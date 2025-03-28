
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-info-lpro", ElementSize = 188, LocalName = "ncp-resp-info-lpro")
public class Ncp_Resp_Info_Lpro
    implements Serializable
{

    private Ncp_Link ncp_Resp_Info_Lpro;

    @DdlField(Version = "2.0", QualName = "ncp-resp-info-lpro", ObjectClass = 0, Level = 0, Structure = 0, Offset = 0, ElementSize = 188, IdentifierElement = 0)
    public Ncp_Link getNcp_Resp_Info_Lpro() {
        return ncp_Resp_Info_Lpro;
    }

    public void setNcp_Resp_Info_Lpro(Ncp_Link ncp_Resp_Info_LproParam) {
        this.ncp_Resp_Info_Lpro = ncp_Resp_Info_LproParam;
    }

}
