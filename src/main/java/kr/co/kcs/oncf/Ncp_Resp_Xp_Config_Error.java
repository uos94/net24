
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-xp-config-error", ElementSize = 2, LocalName = "ncp-resp-xp-config-error")
public class Ncp_Resp_Xp_Config_Error
    implements Serializable
{

    private short ncp_Resp_Xp_Config_Error;

    @DdlField(Version = "2.0", QualName = "ncp-resp-xp-config-error", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Resp_Xp_Config_Error() {
        return ncp_Resp_Xp_Config_Error;
    }

    public void setNcp_Resp_Xp_Config_Error(short ncp_Resp_Xp_Config_ErrorParam) {
        this.ncp_Resp_Xp_Config_Error = ncp_Resp_Xp_Config_ErrorParam;
    }

}
