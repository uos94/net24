
package kr.co.kcs.oncf.ncp_resp_info_sys_evt;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "node-other", ElementSize = 2, LocalName = "node-other")
public class Node_Other
    implements Serializable, Evt_OtherMarker
{

    private short node_Other;

    @DdlField(Version = "2.0", QualName = "node-other", ObjectClass = 1, Level = 1, Structure = 2, Offset = 12, ElementSize = 2, IdentifierElement = 13)
    public short getNode_Other() {
        return node_Other;
    }

    public void setNode_Other(short node_OtherParam) {
        this.node_Other = node_OtherParam;
    }

}
