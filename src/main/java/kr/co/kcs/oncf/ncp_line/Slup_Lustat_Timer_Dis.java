
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "slup-lustat-timer-dis", ElementSize = 2, LocalName = "slup-lustat-timer-dis")
public class Slup_Lustat_Timer_Dis
    implements Serializable, Timer_DisMarker
{

    private short slup_Lustat_Timer_Dis;

    @DdlField(Version = "2.0", QualName = "slup-lustat-timer-dis", ObjectClass = 1, Level = 1, Structure = 2, Offset = 208, ElementSize = 2, IdentifierElement = 163)
    public short getSlup_Lustat_Timer_Dis() {
        return slup_Lustat_Timer_Dis;
    }

    public void setSlup_Lustat_Timer_Dis(short slup_Lustat_Timer_DisParam) {
        this.slup_Lustat_Timer_Dis = slup_Lustat_Timer_DisParam;
    }

}
