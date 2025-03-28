
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cbip-lin-primary", ElementSize = 2, LocalName = "cbip-lin-primary")
public class Cbip_Lin_Primary
    implements Serializable, Lin_PrimaryMarker
{

    private short cbip_Lin_Primary;

    @DdlField(Version = "2.0", QualName = "cbip-lin-primary", ObjectClass = 1, Level = 1, Structure = 2, Offset = 140, ElementSize = 2, IdentifierElement = 85)
    public short getCbip_Lin_Primary() {
        return cbip_Lin_Primary;
    }

    public void setCbip_Lin_Primary(short cbip_Lin_PrimaryParam) {
        this.cbip_Lin_Primary = cbip_Lin_PrimaryParam;
    }

}
