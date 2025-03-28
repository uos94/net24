
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cbit-rvi-level", ElementSize = 2, LocalName = "cbit-rvi-level")
public class Cbit_Rvi_Level
    implements Serializable, Rvi_LevelMarker
{

    private short cbit_Rvi_Level;

    @DdlField(Version = "2.0", QualName = "cbit-rvi-level", ObjectClass = 1, Level = 1, Structure = 2, Offset = 198, ElementSize = 2, IdentifierElement = 151)
    public short getCbit_Rvi_Level() {
        return cbit_Rvi_Level;
    }

    public void setCbit_Rvi_Level(short cbit_Rvi_LevelParam) {
        this.cbit_Rvi_Level = cbit_Rvi_LevelParam;
    }

}
