
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-add-dev", ElementSize = 1962, LocalName = "ncp-req-add-dev")
public class Ncp_Req_Add_Dev
    implements Serializable
{

    private Ncp_Device ncp_Req_Add_Dev;

    @DdlField(Version = "2.0", QualName = "ncp-req-add-dev", ObjectClass = 0, Level = 0, Structure = 0, Offset = 0, ElementSize = 1962, IdentifierElement = 0)
    public Ncp_Device getNcp_Req_Add_Dev() {
        return ncp_Req_Add_Dev;
    }

    public void setNcp_Req_Add_Dev(Ncp_Device ncp_Req_Add_DevParam) {
        this.ncp_Req_Add_Dev = ncp_Req_Add_DevParam;
    }

}
