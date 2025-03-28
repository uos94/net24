
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-info-node", ElementSize = 1656, LocalName = "ncp-resp-info-node")
public class Ncp_Resp_Info_Node
    implements Serializable
{

    private Ncp_Node ncp_Resp_Info_Node;

    @DdlField(Version = "2.0", QualName = "ncp-resp-info-node", ObjectClass = 0, Level = 0, Structure = 0, Offset = 0, ElementSize = 1656, IdentifierElement = 0)
    public Ncp_Node getNcp_Resp_Info_Node() {
        return ncp_Resp_Info_Node;
    }

    public void setNcp_Resp_Info_Node(Ncp_Node ncp_Resp_Info_NodeParam) {
        this.ncp_Resp_Info_Node = ncp_Resp_Info_NodeParam;
    }

}
