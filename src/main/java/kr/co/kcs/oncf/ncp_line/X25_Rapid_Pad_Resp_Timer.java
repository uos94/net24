
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x25-rapid-pad-resp-timer", ElementSize = 2, LocalName = "x25-rapid-pad-resp-timer")
public class X25_Rapid_Pad_Resp_Timer
    implements Serializable, A_TimerMarker
{

    private short x25_Rapid_Pad_Resp_Timer;

    @DdlField(Version = "2.0", QualName = "x25-rapid-pad-resp-timer", ObjectClass = 1, Level = 1, Structure = 2, Offset = 114, ElementSize = 2, IdentifierElement = 29)
    public short getX25_Rapid_Pad_Resp_Timer() {
        return x25_Rapid_Pad_Resp_Timer;
    }

    public void setX25_Rapid_Pad_Resp_Timer(short x25_Rapid_Pad_Resp_TimerParam) {
        this.x25_Rapid_Pad_Resp_Timer = x25_Rapid_Pad_Resp_TimerParam;
    }

}
