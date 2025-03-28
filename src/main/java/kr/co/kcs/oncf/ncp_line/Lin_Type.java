
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "lin-type", ElementSize = 2, LocalName = "lin-type")
public class Lin_Type
    implements Serializable, Lin_TypeMarker
{

    private short lin_Type;

    @DdlField(Version = "2.0", QualName = "lin-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 144, ElementSize = 2, IdentifierElement = 90)
    public short getLin_Type() {
        return lin_Type;
    }

    public void setLin_Type(short lin_TypeParam) {
        this.lin_Type = lin_TypeParam;
    }

}
