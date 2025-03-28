
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "os5-recall-delay", ElementSize = 2, LocalName = "os5-recall-delay")
public class Os5_Recall_Delay
    implements Serializable, Recall_DelayMarker
{

    private short os5_Recall_Delay;

    @DdlField(Version = "2.0", QualName = "os5-recall-delay", ObjectClass = 1, Level = 1, Structure = 2, Offset = 180, ElementSize = 2, IdentifierElement = 139)
    public short getOs5_Recall_Delay() {
        return os5_Recall_Delay;
    }

    public void setOs5_Recall_Delay(short os5_Recall_DelayParam) {
        this.os5_Recall_Delay = os5_Recall_DelayParam;
    }

}
