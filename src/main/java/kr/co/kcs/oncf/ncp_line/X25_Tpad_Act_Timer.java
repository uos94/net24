
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x25-tpad-act-timer", ElementSize = 2, LocalName = "x25-tpad-act-timer")
public class X25_Tpad_Act_Timer
    implements Serializable, A_TimerMarker
{

    private short x25_Tpad_Act_Timer;

    @DdlField(Version = "2.0", QualName = "x25-tpad-act-timer", ObjectClass = 1, Level = 1, Structure = 2, Offset = 114, ElementSize = 2, IdentifierElement = 30)
    public short getX25_Tpad_Act_Timer() {
        return x25_Tpad_Act_Timer;
    }

    public void setX25_Tpad_Act_Timer(short x25_Tpad_Act_TimerParam) {
        this.x25_Tpad_Act_Timer = x25_Tpad_Act_TimerParam;
    }

}
