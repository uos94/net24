
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "saved-msgs", ElementSize = 2, LocalName = "saved-msgs")
public class Saved_Msgs
    implements Serializable, Saved_MsgsMarker
{

    private short saved_Msgs;

    @DdlField(Version = "2.0", QualName = "saved-msgs", ObjectClass = 1, Level = 1, Structure = 2, Offset = 270, ElementSize = 2, IdentifierElement = 75)
    public short getSaved_Msgs() {
        return saved_Msgs;
    }

    public void setSaved_Msgs(short saved_MsgsParam) {
        this.saved_Msgs = saved_MsgsParam;
    }

}
