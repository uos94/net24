
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cmpsb-sta-pollable", ElementSize = 2, LocalName = "cmpsb-sta-pollable")
public class Cmpsb_Sta_Pollable
    implements Serializable, Sta_PollableMarker
{

    private short cmpsb_Sta_Pollable;

    @DdlField(Version = "2.0", QualName = "cmpsb-sta-pollable", ObjectClass = 1, Level = 1, Structure = 2, Offset = 212, ElementSize = 2, IdentifierElement = 68)
    public short getCmpsb_Sta_Pollable() {
        return cmpsb_Sta_Pollable;
    }

    public void setCmpsb_Sta_Pollable(short cmpsb_Sta_PollableParam) {
        this.cmpsb_Sta_Pollable = cmpsb_Sta_PollableParam;
    }

}
