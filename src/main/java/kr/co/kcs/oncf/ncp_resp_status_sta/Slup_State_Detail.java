
package kr.co.kcs.oncf.ncp_resp_status_sta;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "slup-state-detail", ElementSize = 2, LocalName = "slup-state-detail")
public class Slup_State_Detail
    implements Serializable, State_DetailMarker
{

    private short slup_State_Detail;

    @DdlField(Version = "2.0", QualName = "slup-state-detail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 14)
    public short getSlup_State_Detail() {
        return slup_State_Detail;
    }

    public void setSlup_State_Detail(short slup_State_DetailParam) {
        this.slup_State_Detail = slup_State_DetailParam;
    }

}
