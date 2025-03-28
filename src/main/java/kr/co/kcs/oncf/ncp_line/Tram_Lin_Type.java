
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "tram-lin-type", ElementSize = 2, LocalName = "tram-lin-type")
public class Tram_Lin_Type
    implements Serializable, Lin_TypeMarker
{

    private short tram_Lin_Type;

    @DdlField(Version = "2.0", QualName = "tram-lin-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 144, ElementSize = 2, IdentifierElement = 94)
    public short getTram_Lin_Type() {
        return tram_Lin_Type;
    }

    public void setTram_Lin_Type(short tram_Lin_TypeParam) {
        this.tram_Lin_Type = tram_Lin_TypeParam;
    }

}
