
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "buptp-lin-primary", ElementSize = 2, LocalName = "buptp-lin-primary")
public class Buptp_Lin_Primary
    implements Serializable, Lin_PrimaryMarker
{

    private short buptp_Lin_Primary;

    @DdlField(Version = "2.0", QualName = "buptp-lin-primary", ObjectClass = 1, Level = 1, Structure = 2, Offset = 140, ElementSize = 2, IdentifierElement = 84)
    public short getBuptp_Lin_Primary() {
        return buptp_Lin_Primary;
    }

    public void setBuptp_Lin_Primary(short buptp_Lin_PrimaryParam) {
        this.buptp_Lin_Primary = buptp_Lin_PrimaryParam;
    }

}
