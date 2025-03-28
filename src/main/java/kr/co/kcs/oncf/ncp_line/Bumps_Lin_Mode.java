
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bumps-lin-mode", ElementSize = 2, LocalName = "bumps-lin-mode")
public class Bumps_Lin_Mode
    implements Serializable, Lin_ModeMarker
{

    private short bumps_Lin_Mode;

    @DdlField(Version = "2.0", QualName = "bumps-lin-mode", ObjectClass = 1, Level = 1, Structure = 2, Offset = 138, ElementSize = 2, IdentifierElement = 78)
    public short getBumps_Lin_Mode() {
        return bumps_Lin_Mode;
    }

    public void setBumps_Lin_Mode(short bumps_Lin_ModeParam) {
        this.bumps_Lin_Mode = bumps_Lin_ModeParam;
    }

}
