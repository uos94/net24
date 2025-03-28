
package kr.co.kcs.oncf.ncp_resp_info_dev_dest;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "devdest-list", ElementSize = 36, LocalName = "devdest-list")
public class Devdest_List
    implements Serializable
{

    private short devdest_Entry;
    private String devdest_Name;
    private short devdest_Type;
    private short devdest_Offset;
    private String devdest_Char;
    private short devdest_Match_Lgth;

    @DdlField(Version = "2.0", QualName = "devdest-entry", ObjectClass = 1, Level = 2, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 4)
    public short getDevdest_Entry() {
        return devdest_Entry;
    }

    public void setDevdest_Entry(short devdest_EntryParam) {
        this.devdest_Entry = devdest_EntryParam;
    }

    @DdlField(Version = "2.0", QualName = "devdest-name", ObjectClass = 1, Level = 2, Structure = 0, Offset = 6, ElementSize = 16, IdentifierElement = 5)
    public String getDevdest_Name() {
        return devdest_Name;
    }

    public void setDevdest_Name(String devdest_NameParam) {
        this.devdest_Name = devdest_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "devdest-type", ObjectClass = 1, Level = 2, Structure = 2, Offset = 22, ElementSize = 2, IdentifierElement = 6)
    public short getDevdest_Type() {
        return devdest_Type;
    }

    public void setDevdest_Type(short devdest_TypeParam) {
        this.devdest_Type = devdest_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "devdest-offset", ObjectClass = 1, Level = 2, Structure = 2, Offset = 24, ElementSize = 2, IdentifierElement = 7)
    public short getDevdest_Offset() {
        return devdest_Offset;
    }

    public void setDevdest_Offset(short devdest_OffsetParam) {
        this.devdest_Offset = devdest_OffsetParam;
    }

    @DdlField(Version = "2.0", QualName = "devdest-char", ObjectClass = 1, Level = 2, Structure = 0, Offset = 26, ElementSize = 12, IdentifierElement = 8)
    public String getDevdest_Char() {
        return devdest_Char;
    }

    public void setDevdest_Char(String devdest_CharParam) {
        this.devdest_Char = devdest_CharParam;
    }

    @DdlField(Version = "2.0", QualName = "devdest-match-lgth", ObjectClass = 1, Level = 2, Structure = 2, Offset = 38, ElementSize = 2, IdentifierElement = 9)
    public short getDevdest_Match_Lgth() {
        return devdest_Match_Lgth;
    }

    public void setDevdest_Match_Lgth(short devdest_Match_LgthParam) {
        this.devdest_Match_Lgth = devdest_Match_LgthParam;
    }

}
