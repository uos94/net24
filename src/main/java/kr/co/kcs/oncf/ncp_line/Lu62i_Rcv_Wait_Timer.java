
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "lu62i-rcv-wait-timer", ElementSize = 2, LocalName = "lu62i-rcv-wait-timer")
public class Lu62i_Rcv_Wait_Timer
    implements Serializable, A_TimerMarker
{

    private short lu62i_Rcv_Wait_Timer;

    @DdlField(Version = "2.0", QualName = "lu62i-rcv-wait-timer", ObjectClass = 1, Level = 1, Structure = 2, Offset = 114, ElementSize = 2, IdentifierElement = 18)
    public short getLu62i_Rcv_Wait_Timer() {
        return lu62i_Rcv_Wait_Timer;
    }

    public void setLu62i_Rcv_Wait_Timer(short lu62i_Rcv_Wait_TimerParam) {
        this.lu62i_Rcv_Wait_Timer = lu62i_Rcv_Wait_TimerParam;
    }

}
