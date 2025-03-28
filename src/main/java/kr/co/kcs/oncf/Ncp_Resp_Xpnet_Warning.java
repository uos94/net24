
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-xpnet-warning", ElementSize = 2, LocalName = "ncp-resp-xpnet-warning")
public class Ncp_Resp_Xpnet_Warning
    implements Serializable
{

    private short ncp_Resp_Xpnet_Warning;

    @DdlField(Version = "2.0", QualName = "ncp-resp-xpnet-warning", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Resp_Xpnet_Warning() {
        return ncp_Resp_Xpnet_Warning;
    }

    public void setNcp_Resp_Xpnet_Warning(short ncp_Resp_Xpnet_WarningParam) {
        this.ncp_Resp_Xpnet_Warning = ncp_Resp_Xpnet_WarningParam;
    }

}
