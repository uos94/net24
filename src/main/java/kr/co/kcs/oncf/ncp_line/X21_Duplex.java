
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x21-duplex", ElementSize = 2, LocalName = "x21-duplex")
public class X21_Duplex
    implements Serializable, DuplexMarker
{

    private short x21_Duplex;

    @DdlField(Version = "2.0", QualName = "x21-duplex", ObjectClass = 1, Level = 1, Structure = 2, Offset = 128, ElementSize = 2, IdentifierElement = 65)
    public short getX21_Duplex() {
        return x21_Duplex;
    }

    public void setX21_Duplex(short x21_DuplexParam) {
        this.x21_Duplex = x21_DuplexParam;
    }

}
