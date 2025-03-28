
package kr.co.kcs.oncf.ncp_resp_hstat_sta;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cts-state-detail", ElementSize = 2, LocalName = "cts-state-detail")
public class Cts_State_Detail
    implements Serializable, State_DetailMarker
{

    private short cts_State_Detail;

    @DdlField(Version = "2.0", QualName = "cts-state-detail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 10)
    public short getCts_State_Detail() {
        return cts_State_Detail;
    }

    public void setCts_State_Detail(short cts_State_DetailParam) {
        this.cts_State_Detail = cts_State_DetailParam;
    }

}
