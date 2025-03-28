
package kr.co.kcs.oncf.ncp_resp_info_sys_evt;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "node-avail", ElementSize = 2, LocalName = "node-avail")
public class Node_Avail
    implements Serializable, Evt_AvailMarker
{

    private short node_Avail;

    @DdlField(Version = "2.0", QualName = "node-avail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 4)
    public short getNode_Avail() {
        return node_Avail;
    }

    public void setNode_Avail(short node_AvailParam) {
        this.node_Avail = node_AvailParam;
    }

}
