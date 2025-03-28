
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "poll-method", ElementSize = 2, LocalName = "poll-method")
public class Poll_Method
    implements Serializable, Poll_MethodMarker
{

    private short poll_Method;

    @DdlField(Version = "2.0", QualName = "poll-method", ObjectClass = 1, Level = 1, Structure = 2, Offset = 178, ElementSize = 2, IdentifierElement = 136)
    public short getPoll_Method() {
        return poll_Method;
    }

    public void setPoll_Method(short poll_MethodParam) {
        this.poll_Method = poll_MethodParam;
    }

}
