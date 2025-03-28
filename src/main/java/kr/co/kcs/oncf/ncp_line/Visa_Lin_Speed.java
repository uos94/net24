
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "visa-lin-speed", ElementSize = 2, LocalName = "visa-lin-speed")
public class Visa_Lin_Speed
    implements Serializable, Lin_SpeedMarker
{

    private short visa_Lin_Speed;

    @DdlField(Version = "2.0", QualName = "visa-lin-speed", ObjectClass = 1, Level = 1, Structure = 2, Offset = 142, ElementSize = 2, IdentifierElement = 89)
    public short getVisa_Lin_Speed() {
        return visa_Lin_Speed;
    }

    public void setVisa_Lin_Speed(short visa_Lin_SpeedParam) {
        this.visa_Lin_Speed = visa_Lin_SpeedParam;
    }

}
