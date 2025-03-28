
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "slup-saved-msgs", ElementSize = 2, LocalName = "slup-saved-msgs")
public class Slup_Saved_Msgs
    implements Serializable, Saved_MsgsMarker
{

    private short slup_Saved_Msgs;

    @DdlField(Version = "2.0", QualName = "slup-saved-msgs", ObjectClass = 1, Level = 1, Structure = 2, Offset = 270, ElementSize = 2, IdentifierElement = 76)
    public short getSlup_Saved_Msgs() {
        return slup_Saved_Msgs;
    }

    public void setSlup_Saved_Msgs(short slup_Saved_MsgsParam) {
        this.slup_Saved_Msgs = slup_Saved_MsgsParam;
    }

}
