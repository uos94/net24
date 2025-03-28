
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-tell-text", ElementSize = 82, LocalName = "ncp-req-tell-text")
public class Ncp_Req_Tell_Text
    implements Serializable
{

    private short tell_Val_Text_Lgth;
    private String tell_Val_Text;

    @DdlField(Version = "2.0", QualName = "tell-val-text-lgth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getTell_Val_Text_Lgth() {
        return tell_Val_Text_Lgth;
    }

    public void setTell_Val_Text_Lgth(short tell_Val_Text_LgthParam) {
        this.tell_Val_Text_Lgth = tell_Val_Text_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "tell-val-text", ObjectClass = 1, Level = 1, Structure = 0, Offset = 2, ElementSize = 80, IdentifierElement = 2)
    public String getTell_Val_Text() {
        return tell_Val_Text;
    }

    public void setTell_Val_Text(String tell_Val_TextParam) {
        this.tell_Val_Text = tell_Val_TextParam;
    }

}
