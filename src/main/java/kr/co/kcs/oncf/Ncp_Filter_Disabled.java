
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-filter-disabled", ElementSize = 2, LocalName = "ncp-filter-disabled")
public class Ncp_Filter_Disabled
    implements Serializable
{

    private short ncp_Filter_Disabled;

    @DdlField(Version = "2.0", QualName = "ncp-filter-disabled", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Filter_Disabled() {
        return ncp_Filter_Disabled;
    }

    public void setNcp_Filter_Disabled(short ncp_Filter_DisabledParam) {
        this.ncp_Filter_Disabled = ncp_Filter_DisabledParam;
    }

}
