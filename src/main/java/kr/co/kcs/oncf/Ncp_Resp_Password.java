
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-password", ElementSize = 2, LocalName = "ncp-resp-password")
public class Ncp_Resp_Password
    implements Serializable
{

    private short ncp_Resp_Password;

    @DdlField(Version = "2.0", QualName = "ncp-resp-password", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Resp_Password() {
        return ncp_Resp_Password;
    }

    public void setNcp_Resp_Password(short ncp_Resp_PasswordParam) {
        this.ncp_Resp_Password = ncp_Resp_PasswordParam;
    }

}
