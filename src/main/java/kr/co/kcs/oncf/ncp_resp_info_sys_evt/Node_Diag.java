
package kr.co.kcs.oncf.ncp_resp_info_sys_evt;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "node-diag", ElementSize = 2, LocalName = "node-diag")
public class Node_Diag
    implements Serializable, Evt_DiagMarker
{

    private short node_Diag;

    @DdlField(Version = "2.0", QualName = "node-diag", ObjectClass = 1, Level = 1, Structure = 2, Offset = 6, ElementSize = 2, IdentifierElement = 8)
    public short getNode_Diag() {
        return node_Diag;
    }

    public void setNode_Diag(short node_DiagParam) {
        this.node_Diag = node_DiagParam;
    }

}
