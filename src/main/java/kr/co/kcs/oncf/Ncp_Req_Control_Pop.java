
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-control-pop", ElementSize = 12, LocalName = "ncp-req-control-pop")
public class Ncp_Req_Control_Pop
    implements Serializable
{

    private short control_Val_Num;
    private short fill040120_1507;
    private int control_Val_Num32;
    private int control_Val_First32;

    @DdlField(Version = "2.0", QualName = "control-val-num", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getControl_Val_Num() {
        return control_Val_Num;
    }

    public void setControl_Val_Num(short control_Val_NumParam) {
        this.control_Val_Num = control_Val_NumParam;
    }

    @DdlField(Version = "2.0", QualName = "fill040120-1507", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getFill040120_1507() {
        return fill040120_1507;
    }

    public void setFill040120_1507(short fill040120_1507Param) {
        this.fill040120_1507 = fill040120_1507Param;
    }

    @DdlField(Version = "2.0", QualName = "control-val-num32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 4, ElementSize = 4, IdentifierElement = 3)
    public int getControl_Val_Num32() {
        return control_Val_Num32;
    }

    public void setControl_Val_Num32(int control_Val_Num32Param) {
        this.control_Val_Num32 = control_Val_Num32Param;
    }

    @DdlField(Version = "2.0", QualName = "control-val-first32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 8, ElementSize = 4, IdentifierElement = 4)
    public int getControl_Val_First32() {
        return control_Val_First32;
    }

    public void setControl_Val_First32(int control_Val_First32Param) {
        this.control_Val_First32 = control_Val_First32Param;
    }

}
