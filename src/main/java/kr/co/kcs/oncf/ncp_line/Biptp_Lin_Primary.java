
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "biptp-lin-primary", ElementSize = 2, LocalName = "biptp-lin-primary")
public class Biptp_Lin_Primary
    implements Serializable, Lin_PrimaryMarker
{

    private short biptp_Lin_Primary;

    @DdlField(Version = "2.0", QualName = "biptp-lin-primary", ObjectClass = 1, Level = 1, Structure = 2, Offset = 140, ElementSize = 2, IdentifierElement = 83)
    public short getBiptp_Lin_Primary() {
        return biptp_Lin_Primary;
    }

    public void setBiptp_Lin_Primary(short biptp_Lin_PrimaryParam) {
        this.biptp_Lin_Primary = biptp_Lin_PrimaryParam;
    }

}
