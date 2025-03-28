
package kr.co.kcs.oncf.ncp_resp_status_sta;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "plu-state-detail", ElementSize = 2, LocalName = "plu-state-detail")
public class Plu_State_Detail
    implements Serializable, State_DetailMarker
{

    private short plu_State_Detail;

    @DdlField(Version = "2.0", QualName = "plu-state-detail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 12)
    public short getPlu_State_Detail() {
        return plu_State_Detail;
    }

    public void setPlu_State_Detail(short plu_State_DetailParam) {
        this.plu_State_Detail = plu_State_DetailParam;
    }

}
