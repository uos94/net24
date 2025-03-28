
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bimps-lin-mode", ElementSize = 2, LocalName = "bimps-lin-mode")
public class Bimps_Lin_Mode
    implements Serializable, Lin_ModeMarker
{

    private short bimps_Lin_Mode;

    @DdlField(Version = "2.0", QualName = "bimps-lin-mode", ObjectClass = 1, Level = 1, Structure = 2, Offset = 138, ElementSize = 2, IdentifierElement = 77)
    public short getBimps_Lin_Mode() {
        return bimps_Lin_Mode;
    }

    public void setBimps_Lin_Mode(short bimps_Lin_ModeParam) {
        this.bimps_Lin_Mode = bimps_Lin_ModeParam;
    }

}
