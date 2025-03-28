
package kr.co.kcs.oncf.ncp_resp_ctrl_qview.multiple_msgs;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "msg-array", ElementSize = 64, LocalName = "msg-array")
public class Msg_Array
    implements Serializable
{

    private String sym_Source;
    private short fail_Cde;
    private short msg_Flags;
    private short fulltxt_Lgth;
    private short msg_Txt_Lgth;
    private String msg_Txt;

    @DdlField(Version = "2.0", QualName = "sym-source", ObjectClass = 1, Level = 3, Structure = 0, Offset = 10, ElementSize = 16, IdentifierElement = 23, ValidationPattern = "\\p{Sc}{0,16}")
    public String getSym_Source() {
        return sym_Source;
    }

    public void setSym_Source(String sym_SourceParam) {
        this.sym_Source = sym_SourceParam;
    }

    @DdlField(Version = "2.0", QualName = "fail-cde", ObjectClass = 1, Level = 3, Structure = 2, Offset = 26, ElementSize = 2, IdentifierElement = 24)
    public short getFail_Cde() {
        return fail_Cde;
    }

    public void setFail_Cde(short fail_CdeParam) {
        this.fail_Cde = fail_CdeParam;
    }

    @DdlField(Version = "2.0", QualName = "msg-flags", ObjectClass = 1, Level = 3, Structure = 2, Offset = 28, ElementSize = 2, IdentifierElement = 25)
    public short getMsg_Flags() {
        return msg_Flags;
    }

    public void setMsg_Flags(short msg_FlagsParam) {
        this.msg_Flags = msg_FlagsParam;
    }

    @DdlField(Version = "2.0", QualName = "fulltxt-lgth", ObjectClass = 1, Level = 3, Structure = 2, Offset = 30, ElementSize = 2, IdentifierElement = 26)
    public short getFulltxt_Lgth() {
        return fulltxt_Lgth;
    }

    public void setFulltxt_Lgth(short fulltxt_LgthParam) {
        this.fulltxt_Lgth = fulltxt_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "msg-txt-lgth", ObjectClass = 1, Level = 3, Structure = 2, Offset = 32, ElementSize = 2, IdentifierElement = 27)
    public short getMsg_Txt_Lgth() {
        return msg_Txt_Lgth;
    }

    public void setMsg_Txt_Lgth(short msg_Txt_LgthParam) {
        this.msg_Txt_Lgth = msg_Txt_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "msg-txt", ObjectClass = 1, Level = 3, Structure = 0, Offset = 34, ElementSize = 40, IdentifierElement = 28, ValidationPattern = "\\p{Sc}{0,40}")
    public String getMsg_Txt() {
        return msg_Txt;
    }

    public void setMsg_Txt(String msg_TxtParam) {
        this.msg_Txt = msg_TxtParam;
    }

}
