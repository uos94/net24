
package kr.co.kcs.oncf;

import java.io.Serializable;

import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-struct", ElementSize = 3790, LocalName = "ncp-resp-struct")
public class Ncp_Resp_Struct
    implements Serializable
{

    private short resp_Code;
    private short resp_Obj_Typ;
    private String resp_Obj;
    private String resp_Rn;
    private short resp_Data_Lgth;
    private short resp_Data_Typ;
    private String tandem_Node;
    private String fillrr1;
    private Ncp_Resp_Info_Pro resp_Data_S;

    @DdlField(Version = "2.0", QualName = "resp-code", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getResp_Code() {
        return resp_Code;
    }

    public void setResp_Code(short resp_CodeParam) {
        this.resp_Code = resp_CodeParam;
    }

    @DdlField(Version = "2.0", QualName = "resp-obj-typ", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getResp_Obj_Typ() {
        return resp_Obj_Typ;
    }

    public void setResp_Obj_Typ(short resp_Obj_TypParam) {
        this.resp_Obj_Typ = resp_Obj_TypParam;
    }

    @DdlField(Version = "2.0", QualName = "resp-obj", ObjectClass = 1, Level = 1, Structure = 0, Offset = 4, ElementSize = 16, IdentifierElement = 3)
    public String getResp_Obj() {
        return resp_Obj;
    }

    public void setResp_Obj(String resp_ObjParam) {
        this.resp_Obj = resp_ObjParam;
    }

    @DdlField(Version = "2.0", QualName = "resp-rn", ObjectClass = 1, Level = 1, Structure = 0, Offset = 20, ElementSize = 16, IdentifierElement = 4)
    public String getResp_Rn() {
        return resp_Rn;
    }

    public void setResp_Rn(String resp_RnParam) {
        this.resp_Rn = resp_RnParam;
    }

    @DdlField(Version = "2.0", QualName = "resp-data-lgth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 36, ElementSize = 2, IdentifierElement = 5)
    public short getResp_Data_Lgth() {
        return resp_Data_Lgth;
    }

    public void setResp_Data_Lgth(short resp_Data_LgthParam) {
        this.resp_Data_Lgth = resp_Data_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "resp-data-typ", ObjectClass = 1, Level = 1, Structure = 2, Offset = 38, ElementSize = 2, IdentifierElement = 6)
    public short getResp_Data_Typ() {
        return resp_Data_Typ;
    }

    public void setResp_Data_Typ(short resp_Data_TypParam) {
        this.resp_Data_Typ = resp_Data_TypParam;
    }

    @DdlField(Version = "2.0", QualName = "tandem-node", ObjectClass = 1, Level = 1, Structure = 0, Offset = 40, ElementSize = 8, IdentifierElement = 7)
    public String getTandem_Node() {
        return tandem_Node;
    }

    public void setTandem_Node(String tandem_NodeParam) {
        this.tandem_Node = tandem_NodeParam;
    }

    @DdlField(Version = "2.0", QualName = "fillrr1", ObjectClass = 1, Level = 1, Structure = 0, Offset = 48, ElementSize = 24, IdentifierElement = 8, ValidationPattern = "\\p{Sc}{0,24}")
    public String getFillrr1() {
        return fillrr1;
    }

    public void setFillrr1(String fillrr1Param) {
        this.fillrr1 = fillrr1Param;
    }

    @DdlField(Version = "2.0", QualName = "resp-data-s", ObjectClass = 1, Level = 1, Structure = 0, Offset = 72, ElementSize = 3718, IdentifierElement = 9, ValidationPattern = "\\p{Sc}{0,3718}")
//    @ReturnType("kr.co.kcs.oncf.ncp_resp_struct.Resp_Data_S")
    // Ncp_Resp_Info_Pro , Ncp_Resp_Status_Pro
    public Ncp_Resp_Info_Pro getResp_Data_S() {
        return resp_Data_S;
    }

    public void setResp_Data_S(Ncp_Resp_Info_Pro resp_Data_SParam) {
        this.resp_Data_S = resp_Data_SParam;
    }

}
