
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_req_control_destinfo.Ctx;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-control-destinfo", ElementSize = 354, LocalName = "ncp-req-control-destinfo")
public class Ncp_Req_Control_Destinfo
    implements Serializable
{

    private Ctx ctx;
    private short control_Val_Seqnum;
    private String control_Val_Symname;
    private String control_Val_Link;
    private short control_Val_Frozen;
    private short control_Val_Queue;
    private short control_Val_Type;
    private short control_Val_Nodes;
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

    @DdlField(Version = "2.0", QualName = "control-val-link", ObjectClass = 1, Level = 1, Structure = 0, Offset = 322, ElementSize = 16, IdentifierElement = 6)
    public String getControl_Val_Link() {
        return control_Val_Link;
    }

    public void setControl_Val_Link(String control_Val_LinkParam) {
        this.control_Val_Link = control_Val_LinkParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-frozen", ObjectClass = 1, Level = 1, Structure = 2, Offset = 338, ElementSize = 2, IdentifierElement = 7)
    public short getControl_Val_Frozen() {
        return control_Val_Frozen;
    }

    public void setControl_Val_Frozen(short control_Val_FrozenParam) {
        this.control_Val_Frozen = control_Val_FrozenParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-queue", ObjectClass = 1, Level = 1, Structure = 2, Offset = 340, ElementSize = 2, IdentifierElement = 8)
    public short getControl_Val_Queue() {
        return control_Val_Queue;
    }

    public void setControl_Val_Queue(short control_Val_QueueParam) {
        this.control_Val_Queue = control_Val_QueueParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 342, ElementSize = 2, IdentifierElement = 9)
    public short getControl_Val_Type() {
        return control_Val_Type;
    }

    public void setControl_Val_Type(short control_Val_TypeParam) {
        this.control_Val_Type = control_Val_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-nodes", ObjectClass = 1, Level = 1, Structure = 2, Offset = 344, ElementSize = 2, IdentifierElement = 10)
    public short getControl_Val_Nodes() {
        return control_Val_Nodes;
    }

    public void setControl_Val_Nodes(short control_Val_NodesParam) {
        this.control_Val_Nodes = control_Val_NodesParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-display-lines", ObjectClass = 1, Level = 1, Structure = 2, Offset = 346, ElementSize = 2, IdentifierElement = 11)
    public short getControl_Val_Display_Lines() {
        return control_Val_Display_Lines;
    }

    public void setControl_Val_Display_Lines(short control_Val_Display_LinesParam) {
        this.control_Val_Display_Lines = control_Val_Display_LinesParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-fail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 348, ElementSize = 2, IdentifierElement = 12)
    public short getControl_Val_Fail() {
        return control_Val_Fail;
    }

    public void setControl_Val_Fail(short control_Val_FailParam) {
        this.control_Val_Fail = control_Val_FailParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-queue32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 350, ElementSize = 4, IdentifierElement = 13)
    public int getControl_Val_Queue32() {
        return control_Val_Queue32;
    }

    public void setControl_Val_Queue32(int control_Val_Queue32Param) {
        this.control_Val_Queue32 = control_Val_Queue32Param;
    }

}
