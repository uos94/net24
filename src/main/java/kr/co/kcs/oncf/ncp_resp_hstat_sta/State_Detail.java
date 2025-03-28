
package kr.co.kcs.oncf.ncp_resp_hstat_sta;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "state-detail", ElementSize = 2, LocalName = "state-detail")
public class State_Detail
    implements Serializable, State_DetailMarker
{

    private short state_Detail;

    @DdlField(Version = "2.0", QualName = "state-detail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 9)
    public short getState_Detail() {
        return state_Detail;
    }

    public void setState_Detail(short state_DetailParam) {
        this.state_Detail = state_DetailParam;
    }

}
