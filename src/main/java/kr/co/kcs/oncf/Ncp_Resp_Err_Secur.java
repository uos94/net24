
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-err-secur", ElementSize = 2, LocalName = "ncp-resp-err-secur")
public class Ncp_Resp_Err_Secur
    implements Serializable
{

    private short ncp_Resp_Err_Secur;

    @DdlField(Version = "2.0", QualName = "ncp-resp-err-secur", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Resp_Err_Secur() {
        return ncp_Resp_Err_Secur;
    }

    public void setNcp_Resp_Err_Secur(short ncp_Resp_Err_SecurParam) {
        this.ncp_Resp_Err_Secur = ncp_Resp_Err_SecurParam;
    }

}
