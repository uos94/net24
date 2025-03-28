
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bimpt-sta-pollable", ElementSize = 2, LocalName = "bimpt-sta-pollable")
public class Bimpt_Sta_Pollable
    implements Serializable, Sta_PollableMarker
{

    private short bimpt_Sta_Pollable;

    @DdlField(Version = "2.0", QualName = "bimpt-sta-pollable", ObjectClass = 1, Level = 1, Structure = 2, Offset = 212, ElementSize = 2, IdentifierElement = 64)
    public short getBimpt_Sta_Pollable() {
        return bimpt_Sta_Pollable;
    }

    public void setBimpt_Sta_Pollable(short bimpt_Sta_PollableParam) {
        this.bimpt_Sta_Pollable = bimpt_Sta_PollableParam;
    }

}
