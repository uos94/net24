
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-control-xfer", ElementSize = 24, LocalName = "ncp-req-control-xfer")
public class Ncp_Req_Control_Xfer
    implements Serializable
{

    private String control_Val_Symname;
    private int control_Val_Num32;
    private int control_Val_First32;

    @DdlField(Version = "2.0", QualName = "control-val-symname", ObjectClass = 1, Level = 1, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 1)
    public String getControl_Val_Symname() {
        return control_Val_Symname;
    }

    public void setControl_Val_Symname(String control_Val_SymnameParam) {
        this.control_Val_Symname = control_Val_SymnameParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-num32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 16, ElementSize = 4, IdentifierElement = 2)
    public int getControl_Val_Num32() {
        return control_Val_Num32;
    }

    public void setControl_Val_Num32(int control_Val_Num32Param) {
        this.control_Val_Num32 = control_Val_Num32Param;
    }

    @DdlField(Version = "2.0", QualName = "control-val-first32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 20, ElementSize = 4, IdentifierElement = 3)
    public int getControl_Val_First32() {
        return control_Val_First32;
    }

    public void setControl_Val_First32(int control_Val_First32Param) {
        this.control_Val_First32 = control_Val_First32Param;
    }

}
