
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-alter-text", ElementSize = 258, LocalName = "ncp-req-alter-text")
public class Ncp_Req_Alter_Text
    implements Serializable
{

    private short alter_Val_Text_Lgth;
    private String alter_Val_Text;

    @DdlField(Version = "2.0", QualName = "alter-val-text-lgth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getAlter_Val_Text_Lgth() {
        return alter_Val_Text_Lgth;
    }

    public void setAlter_Val_Text_Lgth(short alter_Val_Text_LgthParam) {
        this.alter_Val_Text_Lgth = alter_Val_Text_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "alter-val-text", ObjectClass = 1, Level = 1, Structure = 0, Offset = 2, ElementSize = 256, IdentifierElement = 2)
    public String getAlter_Val_Text() {
        return alter_Val_Text;
    }

    public void setAlter_Val_Text(String alter_Val_TextParam) {
        this.alter_Val_Text = alter_Val_TextParam;
    }

}
