
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "buptp-rvi-level", ElementSize = 2, LocalName = "buptp-rvi-level")
public class Buptp_Rvi_Level
    implements Serializable, Rvi_LevelMarker
{

    private short buptp_Rvi_Level;

    @DdlField(Version = "2.0", QualName = "buptp-rvi-level", ObjectClass = 1, Level = 1, Structure = 2, Offset = 198, ElementSize = 2, IdentifierElement = 148)
    public short getBuptp_Rvi_Level() {
        return buptp_Rvi_Level;
    }

    public void setBuptp_Rvi_Level(short buptp_Rvi_LevelParam) {
        this.buptp_Rvi_Level = buptp_Rvi_LevelParam;
    }

}
