
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cbis-lin-mode", ElementSize = 2, LocalName = "cbis-lin-mode")
public class Cbis_Lin_Mode
    implements Serializable, Lin_ModeMarker
{

    private short cbis_Lin_Mode;

    @DdlField(Version = "2.0", QualName = "cbis-lin-mode", ObjectClass = 1, Level = 1, Structure = 2, Offset = 138, ElementSize = 2, IdentifierElement = 79)
    public short getCbis_Lin_Mode() {
        return cbis_Lin_Mode;
    }

    public void setCbis_Lin_Mode(short cbis_Lin_ModeParam) {
        this.cbis_Lin_Mode = cbis_Lin_ModeParam;
    }

}
