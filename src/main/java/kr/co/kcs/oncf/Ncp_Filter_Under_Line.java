
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-filter-under-line", ElementSize = 16, LocalName = "ncp-filter-under-line")
public class Ncp_Filter_Under_Line
    implements Serializable
{

    private String ncp_Filter_Under_Line;

    @DdlField(Version = "2.0", QualName = "ncp-filter-under-line", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 0)
    public String getNcp_Filter_Under_Line() {
        return ncp_Filter_Under_Line;
    }

    public void setNcp_Filter_Under_Line(String ncp_Filter_Under_LineParam) {
        this.ncp_Filter_Under_Line = ncp_Filter_Under_LineParam;
    }

}
