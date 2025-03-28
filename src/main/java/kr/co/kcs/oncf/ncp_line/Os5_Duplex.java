
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "os5-duplex", ElementSize = 2, LocalName = "os5-duplex")
public class Os5_Duplex
    implements Serializable, DuplexMarker
{

    private short os5_Duplex;

    @DdlField(Version = "2.0", QualName = "os5-duplex", ObjectClass = 1, Level = 1, Structure = 2, Offset = 128, ElementSize = 2, IdentifierElement = 64)
    public short getOs5_Duplex() {
        return os5_Duplex;
    }

    public void setOs5_Duplex(short os5_DuplexParam) {
        this.os5_Duplex = os5_DuplexParam;
    }

}
