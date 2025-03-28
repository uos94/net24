
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "visa-enq-delay", ElementSize = 2, LocalName = "visa-enq-delay")
public class Visa_Enq_Delay
    implements Serializable, Enq_DelayMarker
{

    private short visa_Enq_Delay;

    @DdlField(Version = "2.0", QualName = "visa-enq-delay", ObjectClass = 1, Level = 1, Structure = 2, Offset = 130, ElementSize = 2, IdentifierElement = 68)
    public short getVisa_Enq_Delay() {
        return visa_Enq_Delay;
    }

    public void setVisa_Enq_Delay(short visa_Enq_DelayParam) {
        this.visa_Enq_Delay = visa_Enq_DelayParam;
    }

}
