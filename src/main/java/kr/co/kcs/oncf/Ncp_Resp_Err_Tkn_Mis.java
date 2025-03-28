
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-err-tkn-mis", ElementSize = 8, LocalName = "ncp-resp-err-tkn-mis")
public class Ncp_Resp_Err_Tkn_Mis
    implements Serializable
{

    private short tkn1_Offset;
    private short tkn1_Vty;
    private short tkn2_Offset;
    private short tkn2_Vty;

    @DdlField(Version = "2.0", QualName = "tkn1-offset", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getTkn1_Offset() {
        return tkn1_Offset;
    }

    public void setTkn1_Offset(short tkn1_OffsetParam) {
        this.tkn1_Offset = tkn1_OffsetParam;
    }

    @DdlField(Version = "2.0", QualName = "tkn1-vty", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getTkn1_Vty() {
        return tkn1_Vty;
    }

    public void setTkn1_Vty(short tkn1_VtyParam) {
        this.tkn1_Vty = tkn1_VtyParam;
    }

    @DdlField(Version = "2.0", QualName = "tkn2-offset", ObjectClass = 1, Level = 1, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 3)
    public short getTkn2_Offset() {
        return tkn2_Offset;
    }

    public void setTkn2_Offset(short tkn2_OffsetParam) {
        this.tkn2_Offset = tkn2_OffsetParam;
    }

    @DdlField(Version = "2.0", QualName = "tkn2-vty", ObjectClass = 1, Level = 1, Structure = 2, Offset = 6, ElementSize = 2, IdentifierElement = 4)
    public short getTkn2_Vty() {
        return tkn2_Vty;
    }

    public void setTkn2_Vty(short tkn2_VtyParam) {
        this.tkn2_Vty = tkn2_VtyParam;
    }

}
