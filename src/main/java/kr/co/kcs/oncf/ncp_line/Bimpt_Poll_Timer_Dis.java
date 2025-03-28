
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bimpt-poll-timer-dis", ElementSize = 2, LocalName = "bimpt-poll-timer-dis")
public class Bimpt_Poll_Timer_Dis
    implements Serializable, Timer_DisMarker
{

    private short bimpt_Poll_Timer_Dis;

    @DdlField(Version = "2.0", QualName = "bimpt-poll-timer-dis", ObjectClass = 1, Level = 1, Structure = 2, Offset = 208, ElementSize = 2, IdentifierElement = 161)
    public short getBimpt_Poll_Timer_Dis() {
        return bimpt_Poll_Timer_Dis;
    }

    public void setBimpt_Poll_Timer_Dis(short bimpt_Poll_Timer_DisParam) {
        this.bimpt_Poll_Timer_Dis = bimpt_Poll_Timer_DisParam;
    }

}
