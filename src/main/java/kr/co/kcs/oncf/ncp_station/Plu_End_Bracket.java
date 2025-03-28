
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "plu-end-bracket", ElementSize = 2, LocalName = "plu-end-bracket")
public class Plu_End_Bracket
    implements Serializable, End_BracketMarker
{

    private short plu_End_Bracket;

    @DdlField(Version = "2.0", QualName = "plu-end-bracket", ObjectClass = 1, Level = 1, Structure = 2, Offset = 152, ElementSize = 2, IdentifierElement = 33)
    public short getPlu_End_Bracket() {
        return plu_End_Bracket;
    }

    public void setPlu_End_Bracket(short plu_End_BracketParam) {
        this.plu_End_Bracket = plu_End_BracketParam;
    }

}
