
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "biptp-lin-type", ElementSize = 2, LocalName = "biptp-lin-type")
public class Biptp_Lin_Type
    implements Serializable, Lin_TypeMarker
{

    private short biptp_Lin_Type;

    @DdlField(Version = "2.0", QualName = "biptp-lin-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 144, ElementSize = 2, IdentifierElement = 92)
    public short getBiptp_Lin_Type() {
        return biptp_Lin_Type;
    }

    public void setBiptp_Lin_Type(short biptp_Lin_TypeParam) {
        this.biptp_Lin_Type = biptp_Lin_TypeParam;
    }

}
