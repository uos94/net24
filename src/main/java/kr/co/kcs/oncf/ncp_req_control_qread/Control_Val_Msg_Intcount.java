
package kr.co.kcs.oncf.ncp_req_control_qread;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "control-val-msg-intcount", ElementSize = 2, LocalName = "control-val-msg-intcount")
public class Control_Val_Msg_Intcount
    implements Serializable, Control_Val_Msg_CountMarker
{

    private short control_Val_Msg_Intcount;

    @DdlField(Version = "2.0", QualName = "control-val-msg-intcount", ObjectClass = 1, Level = 1, Structure = 2, Offset = 40, ElementSize = 2, IdentifierElement = 5)
    public short getControl_Val_Msg_Intcount() {
        return control_Val_Msg_Intcount;
    }

    public void setControl_Val_Msg_Intcount(short control_Val_Msg_IntcountParam) {
        this.control_Val_Msg_Intcount = control_Val_Msg_IntcountParam;
    }

}
