
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cbis-rvi-level", ElementSize = 2, LocalName = "cbis-rvi-level")
public class Cbis_Rvi_Level
    implements Serializable, Rvi_LevelMarker
{

    private short cbis_Rvi_Level;

    @DdlField(Version = "2.0", QualName = "cbis-rvi-level", ObjectClass = 1, Level = 1, Structure = 2, Offset = 198, ElementSize = 2, IdentifierElement = 150)
    public short getCbis_Rvi_Level() {
        return cbis_Rvi_Level;
    }

    public void setCbis_Rvi_Level(short cbis_Rvi_LevelParam) {
        this.cbis_Rvi_Level = cbis_Rvi_LevelParam;
    }

}
