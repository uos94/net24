
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-alter-sta-dev", ElementSize = 16, LocalName = "ncp-req-alter-sta-dev")
public class Ncp_Req_Alter_Sta_Dev
    implements Serializable
{

    private String ncp_Req_Alter_Sta_Dev;

    @DdlField(Version = "2.0", QualName = "ncp-req-alter-sta-dev", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 0)
    public String getNcp_Req_Alter_Sta_Dev() {
        return ncp_Req_Alter_Sta_Dev;
    }

    public void setNcp_Req_Alter_Sta_Dev(String ncp_Req_Alter_Sta_DevParam) {
        this.ncp_Req_Alter_Sta_Dev = ncp_Req_Alter_Sta_DevParam;
    }

}
