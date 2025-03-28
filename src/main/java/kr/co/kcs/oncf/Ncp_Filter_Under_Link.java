
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-filter-under-link", ElementSize = 16, LocalName = "ncp-filter-under-link")
public class Ncp_Filter_Under_Link
    implements Serializable
{

    private String ncp_Filter_Under_Link;

    @DdlField(Version = "2.0", QualName = "ncp-filter-under-link", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 0)
    public String getNcp_Filter_Under_Link() {
        return ncp_Filter_Under_Link;
    }

    public void setNcp_Filter_Under_Link(String ncp_Filter_Under_LinkParam) {
        this.ncp_Filter_Under_Link = ncp_Filter_Under_LinkParam;
    }

}
