
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x21-recall-delay", ElementSize = 2, LocalName = "x21-recall-delay")
public class X21_Recall_Delay
    implements Serializable, Recall_DelayMarker
{

    private short x21_Recall_Delay;

    @DdlField(Version = "2.0", QualName = "x21-recall-delay", ObjectClass = 1, Level = 1, Structure = 2, Offset = 180, ElementSize = 2, IdentifierElement = 140)
    public short getX21_Recall_Delay() {
        return x21_Recall_Delay;
    }

    public void setX21_Recall_Delay(short x21_Recall_DelayParam) {
        this.x21_Recall_Delay = x21_Recall_DelayParam;
    }

}
