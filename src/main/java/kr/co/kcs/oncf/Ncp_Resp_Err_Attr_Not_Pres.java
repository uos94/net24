
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-err-attr-not-pres", ElementSize = 2, LocalName = "ncp-resp-err-attr-not-pres")
public class Ncp_Resp_Err_Attr_Not_Pres
    implements Serializable
{

    private short ncp_Resp_Err_Attr_Not_Pres;

    @DdlField(Version = "2.0", QualName = "ncp-resp-err-attr-not-pres", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Resp_Err_Attr_Not_Pres() {
        return ncp_Resp_Err_Attr_Not_Pres;
    }

    public void setNcp_Resp_Err_Attr_Not_Pres(short ncp_Resp_Err_Attr_Not_PresParam) {
        this.ncp_Resp_Err_Attr_Not_Pres = ncp_Resp_Err_Attr_Not_PresParam;
    }

}
