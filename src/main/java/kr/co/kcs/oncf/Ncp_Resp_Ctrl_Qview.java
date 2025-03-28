
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_ctrl_qview.Single_MsgMarker;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-ctrl-qview", ElementSize = 3240, LocalName = "ncp-resp-ctrl-qview")
public class Ncp_Resp_Ctrl_Qview
    implements Serializable
{

    private short txt_Offset;
    private short resp_Typ;
    private int qnum_Returned;
    private Single_MsgMarker single_Msg;

    @DdlField(Version = "2.0", QualName = "txt-offset", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getTxt_Offset() {
        return txt_Offset;
    }

    public void setTxt_Offset(short txt_OffsetParam) {
        this.txt_Offset = txt_OffsetParam;
    }

    @DdlField(Version = "2.0", QualName = "resp-typ", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getResp_Typ() {
        return resp_Typ;
    }

    public void setResp_Typ(short resp_TypParam) {
        this.resp_Typ = resp_TypParam;
    }

    @DdlField(Version = "2.0", QualName = "qnum-returned", ObjectClass = 1, Level = 1, Structure = 4, Offset = 4, ElementSize = 4, IdentifierElement = 3)
    public int getQnum_Returned() {
        return qnum_Returned;
    }

    public void setQnum_Returned(int qnum_ReturnedParam) {
        this.qnum_Returned = qnum_ReturnedParam;
    }

    @DdlField(Version = "2.0", QualName = "single-msg", ObjectClass = 0, Level = 1, Structure = 0, Offset = 8, ElementSize = 3232, IdentifierElement = 4)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_ctrl_qview.Single_Msg")
    public Single_MsgMarker getSingle_Msg() {
        return single_Msg;
    }

    public void setSingle_Msg(Single_MsgMarker single_MsgParam) {
        this.single_Msg = single_MsgParam;
    }

}
