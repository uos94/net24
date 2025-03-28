
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ipos-parity-flg", ElementSize = 2, LocalName = "ipos-parity-flg")
public class Ipos_Parity_Flg
    implements Serializable, Parity_FlgMarker
{

    private short ipos_Parity_Flg;

    @DdlField(Version = "2.0", QualName = "ipos-parity-flg", ObjectClass = 1, Level = 1, Structure = 2, Offset = 330, ElementSize = 2, IdentifierElement = 196)
    public short getIpos_Parity_Flg() {
        return ipos_Parity_Flg;
    }

    public void setIpos_Parity_Flg(short ipos_Parity_FlgParam) {
        this.ipos_Parity_Flg = ipos_Parity_FlgParam;
    }

}
