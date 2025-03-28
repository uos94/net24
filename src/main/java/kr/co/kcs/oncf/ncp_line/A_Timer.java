
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "a-timer", ElementSize = 2, LocalName = "a-timer")
public class A_Timer
    implements Serializable, A_TimerMarker
{

    private short a_Timer;

    @DdlField(Version = "2.0", QualName = "a-timer", ObjectClass = 1, Level = 1, Structure = 2, Offset = 114, ElementSize = 2, IdentifierElement = 17)
    public short getA_Timer() {
        return a_Timer;
    }

    public void setA_Timer(short a_TimerParam) {
        this.a_Timer = a_TimerParam;
    }

}
