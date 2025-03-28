
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "fmtvars", ElementSize = 82, LocalName = "fmtvars")
public class Fmtvars
    implements Serializable
{

    private short format_Var_Cnt;
    private String format_Var_String;

    @DdlField(Version = "2.0", QualName = "format-var-cnt", ObjectClass = 1, Level = 2, Structure = 2, Offset = 406, ElementSize = 2, IdentifierElement = 96)
    public short getFormat_Var_Cnt() {
        return format_Var_Cnt;
    }

    public void setFormat_Var_Cnt(short format_Var_CntParam) {
        this.format_Var_Cnt = format_Var_CntParam;
    }

    @DdlField(Version = "2.0", QualName = "format-var-string", ObjectClass = 1, Level = 2, Structure = 0, Offset = 408, ElementSize = 80, IdentifierElement = 97)
    public String getFormat_Var_String() {
        return format_Var_String;
    }

    public void setFormat_Var_String(String format_Var_StringParam) {
        this.format_Var_String = format_Var_StringParam;
    }

}
