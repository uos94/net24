
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_req_control_segstatus.Ctx;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-control-segstatus", ElementSize = 44, LocalName = "ncp-req-control-segstatus")
public class Ncp_Req_Control_Segstatus
    implements Serializable
{

    private Ctx ctx;
    private short control_Val_Seqnum;
    private short control_Val_Display_Lines;

    @DdlField(Version = "2.0", QualName = "ctx", ObjectClass = 0, Level = 1, Structure = 0, Offset = 0, ElementSize = 40, IdentifierElement = 1)
    public Ctx getCtx() {
        return ctx;
    }

    public void setCtx(Ctx ctxParam) {
        this.ctx = ctxParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-seqnum", ObjectClass = 1, Level = 1, Structure = 2, Offset = 40, ElementSize = 2, IdentifierElement = 5)
    public short getControl_Val_Seqnum() {
        return control_Val_Seqnum;
    }

    public void setControl_Val_Seqnum(short control_Val_SeqnumParam) {
        this.control_Val_Seqnum = control_Val_SeqnumParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-display-lines", ObjectClass = 1, Level = 1, Structure = 2, Offset = 42, ElementSize = 2, IdentifierElement = 6)
    public short getControl_Val_Display_Lines() {
        return control_Val_Display_Lines;
    }

    public void setControl_Val_Display_Lines(short control_Val_Display_LinesParam) {
        this.control_Val_Display_Lines = control_Val_Display_LinesParam;
    }

}
