
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "lu62i-applmsg-wait-timer", ElementSize = 2, LocalName = "lu62i-applmsg-wait-timer")
public class Lu62i_Applmsg_Wait_Timer
    implements Serializable, B_TimerMarker
{

    private short lu62i_Applmsg_Wait_Timer;

    @DdlField(Version = "2.0", QualName = "lu62i-applmsg-wait-timer", ObjectClass = 1, Level = 1, Structure = 2, Offset = 116, ElementSize = 2, IdentifierElement = 34)
    public short getLu62i_Applmsg_Wait_Timer() {
        return lu62i_Applmsg_Wait_Timer;
    }

    public void setLu62i_Applmsg_Wait_Timer(short lu62i_Applmsg_Wait_TimerParam) {
        this.lu62i_Applmsg_Wait_Timer = lu62i_Applmsg_Wait_TimerParam;
    }

}
