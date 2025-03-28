
package kr.co.kcs.oncf.ncp_resp_ctrl_qview.single_msg;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "msg-data-area-s", ElementSize = 3200, LocalName = "msg-data-area-s")
public class Msg_Data_Area_S
    implements Serializable, Msg_Data_Area_SMarker
{

    private String msg_Data_Area_S;

    @DdlField(Version = "2.0", QualName = "msg-data-area-s", ObjectClass = 1, Level = 2, Structure = 0, Offset = 40, ElementSize = 3200, IdentifierElement = 18, ValidationPattern = "\\p{Sc}{0,3200}")
    public String getMsg_Data_Area_S() {
        return msg_Data_Area_S;
    }

    public void setMsg_Data_Area_S(String msg_Data_Area_SParam) {
        this.msg_Data_Area_S = msg_Data_Area_SParam;
    }

}
