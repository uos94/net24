
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "duplex", ElementSize = 2, LocalName = "duplex")
public class Duplex
    implements Serializable, DuplexMarker
{

    private short duplex;

    @DdlField(Version = "2.0", QualName = "duplex", ObjectClass = 1, Level = 1, Structure = 2, Offset = 128, ElementSize = 2, IdentifierElement = 63)
    public short getDuplex() {
        return duplex;
    }

    public void setDuplex(short duplexParam) {
        this.duplex = duplexParam;
    }

}
