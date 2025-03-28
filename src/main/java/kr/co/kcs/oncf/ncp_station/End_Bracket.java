
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "end-bracket", ElementSize = 2, LocalName = "end-bracket")
public class End_Bracket
    implements Serializable, End_BracketMarker
{

    private short end_Bracket;

    @DdlField(Version = "2.0", QualName = "end-bracket", ObjectClass = 1, Level = 1, Structure = 2, Offset = 152, ElementSize = 2, IdentifierElement = 32)
    public short getEnd_Bracket() {
        return end_Bracket;
    }

    public void setEnd_Bracket(short end_BracketParam) {
        this.end_Bracket = end_BracketParam;
    }

}
