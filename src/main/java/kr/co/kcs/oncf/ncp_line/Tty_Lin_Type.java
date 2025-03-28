
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "tty-lin-type", ElementSize = 2, LocalName = "tty-lin-type")
public class Tty_Lin_Type
    implements Serializable, Lin_TypeMarker
{

    private short tty_Lin_Type;

    @DdlField(Version = "2.0", QualName = "tty-lin-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 144, ElementSize = 2, IdentifierElement = 91)
    public short getTty_Lin_Type() {
        return tty_Lin_Type;
    }

    public void setTty_Lin_Type(short tty_Lin_TypeParam) {
        this.tty_Lin_Type = tty_Lin_TypeParam;
    }

}
