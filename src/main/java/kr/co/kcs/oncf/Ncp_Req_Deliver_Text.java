
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-deliver-text", ElementSize = 2002, LocalName = "ncp-req-deliver-text")
public class Ncp_Req_Deliver_Text
    implements Serializable
{

    private short deliver_Val_Text_Lgth;
    private String deliver_Val_Text;

    @DdlField(Version = "2.0", QualName = "deliver-val-text-lgth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getDeliver_Val_Text_Lgth() {
        return deliver_Val_Text_Lgth;
    }

    public void setDeliver_Val_Text_Lgth(short deliver_Val_Text_LgthParam) {
        this.deliver_Val_Text_Lgth = deliver_Val_Text_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "deliver-val-text", ObjectClass = 1, Level = 1, Structure = 0, Offset = 2, ElementSize = 2000, IdentifierElement = 2)
    public String getDeliver_Val_Text() {
        return deliver_Val_Text;
    }

    public void setDeliver_Val_Text(String deliver_Val_TextParam) {
        this.deliver_Val_Text = deliver_Val_TextParam;
    }

}
