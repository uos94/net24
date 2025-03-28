
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "tram-wt-timer-intvl", ElementSize = 2, LocalName = "tram-wt-timer-intvl")
public class Tram_Wt_Timer_Intvl
    implements Serializable, Timer_IntervalMarker
{

    private short tram_Wt_Timer_Intvl;

    @DdlField(Version = "2.0", QualName = "tram-wt-timer-intvl", ObjectClass = 1, Level = 1, Structure = 2, Offset = 210, ElementSize = 2, IdentifierElement = 170)
    public short getTram_Wt_Timer_Intvl() {
        return tram_Wt_Timer_Intvl;
    }

    public void setTram_Wt_Timer_Intvl(short tram_Wt_Timer_IntvlParam) {
        this.tram_Wt_Timer_Intvl = tram_Wt_Timer_IntvlParam;
    }

}
