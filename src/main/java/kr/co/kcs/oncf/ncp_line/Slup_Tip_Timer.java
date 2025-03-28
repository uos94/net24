
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "slup-tip-timer", ElementSize = 2, LocalName = "slup-tip-timer")
public class Slup_Tip_Timer
    implements Serializable, A_TimerMarker
{

    private short slup_Tip_Timer;

    @DdlField(Version = "2.0", QualName = "slup-tip-timer", ObjectClass = 1, Level = 1, Structure = 2, Offset = 114, ElementSize = 2, IdentifierElement = 20)
    public short getSlup_Tip_Timer() {
        return slup_Tip_Timer;
    }

    public void setSlup_Tip_Timer(short slup_Tip_TimerParam) {
        this.slup_Tip_Timer = slup_Tip_TimerParam;
    }

}
