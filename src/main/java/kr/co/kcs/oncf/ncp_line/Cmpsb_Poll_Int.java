
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cmpsb-poll-int", ElementSize = 2, LocalName = "cmpsb-poll-int")
public class Cmpsb_Poll_Int
    implements Serializable, Poll_IntervalMarker
{

    private short cmpsb_Poll_Int;

    @DdlField(Version = "2.0", QualName = "cmpsb-poll-int", ObjectClass = 1, Level = 1, Structure = 2, Offset = 176, ElementSize = 2, IdentifierElement = 133)
    public short getCmpsb_Poll_Int() {
        return cmpsb_Poll_Int;
    }

    public void setCmpsb_Poll_Int(short cmpsb_Poll_IntParam) {
        this.cmpsb_Poll_Int = cmpsb_Poll_IntParam;
    }

}
