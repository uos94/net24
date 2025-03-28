
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "timer-dis", ElementSize = 2, LocalName = "timer-dis")
public class Timer_Dis
    implements Serializable, Timer_DisMarker
{

    private short timer_Dis;

    @DdlField(Version = "2.0", QualName = "timer-dis", ObjectClass = 1, Level = 1, Structure = 2, Offset = 208, ElementSize = 2, IdentifierElement = 160)
    public short getTimer_Dis() {
        return timer_Dis;
    }

    public void setTimer_Dis(short timer_DisParam) {
        this.timer_Dis = timer_DisParam;
    }

}
