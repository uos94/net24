
package kr.co.kcs.oncf.ncp_resp_info_sys_evt;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "evt-avail", ElementSize = 2, LocalName = "evt-avail")
public class Evt_Avail
    implements Serializable, Evt_AvailMarker
{

    private short evt_Avail;

    @DdlField(Version = "2.0", QualName = "evt-avail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 3)
    public short getEvt_Avail() {
        return evt_Avail;
    }

    public void setEvt_Avail(short evt_AvailParam) {
        this.evt_Avail = evt_AvailParam;
    }

}
