
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-info-dev", ElementSize = 1962, LocalName = "ncp-resp-info-dev")
public class Ncp_Resp_Info_Dev
    implements Serializable
{

    private Ncp_Device ncp_Resp_Info_Dev;

    @DdlField(Version = "2.0", QualName = "ncp-resp-info-dev", ObjectClass = 0, Level = 0, Structure = 0, Offset = 0, ElementSize = 1962, IdentifierElement = 0)
    public Ncp_Device getNcp_Resp_Info_Dev() {
        return ncp_Resp_Info_Dev;
    }

    public void setNcp_Resp_Info_Dev(Ncp_Device ncp_Resp_Info_DevParam) {
        this.ncp_Resp_Info_Dev = ncp_Resp_Info_DevParam;
    }

}
