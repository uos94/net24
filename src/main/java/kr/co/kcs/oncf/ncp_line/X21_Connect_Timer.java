
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x21-connect-timer", ElementSize = 2, LocalName = "x21-connect-timer")
public class X21_Connect_Timer
    implements Serializable, B_TimerMarker
{

    private short x21_Connect_Timer;

    @DdlField(Version = "2.0", QualName = "x21-connect-timer", ObjectClass = 1, Level = 1, Structure = 2, Offset = 116, ElementSize = 2, IdentifierElement = 37)
    public short getX21_Connect_Timer() {
        return x21_Connect_Timer;
    }

    public void setX21_Connect_Timer(short x21_Connect_TimerParam) {
        this.x21_Connect_Timer = x21_Connect_TimerParam;
    }

}
