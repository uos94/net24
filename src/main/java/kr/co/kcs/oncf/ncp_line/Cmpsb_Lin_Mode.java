
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cmpsb-lin-mode", ElementSize = 2, LocalName = "cmpsb-lin-mode")
public class Cmpsb_Lin_Mode
    implements Serializable, Lin_ModeMarker
{

    private short cmpsb_Lin_Mode;

    @DdlField(Version = "2.0", QualName = "cmpsb-lin-mode", ObjectClass = 1, Level = 1, Structure = 2, Offset = 138, ElementSize = 2, IdentifierElement = 80)
    public short getCmpsb_Lin_Mode() {
        return cmpsb_Lin_Mode;
    }

    public void setCmpsb_Lin_Mode(short cmpsb_Lin_ModeParam) {
        this.cmpsb_Lin_Mode = cmpsb_Lin_ModeParam;
    }

}
