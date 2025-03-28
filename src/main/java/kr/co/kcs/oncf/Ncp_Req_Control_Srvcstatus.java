
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_req_control_srvcstatus.Ctx;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-control-srvcstatus", ElementSize = 336, LocalName = "ncp-req-control-srvcstatus")
public class Ncp_Req_Control_Srvcstatus
    implements Serializable
{

    private Ctx ctx;
    private short control_Val_Seqnum;
    private String control_Val_Symname;
    private short control_Val_Frozen;
    private short control_Val_Queue;
    private short control_Val_Unavail;
    private short control_Val_Display_Lines;
    private short control_Val_Fail;
    private int control_Val_Queue32;

    @DdlField(Version = "2.0", QualName = "ctx", ObjectClass = 0, Level = 1, Structure = 0, Offset = 0, ElementSize = 304, IdentifierElement = 1)
    public Ctx getCtx() {
        return ctx;
    }

    public void setCtx(Ctx ctxParam) {
        this.ctx = ctxParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-seqnum", ObjectClass = 1, Level = 1, Structure = 2, Offset = 304, ElementSize = 2, IdentifierElement = 4)
    public short getControl_Val_Seqnum() {
        return control_Val_Seqnum;
    }

    public void setControl_Val_Seqnum(short control_Val_SeqnumParam) {
        this.control_Val_Seqnum = control_Val_SeqnumParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-symname", ObjectClass = 1, Level = 1, Structure = 0, Offset = 306, ElementSize = 16, IdentifierElement = 5)
    public String getControl_Val_Symname() {
        return control_Val_Symname;
    }

    public void setControl_Val_Symname(String control_Val_SymnameParam) {
        this.control_Val_Symname = control_Val_SymnameParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-frozen", ObjectClass = 1, Level = 1, Structure = 2, Offset = 322, ElementSize = 2, IdentifierElement = 6)
    public short getControl_Val_Frozen() {
        return control_Val_Frozen;
    }

    public void setControl_Val_Frozen(short control_Val_FrozenParam) {
        this.control_Val_Frozen = control_Val_FrozenParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-queue", ObjectClass = 1, Level = 1, Structure = 2, Offset = 324, ElementSize = 2, IdentifierElement = 7)
    public short getControl_Val_Queue() {
        return control_Val_Queue;
    }

    public void setControl_Val_Queue(short control_Val_QueueParam) {
        this.control_Val_Queue = control_Val_QueueParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-unavail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 326, ElementSize = 2, IdentifierElement = 8)
    public short getControl_Val_Unavail() {
        return control_Val_Unavail;
    }

    public void setControl_Val_Unavail(short control_Val_UnavailParam) {
        this.control_Val_Unavail = control_Val_UnavailParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-display-lines", ObjectClass = 1, Level = 1, Structure = 2, Offset = 328, ElementSize = 2, IdentifierElement = 9)
    public short getControl_Val_Display_Lines() {
        return control_Val_Display_Lines;
    }

    public void setControl_Val_Display_Lines(short control_Val_Display_LinesParam) {
        this.control_Val_Display_Lines = control_Val_Display_LinesParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-fail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 330, ElementSize = 2, IdentifierElement = 10)
    public short getControl_Val_Fail() {
        return control_Val_Fail;
    }

    public void setControl_Val_Fail(short control_Val_FailParam) {
        this.control_Val_Fail = control_Val_FailParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-queue32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 332, ElementSize = 4, IdentifierElement = 11)
    public int getControl_Val_Queue32() {
        return control_Val_Queue32;
    }

    public void setControl_Val_Queue32(int control_Val_Queue32Param) {
        this.control_Val_Queue32 = control_Val_Queue32Param;
    }

}
