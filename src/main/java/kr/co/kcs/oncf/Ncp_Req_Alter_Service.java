
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-alter-service", ElementSize = 32, LocalName = "ncp-req-alter-service")
public class Ncp_Req_Alter_Service
    implements Serializable
{

    private String ncp_Req_Alter_Service;

    @DdlField(Version = "2.0", QualName = "ncp-req-alter-service", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 32, IdentifierElement = 0)
    public String getNcp_Req_Alter_Service() {
        return ncp_Req_Alter_Service;
    }

    public void setNcp_Req_Alter_Service(String ncp_Req_Alter_ServiceParam) {
        this.ncp_Req_Alter_Service = ncp_Req_Alter_ServiceParam;
    }

}
