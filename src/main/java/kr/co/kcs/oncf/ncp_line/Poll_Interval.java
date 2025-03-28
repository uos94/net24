
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "poll-interval", ElementSize = 2, LocalName = "poll-interval")
public class Poll_Interval
    implements Serializable, Poll_IntervalMarker
{

    private short poll_Interval;

    @DdlField(Version = "2.0", QualName = "poll-interval", ObjectClass = 1, Level = 1, Structure = 2, Offset = 176, ElementSize = 2, IdentifierElement = 129)
    public short getPoll_Interval() {
        return poll_Interval;
    }

    public void setPoll_Interval(short poll_IntervalParam) {
        this.poll_Interval = poll_IntervalParam;
    }

}
