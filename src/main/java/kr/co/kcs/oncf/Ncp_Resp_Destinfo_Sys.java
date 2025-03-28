
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_destinfo_sys.Ctx;
import kr.co.kcs.oncf.ncp_resp_destinfo_sys.Dests;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-destinfo-sys", ElementSize = 1070, LocalName = "ncp-resp-destinfo-sys")
public class Ncp_Resp_Destinfo_Sys
    implements Serializable
{

    private Ctx ctx;
    private short cmd_Seqnum;
    private short more_Dests;
    private short num_Dests;
    private Dests[] dests = new Dests[ 20 ] ;

    @DdlField(Version = "2.0", QualName = "ctx", ObjectClass = 0, Level = 1, Structure = 0, Offset = 0, ElementSize = 304, IdentifierElement = 1)
    public Ctx getCtx() {
        return ctx;
    }

    public void setCtx(Ctx ctxParam) {
        this.ctx = ctxParam;
    }

    @DdlField(Version = "2.0", QualName = "cmd-seqnum", ObjectClass = 1, Level = 1, Structure = 2, Offset = 304, ElementSize = 2, IdentifierElement = 4)
    public short getCmd_Seqnum() {
        return cmd_Seqnum;
    }

    public void setCmd_Seqnum(short cmd_SeqnumParam) {
        this.cmd_Seqnum = cmd_SeqnumParam;
    }

    @DdlField(Version = "2.0", QualName = "more-dests", ObjectClass = 1, Level = 1, Structure = 2, Offset = 306, ElementSize = 2, IdentifierElement = 5)
    public short getMore_Dests() {
        return more_Dests;
    }

    public void setMore_Dests(short more_DestsParam) {
        this.more_Dests = more_DestsParam;
    }

    @DdlField(Version = "2.0", QualName = "num-dests", ObjectClass = 1, Level = 1, Structure = 2, Offset = 308, ElementSize = 2, IdentifierElement = 6)
    public short getNum_Dests() {
        return num_Dests;
    }

    public void setNum_Dests(short num_DestsParam) {
        this.num_Dests = num_DestsParam;
    }

    @DdlField(Version = "2.0", QualName = "dests", ObjectClass = 0, Level = 1, Structure = 0, Offset = 310, ElementSize = 38, IdentifierElement = 7, OccursMax = 20)
    public Dests[] getDests() {
        return dests;
    }

    @DdlField(Version = "2.0", QualName = "dests", ObjectClass = 0, Level = 1, Structure = 0, Offset = 310, ElementSize = 38, IdentifierElement = 7, OccursMax = 20)
    public Dests getDests(int index) {
        return (dests[index]);
    }

    public void setDests(Dests[] destsParam) {
        this.dests = destsParam;
    }

    public void setDests(int index, Dests destsParam) {
        this.dests[index]=destsParam;
    }

}
