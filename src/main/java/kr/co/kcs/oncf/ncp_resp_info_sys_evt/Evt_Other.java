
package kr.co.kcs.oncf.ncp_resp_info_sys_evt;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "evt-other", ElementSize = 2, LocalName = "evt-other")
public class Evt_Other
    implements Serializable, Evt_OtherMarker
{

    private short evt_Other;

    @DdlField(Version = "2.0", QualName = "evt-other", ObjectClass = 1, Level = 1, Structure = 2, Offset = 12, ElementSize = 2, IdentifierElement = 12)
    public short getEvt_Other() {
        return evt_Other;
    }

    public void setEvt_Other(short evt_OtherParam) {
        this.evt_Other = evt_OtherParam;
    }

}
