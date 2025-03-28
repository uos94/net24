
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_srvcstatus_sys.Ctx;
import kr.co.kcs.oncf.ncp_resp_srvcstatus_sys.Ext;
import kr.co.kcs.oncf.ncp_resp_srvcstatus_sys.Srvcs;
import kr.co.kcs.oncf.ncp_resp_srvcstatus_sys.Srvcs32;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-srvcstatus-sys", ElementSize = 990, LocalName = "ncp-resp-srvcstatus-sys")
public class Ncp_Resp_Srvcstatus_Sys
    implements Serializable
{

    private Ctx ctx;
    private short cmd_Seqnum;
    private short more_Srvcs;
    private short num_Srvcs;
    private Srvcs[] srvcs = new Srvcs[ 20 ] ;
    private Ext[] ext = new Ext[ 20 ] ;
    private Srvcs32 [] srvcs32 = new Srvcs32 [ 20 ] ;

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

    @DdlField(Version = "2.0", QualName = "more-srvcs", ObjectClass = 1, Level = 1, Structure = 2, Offset = 306, ElementSize = 2, IdentifierElement = 5)
    public short getMore_Srvcs() {
        return more_Srvcs;
    }

    public void setMore_Srvcs(short more_SrvcsParam) {
        this.more_Srvcs = more_SrvcsParam;
    }

    @DdlField(Version = "2.0", QualName = "num-srvcs", ObjectClass = 1, Level = 1, Structure = 2, Offset = 308, ElementSize = 2, IdentifierElement = 6)
    public short getNum_Srvcs() {
        return num_Srvcs;
    }

    public void setNum_Srvcs(short num_SrvcsParam) {
        this.num_Srvcs = num_SrvcsParam;
    }

    @DdlField(Version = "2.0", QualName = "srvcs", ObjectClass = 0, Level = 1, Structure = 0, Offset = 310, ElementSize = 28, IdentifierElement = 7, OccursMax = 20)
    public Srvcs[] getSrvcs() {
        return srvcs;
    }

    @DdlField(Version = "2.0", QualName = "srvcs", ObjectClass = 0, Level = 1, Structure = 0, Offset = 310, ElementSize = 28, IdentifierElement = 7, OccursMax = 20)
    public Srvcs getSrvcs(int index) {
        return (srvcs[index]);
    }

    public void setSrvcs(Srvcs[] srvcsParam) {
        this.srvcs = srvcsParam;
    }

    public void setSrvcs(int index, Srvcs srvcsParam) {
        this.srvcs[index]=srvcsParam;
    }

    @DdlField(Version = "2.0", QualName = "ext", ObjectClass = 0, Level = 1, Structure = 0, Offset = 870, ElementSize = 2, IdentifierElement = 15, OccursMax = 20)
    public Ext[] getExt() {
        return ext;
    }

    @DdlField(Version = "2.0", QualName = "ext", ObjectClass = 0, Level = 1, Structure = 0, Offset = 870, ElementSize = 2, IdentifierElement = 15, OccursMax = 20)
    public Ext getExt(int index) {
        return (ext[index]);
    }

    public void setExt(Ext[] extParam) {
        this.ext = extParam;
    }

    public void setExt(int index, Ext extParam) {
        this.ext[index]=extParam;
    }

    @DdlField(Version = "2.0", QualName = "srvcs32", ObjectClass = 0, Level = 1, Structure = 0, Offset = 910, ElementSize = 4, IdentifierElement = 17, OccursMax = 20)
    public Srvcs32 [] getSrvcs32() {
        return srvcs32;
    }

    @DdlField(Version = "2.0", QualName = "srvcs32", ObjectClass = 0, Level = 1, Structure = 0, Offset = 910, ElementSize = 4, IdentifierElement = 17, OccursMax = 20)
    public Srvcs32 getSrvcs32(int index) {
        return (srvcs32[index]);
    }

    public void setSrvcs32(Srvcs32 [] srvcs32Param) {
        this.srvcs32 = srvcs32Param;
    }

    public void setSrvcs32(int index, Srvcs32 srvcs32Param) {
        this.srvcs32[index]=srvcs32Param;
    }

}
