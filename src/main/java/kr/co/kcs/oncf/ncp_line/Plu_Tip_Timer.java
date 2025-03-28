
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "plu-tip-timer", ElementSize = 2, LocalName = "plu-tip-timer")
public class Plu_Tip_Timer
    implements Serializable, A_TimerMarker
{

    private short plu_Tip_Timer;

    @DdlField(Version = "2.0", QualName = "plu-tip-timer", ObjectClass = 1, Level = 1, Structure = 2, Offset = 114, ElementSize = 2, IdentifierElement = 19)
    public short getPlu_Tip_Timer() {
        return plu_Tip_Timer;
    }

    public void setPlu_Tip_Timer(short plu_Tip_TimerParam) {
        this.plu_Tip_Timer = plu_Tip_TimerParam;
    }

}
