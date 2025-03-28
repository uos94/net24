
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x25-lin-type", ElementSize = 2, LocalName = "x25-lin-type")
public class X25_Lin_Type
    implements Serializable, Lin_TypeMarker
{

    private short x25_Lin_Type;

    @DdlField(Version = "2.0", QualName = "x25-lin-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 144, ElementSize = 2, IdentifierElement = 93)
    public short getX25_Lin_Type() {
        return x25_Lin_Type;
    }

    public void setX25_Lin_Type(short x25_Lin_TypeParam) {
        this.x25_Lin_Type = x25_Lin_TypeParam;
    }

}
