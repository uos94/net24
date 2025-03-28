
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "enq-delay", ElementSize = 2, LocalName = "enq-delay")
public class Enq_Delay
    implements Serializable, Enq_DelayMarker
{

    private short enq_Delay;

    @DdlField(Version = "2.0", QualName = "enq-delay", ObjectClass = 1, Level = 1, Structure = 2, Offset = 130, ElementSize = 2, IdentifierElement = 67)
    public short getEnq_Delay() {
        return enq_Delay;
    }

    public void setEnq_Delay(short enq_DelayParam) {
        this.enq_Delay = enq_DelayParam;
    }

}
