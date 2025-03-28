
package kr.co.kcs.oncf.ncp_resp_info_sys_evt;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "evt-abnormal", ElementSize = 2, LocalName = "evt-abnormal")
public class Evt_Abnormal
    implements Serializable, Evt_AbnormalMarker
{

    private short evt_Abnormal;

    @DdlField(Version = "2.0", QualName = "evt-abnormal", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getEvt_Abnormal() {
        return evt_Abnormal;
    }

    public void setEvt_Abnormal(short evt_AbnormalParam) {
        this.evt_Abnormal = evt_AbnormalParam;
    }

}
