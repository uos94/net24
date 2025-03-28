
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "recall-delay", ElementSize = 2, LocalName = "recall-delay")
public class Recall_Delay
    implements Serializable, Recall_DelayMarker
{

    private short recall_Delay;

    @DdlField(Version = "2.0", QualName = "recall-delay", ObjectClass = 1, Level = 1, Structure = 2, Offset = 180, ElementSize = 2, IdentifierElement = 138)
    public short getRecall_Delay() {
        return recall_Delay;
    }

    public void setRecall_Delay(short recall_DelayParam) {
        this.recall_Delay = recall_DelayParam;
    }

}
