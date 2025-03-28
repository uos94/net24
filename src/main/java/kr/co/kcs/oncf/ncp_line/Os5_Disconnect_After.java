
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "os5-disconnect-after", ElementSize = 2, LocalName = "os5-disconnect-after")
public class Os5_Disconnect_After
    implements Serializable, Disconnect_AfterMarker
{

    private short os5_Disconnect_After;

    @DdlField(Version = "2.0", QualName = "os5-disconnect-after", ObjectClass = 1, Level = 1, Structure = 2, Offset = 126, ElementSize = 2, IdentifierElement = 59)
    public short getOs5_Disconnect_After() {
        return os5_Disconnect_After;
    }

    public void setOs5_Disconnect_After(short os5_Disconnect_AfterParam) {
        this.os5_Disconnect_After = os5_Disconnect_AfterParam;
    }

}
