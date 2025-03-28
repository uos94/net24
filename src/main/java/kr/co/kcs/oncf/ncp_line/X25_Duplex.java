
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x25-duplex", ElementSize = 2, LocalName = "x25-duplex")
public class X25_Duplex
    implements Serializable, DuplexMarker
{

    private short x25_Duplex;

    @DdlField(Version = "2.0", QualName = "x25-duplex", ObjectClass = 1, Level = 1, Structure = 2, Offset = 128, ElementSize = 2, IdentifierElement = 66)
    public short getX25_Duplex() {
        return x25_Duplex;
    }

    public void setX25_Duplex(short x25_DuplexParam) {
        this.x25_Duplex = x25_DuplexParam;
    }

}
