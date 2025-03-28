
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-err-node-resp", ElementSize = 2, LocalName = "ncp-resp-err-node-resp")
public class Ncp_Resp_Err_Node_Resp
    implements Serializable
{

    private short ncp_Resp_Err_Node_Resp;

    @DdlField(Version = "2.0", QualName = "ncp-resp-err-node-resp", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Resp_Err_Node_Resp() {
        return ncp_Resp_Err_Node_Resp;
    }

    public void setNcp_Resp_Err_Node_Resp(short ncp_Resp_Err_Node_RespParam) {
        this.ncp_Resp_Err_Node_Resp = ncp_Resp_Err_Node_RespParam;
    }

}
