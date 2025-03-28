
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cts-conn-wait-timer", ElementSize = 2, LocalName = "cts-conn-wait-timer")
public class Cts_Conn_Wait_Timer
    implements Serializable, A_TimerMarker
{

    private short cts_Conn_Wait_Timer;

    @DdlField(Version = "2.0", QualName = "cts-conn-wait-timer", ObjectClass = 1, Level = 1, Structure = 2, Offset = 114, ElementSize = 2, IdentifierElement = 32)
    public short getCts_Conn_Wait_Timer() {
        return cts_Conn_Wait_Timer;
    }

    public void setCts_Conn_Wait_Timer(short cts_Conn_Wait_TimerParam) {
        this.cts_Conn_Wait_Timer = cts_Conn_Wait_TimerParam;
    }

}
