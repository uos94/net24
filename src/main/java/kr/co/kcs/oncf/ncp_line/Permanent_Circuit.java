
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "permanent-circuit", ElementSize = 2, LocalName = "permanent-circuit")
public class Permanent_Circuit
    implements Serializable, Permanent_CircuitMarker
{

    private short permanent_Circuit;

    @DdlField(Version = "2.0", QualName = "permanent-circuit", ObjectClass = 1, Level = 1, Structure = 2, Offset = 174, ElementSize = 2, IdentifierElement = 127)
    public short getPermanent_Circuit() {
        return permanent_Circuit;
    }

    public void setPermanent_Circuit(short permanent_CircuitParam) {
        this.permanent_Circuit = permanent_CircuitParam;
    }

}
