
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-err-ttl-inv", ElementSize = 4, LocalName = "ncp-resp-err-ttl-inv")
public class Ncp_Resp_Err_Ttl_Inv
    implements Serializable
{

    private short tkn_Ttl;
    private short offset;

    @DdlField(Version = "2.0", QualName = "tkn-ttl", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getTkn_Ttl() {
        return tkn_Ttl;
    }

    public void setTkn_Ttl(short tkn_TtlParam) {
        this.tkn_Ttl = tkn_TtlParam;
    }

    @DdlField(Version = "2.0", QualName = "offset", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getOffset() {
        return offset;
    }

    public void setOffset(short offsetParam) {
        this.offset = offsetParam;
    }

}
