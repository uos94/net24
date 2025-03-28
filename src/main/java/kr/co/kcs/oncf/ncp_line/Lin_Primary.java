
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "lin-primary", ElementSize = 2, LocalName = "lin-primary")
public class Lin_Primary
    implements Serializable, Lin_PrimaryMarker
{

    private short lin_Primary;

    @DdlField(Version = "2.0", QualName = "lin-primary", ObjectClass = 1, Level = 1, Structure = 2, Offset = 140, ElementSize = 2, IdentifierElement = 82)
    public short getLin_Primary() {
        return lin_Primary;
    }

    public void setLin_Primary(short lin_PrimaryParam) {
        this.lin_Primary = lin_PrimaryParam;
    }

}
