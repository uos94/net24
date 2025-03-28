
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cbit-poll-timer-dis", ElementSize = 2, LocalName = "cbit-poll-timer-dis")
public class Cbit_Poll_Timer_Dis
    implements Serializable, Timer_DisMarker
{

    private short cbit_Poll_Timer_Dis;

    @DdlField(Version = "2.0", QualName = "cbit-poll-timer-dis", ObjectClass = 1, Level = 1, Structure = 2, Offset = 208, ElementSize = 2, IdentifierElement = 162)
    public short getCbit_Poll_Timer_Dis() {
        return cbit_Poll_Timer_Dis;
    }

    public void setCbit_Poll_Timer_Dis(short cbit_Poll_Timer_DisParam) {
        this.cbit_Poll_Timer_Dis = cbit_Poll_Timer_DisParam;
    }

}
