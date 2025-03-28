
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bimps-sta-pollable", ElementSize = 2, LocalName = "bimps-sta-pollable")
public class Bimps_Sta_Pollable
    implements Serializable, Sta_PollableMarker
{

    private short bimps_Sta_Pollable;

    @DdlField(Version = "2.0", QualName = "bimps-sta-pollable", ObjectClass = 1, Level = 1, Structure = 2, Offset = 212, ElementSize = 2, IdentifierElement = 63)
    public short getBimps_Sta_Pollable() {
        return bimps_Sta_Pollable;
    }

    public void setBimps_Sta_Pollable(short bimps_Sta_PollableParam) {
        this.bimps_Sta_Pollable = bimps_Sta_PollableParam;
    }

}
