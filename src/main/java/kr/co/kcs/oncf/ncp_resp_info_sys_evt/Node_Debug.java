
package kr.co.kcs.oncf.ncp_resp_info_sys_evt;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "node-debug", ElementSize = 2, LocalName = "node-debug")
public class Node_Debug
    implements Serializable, Evt_DebugMarker
{

    private short node_Debug;

    @DdlField(Version = "2.0", QualName = "node-debug", ObjectClass = 1, Level = 1, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 6)
    public short getNode_Debug() {
        return node_Debug;
    }

    public void setNode_Debug(short node_DebugParam) {
        this.node_Debug = node_DebugParam;
    }

}
