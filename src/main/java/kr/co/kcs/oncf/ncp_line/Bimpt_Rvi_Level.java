
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bimpt-rvi-level", ElementSize = 2, LocalName = "bimpt-rvi-level")
public class Bimpt_Rvi_Level
    implements Serializable, Rvi_LevelMarker
{

    private short bimpt_Rvi_Level;

    @DdlField(Version = "2.0", QualName = "bimpt-rvi-level", ObjectClass = 1, Level = 1, Structure = 2, Offset = 198, ElementSize = 2, IdentifierElement = 146)
    public short getBimpt_Rvi_Level() {
        return bimpt_Rvi_Level;
    }

    public void setBimpt_Rvi_Level(short bimpt_Rvi_LevelParam) {
        this.bimpt_Rvi_Level = bimpt_Rvi_LevelParam;
    }

}
