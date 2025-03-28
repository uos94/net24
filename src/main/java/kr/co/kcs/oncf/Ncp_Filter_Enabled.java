
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-filter-enabled", ElementSize = 2, LocalName = "ncp-filter-enabled")
public class Ncp_Filter_Enabled
    implements Serializable
{

    private short ncp_Filter_Enabled;

    @DdlField(Version = "2.0", QualName = "ncp-filter-enabled", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Filter_Enabled() {
        return ncp_Filter_Enabled;
    }

    public void setNcp_Filter_Enabled(short ncp_Filter_EnabledParam) {
        this.ncp_Filter_Enabled = ncp_Filter_EnabledParam;
    }

}
