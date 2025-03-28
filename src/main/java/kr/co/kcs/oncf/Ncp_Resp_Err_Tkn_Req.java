
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-err-tkn-req", ElementSize = 2, LocalName = "ncp-resp-err-tkn-req")
public class Ncp_Resp_Err_Tkn_Req
    implements Serializable
{

    private short ncp_Resp_Err_Tkn_Req;

    @DdlField(Version = "2.0", QualName = "ncp-resp-err-tkn-req", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Resp_Err_Tkn_Req() {
        return ncp_Resp_Err_Tkn_Req;
    }

    public void setNcp_Resp_Err_Tkn_Req(short ncp_Resp_Err_Tkn_ReqParam) {
        this.ncp_Resp_Err_Tkn_Req = ncp_Resp_Err_Tkn_ReqParam;
    }

}
