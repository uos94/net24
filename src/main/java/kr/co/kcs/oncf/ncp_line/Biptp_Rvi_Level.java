
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "biptp-rvi-level", ElementSize = 2, LocalName = "biptp-rvi-level")
public class Biptp_Rvi_Level
    implements Serializable, Rvi_LevelMarker
{

    private short biptp_Rvi_Level;

    @DdlField(Version = "2.0", QualName = "biptp-rvi-level", ObjectClass = 1, Level = 1, Structure = 2, Offset = 198, ElementSize = 2, IdentifierElement = 147)
    public short getBiptp_Rvi_Level() {
        return biptp_Rvi_Level;
    }

    public void setBiptp_Rvi_Level(short biptp_Rvi_LevelParam) {
        this.biptp_Rvi_Level = biptp_Rvi_LevelParam;
    }

}
