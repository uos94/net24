
package kr.co.kcs.oncf.ncp_resp_info_sys_evt;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "evt-debug", ElementSize = 2, LocalName = "evt-debug")
public class Evt_Debug
    implements Serializable, Evt_DebugMarker
{

    private short evt_Debug;

    @DdlField(Version = "2.0", QualName = "evt-debug", ObjectClass = 1, Level = 1, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 5)
    public short getEvt_Debug() {
        return evt_Debug;
    }

    public void setEvt_Debug(short evt_DebugParam) {
        this.evt_Debug = evt_DebugParam;
    }

}
