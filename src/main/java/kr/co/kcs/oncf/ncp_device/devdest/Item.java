
package kr.co.kcs.oncf.ncp_device.devdest;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "item", ElementSize = 36, LocalName = "item")
public class Item
    implements Serializable
{

    private short element;
    private String name;
    private short type_Var1;
    private short offset;
    private String match_Char;
    private short match_Lgth;

    @DdlField(Version = "2.0", QualName = "element", ObjectClass = 1, Level = 3, Structure = 2, Offset = 256, ElementSize = 2, IdentifierElement = 36)
    public short getElement() {
        return element;
    }

    public void setElement(short elementParam) {
        this.element = elementParam;
    }

    @DdlField(Version = "2.0", QualName = "name", ObjectClass = 1, Level = 3, Structure = 0, Offset = 258, ElementSize = 16, IdentifierElement = 37)
    public String getName() {
        return name;
    }

    public void setName(String nameParam) {
        this.name = nameParam;
    }

    @DdlField(Version = "2.0", QualName = "type-var1", ObjectClass = 1, Level = 3, Structure = 2, Offset = 274, ElementSize = 2, IdentifierElement = 38)
    public short getType_Var1() {
        return type_Var1;
    }

    public void setType_Var1(short type_Var1Param) {
        this.type_Var1 = type_Var1Param;
    }

    @DdlField(Version = "2.0", QualName = "offset", ObjectClass = 1, Level = 3, Structure = 2, Offset = 276, ElementSize = 2, IdentifierElement = 39)
    public short getOffset() {
        return offset;
    }

    public void setOffset(short offsetParam) {
        this.offset = offsetParam;
    }

    @DdlField(Version = "2.0", QualName = "match-char", ObjectClass = 1, Level = 3, Structure = 0, Offset = 278, ElementSize = 12, IdentifierElement = 40)
    public String getMatch_Char() {
        return match_Char;
    }

    public void setMatch_Char(String match_CharParam) {
        this.match_Char = match_CharParam;
    }

    @DdlField(Version = "2.0", QualName = "match-lgth", ObjectClass = 1, Level = 3, Structure = 2, Offset = 290, ElementSize = 2, IdentifierElement = 41)
    public short getMatch_Lgth() {
        return match_Lgth;
    }

    public void setMatch_Lgth(short match_LgthParam) {
        this.match_Lgth = match_LgthParam;
    }

}
