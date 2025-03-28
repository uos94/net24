
package kr.co.kcs.oncf.ncp_resp_info_dev_prot;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "devprot-list", ElementSize = 20, LocalName = "devprot-list")
public class Devprot_List
    implements Serializable
{

    private short devprot_Entry;
    private short devprot_Id;
    private short devprot_Offset;
    private String devprot_Char;
    private short devprot_Match_Lgth;

    @DdlField(Version = "2.0", QualName = "devprot-entry", ObjectClass = 1, Level = 2, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 4)
    public short getDevprot_Entry() {
        return devprot_Entry;
    }

    public void setDevprot_Entry(short devprot_EntryParam) {
        this.devprot_Entry = devprot_EntryParam;
    }

    @DdlField(Version = "2.0", QualName = "devprot-id", ObjectClass = 1, Level = 2, Structure = 2, Offset = 6, ElementSize = 2, IdentifierElement = 5)
    public short getDevprot_Id() {
        return devprot_Id;
    }

    public void setDevprot_Id(short devprot_IdParam) {
        this.devprot_Id = devprot_IdParam;
    }

    @DdlField(Version = "2.0", QualName = "devprot-offset", ObjectClass = 1, Level = 2, Structure = 2, Offset = 8, ElementSize = 2, IdentifierElement = 6)
    public short getDevprot_Offset() {
        return devprot_Offset;
    }

    public void setDevprot_Offset(short devprot_OffsetParam) {
        this.devprot_Offset = devprot_OffsetParam;
    }

    @DdlField(Version = "2.0", QualName = "devprot-char", ObjectClass = 1, Level = 2, Structure = 0, Offset = 10, ElementSize = 12, IdentifierElement = 7)
    public String getDevprot_Char() {
        return devprot_Char;
    }

    public void setDevprot_Char(String devprot_CharParam) {
        this.devprot_Char = devprot_CharParam;
    }

    @DdlField(Version = "2.0", QualName = "devprot-match-lgth", ObjectClass = 1, Level = 2, Structure = 2, Offset = 22, ElementSize = 2, IdentifierElement = 8)
    public short getDevprot_Match_Lgth() {
        return devprot_Match_Lgth;
    }

    public void setDevprot_Match_Lgth(short devprot_Match_LgthParam) {
        this.devprot_Match_Lgth = devprot_Match_LgthParam;
    }

}
