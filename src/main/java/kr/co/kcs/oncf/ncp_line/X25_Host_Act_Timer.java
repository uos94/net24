
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x25-host-act-timer", ElementSize = 2, LocalName = "x25-host-act-timer")
public class X25_Host_Act_Timer
    implements Serializable, A_TimerMarker
{

    private short x25_Host_Act_Timer;

    @DdlField(Version = "2.0", QualName = "x25-host-act-timer", ObjectClass = 1, Level = 1, Structure = 2, Offset = 114, ElementSize = 2, IdentifierElement = 24)
    public short getX25_Host_Act_Timer() {
        return x25_Host_Act_Timer;
    }

    public void setX25_Host_Act_Timer(short x25_Host_Act_TimerParam) {
        this.x25_Host_Act_Timer = x25_Host_Act_TimerParam;
    }

}
