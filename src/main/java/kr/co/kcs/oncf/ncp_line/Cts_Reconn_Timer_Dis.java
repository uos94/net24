
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cts-reconn-timer-dis", ElementSize = 2, LocalName = "cts-reconn-timer-dis")
public class Cts_Reconn_Timer_Dis
    implements Serializable, Timer_DisMarker
{

    private short cts_Reconn_Timer_Dis;

    @DdlField(Version = "2.0", QualName = "cts-reconn-timer-dis", ObjectClass = 1, Level = 1, Structure = 2, Offset = 208, ElementSize = 2, IdentifierElement = 165)
    public short getCts_Reconn_Timer_Dis() {
        return cts_Reconn_Timer_Dis;
    }

    public void setCts_Reconn_Timer_Dis(short cts_Reconn_Timer_DisParam) {
        this.cts_Reconn_Timer_Dis = cts_Reconn_Timer_DisParam;
    }

}
