
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-alter-frmtmacro", ElementSize = 114, LocalName = "ncp-req-alter-frmtmacro")
public class Ncp_Req_Alter_Frmtmacro
    implements Serializable
{

    private short macro;
    private short inpfrmt_Lgth;
    private String inpfrmt_Chars;
    private short outfrmt_Lgth;
    private String outfrmt_Chars;
    private short pollfrmt_Lgth;
    private String pollfrmt_Chars;
    private short selfrmt_Lgth;
    private String selfrmt_Chars;

    @DdlField(Version = "2.0", QualName = "macro", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getMacro() {
        return macro;
    }

    public void setMacro(short macroParam) {
        this.macro = macroParam;
    }

    @DdlField(Version = "2.0", QualName = "inpfrmt-lgth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getInpfrmt_Lgth() {
        return inpfrmt_Lgth;
    }

    public void setInpfrmt_Lgth(short inpfrmt_LgthParam) {
        this.inpfrmt_Lgth = inpfrmt_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "inpfrmt-chars", ObjectClass = 1, Level = 1, Structure = 0, Offset = 4, ElementSize = 32, IdentifierElement = 3)
    public String getInpfrmt_Chars() {
        return inpfrmt_Chars;
    }

    public void setInpfrmt_Chars(String inpfrmt_CharsParam) {
        this.inpfrmt_Chars = inpfrmt_CharsParam;
    }

    @DdlField(Version = "2.0", QualName = "outfrmt-lgth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 36, ElementSize = 2, IdentifierElement = 4)
    public short getOutfrmt_Lgth() {
        return outfrmt_Lgth;
    }

    public void setOutfrmt_Lgth(short outfrmt_LgthParam) {
        this.outfrmt_Lgth = outfrmt_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "outfrmt-chars", ObjectClass = 1, Level = 1, Structure = 0, Offset = 38, ElementSize = 32, IdentifierElement = 5)
    public String getOutfrmt_Chars() {
        return outfrmt_Chars;
    }

    public void setOutfrmt_Chars(String outfrmt_CharsParam) {
        this.outfrmt_Chars = outfrmt_CharsParam;
    }

    @DdlField(Version = "2.0", QualName = "pollfrmt-lgth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 70, ElementSize = 2, IdentifierElement = 6)
    public short getPollfrmt_Lgth() {
        return pollfrmt_Lgth;
    }

    public void setPollfrmt_Lgth(short pollfrmt_LgthParam) {
        this.pollfrmt_Lgth = pollfrmt_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "pollfrmt-chars", ObjectClass = 1, Level = 1, Structure = 0, Offset = 72, ElementSize = 20, IdentifierElement = 7)
    public String getPollfrmt_Chars() {
        return pollfrmt_Chars;
    }

    public void setPollfrmt_Chars(String pollfrmt_CharsParam) {
        this.pollfrmt_Chars = pollfrmt_CharsParam;
    }

    @DdlField(Version = "2.0", QualName = "selfrmt-lgth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 92, ElementSize = 2, IdentifierElement = 8)
    public short getSelfrmt_Lgth() {
        return selfrmt_Lgth;
    }

    public void setSelfrmt_Lgth(short selfrmt_LgthParam) {
        this.selfrmt_Lgth = selfrmt_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "selfrmt-chars", ObjectClass = 1, Level = 1, Structure = 0, Offset = 94, ElementSize = 20, IdentifierElement = 9)
    public String getSelfrmt_Chars() {
        return selfrmt_Chars;
    }

    public void setSelfrmt_Chars(String selfrmt_CharsParam) {
        this.selfrmt_Chars = selfrmt_CharsParam;
    }

}
