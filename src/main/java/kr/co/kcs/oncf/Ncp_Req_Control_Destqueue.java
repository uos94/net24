
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-control-destqueue", ElementSize = 22, LocalName = "ncp-req-control-destqueue")
public class Ncp_Req_Control_Destqueue
    implements Serializable
{

    private String control_Val_Symname;
    private short control_Val_Num;
    private int control_Val_Num32;

    @DdlField(Version = "2.0", QualName = "control-val-symname", ObjectClass = 1, Level = 1, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 1)
    public String getControl_Val_Symname() {
        return control_Val_Symname;
    }

    public void setControl_Val_Symname(String control_Val_SymnameParam) {
        this.control_Val_Symname = control_Val_SymnameParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-num", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 2)
    public short getControl_Val_Num() {
        return control_Val_Num;
    }

    public void setControl_Val_Num(short control_Val_NumParam) {
        this.control_Val_Num = control_Val_NumParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-num32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 18, ElementSize = 4, IdentifierElement = 3)
    public int getControl_Val_Num32() {
        return control_Val_Num32;
    }

    public void setControl_Val_Num32(int control_Val_Num32Param) {
        this.control_Val_Num32 = control_Val_Num32Param;
    }

}
