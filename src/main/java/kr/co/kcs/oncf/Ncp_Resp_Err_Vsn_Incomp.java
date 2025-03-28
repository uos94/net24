
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-err-vsn-incomp", ElementSize = 8, LocalName = "ncp-resp-err-vsn-incomp")
public class Ncp_Resp_Err_Vsn_Incomp
    implements Serializable
{

    private short tkn_Vty;
    private String server_Vsn;

    @DdlField(Version = "2.0", QualName = "tkn-vty", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getTkn_Vty() {
        return tkn_Vty;
    }

    public void setTkn_Vty(short tkn_VtyParam) {
        this.tkn_Vty = tkn_VtyParam;
    }

    @DdlField(Version = "2.0", QualName = "server-vsn", ObjectClass = 1, Level = 1, Structure = 0, Offset = 2, ElementSize = 6, IdentifierElement = 2)
    public String getServer_Vsn() {
        return server_Vsn;
    }

    public void setServer_Vsn(String server_VsnParam) {
        this.server_Vsn = server_VsnParam;
    }

}
