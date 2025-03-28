
package kr.co.kcs.oncf.ncp_resp_info_sys_evt;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "evt-unavail", ElementSize = 2, LocalName = "evt-unavail")
public class Evt_Unavail
    implements Serializable, Evt_UnavailMarker
{

    private short evt_Unavail;

    @DdlField(Version = "2.0", QualName = "evt-unavail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 16)
    public short getEvt_Unavail() {
        return evt_Unavail;
    }

    public void setEvt_Unavail(short evt_UnavailParam) {
        this.evt_Unavail = evt_UnavailParam;
    }

}
