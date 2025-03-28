
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "lin-mode", ElementSize = 2, LocalName = "lin-mode")
public class Lin_Mode
    implements Serializable, Lin_ModeMarker
{

    private short lin_Mode;

    @DdlField(Version = "2.0", QualName = "lin-mode", ObjectClass = 1, Level = 1, Structure = 2, Offset = 138, ElementSize = 2, IdentifierElement = 76)
    public short getLin_Mode() {
        return lin_Mode;
    }

    public void setLin_Mode(short lin_ModeParam) {
        this.lin_Mode = lin_ModeParam;
    }

}
