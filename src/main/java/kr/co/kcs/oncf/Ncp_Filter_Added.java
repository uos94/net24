
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-filter-added", ElementSize = 2, LocalName = "ncp-filter-added")
public class Ncp_Filter_Added
    implements Serializable
{

    private short ncp_Filter_Added;

    @DdlField(Version = "2.0", QualName = "ncp-filter-added", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Filter_Added() {
        return ncp_Filter_Added;
    }

    public void setNcp_Filter_Added(short ncp_Filter_AddedParam) {
        this.ncp_Filter_Added = ncp_Filter_AddedParam;
    }

}
