
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x25-pos2-prot-timer", ElementSize = 2, LocalName = "x25-pos2-prot-timer")
public class X25_Pos2_Prot_Timer
    implements Serializable, B_TimerMarker
{

    private short x25_Pos2_Prot_Timer;

    @DdlField(Version = "2.0", QualName = "x25-pos2-prot-timer", ObjectClass = 1, Level = 1, Structure = 2, Offset = 116, ElementSize = 2, IdentifierElement = 39)
    public short getX25_Pos2_Prot_Timer() {
        return x25_Pos2_Prot_Timer;
    }

    public void setX25_Pos2_Prot_Timer(short x25_Pos2_Prot_TimerParam) {
        this.x25_Pos2_Prot_Timer = x25_Pos2_Prot_TimerParam;
    }

}
