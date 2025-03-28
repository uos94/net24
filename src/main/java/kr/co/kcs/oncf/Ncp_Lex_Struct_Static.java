
package kr.co.kcs.oncf;

import java.io.Serializable;

import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

import kr.co.kcs.oncf.ncp_lex_struct_static.Fillrr1Marker;

@DdlGroup(Version = "2.0", QualName = "ncp-lex-struct-static", ElementSize = 210, LocalName = "ncp-lex-struct-static")
public class Ncp_Lex_Struct_Static
    implements Serializable
{

    private short lgth;
    private short cmd;
    private short obj_Typ;
    private String obj;
    private String rn;
    private String user;
    private String sess_Id;
    private String user_Info;
    private int cmd_Timout;
    private String tstamp;
    private short max_Resps;
    private String rqst_Vsn;
    private String ctx_Info;
    private short resp_Typ;
    private short rqst_Cntl;
    private String tandem_Node;
    private short request_Depth;
    private String config_Lock;
    private short new_Userid;
    private short update_Ncss;
    private short dont_Advance_Ctx;
    private short max_Resp_Tkn_Lgth;
    private short[] last_Cmd_Timestamp = new short[ 3 ] ;
    private short pw_Expire_Days;
    private Fillrr1Marker fillrr1;

    @DdlField(Version = "2.0", QualName = "lgth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getLgth() {
        return lgth;
    }

    public void setLgth(short lgthParam) {
        this.lgth = lgthParam;
    }

    @DdlField(Version = "2.0", QualName = "cmd", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getCmd() {
        return cmd;
    }

    public void setCmd(short cmdParam) {
        this.cmd = cmdParam;
    }

    @DdlField(Version = "2.0", QualName = "obj-typ", ObjectClass = 1, Level = 1, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 3)
    public short getObj_Typ() {
        return obj_Typ;
    }

    public void setObj_Typ(short obj_TypParam) {
        this.obj_Typ = obj_TypParam;
    }

    @DdlField(Version = "2.0", QualName = "obj", ObjectClass = 1, Level = 1, Structure = 0, Offset = 6, ElementSize = 16, IdentifierElement = 4)
    public String getObj() {
        return obj;
    }

    public void setObj(String objParam) {
        this.obj = objParam;
    }

    @DdlField(Version = "2.0", QualName = "rn", ObjectClass = 1, Level = 1, Structure = 0, Offset = 22, ElementSize = 16, IdentifierElement = 5)
    public String getRn() {
        return rn;
    }

    public void setRn(String rnParam) {
        this.rn = rnParam;
    }

    @DdlField(Version = "2.0", QualName = "user", ObjectClass = 1, Level = 2, Structure = 0, Offset = 38, ElementSize = 16, IdentifierElement = 8)
    public String getUser() {
        return user;
    }

    public void setUser(String userParam) {
        this.user = userParam;
    }

    @DdlField(Version = "2.0", QualName = "sess-id", ObjectClass = 1, Level = 2, Structure = 0, Offset = 54, ElementSize = 16, IdentifierElement = 9)
    public String getSess_Id() {
        return sess_Id;
    }

    public void setSess_Id(String sess_IdParam) {
        this.sess_Id = sess_IdParam;
    }

    @DdlField(Version = "2.0", QualName = "user-info", ObjectClass = 1, Level = 1, Structure = 0, Offset = 70, ElementSize = 16, IdentifierElement = 10)
    public String getUser_Info() {
        return user_Info;
    }

    public void setUser_Info(String user_InfoParam) {
        this.user_Info = user_InfoParam;
    }

    @DdlField(Version = "2.0", QualName = "cmd-timout", ObjectClass = 1, Level = 1, Structure = 4, Offset = 86, ElementSize = 4, IdentifierElement = 11)
    public int getCmd_Timout() {
        return cmd_Timout;
    }

    public void setCmd_Timout(int cmd_TimoutParam) {
        this.cmd_Timout = cmd_TimoutParam;
    }

    @DdlField(Version = "2.0", QualName = "tstamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 90, ElementSize = 14, IdentifierElement = 12)
    public String getTstamp() {
        return tstamp;
    }

    public void setTstamp(String tstampParam) {
        this.tstamp = tstampParam;
    }

    @DdlField(Version = "2.0", QualName = "max-resps", ObjectClass = 1, Level = 1, Structure = 2, Offset = 104, ElementSize = 2, IdentifierElement = 13)
    public short getMax_Resps() {
        return max_Resps;
    }

    public void setMax_Resps(short max_RespsParam) {
        this.max_Resps = max_RespsParam;
    }

    @DdlField(Version = "2.0", QualName = "rqst-vsn", ObjectClass = 1, Level = 1, Structure = 0, Offset = 106, ElementSize = 6, IdentifierElement = 14)
    public String getRqst_Vsn() {
        return rqst_Vsn;
    }

    public void setRqst_Vsn(String rqst_VsnParam) {
        this.rqst_Vsn = rqst_VsnParam;
    }

    @DdlField(Version = "2.0", QualName = "ctx-info", ObjectClass = 1, Level = 1, Structure = 0, Offset = 112, ElementSize = 32, IdentifierElement = 15)
    public String getCtx_Info() {
        return ctx_Info;
    }

    public void setCtx_Info(String ctx_InfoParam) {
        this.ctx_Info = ctx_InfoParam;
    }

    @DdlField(Version = "2.0", QualName = "resp-typ", ObjectClass = 1, Level = 1, Structure = 2, Offset = 144, ElementSize = 2, IdentifierElement = 16)
    public short getResp_Typ() {
        return resp_Typ;
    }

    public void setResp_Typ(short resp_TypParam) {
        this.resp_Typ = resp_TypParam;
    }

    @DdlField(Version = "2.0", QualName = "rqst-cntl", ObjectClass = 1, Level = 1, Structure = 2, Offset = 146, ElementSize = 2, IdentifierElement = 17)
    public short getRqst_Cntl() {
        return rqst_Cntl;
    }

    public void setRqst_Cntl(short rqst_CntlParam) {
        this.rqst_Cntl = rqst_CntlParam;
    }

    @DdlField(Version = "2.0", QualName = "tandem-node", ObjectClass = 1, Level = 1, Structure = 0, Offset = 148, ElementSize = 8, IdentifierElement = 18)
    public String getTandem_Node() {
        return tandem_Node;
    }

    public void setTandem_Node(String tandem_NodeParam) {
        this.tandem_Node = tandem_NodeParam;
    }

    @DdlField(Version = "2.0", QualName = "request-depth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 156, ElementSize = 2, IdentifierElement = 19)
    public short getRequest_Depth() {
        return request_Depth;
    }

    public void setRequest_Depth(short request_DepthParam) {
        this.request_Depth = request_DepthParam;
    }

    @DdlField(Version = "2.0", QualName = "config-lock", ObjectClass = 1, Level = 1, Structure = 0, Offset = 158, ElementSize = 8, IdentifierElement = 20, ValidationPattern = "\\p{Sc}{0,8}")
    public String getConfig_Lock() {
        return config_Lock;
    }

    public void setConfig_Lock(String config_LockParam) {
        this.config_Lock = config_LockParam;
    }

    @DdlField(Version = "2.0", QualName = "new-userid", ObjectClass = 1, Level = 1, Structure = 2, Offset = 166, ElementSize = 2, IdentifierElement = 21)
    public short getNew_Userid() {
        return new_Userid;
    }

    public void setNew_Userid(short new_UseridParam) {
        this.new_Userid = new_UseridParam;
    }

    @DdlField(Version = "2.0", QualName = "update-ncss", ObjectClass = 1, Level = 1, Structure = 2, Offset = 168, ElementSize = 2, IdentifierElement = 22)
    public short getUpdate_Ncss() {
        return update_Ncss;
    }

    public void setUpdate_Ncss(short update_NcssParam) {
        this.update_Ncss = update_NcssParam;
    }

    @DdlField(Version = "2.0", QualName = "dont-advance-ctx", ObjectClass = 1, Level = 1, Structure = 2, Offset = 170, ElementSize = 2, IdentifierElement = 23)
    public short getDont_Advance_Ctx() {
        return dont_Advance_Ctx;
    }

    public void setDont_Advance_Ctx(short dont_Advance_CtxParam) {
        this.dont_Advance_Ctx = dont_Advance_CtxParam;
    }

    @DdlField(Version = "2.0", QualName = "max-resp-tkn-lgth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 172, ElementSize = 2, IdentifierElement = 24)
    public short getMax_Resp_Tkn_Lgth() {
        return max_Resp_Tkn_Lgth;
    }

    public void setMax_Resp_Tkn_Lgth(short max_Resp_Tkn_LgthParam) {
        this.max_Resp_Tkn_Lgth = max_Resp_Tkn_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "last-cmd-timestamp", ObjectClass = 1, Level = 1, Structure = 2, Offset = 174, ElementSize = 2, IdentifierElement = 25, OccursMax = 3)
    public short[] getLast_Cmd_Timestamp() {
        return last_Cmd_Timestamp;
    }

    @DdlField(Version = "2.0", QualName = "last-cmd-timestamp", ObjectClass = 1, Level = 1, Structure = 2, Offset = 174, ElementSize = 2, IdentifierElement = 25, OccursMax = 3)
    public short getLast_Cmd_Timestamp(int index) {
        return (last_Cmd_Timestamp[index]);
    }

    public void setLast_Cmd_Timestamp(short[] last_Cmd_TimestampParam) {
        this.last_Cmd_Timestamp = last_Cmd_TimestampParam;
    }

    public void setLast_Cmd_Timestamp(int index, short last_Cmd_TimestampParam) {
        this.last_Cmd_Timestamp[index]=last_Cmd_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "pw-expire-days", ObjectClass = 1, Level = 1, Structure = 2, Offset = 180, ElementSize = 2, IdentifierElement = 26)
    public short getPw_Expire_Days() {
        return pw_Expire_Days;
    }

    public void setPw_Expire_Days(short pw_Expire_DaysParam) {
        this.pw_Expire_Days = pw_Expire_DaysParam;
    }

    @DdlField(Version = "2.0", QualName = "fillrr1", ObjectClass = 1, Level = 1, Structure = 0, Offset = 182, ElementSize = 28, IdentifierElement = 27, ValidationPattern = "\\p{Sc}{0,28}")
    @ReturnType("kr.co.kcs.oncf.ncp_lex_struct_static.Fillrr1")
    public Fillrr1Marker getFillrr1() {
        return fillrr1;
    }

    public void setFillrr1(Fillrr1Marker fillrr1Param) {
        this.fillrr1 = fillrr1Param;
    }

}
