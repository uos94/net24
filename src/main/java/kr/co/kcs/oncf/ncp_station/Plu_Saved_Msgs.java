
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "plu-saved-msgs", ElementSize = 2, LocalName = "plu-saved-msgs")
public class Plu_Saved_Msgs
    implements Serializable, Saved_MsgsMarker
{

    private short plu_Saved_Msgs;

    @DdlField(Version = "2.0", QualName = "plu-saved-msgs", ObjectClass = 1, Level = 1, Structure = 2, Offset = 270, ElementSize = 2, IdentifierElement = 77)
    public short getPlu_Saved_Msgs() {
        return plu_Saved_Msgs;
    }

    public void setPlu_Saved_Msgs(short plu_Saved_MsgsParam) {
        this.plu_Saved_Msgs = plu_Saved_MsgsParam;
    }

}
