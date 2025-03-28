
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "b-timer", ElementSize = 2, LocalName = "b-timer")
public class B_Timer
    implements Serializable, B_TimerMarker
{

    private short b_Timer;

    @DdlField(Version = "2.0", QualName = "b-timer", ObjectClass = 1, Level = 1, Structure = 2, Offset = 116, ElementSize = 2, IdentifierElement = 33)
    public short getB_Timer() {
        return b_Timer;
    }

    public void setB_Timer(short b_TimerParam) {
        this.b_Timer = b_TimerParam;
    }

}
