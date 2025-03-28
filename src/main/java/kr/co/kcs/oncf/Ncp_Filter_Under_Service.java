
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-filter-under-service", ElementSize = 16, LocalName = "ncp-filter-under-service")
public class Ncp_Filter_Under_Service
    implements Serializable
{

    private String ncp_Filter_Under_Service;

    @DdlField(Version = "2.0", QualName = "ncp-filter-under-service", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 0)
    public String getNcp_Filter_Under_Service() {
        return ncp_Filter_Under_Service;
    }

    public void setNcp_Filter_Under_Service(String ncp_Filter_Under_ServiceParam) {
        this.ncp_Filter_Under_Service = ncp_Filter_Under_ServiceParam;
    }

}
