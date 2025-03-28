
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x25-pos1-data-timer", ElementSize = 2, LocalName = "x25-pos1-data-timer")
public class X25_Pos1_Data_Timer
    implements Serializable, A_TimerMarker
{

    private short x25_Pos1_Data_Timer;

    @DdlField(Version = "2.0", QualName = "x25-pos1-data-timer", ObjectClass = 1, Level = 1, Structure = 2, Offset = 114, ElementSize = 2, IdentifierElement = 27)
    public short getX25_Pos1_Data_Timer() {
        return x25_Pos1_Data_Timer;
    }

    public void setX25_Pos1_Data_Timer(short x25_Pos1_Data_TimerParam) {
        this.x25_Pos1_Data_Timer = x25_Pos1_Data_TimerParam;
    }

}
