
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "nc279-lin-mode", ElementSize = 2, LocalName = "nc279-lin-mode")
public class Nc279_Lin_Mode
    implements Serializable, Lin_ModeMarker
{

    private short nc279_Lin_Mode;

    @DdlField(Version = "2.0", QualName = "nc279-lin-mode", ObjectClass = 1, Level = 1, Structure = 2, Offset = 138, ElementSize = 2, IdentifierElement = 81)
    public short getNc279_Lin_Mode() {
        return nc279_Lin_Mode;
    }

    public void setNc279_Lin_Mode(short nc279_Lin_ModeParam) {
        this.nc279_Lin_Mode = nc279_Lin_ModeParam;
    }

}
