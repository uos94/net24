
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bumps-sta-pollable", ElementSize = 2, LocalName = "bumps-sta-pollable")
public class Bumps_Sta_Pollable
    implements Serializable, Sta_PollableMarker
{

    private short bumps_Sta_Pollable;

    @DdlField(Version = "2.0", QualName = "bumps-sta-pollable", ObjectClass = 1, Level = 1, Structure = 2, Offset = 212, ElementSize = 2, IdentifierElement = 65)
    public short getBumps_Sta_Pollable() {
        return bumps_Sta_Pollable;
    }

    public void setBumps_Sta_Pollable(short bumps_Sta_PollableParam) {
        this.bumps_Sta_Pollable = bumps_Sta_PollableParam;
    }

}
