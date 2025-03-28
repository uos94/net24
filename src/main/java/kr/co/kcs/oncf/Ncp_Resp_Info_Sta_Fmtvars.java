
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-info-sta-fmtvars", ElementSize = 82, LocalName = "ncp-resp-info-sta-fmtvars")
public class Ncp_Resp_Info_Sta_Fmtvars
    implements Serializable
{

    private short format_Var_Cnt;
    private String format_Var_String;

    @DdlField(Version = "2.0", QualName = "format-var-cnt", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getFormat_Var_Cnt() {
        return format_Var_Cnt;
    }

    public void setFormat_Var_Cnt(short format_Var_CntParam) {
        this.format_Var_Cnt = format_Var_CntParam;
    }

    @DdlField(Version = "2.0", QualName = "format-var-string", ObjectClass = 1, Level = 1, Structure = 0, Offset = 2, ElementSize = 80, IdentifierElement = 2)
    public String getFormat_Var_String() {
        return format_Var_String;
    }

    public void setFormat_Var_String(String format_Var_StringParam) {
        this.format_Var_String = format_Var_StringParam;
    }

}
