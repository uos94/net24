
package kr.co.kcs.oncf.ncp_resp_info_sys_evt;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "evt-diag", ElementSize = 2, LocalName = "evt-diag")
public class Evt_Diag
    implements Serializable, Evt_DiagMarker
{

    private short evt_Diag;

    @DdlField(Version = "2.0", QualName = "evt-diag", ObjectClass = 1, Level = 1, Structure = 2, Offset = 6, ElementSize = 2, IdentifierElement = 7)
    public short getEvt_Diag() {
        return evt_Diag;
    }

    public void setEvt_Diag(short evt_DiagParam) {
        this.evt_Diag = evt_DiagParam;
    }

}
