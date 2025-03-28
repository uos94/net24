
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x25-rapid-sta-pollable", ElementSize = 2, LocalName = "x25-rapid-sta-pollable")
public class X25_Rapid_Sta_Pollable
    implements Serializable, Sta_PollableMarker
{

    private short x25_Rapid_Sta_Pollable;

    @DdlField(Version = "2.0", QualName = "x25-rapid-sta-pollable", ObjectClass = 1, Level = 1, Structure = 2, Offset = 212, ElementSize = 2, IdentifierElement = 69)
    public short getX25_Rapid_Sta_Pollable() {
        return x25_Rapid_Sta_Pollable;
    }

    public void setX25_Rapid_Sta_Pollable(short x25_Rapid_Sta_PollableParam) {
        this.x25_Rapid_Sta_Pollable = x25_Rapid_Sta_PollableParam;
    }

}
