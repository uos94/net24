
package kr.co.kcs.oncf.ncp_resp_info_sys_evt;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "node-unavail", ElementSize = 2, LocalName = "node-unavail")
public class Node_Unavail
    implements Serializable, Evt_UnavailMarker
{

    private short node_Unavail;

    @DdlField(Version = "2.0", QualName = "node-unavail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 17)
    public short getNode_Unavail() {
        return node_Unavail;
    }

    public void setNode_Unavail(short node_UnavailParam) {
        this.node_Unavail = node_UnavailParam;
    }

}
