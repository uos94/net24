
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x21-sabm-delay", ElementSize = 2, LocalName = "x21-sabm-delay")
public class X21_Sabm_Delay
    implements Serializable, A_TimerMarker
{

    private short x21_Sabm_Delay;

    @DdlField(Version = "2.0", QualName = "x21-sabm-delay", ObjectClass = 1, Level = 1, Structure = 2, Offset = 114, ElementSize = 2, IdentifierElement = 22)
    public short getX21_Sabm_Delay() {
        return x21_Sabm_Delay;
    }

    public void setX21_Sabm_Delay(short x21_Sabm_DelayParam) {
        this.x21_Sabm_Delay = x21_Sabm_DelayParam;
    }

}
