
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "tram-wt-timer-dis", ElementSize = 2, LocalName = "tram-wt-timer-dis")
public class Tram_Wt_Timer_Dis
    implements Serializable, Timer_DisMarker
{

    private short tram_Wt_Timer_Dis;

    @DdlField(Version = "2.0", QualName = "tram-wt-timer-dis", ObjectClass = 1, Level = 1, Structure = 2, Offset = 208, ElementSize = 2, IdentifierElement = 164)
    public short getTram_Wt_Timer_Dis() {
        return tram_Wt_Timer_Dis;
    }

    public void setTram_Wt_Timer_Dis(short tram_Wt_Timer_DisParam) {
        this.tram_Wt_Timer_Dis = tram_Wt_Timer_DisParam;
    }

}
