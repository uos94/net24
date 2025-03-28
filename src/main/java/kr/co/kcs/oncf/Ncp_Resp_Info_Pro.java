
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-info-pro", ElementSize = 1358, LocalName = "ncp-resp-info-pro")
public class Ncp_Resp_Info_Pro
    implements Serializable
{

    private Ncp_Process ncp_Resp_Info_Pro;

    @DdlField(Version = "2.0", QualName = "ncp-resp-info-pro", ObjectClass = 0, Level = 0, Structure = 0, Offset = 0, ElementSize = 1358, IdentifierElement = 0)
    public Ncp_Process getNcp_Resp_Info_Pro() {
        return ncp_Resp_Info_Pro;
    }

    public void setNcp_Resp_Info_Pro(Ncp_Process ncp_Resp_Info_ProParam) {
        this.ncp_Resp_Info_Pro = ncp_Resp_Info_ProParam;
    }

}
