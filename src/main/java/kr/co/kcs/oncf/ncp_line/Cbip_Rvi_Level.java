
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cbip-rvi-level", ElementSize = 2, LocalName = "cbip-rvi-level")
public class Cbip_Rvi_Level
    implements Serializable, Rvi_LevelMarker
{

    private short cbip_Rvi_Level;

    @DdlField(Version = "2.0", QualName = "cbip-rvi-level", ObjectClass = 1, Level = 1, Structure = 2, Offset = 198, ElementSize = 2, IdentifierElement = 149)
    public short getCbip_Rvi_Level() {
        return cbip_Rvi_Level;
    }

    public void setCbip_Rvi_Level(short cbip_Rvi_LevelParam) {
        this.cbip_Rvi_Level = cbip_Rvi_LevelParam;
    }

}
