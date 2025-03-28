
package kr.co.kcs.oncf.ncp_resp_status_sta;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bimpt-state-detail", ElementSize = 2, LocalName = "bimpt-state-detail")
public class Bimpt_State_Detail
    implements Serializable, State_DetailMarker
{

    private short bimpt_State_Detail;

    @DdlField(Version = "2.0", QualName = "bimpt-state-detail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 10)
    public short getBimpt_State_Detail() {
        return bimpt_State_Detail;
    }

    public void setBimpt_State_Detail(short bimpt_State_DetailParam) {
        this.bimpt_State_Detail = bimpt_State_DetailParam;
    }

}
