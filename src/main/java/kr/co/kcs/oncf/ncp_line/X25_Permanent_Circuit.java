
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x25-permanent-circuit", ElementSize = 2, LocalName = "x25-permanent-circuit")
public class X25_Permanent_Circuit
    implements Serializable, Permanent_CircuitMarker
{

    private short x25_Permanent_Circuit;

    @DdlField(Version = "2.0", QualName = "x25-permanent-circuit", ObjectClass = 1, Level = 1, Structure = 2, Offset = 174, ElementSize = 2, IdentifierElement = 128)
    public short getX25_Permanent_Circuit() {
        return x25_Permanent_Circuit;
    }

    public void setX25_Permanent_Circuit(short x25_Permanent_CircuitParam) {
        this.x25_Permanent_Circuit = x25_Permanent_CircuitParam;
    }

}
