
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_segstatus_sys.Ctx;
import kr.co.kcs.oncf.ncp_resp_segstatus_sys.Segs;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-segstatus-sys", ElementSize = 1646, LocalName = "ncp-resp-segstatus-sys")
public class Ncp_Resp_Segstatus_Sys
    implements Serializable
{

    private Ctx ctx;
    private short cmd_Seqnum;
    private short more_Segs;
    private short num_Segs;
    private Segs[] segs = new Segs[ 20 ] ;

    @DdlField(Version = "2.0", QualName = "ctx", ObjectClass = 0, Level = 1, Structure = 0, Offset = 0, ElementSize = 40, IdentifierElement = 1)
    public Ctx getCtx() {
        return ctx;
    }

    public void setCtx(Ctx ctxParam) {
        this.ctx = ctxParam;
    }

    @DdlField(Version = "2.0", QualName = "cmd-seqnum", ObjectClass = 1, Level = 1, Structure = 2, Offset = 40, ElementSize = 2, IdentifierElement = 5)
    public short getCmd_Seqnum() {
        return cmd_Seqnum;
    }

    public void setCmd_Seqnum(short cmd_SeqnumParam) {
        this.cmd_Seqnum = cmd_SeqnumParam;
    }

    @DdlField(Version = "2.0", QualName = "more-segs", ObjectClass = 1, Level = 1, Structure = 2, Offset = 42, ElementSize = 2, IdentifierElement = 6)
    public short getMore_Segs() {
        return more_Segs;
    }

    public void setMore_Segs(short more_SegsParam) {
        this.more_Segs = more_SegsParam;
    }

    @DdlField(Version = "2.0", QualName = "num-segs", ObjectClass = 1, Level = 1, Structure = 2, Offset = 44, ElementSize = 2, IdentifierElement = 7)
    public short getNum_Segs() {
        return num_Segs;
    }

    public void setNum_Segs(short num_SegsParam) {
        this.num_Segs = num_SegsParam;
    }

    @DdlField(Version = "2.0", QualName = "segs", ObjectClass = 0, Level = 1, Structure = 0, Offset = 46, ElementSize = 80, IdentifierElement = 8, OccursMax = 20)
    public Segs[] getSegs() {
        return segs;
    }

    @DdlField(Version = "2.0", QualName = "segs", ObjectClass = 0, Level = 1, Structure = 0, Offset = 46, ElementSize = 80, IdentifierElement = 8, OccursMax = 20)
    public Segs getSegs(int index) {
        return (segs[index]);
    }

    public void setSegs(Segs[] segsParam) {
        this.segs = segsParam;
    }

    public void setSegs(int index, Segs segsParam) {
        this.segs[index]=segsParam;
    }

}
