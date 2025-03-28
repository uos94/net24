
package kr.co.kcs.oncf.ncp_resp_info_sys_evt;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "evt-info", ElementSize = 2, LocalName = "evt-info")
public class Evt_Info
    implements Serializable, Evt_InfoMarker
{

    private short evt_Info;

    @DdlField(Version = "2.0", QualName = "evt-info", ObjectClass = 1, Level = 1, Structure = 2, Offset = 8, ElementSize = 2, IdentifierElement = 9)
    public short getEvt_Info() {
        return evt_Info;
    }

    public void setEvt_Info(short evt_InfoParam) {
        this.evt_Info = evt_InfoParam;
    }

}
