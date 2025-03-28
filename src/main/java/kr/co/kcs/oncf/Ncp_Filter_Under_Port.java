
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-filter-under-port", ElementSize = 47, LocalName = "ncp-filter-under-port")
public class Ncp_Filter_Under_Port
    implements Serializable
{

    private String ncp_Filter_Under_Port;

    @DdlField(Version = "2.0", QualName = "ncp-filter-under-port", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 47, IdentifierElement = 0)
    public String getNcp_Filter_Under_Port() {
        return ncp_Filter_Under_Port;
    }

    public void setNcp_Filter_Under_Port(String ncp_Filter_Under_PortParam) {
        this.ncp_Filter_Under_Port = ncp_Filter_Under_PortParam;
    }

}
