
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cts-conn-in-prog-timer", ElementSize = 2, LocalName = "cts-conn-in-prog-timer")
public class Cts_Conn_In_Prog_Timer
    implements Serializable, B_TimerMarker
{

    private short cts_Conn_In_Prog_Timer;

    @DdlField(Version = "2.0", QualName = "cts-conn-in-prog-timer", ObjectClass = 1, Level = 1, Structure = 2, Offset = 116, ElementSize = 2, IdentifierElement = 40)
    public short getCts_Conn_In_Prog_Timer() {
        return cts_Conn_In_Prog_Timer;
    }

    public void setCts_Conn_In_Prog_Timer(short cts_Conn_In_Prog_TimerParam) {
        this.cts_Conn_In_Prog_Timer = cts_Conn_In_Prog_TimerParam;
    }

}
