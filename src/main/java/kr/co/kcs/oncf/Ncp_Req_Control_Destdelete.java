
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-control-destdelete", ElementSize = 82, LocalName = "ncp-req-control-destdelete")
public class Ncp_Req_Control_Destdelete
    implements Serializable
{

    private String control_Val_Symname;
    private String control_Val_Link;
    private short control_Val_Que_Strategy;
    private String control_Val_Save_Filename;
    private String control_Val_Fillrr;

    @DdlField(Version = "2.0", QualName = "control-val-symname", ObjectClass = 1, Level = 1, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 1)
    public String getControl_Val_Symname() {
        return control_Val_Symname;
    }

    public void setControl_Val_Symname(String control_Val_SymnameParam) {
        this.control_Val_Symname = control_Val_SymnameParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-link", ObjectClass = 1, Level = 1, Structure = 0, Offset = 16, ElementSize = 16, IdentifierElement = 2)
    public String getControl_Val_Link() {
        return control_Val_Link;
    }

    public void setControl_Val_Link(String control_Val_LinkParam) {
        this.control_Val_Link = control_Val_LinkParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-que-strategy", ObjectClass = 1, Level = 1, Structure = 2, Offset = 32, ElementSize = 2, IdentifierElement = 3)
    public short getControl_Val_Que_Strategy() {
        return control_Val_Que_Strategy;
    }

    public void setControl_Val_Que_Strategy(short control_Val_Que_StrategyParam) {
        this.control_Val_Que_Strategy = control_Val_Que_StrategyParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-save-filename", ObjectClass = 1, Level = 1, Structure = 0, Offset = 34, ElementSize = 47, IdentifierElement = 4)
    public String getControl_Val_Save_Filename() {
        return control_Val_Save_Filename;
    }

    public void setControl_Val_Save_Filename(String control_Val_Save_FilenameParam) {
        this.control_Val_Save_Filename = control_Val_Save_FilenameParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-fillrr", ObjectClass = 1, Level = 1, Structure = 0, Offset = 81, ElementSize = 1, IdentifierElement = 5)
    public String getControl_Val_Fillrr() {
        return control_Val_Fillrr;
    }

    public void setControl_Val_Fillrr(String control_Val_FillrrParam) {
        this.control_Val_Fillrr = control_Val_FillrrParam;
    }

}
