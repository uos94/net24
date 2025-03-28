
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "slup-cont-timer", ElementSize = 2, LocalName = "slup-cont-timer")
public class Slup_Cont_Timer
    implements Serializable, B_TimerMarker
{

    private short slup_Cont_Timer;

    @DdlField(Version = "2.0", QualName = "slup-cont-timer", ObjectClass = 1, Level = 1, Structure = 2, Offset = 116, ElementSize = 2, IdentifierElement = 36)
    public short getSlup_Cont_Timer() {
        return slup_Cont_Timer;
    }

    public void setSlup_Cont_Timer(short slup_Cont_TimerParam) {
        this.slup_Cont_Timer = slup_Cont_TimerParam;
    }

}
