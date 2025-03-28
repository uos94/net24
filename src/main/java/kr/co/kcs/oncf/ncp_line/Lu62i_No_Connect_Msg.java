
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "lu62i-no-connect-msg", ElementSize = 2, LocalName = "lu62i-no-connect-msg")
public class Lu62i_No_Connect_Msg
    implements Serializable, No_Connect_MsgMarker
{

    private short lu62i_No_Connect_Msg;

    @DdlField(Version = "2.0", QualName = "lu62i-no-connect-msg", ObjectClass = 1, Level = 1, Structure = 2, Offset = 160, ElementSize = 2, IdentifierElement = 108)
    public short getLu62i_No_Connect_Msg() {
        return lu62i_No_Connect_Msg;
    }

    public void setLu62i_No_Connect_Msg(short lu62i_No_Connect_MsgParam) {
        this.lu62i_No_Connect_Msg = lu62i_No_Connect_MsgParam;
    }

}
