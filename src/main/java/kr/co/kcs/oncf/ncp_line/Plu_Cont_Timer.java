
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "plu-cont-timer", ElementSize = 2, LocalName = "plu-cont-timer")
public class Plu_Cont_Timer
    implements Serializable, B_TimerMarker
{

    private short plu_Cont_Timer;

    @DdlField(Version = "2.0", QualName = "plu-cont-timer", ObjectClass = 1, Level = 1, Structure = 2, Offset = 116, ElementSize = 2, IdentifierElement = 35)
    public short getPlu_Cont_Timer() {
        return plu_Cont_Timer;
    }

    public void setPlu_Cont_Timer(short plu_Cont_TimerParam) {
        this.plu_Cont_Timer = plu_Cont_TimerParam;
    }

}
