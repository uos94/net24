
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-set-password", ElementSize = 16, LocalName = "ncp-req-set-password")
public class Ncp_Req_Set_Password
    implements Serializable
{

    private String ncp_Req_Set_Password;

    @DdlField(Version = "2.0", QualName = "ncp-req-set-password", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 0)
    public String getNcp_Req_Set_Password() {
        return ncp_Req_Set_Password;
    }

    public void setNcp_Req_Set_Password(String ncp_Req_Set_PasswordParam) {
        this.ncp_Req_Set_Password = ncp_Req_Set_PasswordParam;
    }

}
