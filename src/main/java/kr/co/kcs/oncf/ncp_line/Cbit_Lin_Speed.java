
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cbit-lin-speed", ElementSize = 2, LocalName = "cbit-lin-speed")
public class Cbit_Lin_Speed
    implements Serializable, Lin_SpeedMarker
{

    private short cbit_Lin_Speed;

    @DdlField(Version = "2.0", QualName = "cbit-lin-speed", ObjectClass = 1, Level = 1, Structure = 2, Offset = 142, ElementSize = 2, IdentifierElement = 87)
    public short getCbit_Lin_Speed() {
        return cbit_Lin_Speed;
    }

    public void setCbit_Lin_Speed(short cbit_Lin_SpeedParam) {
        this.cbit_Lin_Speed = cbit_Lin_SpeedParam;
    }

}
