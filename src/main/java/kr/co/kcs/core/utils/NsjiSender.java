package kr.co.kcs.core.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.hpe.nonstop.ddl2bean.io.Ddl2BeanObjectInputStream;
import com.hpe.nonstop.ddl2bean.io.Ddl2BeanObjectOutputStream;

import kr.co.kcs.oncf.cmn.Constants;

@Component
public class NsjiSender {

	protected final Logger log	= LoggerFactory.getLogger(getClass());

	@Value("${connect.addr}")
	String addr;

	@Value("${connect.port}")
	int port;

	@Value("${connect.timeout}")
	int timeout;


	public Object sender(Object beanType) {

		Object rsObj						= null;
		ByteArrayOutputStream baos			= null;
		ByteArrayInputStream bais			= null;
		Ddl2BeanObjectOutputStream ddlOs	= null;
		Ddl2BeanObjectInputStream ddlIs 	= null;

		try{
			baos			= new ByteArrayOutputStream();
			ddlOs			= new Ddl2BeanObjectOutputStream(baos);

//			byte[] test 	= writeStream();
//			byte[] inByte	= socketSender(test);
			
			ddlOs.writeObject(beanType);
			ddlOs.flush();

			byte[] outByte	= baos.toByteArray();
			byte[] inByte	= socketSender(outByte);

			bais 			= new ByteArrayInputStream(inByte);
			ddlIs 			= new Ddl2BeanObjectInputStream(bais, beanType.getClass());
			rsObj 			= ddlIs.readObject();

		}catch(Exception e){
			e.printStackTrace();

		}finally{
			try{if(ddlIs != null) ddlIs.close();}catch(Exception ef){}
			try{if(bais != null) bais.close();}catch(Exception ef){}
			try{if(ddlOs != null) ddlOs.close();}catch(Exception ef){}
			try{if(baos != null) baos.close();}catch(Exception ef){}
		}

		return rsObj;
	}


	private byte[] writeStream() {
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    
	    short lgth = 214;
	    short cmd = Constants.ncp_cmd_start;
	    short obj_Typ = 2;

	    String obj = "P1A^ZTC0^TEST";
	    String rn = "P1A^NODE";
	    String user = "DEFAULT";
	    String sess_Id = "";
	    String user_Info = "";
	    int cmd_Timout = 18000;
	    String tstamp = SUtils.getDate();
	    short max_Resps = 1;
	    String rqst_Vsn = Constants.ncp_val_curr_vsn;
	    String ctx_Info = "";
	    short resp_Typ = Constants.ncp_val_resp_err_warn_norm;
	    short rqst_Cntl = Constants.ncp_val_rqst_err_warn_norm;
	    String tandem_Node = "";
	    short request_Depth = 0;
	    String config_Lock = "";
	    short new_Userid = 0;
	    short update_Ncss = 0;
	    short dont_Advance_Ctx = 0;
	    short max_Resp_Tkn_Lgth = 0;
	    short[] last_Cmd_Timestamp = new short[3];
	    short pw_Expire_Days = 0;

	    /* *** */
	    short dynamic_Area_Lgth = 2;

	    /* varToken */
	    short var_Ttl_Lgth = 0;
	    short var_Typ = 0;
	    short var_Data_Lgth = 0;

	    try (DataOutputStream dataStream = new DataOutputStream(baos)) {
	        // 1. short 값들 (Big-Endian)
	        dataStream.writeShort(lgth);
	        dataStream.writeShort(cmd);
	        dataStream.writeShort(obj_Typ);

	        // 2. 문자열을 고정 길이로 변환
	        writeString(dataStream, obj, 20);
	        writeString(dataStream, rn, 20);
	        writeString(dataStream, user, 10);
	        writeString(dataStream, sess_Id, 10);
	        writeString(dataStream, user_Info, 20);

	        // 3. int 값 저장
	        dataStream.writeInt(cmd_Timout);

	        // 4. 문자열 데이터
	        writeString(dataStream, tstamp, 14);
	        dataStream.writeShort(max_Resps);
	        writeString(dataStream, rqst_Vsn, 10);
	        writeString(dataStream, ctx_Info, 20);
	        dataStream.writeShort(resp_Typ);
	        dataStream.writeShort(rqst_Cntl);
	        writeString(dataStream, tandem_Node, 20);
	        dataStream.writeShort(request_Depth);
	        writeString(dataStream, config_Lock, 20);
	        dataStream.writeShort(new_Userid);
	        dataStream.writeShort(update_Ncss);
	        dataStream.writeShort(dont_Advance_Ctx);
	        dataStream.writeShort(max_Resp_Tkn_Lgth);

	        // 5. short 배열
	        for (short value : last_Cmd_Timestamp) {
	            dataStream.writeShort(value);
	        }

	        dataStream.writeShort(pw_Expire_Days);

	        // ✅ `flush()` 호출 후 `byte[]` 반환
	        dataStream.flush();
	        return baos.toByteArray();
	        
	    } catch (IOException e) {
	        e.printStackTrace();
	        return null; // 에러 발생 시 `null` 반환
	    }
	}

	// ✅ 문자열을 고정 길이로 변환하는 메서드
	private static void writeString(DataOutputStream dataStream, String value, int fixedLength) throws IOException {
	    byte[] stringBytes = value.getBytes(StandardCharsets.UTF_8);
	    byte[] buffer = new byte[fixedLength];

	    if (stringBytes.length > fixedLength) {
	        System.err.println("Warning: String '" + value + "' is too long! It will be truncated.");
	    }

	    System.arraycopy(stringBytes, 0, buffer, 0, Math.min(stringBytes.length, fixedLength));
	    dataStream.write(buffer);
	}




	private byte[] socketSender(byte[] outByte) {

		byte[] rsByte				= null;

		SocketAddress address		= new InetSocketAddress(addr, port);
    	Socket socket 				= new Socket();

    	OutputStream os				= null;
    	DataOutputStream dataOs		= null;
    	InputStream is				= null;
    	DataInputStream dataIs 		= null;

		try{

			socket.setSoTimeout(timeout);
			socket.connect(address, timeout);

			os			= socket.getOutputStream();
			dataOs		= new DataOutputStream(os);

			dataOs.write(outByte);
			dataOs.flush();

			is				= socket.getInputStream();
			dataIs			= new DataInputStream(is);

			byte[] lenByte	= new byte[2];
			dataIs.read(lenByte, 0, lenByte.length);

			int isDataLen	= (( lenByte[1] & 0xff ) << 8 ) | (lenByte[0] & 0xff);

			System.err.println("isDataLen ::::::::::::::: "+isDataLen);

			if(isDataLen > 0){
				byte inByte[] = new byte[isDataLen];

				dataIs.read(inByte, 0, isDataLen);
				System.err.println("message ::::::::::::::: "+new String(inByte));
				rsByte	= SUtils.bytesExtend(lenByte, inByte);
			}

		} catch (EOFException e) {
			e.printStackTrace();

		}catch(IOException e){
			e.printStackTrace();

		}finally {
			try{if(dataIs != null) dataIs.close();}catch(Exception e2){}
			try{if(is != null) is.close();}catch(Exception e2){}
			try{if(dataOs != null) dataOs.close();}catch(Exception e2){}
			try{if(os != null) os.close();}catch(Exception e2){}
			try{if(socket != null) socket.close();}catch(Exception e2){}
		}

		return rsByte;
	}






}
