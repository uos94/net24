
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-alter-meascounter", ElementSize = 14, LocalName = "ncp-req-alter-meascounter")
public class Ncp_Req_Alter_Meascounter
    implements Serializable
{

    private String ncp_Req_Alter_Meascounter;

    @DdlField(Version = "2.0", QualName = "ncp-req-alter-meascounter", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 14, IdentifierElement = 0)
    public String getNcp_Req_Alter_Meascounter() {
        return ncp_Req_Alter_Meascounter;
    }

    public void setNcp_Req_Alter_Meascounter(String ncp_Req_Alter_MeascounterParam) {
        this.ncp_Req_Alter_Meascounter = ncp_Req_Alter_MeascounterParam;
    }

}
