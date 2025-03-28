
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "visa-lin-type", ElementSize = 2, LocalName = "visa-lin-type")
public class Visa_Lin_Type
    implements Serializable, Lin_TypeMarker
{

    private short visa_Lin_Type;

    @DdlField(Version = "2.0", QualName = "visa-lin-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 144, ElementSize = 2, IdentifierElement = 95)
    public short getVisa_Lin_Type() {
        return visa_Lin_Type;
    }

    public void setVisa_Lin_Type(short visa_Lin_TypeParam) {
        this.visa_Lin_Type = visa_Lin_TypeParam;
    }

}
