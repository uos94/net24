
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cts-reconn-timer-int", ElementSize = 2, LocalName = "cts-reconn-timer-int")
public class Cts_Reconn_Timer_Int
    implements Serializable, Timer_IntervalMarker
{

    private short cts_Reconn_Timer_Int;

    @DdlField(Version = "2.0", QualName = "cts-reconn-timer-int", ObjectClass = 1, Level = 1, Structure = 2, Offset = 210, ElementSize = 2, IdentifierElement = 171)
    public short getCts_Reconn_Timer_Int() {
        return cts_Reconn_Timer_Int;
    }

    public void setCts_Reconn_Timer_Int(short cts_Reconn_Timer_IntParam) {
        this.cts_Reconn_Timer_Int = cts_Reconn_Timer_IntParam;
    }

}
