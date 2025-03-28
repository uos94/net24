
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "no-connect-msg", ElementSize = 2, LocalName = "no-connect-msg")
public class No_Connect_Msg
    implements Serializable, No_Connect_MsgMarker
{

    private short no_Connect_Msg;

    @DdlField(Version = "2.0", QualName = "no-connect-msg", ObjectClass = 1, Level = 1, Structure = 2, Offset = 160, ElementSize = 2, IdentifierElement = 107)
    public short getNo_Connect_Msg() {
        return no_Connect_Msg;
    }

    public void setNo_Connect_Msg(short no_Connect_MsgParam) {
        this.no_Connect_Msg = no_Connect_MsgParam;
    }

}
