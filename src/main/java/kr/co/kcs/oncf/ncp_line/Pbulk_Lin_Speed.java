
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "pbulk-lin-speed", ElementSize = 2, LocalName = "pbulk-lin-speed")
public class Pbulk_Lin_Speed
    implements Serializable, Lin_SpeedMarker
{

    private short pbulk_Lin_Speed;

    @DdlField(Version = "2.0", QualName = "pbulk-lin-speed", ObjectClass = 1, Level = 1, Structure = 2, Offset = 142, ElementSize = 2, IdentifierElement = 88)
    public short getPbulk_Lin_Speed() {
        return pbulk_Lin_Speed;
    }

    public void setPbulk_Lin_Speed(short pbulk_Lin_SpeedParam) {
        this.pbulk_Lin_Speed = pbulk_Lin_SpeedParam;
    }

}
