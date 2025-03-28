
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-control-text", ElementSize = 82, LocalName = "ncp-req-control-text")
public class Ncp_Req_Control_Text
    implements Serializable
{

    private short control_Val_Text_Lgth;
    private String control_Val_Text;

    @DdlField(Version = "2.0", QualName = "control-val-text-lgth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getControl_Val_Text_Lgth() {
        return control_Val_Text_Lgth;
    }

    public void setControl_Val_Text_Lgth(short control_Val_Text_LgthParam) {
        this.control_Val_Text_Lgth = control_Val_Text_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-text", ObjectClass = 1, Level = 1, Structure = 0, Offset = 2, ElementSize = 80, IdentifierElement = 2)
    public String getControl_Val_Text() {
        return control_Val_Text;
    }

    public void setControl_Val_Text(String control_Val_TextParam) {
        this.control_Val_Text = control_Val_TextParam;
    }

}
