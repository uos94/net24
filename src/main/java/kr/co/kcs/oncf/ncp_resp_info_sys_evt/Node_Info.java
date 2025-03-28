
package kr.co.kcs.oncf.ncp_resp_info_sys_evt;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "node-info", ElementSize = 2, LocalName = "node-info")
public class Node_Info
    implements Serializable, Evt_InfoMarker
{

    private short node_Info;

    @DdlField(Version = "2.0", QualName = "node-info", ObjectClass = 1, Level = 1, Structure = 2, Offset = 8, ElementSize = 2, IdentifierElement = 10)
    public short getNode_Info() {
        return node_Info;
    }

    public void setNode_Info(short node_InfoParam) {
        this.node_Info = node_InfoParam;
    }

}
