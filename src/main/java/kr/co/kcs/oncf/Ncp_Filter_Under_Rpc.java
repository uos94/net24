
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-filter-under-rpc", ElementSize = 47, LocalName = "ncp-filter-under-rpc")
public class Ncp_Filter_Under_Rpc
    implements Serializable
{

    private String ncp_Filter_Under_Rpc;

    @DdlField(Version = "2.0", QualName = "ncp-filter-under-rpc", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 47, IdentifierElement = 0)
    public String getNcp_Filter_Under_Rpc() {
        return ncp_Filter_Under_Rpc;
    }

    public void setNcp_Filter_Under_Rpc(String ncp_Filter_Under_RpcParam) {
        this.ncp_Filter_Under_Rpc = ncp_Filter_Under_RpcParam;
    }

}
