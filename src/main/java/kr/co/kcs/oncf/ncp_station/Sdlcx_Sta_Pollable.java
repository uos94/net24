
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "sdlcx-sta-pollable", ElementSize = 2, LocalName = "sdlcx-sta-pollable")
public class Sdlcx_Sta_Pollable
    implements Serializable, Sta_PollableMarker
{

    private short sdlcx_Sta_Pollable;

    @DdlField(Version = "2.0", QualName = "sdlcx-sta-pollable", ObjectClass = 1, Level = 1, Structure = 2, Offset = 212, ElementSize = 2, IdentifierElement = 71)
    public short getSdlcx_Sta_Pollable() {
        return sdlcx_Sta_Pollable;
    }

    public void setSdlcx_Sta_Pollable(short sdlcx_Sta_PollableParam) {
        this.sdlcx_Sta_Pollable = sdlcx_Sta_PollableParam;
    }

}
