
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bumps-poll-int", ElementSize = 2, LocalName = "bumps-poll-int")
public class Bumps_Poll_Int
    implements Serializable, Poll_IntervalMarker
{

    private short bumps_Poll_Int;

    @DdlField(Version = "2.0", QualName = "bumps-poll-int", ObjectClass = 1, Level = 1, Structure = 2, Offset = 176, ElementSize = 2, IdentifierElement = 131)
    public short getBumps_Poll_Int() {
        return bumps_Poll_Int;
    }

    public void setBumps_Poll_Int(short bumps_Poll_IntParam) {
        this.bumps_Poll_Int = bumps_Poll_IntParam;
    }

}
