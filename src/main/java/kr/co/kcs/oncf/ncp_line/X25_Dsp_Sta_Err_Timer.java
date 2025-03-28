
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x25-dsp-sta-err-timer", ElementSize = 2, LocalName = "x25-dsp-sta-err-timer")
public class X25_Dsp_Sta_Err_Timer
    implements Serializable, A_TimerMarker
{

    private short x25_Dsp_Sta_Err_Timer;

    @DdlField(Version = "2.0", QualName = "x25-dsp-sta-err-timer", ObjectClass = 1, Level = 1, Structure = 2, Offset = 114, ElementSize = 2, IdentifierElement = 23)
    public short getX25_Dsp_Sta_Err_Timer() {
        return x25_Dsp_Sta_Err_Timer;
    }

    public void setX25_Dsp_Sta_Err_Timer(short x25_Dsp_Sta_Err_TimerParam) {
        this.x25_Dsp_Sta_Err_Timer = x25_Dsp_Sta_Err_TimerParam;
    }

}
