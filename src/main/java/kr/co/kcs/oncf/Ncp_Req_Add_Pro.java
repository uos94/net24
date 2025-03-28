
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-add-pro", ElementSize = 1358, LocalName = "ncp-req-add-pro")
public class Ncp_Req_Add_Pro
    implements Serializable
{

    private Ncp_Process ncp_Req_Add_Pro;

    @DdlField(Version = "2.0", QualName = "ncp-req-add-pro", ObjectClass = 0, Level = 0, Structure = 0, Offset = 0, ElementSize = 1358, IdentifierElement = 0)
    public Ncp_Process getNcp_Req_Add_Pro() {
        return ncp_Req_Add_Pro;
    }

    public void setNcp_Req_Add_Pro(Ncp_Process ncp_Req_Add_ProParam) {
        this.ncp_Req_Add_Pro = ncp_Req_Add_ProParam;
    }

}
