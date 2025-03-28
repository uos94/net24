
package kr.co.kcs.oncf.ncp_resp_status_sta;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "lu62i-state-detail", ElementSize = 2, LocalName = "lu62i-state-detail")
public class Lu62i_State_Detail
    implements Serializable, State_DetailMarker
{

    private short lu62i_State_Detail;

    @DdlField(Version = "2.0", QualName = "lu62i-state-detail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 11)
    public short getLu62i_State_Detail() {
        return lu62i_State_Detail;
    }

    public void setLu62i_State_Detail(short lu62i_State_DetailParam) {
        this.lu62i_State_Detail = lu62i_State_DetailParam;
    }

}
