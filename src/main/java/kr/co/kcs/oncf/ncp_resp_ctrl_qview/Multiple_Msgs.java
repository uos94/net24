
package kr.co.kcs.oncf.ncp_resp_ctrl_qview;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_ctrl_qview.multiple_msgs.Msg_Array;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "multiple-msgs", ElementSize = 3232, LocalName = "multiple-msgs")
public class Multiple_Msgs
    implements Serializable, Single_MsgMarker
{

    private short num_Msgs;
    private Msg_Array[] msg_Array = new Msg_Array[ 50 ] ;
    private String fil040823_1109;

    @DdlField(Version = "2.0", QualName = "num-msgs", ObjectClass = 1, Level = 2, Structure = 2, Offset = 8, ElementSize = 2, IdentifierElement = 21)
    public short getNum_Msgs() {
        return num_Msgs;
    }

    public void setNum_Msgs(short num_MsgsParam) {
        this.num_Msgs = num_MsgsParam;
    }

    @DdlField(Version = "2.0", QualName = "msg-array", ObjectClass = 0, Level = 2, Structure = 0, Offset = 10, ElementSize = 64, IdentifierElement = 22, OccursMax = 50)
    public Msg_Array[] getMsg_Array() {
        return msg_Array;
    }

    @DdlField(Version = "2.0", QualName = "msg-array", ObjectClass = 0, Level = 2, Structure = 0, Offset = 10, ElementSize = 64, IdentifierElement = 22, OccursMax = 50)
    public Msg_Array getMsg_Array(int index) {
        return (msg_Array[index]);
    }

    public void setMsg_Array(Msg_Array[] msg_ArrayParam) {
        this.msg_Array = msg_ArrayParam;
    }

    public void setMsg_Array(int index, Msg_Array msg_ArrayParam) {
        this.msg_Array[index]=msg_ArrayParam;
    }

    @DdlField(Version = "2.0", QualName = "fil040823-1109", ObjectClass = 1, Level = 2, Structure = 0, Offset = 3210, ElementSize = 30, IdentifierElement = 29, ValidationPattern = "\\p{Sc}{0,30}")
    public String getFil040823_1109() {
        return fil040823_1109;
    }

    public void setFil040823_1109(String fil040823_1109Param) {
        this.fil040823_1109 = fil040823_1109Param;
    }

}
