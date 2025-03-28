
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-filter-under-system", ElementSize = 16, LocalName = "ncp-filter-under-system")
public class Ncp_Filter_Under_System
    implements Serializable
{

    private String ncp_Filter_Under_System;

    @DdlField(Version = "2.0", QualName = "ncp-filter-under-system", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 0)
    public String getNcp_Filter_Under_System() {
        return ncp_Filter_Under_System;
    }

    public void setNcp_Filter_Under_System(String ncp_Filter_Under_SystemParam) {
        this.ncp_Filter_Under_System = ncp_Filter_Under_SystemParam;
    }

}
