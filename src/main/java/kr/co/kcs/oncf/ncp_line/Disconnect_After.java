
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "disconnect-after", ElementSize = 2, LocalName = "disconnect-after")
public class Disconnect_After
    implements Serializable, Disconnect_AfterMarker
{

    private short disconnect_After;

    @DdlField(Version = "2.0", QualName = "disconnect-after", ObjectClass = 1, Level = 1, Structure = 2, Offset = 126, ElementSize = 2, IdentifierElement = 58)
    public short getDisconnect_After() {
        return disconnect_After;
    }

    public void setDisconnect_After(short disconnect_AfterParam) {
        this.disconnect_After = disconnect_AfterParam;
    }

}
