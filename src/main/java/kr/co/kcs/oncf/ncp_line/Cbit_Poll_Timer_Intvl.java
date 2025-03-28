
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cbit-poll-timer-intvl", ElementSize = 2, LocalName = "cbit-poll-timer-intvl")
public class Cbit_Poll_Timer_Intvl
    implements Serializable, Timer_IntervalMarker
{

    private short cbit_Poll_Timer_Intvl;

    @DdlField(Version = "2.0", QualName = "cbit-poll-timer-intvl", ObjectClass = 1, Level = 1, Structure = 2, Offset = 210, ElementSize = 2, IdentifierElement = 168)
    public short getCbit_Poll_Timer_Intvl() {
        return cbit_Poll_Timer_Intvl;
    }

    public void setCbit_Poll_Timer_Intvl(short cbit_Poll_Timer_IntvlParam) {
        this.cbit_Poll_Timer_Intvl = cbit_Poll_Timer_IntvlParam;
    }

}
