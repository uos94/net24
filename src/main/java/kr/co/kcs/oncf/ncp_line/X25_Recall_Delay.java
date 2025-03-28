
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x25-recall-delay", ElementSize = 2, LocalName = "x25-recall-delay")
public class X25_Recall_Delay
    implements Serializable, Recall_DelayMarker
{

    private short x25_Recall_Delay;

    @DdlField(Version = "2.0", QualName = "x25-recall-delay", ObjectClass = 1, Level = 1, Structure = 2, Offset = 180, ElementSize = 2, IdentifierElement = 141)
    public short getX25_Recall_Delay() {
        return x25_Recall_Delay;
    }

    public void setX25_Recall_Delay(short x25_Recall_DelayParam) {
        this.x25_Recall_Delay = x25_Recall_DelayParam;
    }

}
