
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "parity-flg", ElementSize = 2, LocalName = "parity-flg")
public class Parity_Flg
    implements Serializable, Parity_FlgMarker
{

    private short parity_Flg;

    @DdlField(Version = "2.0", QualName = "parity-flg", ObjectClass = 1, Level = 1, Structure = 2, Offset = 330, ElementSize = 2, IdentifierElement = 195)
    public short getParity_Flg() {
        return parity_Flg;
    }

    public void setParity_Flg(short parity_FlgParam) {
        this.parity_Flg = parity_FlgParam;
    }

}
