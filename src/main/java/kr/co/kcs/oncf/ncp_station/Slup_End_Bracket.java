
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "slup-end-bracket", ElementSize = 2, LocalName = "slup-end-bracket")
public class Slup_End_Bracket
    implements Serializable, End_BracketMarker
{

    private short slup_End_Bracket;

    @DdlField(Version = "2.0", QualName = "slup-end-bracket", ObjectClass = 1, Level = 1, Structure = 2, Offset = 152, ElementSize = 2, IdentifierElement = 34)
    public short getSlup_End_Bracket() {
        return slup_End_Bracket;
    }

    public void setSlup_End_Bracket(short slup_End_BracketParam) {
        this.slup_End_Bracket = slup_End_BracketParam;
    }

}
