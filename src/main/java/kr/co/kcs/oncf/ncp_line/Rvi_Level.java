
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "rvi-level", ElementSize = 2, LocalName = "rvi-level")
public class Rvi_Level
    implements Serializable, Rvi_LevelMarker
{

    private short rvi_Level;

    @DdlField(Version = "2.0", QualName = "rvi-level", ObjectClass = 1, Level = 1, Structure = 2, Offset = 198, ElementSize = 2, IdentifierElement = 144)
    public short getRvi_Level() {
        return rvi_Level;
    }

    public void setRvi_Level(short rvi_LevelParam) {
        this.rvi_Level = rvi_LevelParam;
    }

}
