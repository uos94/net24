
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bimpt-poll-timer-intvl", ElementSize = 2, LocalName = "bimpt-poll-timer-intvl")
public class Bimpt_Poll_Timer_Intvl
    implements Serializable, Timer_IntervalMarker
{

    private short bimpt_Poll_Timer_Intvl;

    @DdlField(Version = "2.0", QualName = "bimpt-poll-timer-intvl", ObjectClass = 1, Level = 1, Structure = 2, Offset = 210, ElementSize = 2, IdentifierElement = 167)
    public short getBimpt_Poll_Timer_Intvl() {
        return bimpt_Poll_Timer_Intvl;
    }

    public void setBimpt_Poll_Timer_Intvl(short bimpt_Poll_Timer_IntvlParam) {
        this.bimpt_Poll_Timer_Intvl = bimpt_Poll_Timer_IntvlParam;
    }

}
