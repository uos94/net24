
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "sta-pollable", ElementSize = 2, LocalName = "sta-pollable")
public class Sta_Pollable
    implements Serializable, Sta_PollableMarker
{

    private short sta_Pollable;

    @DdlField(Version = "2.0", QualName = "sta-pollable", ObjectClass = 1, Level = 1, Structure = 2, Offset = 212, ElementSize = 2, IdentifierElement = 62)
    public short getSta_Pollable() {
        return sta_Pollable;
    }

    public void setSta_Pollable(short sta_PollableParam) {
        this.sta_Pollable = sta_PollableParam;
    }

}
