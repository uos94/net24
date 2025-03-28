
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_req_control_qread.Control_Val_Msg_CountMarker;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

@DdlGroup(Version = "2.0", QualName = "ncp-req-control-qread", ElementSize = 52, LocalName = "ncp-req-control-qread")
public class Ncp_Req_Control_Qread
    implements Serializable
{

    private String control_Val_Filename;
    private short control_Val_Msg_Type;
    private short control_Val_Interval;
    private Control_Val_Msg_CountMarker control_Val_Msg_Count;
    private short control_Val_Poss_Dup_Flg;
    private int control_Val_Msg_Count_Ttl;
    private int control_Val_Msg_First;

    @DdlField(Version = "2.0", QualName = "control-val-filename", ObjectClass = 1, Level = 1, Structure = 0, Offset = 0, ElementSize = 36, IdentifierElement = 1)
    public String getControl_Val_Filename() {
        return control_Val_Filename;
    }

    public void setControl_Val_Filename(String control_Val_FilenameParam) {
        this.control_Val_Filename = control_Val_FilenameParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-msg-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 36, ElementSize = 2, IdentifierElement = 2)
    public short getControl_Val_Msg_Type() {
        return control_Val_Msg_Type;
    }

    public void setControl_Val_Msg_Type(short control_Val_Msg_TypeParam) {
        this.control_Val_Msg_Type = control_Val_Msg_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-interval", ObjectClass = 1, Level = 1, Structure = 2, Offset = 38, ElementSize = 2, IdentifierElement = 3)
    public short getControl_Val_Interval() {
        return control_Val_Interval;
    }

    public void setControl_Val_Interval(short control_Val_IntervalParam) {
        this.control_Val_Interval = control_Val_IntervalParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-msg-count", ObjectClass = 1, Level = 1, Structure = 2, Offset = 40, ElementSize = 2, IdentifierElement = 4)
    @ReturnType("kr.co.kcs.oncf.ncp_req_control_qread.Control_Val_Msg_Count")
    public Control_Val_Msg_CountMarker getControl_Val_Msg_Count() {
        return control_Val_Msg_Count;
    }

    public void setControl_Val_Msg_Count(Control_Val_Msg_CountMarker control_Val_Msg_CountParam) {
        this.control_Val_Msg_Count = control_Val_Msg_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-poss-dup-flg", ObjectClass = 1, Level = 1, Structure = 2, Offset = 42, ElementSize = 2, IdentifierElement = 6)
    public short getControl_Val_Poss_Dup_Flg() {
        return control_Val_Poss_Dup_Flg;
    }

    public void setControl_Val_Poss_Dup_Flg(short control_Val_Poss_Dup_FlgParam) {
        this.control_Val_Poss_Dup_Flg = control_Val_Poss_Dup_FlgParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-msg-count-ttl", ObjectClass = 1, Level = 1, Structure = 4, Offset = 44, ElementSize = 4, IdentifierElement = 7)
    public int getControl_Val_Msg_Count_Ttl() {
        return control_Val_Msg_Count_Ttl;
    }

    public void setControl_Val_Msg_Count_Ttl(int control_Val_Msg_Count_TtlParam) {
        this.control_Val_Msg_Count_Ttl = control_Val_Msg_Count_TtlParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-msg-first", ObjectClass = 1, Level = 1, Structure = 4, Offset = 48, ElementSize = 4, IdentifierElement = 8)
    public int getControl_Val_Msg_First() {
        return control_Val_Msg_First;
    }

    public void setControl_Val_Msg_First(int control_Val_Msg_FirstParam) {
        this.control_Val_Msg_First = control_Val_Msg_FirstParam;
    }

}
