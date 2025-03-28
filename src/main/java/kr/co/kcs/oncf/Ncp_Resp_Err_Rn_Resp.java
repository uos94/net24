
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-err-rn-resp", ElementSize = 2, LocalName = "ncp-resp-err-rn-resp")
public class Ncp_Resp_Err_Rn_Resp
    implements Serializable
{

    private short ncp_Resp_Err_Rn_Resp;

    @DdlField(Version = "2.0", QualName = "ncp-resp-err-rn-resp", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Resp_Err_Rn_Resp() {
        return ncp_Resp_Err_Rn_Resp;
    }

    public void setNcp_Resp_Err_Rn_Resp(short ncp_Resp_Err_Rn_RespParam) {
        this.ncp_Resp_Err_Rn_Resp = ncp_Resp_Err_Rn_RespParam;
    }

}
