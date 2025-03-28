
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "lu62i-disconnect-after", ElementSize = 2, LocalName = "lu62i-disconnect-after")
public class Lu62i_Disconnect_After
    implements Serializable, Disconnect_AfterMarker
{

    private short lu62i_Disconnect_After;

    @DdlField(Version = "2.0", QualName = "lu62i-disconnect-after", ObjectClass = 1, Level = 1, Structure = 2, Offset = 126, ElementSize = 2, IdentifierElement = 62)
    public short getLu62i_Disconnect_After() {
        return lu62i_Disconnect_After;
    }

    public void setLu62i_Disconnect_After(short lu62i_Disconnect_AfterParam) {
        this.lu62i_Disconnect_After = lu62i_Disconnect_AfterParam;
    }

}
