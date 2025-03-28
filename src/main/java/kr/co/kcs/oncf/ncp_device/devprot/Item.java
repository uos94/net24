
package kr.co.kcs.oncf.ncp_device.devprot;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "item", ElementSize = 20, LocalName = "item")
public class Item
    implements Serializable
{

    private short id;
    private short protocol;
    private short offset;
    private String match_Char;
    private short match_Lgth;

    @DdlField(Version = "2.0", QualName = "id", ObjectClass = 1, Level = 3, Structure = 2, Offset = 1410, ElementSize = 2, IdentifierElement = 45)
    public short getId() {
        return id;
    }

    public void setId(short idParam) {
        this.id = idParam;
    }

    @DdlField(Version = "2.0", QualName = "protocol", ObjectClass = 1, Level = 3, Structure = 2, Offset = 1412, ElementSize = 2, IdentifierElement = 46)
    public short getProtocol() {
        return protocol;
    }

    public void setProtocol(short protocolParam) {
        this.protocol = protocolParam;
    }

    @DdlField(Version = "2.0", QualName = "offset", ObjectClass = 1, Level = 3, Structure = 2, Offset = 1414, ElementSize = 2, IdentifierElement = 47)
    public short getOffset() {
        return offset;
    }

    public void setOffset(short offsetParam) {
        this.offset = offsetParam;
    }

    @DdlField(Version = "2.0", QualName = "match-char", ObjectClass = 1, Level = 3, Structure = 0, Offset = 1416, ElementSize = 12, IdentifierElement = 48)
    public String getMatch_Char() {
        return match_Char;
    }

    public void setMatch_Char(String match_CharParam) {
        this.match_Char = match_CharParam;
    }

    @DdlField(Version = "2.0", QualName = "match-lgth", ObjectClass = 1, Level = 3, Structure = 2, Offset = 1428, ElementSize = 2, IdentifierElement = 49)
    public short getMatch_Lgth() {
        return match_Lgth;
    }

    public void setMatch_Lgth(short match_LgthParam) {
        this.match_Lgth = match_LgthParam;
    }

}
