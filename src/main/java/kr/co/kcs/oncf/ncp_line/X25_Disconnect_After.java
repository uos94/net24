
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x25-disconnect-after", ElementSize = 2, LocalName = "x25-disconnect-after")
public class X25_Disconnect_After
    implements Serializable, Disconnect_AfterMarker
{

    private short x25_Disconnect_After;

    @DdlField(Version = "2.0", QualName = "x25-disconnect-after", ObjectClass = 1, Level = 1, Structure = 2, Offset = 126, ElementSize = 2, IdentifierElement = 61)
    public short getX25_Disconnect_After() {
        return x25_Disconnect_After;
    }

    public void setX25_Disconnect_After(short x25_Disconnect_AfterParam) {
        this.x25_Disconnect_After = x25_Disconnect_AfterParam;
    }

}
