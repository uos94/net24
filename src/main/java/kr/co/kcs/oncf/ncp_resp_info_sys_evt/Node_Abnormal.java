
package kr.co.kcs.oncf.ncp_resp_info_sys_evt;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "node-abnormal", ElementSize = 2, LocalName = "node-abnormal")
public class Node_Abnormal
    implements Serializable, Evt_AbnormalMarker
{

    private short node_Abnormal;

    @DdlField(Version = "2.0", QualName = "node-abnormal", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 2)
    public short getNode_Abnormal() {
        return node_Abnormal;
    }

    public void setNode_Abnormal(short node_AbnormalParam) {
        this.node_Abnormal = node_AbnormalParam;
    }

}
