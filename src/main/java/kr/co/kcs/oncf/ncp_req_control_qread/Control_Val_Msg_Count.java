
package kr.co.kcs.oncf.ncp_req_control_qread;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "control-val-msg-count", ElementSize = 2, LocalName = "control-val-msg-count")
public class Control_Val_Msg_Count
    implements Serializable, Control_Val_Msg_CountMarker
{

    private short control_Val_Msg_Count;

    @DdlField(Version = "2.0", QualName = "control-val-msg-count", ObjectClass = 1, Level = 1, Structure = 2, Offset = 40, ElementSize = 2, IdentifierElement = 4)
    public short getControl_Val_Msg_Count() {
        return control_Val_Msg_Count;
    }

    public void setControl_Val_Msg_Count(short control_Val_Msg_CountParam) {
        this.control_Val_Msg_Count = control_Val_Msg_CountParam;
    }

}
