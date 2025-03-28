
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ipos-enq-delay", ElementSize = 2, LocalName = "ipos-enq-delay")
public class Ipos_Enq_Delay
    implements Serializable, Enq_DelayMarker
{

    private short ipos_Enq_Delay;

    @DdlField(Version = "2.0", QualName = "ipos-enq-delay", ObjectClass = 1, Level = 1, Structure = 2, Offset = 130, ElementSize = 2, IdentifierElement = 69)
    public short getIpos_Enq_Delay() {
        return ipos_Enq_Delay;
    }

    public void setIpos_Enq_Delay(short ipos_Enq_DelayParam) {
        this.ipos_Enq_Delay = ipos_Enq_DelayParam;
    }

}
