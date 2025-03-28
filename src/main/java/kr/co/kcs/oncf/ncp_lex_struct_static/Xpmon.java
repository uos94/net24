
package kr.co.kcs.oncf.ncp_lex_struct_static;

import java.io.Serializable;
import kr.co.kcs.oncf.Ncp_Lex_Xpmon_Data;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "xpmon", ElementSize = 28, LocalName = "xpmon")
public class Xpmon
    implements Serializable, Fillrr1Marker
{

    private Ncp_Lex_Xpmon_Data xpmon;

    @DdlField(Version = "2.0", QualName = "xpmon", ObjectClass = 0, Level = 1, Structure = 0, Offset = 182, ElementSize = 28, IdentifierElement = 28)
    public Ncp_Lex_Xpmon_Data getXpmon() {
        return xpmon;
    }

    public void setXpmon(Ncp_Lex_Xpmon_Data xpmonParam) {
        this.xpmon = xpmonParam;
    }

}
