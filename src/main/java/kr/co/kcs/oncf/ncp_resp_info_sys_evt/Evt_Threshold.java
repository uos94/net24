
package kr.co.kcs.oncf.ncp_resp_info_sys_evt;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "evt-threshold", ElementSize = 2, LocalName = "evt-threshold")
public class Evt_Threshold
    implements Serializable, Evt_ThresholdMarker
{

    private short evt_Threshold;

    @DdlField(Version = "2.0", QualName = "evt-threshold", ObjectClass = 1, Level = 1, Structure = 2, Offset = 14, ElementSize = 2, IdentifierElement = 14)
    public short getEvt_Threshold() {
        return evt_Threshold;
    }

    public void setEvt_Threshold(short evt_ThresholdParam) {
        this.evt_Threshold = evt_ThresholdParam;
    }

}
