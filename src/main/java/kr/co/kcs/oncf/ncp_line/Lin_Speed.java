
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "lin-speed", ElementSize = 2, LocalName = "lin-speed")
public class Lin_Speed
    implements Serializable, Lin_SpeedMarker
{

    private short lin_Speed;

    @DdlField(Version = "2.0", QualName = "lin-speed", ObjectClass = 1, Level = 1, Structure = 2, Offset = 142, ElementSize = 2, IdentifierElement = 86)
    public short getLin_Speed() {
        return lin_Speed;
    }

    public void setLin_Speed(short lin_SpeedParam) {
        this.lin_Speed = lin_SpeedParam;
    }

}
