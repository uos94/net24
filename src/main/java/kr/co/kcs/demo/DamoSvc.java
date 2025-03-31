package kr.co.kcs.demo;

import org.springframework.stereotype.Service;

import kr.co.kcs.core.utils.SUtils;
import kr.co.kcs.oncf.Ncp_Lex_Struct;
import kr.co.kcs.oncf.Ncp_Lex_Struct_Static;
import kr.co.kcs.oncf.Var_Token;
import kr.co.kcs.oncf.cmn.Constants;
import kr.co.kcs.oncf.ncp_lex_struct.Dynamic_Var1;
import kr.co.kcs.oncf.ncp_lex_struct.dynamic_var1.Dynamic_Area_SMarker;
import kr.co.kcs.oncf.ncp_lex_struct_static.End_User_Id;
import kr.co.kcs.oncf.ncp_lex_struct_static.Rn;
import kr.co.kcs.oncf.ncp_lex_struct_static.RnMarker;

@Service
public class DamoSvc {
	
	public Ncp_Lex_Struct lexStruct() {

		Ncp_Lex_Struct struct			= new Ncp_Lex_Struct();
		Ncp_Lex_Struct_Static sstatic	= new Ncp_Lex_Struct_Static();
		//Var_Token varToken				= new Var_Token();
		Dynamic_Var1 var = new Dynamic_Var1();
		/* structStatic */
		short lgth					= 214;
		short cmd					= Constants.ncp_cmd_start;	//	ncp_cmd_start , ncp_cmd_stop , ncp_cmd_info, ncp_cmd_status
		short obj_Typ				= 2;
		String obj					= "P1A^ZTC0^TEST";
		Rn rn						= new Rn();
		End_User_Id user = new End_User_Id();
//		String user					= "DEFAULT";
//		String sess_Id				= "";
		String user_Info			= "";
		int cmd_Timout				= 18000;
		String tstamp				= SUtils.getDate(); 
		short max_Resps				= 1;
		String rqst_Vsn				= Constants.ncp_val_curr_vsn;
		String ctx_Info				= "";
		short resp_Typ				= Constants.ncp_val_resp_err_warn_norm;
		short rqst_Cntl				= Constants.ncp_val_rqst_err_warn_norm;
		String tandem_Node			= "";
		short request_Depth			= 0;
		String config_Lock			= "";
		short new_Userid			= 0;
		short update_Ncss			= 0;
		short dont_Advance_Ctx		= 0;
		short max_Resp_Tkn_Lgth		= 0;
		short[] last_Cmd_Timestamp	= new short[ 3 ] ;
//		last_Cmd_Timestamp[0]		= 0;
//		last_Cmd_Timestamp[1]		= 0;
//		last_Cmd_Timestamp[2]		= 0;
		short pw_Expire_Days		= 0;

		/* *** */
		short dynamic_Area_Lgth		= 2;

		/* varToken */
		short var_Ttl_Lgth			= 0;
		short var_Typ				= 0;
		short var_Data_Lgth			= 0;
		
		rn.setRn("P1A^NODE");
		user.setUser("DEFAULT");
		user.setSess_Id("");
		
		sstatic.setLgth(lgth);
		sstatic.setCmd(cmd);
		sstatic.setObj_Typ(obj_Typ);
		sstatic.setObj(obj);
		sstatic.setRn(rn);
		sstatic.setEnd_User_Id(user);
		//sstatic.setUser(user);
		//sstatic.setSess_Id(sess_Id);
		sstatic.setUser_Info(user_Info);
		sstatic.setCmd_Timout(cmd_Timout);
		sstatic.setTstamp(tstamp);
		sstatic.setMax_Resps(max_Resps);
		sstatic.setRqst_Vsn(rqst_Vsn);
		sstatic.setCtx_Info(ctx_Info);
		sstatic.setResp_Typ(resp_Typ);
		sstatic.setRqst_Cntl(rqst_Cntl);
		sstatic.setTandem_Node(tandem_Node);
		sstatic.setRequest_Depth(request_Depth);
		sstatic.setConfig_Lock(config_Lock);
		sstatic.setNew_Userid(new_Userid);
		sstatic.setUpdate_Ncss(update_Ncss);
		sstatic.setDont_Advance_Ctx(dont_Advance_Ctx);
		sstatic.setMax_Resp_Tkn_Lgth(max_Resp_Tkn_Lgth);
		sstatic.setLast_Cmd_Timestamp(last_Cmd_Timestamp);
		sstatic.setPw_Expire_Days(pw_Expire_Days);

//		varToken.setVar_Ttl_Lgth(var_Ttl_Lgth);
//		varToken.setVar_Typ(var_Typ);
//		varToken.setVar_Data_Lgth(var_Data_Lgth);
		var.setDynamic_Area_S(new Dynamic_Area_SMarker() {
		});
		struct.setStatic(sstatic);
		//struct.setDynamic_Var1(varToken);
		struct.setDynamic_Var1(var);
		struct.setDynamic_Area_Lgth(dynamic_Area_Lgth);

		return struct;

	}

}
