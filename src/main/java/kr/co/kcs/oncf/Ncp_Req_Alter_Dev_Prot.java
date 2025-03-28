
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-alter-dev-prot", ElementSize = 88, LocalName = "ncp-req-alter-dev-prot")
public class Ncp_Req_Alter_Dev_Prot
    implements Serializable
{

    private short alter_Val_Protadd_Element;
    private short alter_Val_Protadd_Protocol;
    private short alter_Val_Protadd_Offset;
    private short alter_Val_Protadd_Text_Lgth;
    private String alter_Val_Protadd_Text;

    @DdlField(Version = "2.0", QualName = "alter-val-protadd-element", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getAlter_Val_Protadd_Element() {
        return alter_Val_Protadd_Element;
    }

    public void setAlter_Val_Protadd_Element(short alter_Val_Protadd_ElementParam) {
        this.alter_Val_Protadd_Element = alter_Val_Protadd_ElementParam;
    }

    @DdlField(Version = "2.0", QualName = "alter-val-protadd-protocol", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getAlter_Val_Protadd_Protocol() {
        return alter_Val_Protadd_Protocol;
    }

    public void setAlter_Val_Protadd_Protocol(short alter_Val_Protadd_ProtocolParam) {
        this.alter_Val_Protadd_Protocol = alter_Val_Protadd_ProtocolParam;
    }

    @DdlField(Version = "2.0", QualName = "alter-val-protadd-offset", ObjectClass = 1, Level = 1, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 3)
    public short getAlter_Val_Protadd_Offset() {
        return alter_Val_Protadd_Offset;
    }

    public void setAlter_Val_Protadd_Offset(short alter_Val_Protadd_OffsetParam) {
        this.alter_Val_Protadd_Offset = alter_Val_Protadd_OffsetParam;
    }

    @DdlField(Version = "2.0", QualName = "alter-val-protadd-text-lgth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 6, ElementSize = 2, IdentifierElement = 4)
    public short getAlter_Val_Protadd_Text_Lgth() {
        return alter_Val_Protadd_Text_Lgth;
    }

    public void setAlter_Val_Protadd_Text_Lgth(short alter_Val_Protadd_Text_LgthParam) {
        this.alter_Val_Protadd_Text_Lgth = alter_Val_Protadd_Text_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "alter-val-protadd-text", ObjectClass = 1, Level = 1, Structure = 0, Offset = 8, ElementSize = 80, IdentifierElement = 5)
    public String getAlter_Val_Protadd_Text() {
        return alter_Val_Protadd_Text;
    }

    public void setAlter_Val_Protadd_Text(String alter_Val_Protadd_TextParam) {
        this.alter_Val_Protadd_Text = alter_Val_Protadd_TextParam;
    }

}
