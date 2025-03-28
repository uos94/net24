
package kr.co.kcs.oncf.ncp_resp_info_sys_evt;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "node-threshold", ElementSize = 2, LocalName = "node-threshold")
public class Node_Threshold
    implements Serializable, Evt_ThresholdMarker
{

    private short node_Threshold;

    @DdlField(Version = "2.0", QualName = "node-threshold", ObjectClass = 1, Level = 1, Structure = 2, Offset = 14, ElementSize = 2, IdentifierElement = 15)
    public short getNode_Threshold() {
        return node_Threshold;
    }

    public void setNode_Threshold(short node_ThresholdParam) {
        this.node_Threshold = node_ThresholdParam;
    }

}
