
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-info-sta", ElementSize = 1176, LocalName = "ncp-resp-info-sta")
public class Ncp_Resp_Info_Sta
    implements Serializable
{

    private Ncp_Station ncp_Resp_Info_Sta;

    @DdlField(Version = "2.0", QualName = "ncp-resp-info-sta", ObjectClass = 0, Level = 0, Structure = 0, Offset = 0, ElementSize = 1176, IdentifierElement = 0)
    public Ncp_Station getNcp_Resp_Info_Sta() {
        return ncp_Resp_Info_Sta;
    }

    public void setNcp_Resp_Info_Sta(Ncp_Station ncp_Resp_Info_StaParam) {
        this.ncp_Resp_Info_Sta = ncp_Resp_Info_StaParam;
    }

}
