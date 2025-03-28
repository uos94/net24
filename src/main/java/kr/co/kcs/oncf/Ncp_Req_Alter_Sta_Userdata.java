
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-alter-sta-userdata", ElementSize = 84, LocalName = "ncp-req-alter-sta-userdata")
public class Ncp_Req_Alter_Sta_Userdata
    implements Serializable
{

    private short alter_Val_Userdata_Element;
    private short alter_Val_Userdata_Text_Lgth;
    private String alter_Val_Userdata_Text;

    @DdlField(Version = "2.0", QualName = "alter-val-userdata-element", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getAlter_Val_Userdata_Element() {
        return alter_Val_Userdata_Element;
    }

    public void setAlter_Val_Userdata_Element(short alter_Val_Userdata_ElementParam) {
        this.alter_Val_Userdata_Element = alter_Val_Userdata_ElementParam;
    }

    @DdlField(Version = "2.0", QualName = "alter-val-userdata-text-lgth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getAlter_Val_Userdata_Text_Lgth() {
        return alter_Val_Userdata_Text_Lgth;
    }

    public void setAlter_Val_Userdata_Text_Lgth(short alter_Val_Userdata_Text_LgthParam) {
        this.alter_Val_Userdata_Text_Lgth = alter_Val_Userdata_Text_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "alter-val-userdata-text", ObjectClass = 1, Level = 1, Structure = 0, Offset = 4, ElementSize = 80, IdentifierElement = 3)
    public String getAlter_Val_Userdata_Text() {
        return alter_Val_Userdata_Text;
    }

    public void setAlter_Val_Userdata_Text(String alter_Val_Userdata_TextParam) {
        this.alter_Val_Userdata_Text = alter_Val_Userdata_TextParam;
    }

}
