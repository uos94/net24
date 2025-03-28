
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bimps-rvi-level", ElementSize = 2, LocalName = "bimps-rvi-level")
public class Bimps_Rvi_Level
    implements Serializable, Rvi_LevelMarker
{

    private short bimps_Rvi_Level;

    @DdlField(Version = "2.0", QualName = "bimps-rvi-level", ObjectClass = 1, Level = 1, Structure = 2, Offset = 198, ElementSize = 2, IdentifierElement = 145)
    public short getBimps_Rvi_Level() {
        return bimps_Rvi_Level;
    }

    public void setBimps_Rvi_Level(short bimps_Rvi_LevelParam) {
        this.bimps_Rvi_Level = bimps_Rvi_LevelParam;
    }

}
