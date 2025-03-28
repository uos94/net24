
package kr.co.kcs.oncf.ncp_resp_status_sta;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "sdlcx-state-detail", ElementSize = 2, LocalName = "sdlcx-state-detail")
public class Sdlcx_State_Detail
    implements Serializable, State_DetailMarker
{

    private short sdlcx_State_Detail;

    @DdlField(Version = "2.0", QualName = "sdlcx-state-detail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 13)
    public short getSdlcx_State_Detail() {
        return sdlcx_State_Detail;
    }

    public void setSdlcx_State_Detail(short sdlcx_State_DetailParam) {
        this.sdlcx_State_Detail = sdlcx_State_DetailParam;
    }

}
