
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-err-lgth-inv", ElementSize = 4, LocalName = "ncp-resp-err-lgth-inv")
public class Ncp_Resp_Err_Lgth_Inv
    implements Serializable
{

    private short tkn_Lgth;
    private short offset;

    @DdlField(Version = "2.0", QualName = "tkn-lgth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getTkn_Lgth() {
        return tkn_Lgth;
    }

    public void setTkn_Lgth(short tkn_LgthParam) {
        this.tkn_Lgth = tkn_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "offset", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getOffset() {
        return offset;
    }

    public void setOffset(short offsetParam) {
        this.offset = offsetParam;
    }

}
