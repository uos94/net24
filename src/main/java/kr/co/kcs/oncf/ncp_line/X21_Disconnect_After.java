
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x21-disconnect-after", ElementSize = 2, LocalName = "x21-disconnect-after")
public class X21_Disconnect_After
    implements Serializable, Disconnect_AfterMarker
{

    private short x21_Disconnect_After;

    @DdlField(Version = "2.0", QualName = "x21-disconnect-after", ObjectClass = 1, Level = 1, Structure = 2, Offset = 126, ElementSize = 2, IdentifierElement = 60)
    public short getX21_Disconnect_After() {
        return x21_Disconnect_After;
    }

    public void setX21_Disconnect_After(short x21_Disconnect_AfterParam) {
        this.x21_Disconnect_After = x21_Disconnect_AfterParam;
    }

}
