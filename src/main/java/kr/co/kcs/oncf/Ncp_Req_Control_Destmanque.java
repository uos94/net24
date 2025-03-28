
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-control-destmanque", ElementSize = 104, LocalName = "ncp-req-control-destmanque")
public class Ncp_Req_Control_Destmanque
    implements Serializable
{

    private String control_Val_Symname;
    private String control_Val_Xfer_Name;
    private String control_Val_Link;
    private String control_Val_Save_Filename;
    private String control_Val_Fillrr;
    private short control_Val_Num_To_Pop;
    private short control_Val_Logic;
    private int control_Val_Num_To_Pop32;

    @DdlField(Version = "2.0", QualName = "control-val-symname", ObjectClass = 1, Level = 1, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 1)
    public String getControl_Val_Symname() {
        return control_Val_Symname;
    }

    public void setControl_Val_Symname(String control_Val_SymnameParam) {
        this.control_Val_Symname = control_Val_SymnameParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-xfer-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 16, ElementSize = 16, IdentifierElement = 2)
    public String getControl_Val_Xfer_Name() {
        return control_Val_Xfer_Name;
    }

    public void setControl_Val_Xfer_Name(String control_Val_Xfer_NameParam) {
        this.control_Val_Xfer_Name = control_Val_Xfer_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-link", ObjectClass = 1, Level = 1, Structure = 0, Offset = 32, ElementSize = 16, IdentifierElement = 3)
    public String getControl_Val_Link() {
        return control_Val_Link;
    }

    public void setControl_Val_Link(String control_Val_LinkParam) {
        this.control_Val_Link = control_Val_LinkParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-save-filename", ObjectClass = 1, Level = 1, Structure = 0, Offset = 48, ElementSize = 47, IdentifierElement = 4)
    public String getControl_Val_Save_Filename() {
        return control_Val_Save_Filename;
    }

    public void setControl_Val_Save_Filename(String control_Val_Save_FilenameParam) {
        this.control_Val_Save_Filename = control_Val_Save_FilenameParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-fillrr", ObjectClass = 1, Level = 1, Structure = 0, Offset = 95, ElementSize = 1, IdentifierElement = 5)
    public String getControl_Val_Fillrr() {
        return control_Val_Fillrr;
    }

    public void setControl_Val_Fillrr(String control_Val_FillrrParam) {
        this.control_Val_Fillrr = control_Val_FillrrParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-num-to-pop", ObjectClass = 1, Level = 1, Structure = 2, Offset = 96, ElementSize = 2, IdentifierElement = 6)
    public short getControl_Val_Num_To_Pop() {
        return control_Val_Num_To_Pop;
    }

    public void setControl_Val_Num_To_Pop(short control_Val_Num_To_PopParam) {
        this.control_Val_Num_To_Pop = control_Val_Num_To_PopParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-logic", ObjectClass = 1, Level = 1, Structure = 2, Offset = 98, ElementSize = 2, IdentifierElement = 7)
    public short getControl_Val_Logic() {
        return control_Val_Logic;
    }

    public void setControl_Val_Logic(short control_Val_LogicParam) {
        this.control_Val_Logic = control_Val_LogicParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-num-to-pop32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 100, ElementSize = 4, IdentifierElement = 8)
    public int getControl_Val_Num_To_Pop32() {
        return control_Val_Num_To_Pop32;
    }

    public void setControl_Val_Num_To_Pop32(int control_Val_Num_To_Pop32Param) {
        this.control_Val_Num_To_Pop32 = control_Val_Num_To_Pop32Param;
    }

}
