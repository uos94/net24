
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "give-tkns", ElementSize = 2, LocalName = "give-tkns")
public class Give_Tkns
    implements Serializable, Give_TknsMarker
{

    private short give_Tkns;

    @DdlField(Version = "2.0", QualName = "give-tkns", ObjectClass = 1, Level = 1, Structure = 2, Offset = 132, ElementSize = 2, IdentifierElement = 70)
    public short getGive_Tkns() {
        return give_Tkns;
    }

    public void setGive_Tkns(short give_TknsParam) {
        this.give_Tkns = give_TknsParam;
    }

}
