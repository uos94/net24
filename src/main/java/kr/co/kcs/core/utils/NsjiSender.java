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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.hpe.nonstop.ddl2bean.io.Ddl2BeanObjectInputStream;
import com.hpe.nonstop.ddl2bean.io.Ddl2BeanObjectOutputStream;

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
