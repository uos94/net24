
package kr.co.kcs.oncf.ncp_req_control_segstatus;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ctx", ElementSize = 40, LocalName = "ctx")
public class Ctx
    implements Serializable
{

    private String control_Val_Last_Segname;
    private short control_Val_Last_Segname_Len;
    private short control_Val_Last_Segnum;

    @DdlField(Version = "2.0", QualName = "control-val-last-segname", ObjectClass = 1, Level = 2, Structure = 0, Offset = 0, ElementSize = 36, IdentifierElement = 2)
    public String getControl_Val_Last_Segname() {
        return control_Val_Last_Segname;
    }

    public void setControl_Val_Last_Segname(String control_Val_Last_SegnameParam) {
        this.control_Val_Last_Segname = control_Val_Last_SegnameParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-last-segname-len", ObjectClass = 1, Level = 2, Structure = 2, Offset = 36, ElementSize = 2, IdentifierElement = 3)
    public short getControl_Val_Last_Segname_Len() {
        return control_Val_Last_Segname_Len;
    }

    public void setControl_Val_Last_Segname_Len(short control_Val_Last_Segname_LenParam) {
        this.control_Val_Last_Segname_Len = control_Val_Last_Segname_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-last-segnum", ObjectClass = 1, Level = 2, Structure = 2, Offset = 38, ElementSize = 2, IdentifierElement = 4)
    public short getControl_Val_Last_Segnum() {
        return control_Val_Last_Segnum;
    }

    public void setControl_Val_Last_Segnum(short control_Val_Last_SegnumParam) {
        this.control_Val_Last_Segnum = control_Val_Last_SegnumParam;
    }

}
