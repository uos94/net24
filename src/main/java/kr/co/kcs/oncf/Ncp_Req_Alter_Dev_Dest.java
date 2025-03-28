
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-alter-dev-dest", ElementSize = 102, LocalName = "ncp-req-alter-dev-dest")
public class Ncp_Req_Alter_Dev_Dest
    implements Serializable
{

    private short alter_Val_Destadd_Element;
    private String alter_Val_Destadd_Name;
    private short alter_Val_Destadd_Offset;
    private short alter_Val_Destadd_Text_Lgth;
    private String alter_Val_Destadd_Text;

    @DdlField(Version = "2.0", QualName = "alter-val-destadd-element", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getAlter_Val_Destadd_Element() {
        return alter_Val_Destadd_Element;
    }

    public void setAlter_Val_Destadd_Element(short alter_Val_Destadd_ElementParam) {
        this.alter_Val_Destadd_Element = alter_Val_Destadd_ElementParam;
    }

    @DdlField(Version = "2.0", QualName = "alter-val-destadd-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 2, ElementSize = 16, IdentifierElement = 2)
    public String getAlter_Val_Destadd_Name() {
        return alter_Val_Destadd_Name;
    }

    public void setAlter_Val_Destadd_Name(String alter_Val_Destadd_NameParam) {
        this.alter_Val_Destadd_Name = alter_Val_Destadd_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "alter-val-destadd-offset", ObjectClass = 1, Level = 1, Structure = 2, Offset = 18, ElementSize = 2, IdentifierElement = 3)
    public short getAlter_Val_Destadd_Offset() {
        return alter_Val_Destadd_Offset;
    }

    public void setAlter_Val_Destadd_Offset(short alter_Val_Destadd_OffsetParam) {
        this.alter_Val_Destadd_Offset = alter_Val_Destadd_OffsetParam;
    }

    @DdlField(Version = "2.0", QualName = "alter-val-destadd-text-lgth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 20, ElementSize = 2, IdentifierElement = 4)
    public short getAlter_Val_Destadd_Text_Lgth() {
        return alter_Val_Destadd_Text_Lgth;
    }

    public void setAlter_Val_Destadd_Text_Lgth(short alter_Val_Destadd_Text_LgthParam) {
        this.alter_Val_Destadd_Text_Lgth = alter_Val_Destadd_Text_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "alter-val-destadd-text", ObjectClass = 1, Level = 1, Structure = 0, Offset = 22, ElementSize = 80, IdentifierElement = 5)
    public String getAlter_Val_Destadd_Text() {
        return alter_Val_Destadd_Text;
    }

    public void setAlter_Val_Destadd_Text(String alter_Val_Destadd_TextParam) {
        this.alter_Val_Destadd_Text = alter_Val_Destadd_TextParam;
    }

}
