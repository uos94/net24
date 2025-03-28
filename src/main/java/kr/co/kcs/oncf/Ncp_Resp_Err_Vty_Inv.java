
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-err-vty-inv", ElementSize = 4, LocalName = "ncp-resp-err-vty-inv")
public class Ncp_Resp_Err_Vty_Inv
    implements Serializable
{

    private short tkn_Vty;
    private short offset;

    @DdlField(Version = "2.0", QualName = "tkn-vty", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getTkn_Vty() {
        return tkn_Vty;
    }

    public void setTkn_Vty(short tkn_VtyParam) {
        this.tkn_Vty = tkn_VtyParam;
    }

    @DdlField(Version = "2.0", QualName = "offset", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getOffset() {
        return offset;
    }

    public void setOffset(short offsetParam) {
        this.offset = offsetParam;
    }

}
