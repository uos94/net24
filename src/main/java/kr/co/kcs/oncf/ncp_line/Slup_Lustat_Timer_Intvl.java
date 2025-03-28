
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "slup-lustat-timer-intvl", ElementSize = 2, LocalName = "slup-lustat-timer-intvl")
public class Slup_Lustat_Timer_Intvl
    implements Serializable, Timer_IntervalMarker
{

    private short slup_Lustat_Timer_Intvl;

    @DdlField(Version = "2.0", QualName = "slup-lustat-timer-intvl", ObjectClass = 1, Level = 1, Structure = 2, Offset = 210, ElementSize = 2, IdentifierElement = 169)
    public short getSlup_Lustat_Timer_Intvl() {
        return slup_Lustat_Timer_Intvl;
    }

    public void setSlup_Lustat_Timer_Intvl(short slup_Lustat_Timer_IntvlParam) {
        this.slup_Lustat_Timer_Intvl = slup_Lustat_Timer_IntvlParam;
    }

}
