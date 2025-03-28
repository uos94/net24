
package kr.co.kcs.oncf.ncp_resp_hinfo_sta.lin;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "timer-interval", ElementSize = 2, LocalName = "timer-interval")
public class Timer_Interval
    implements Serializable, Timer_IntervalMarker
{

    private short timer_Interval;

    @DdlField(Version = "2.0", QualName = "timer-interval", ObjectClass = 1, Level = 2, Structure = 2, Offset = 60, ElementSize = 2, IdentifierElement = 10)
    public short getTimer_Interval() {
        return timer_Interval;
    }

    public void setTimer_Interval(short timer_IntervalParam) {
        this.timer_Interval = timer_IntervalParam;
    }

}
