
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "nc279-sta-pollable", ElementSize = 2, LocalName = "nc279-sta-pollable")
public class Nc279_Sta_Pollable
    implements Serializable, Sta_PollableMarker
{

    private short nc279_Sta_Pollable;

    @DdlField(Version = "2.0", QualName = "nc279-sta-pollable", ObjectClass = 1, Level = 1, Structure = 2, Offset = 212, ElementSize = 2, IdentifierElement = 70)
    public short getNc279_Sta_Pollable() {
        return nc279_Sta_Pollable;
    }

    public void setNc279_Sta_Pollable(short nc279_Sta_PollableParam) {
        this.nc279_Sta_Pollable = nc279_Sta_PollableParam;
    }

}
