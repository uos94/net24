
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-info-link", ElementSize = 188, LocalName = "ncp-resp-info-link")
public class Ncp_Resp_Info_Link
    implements Serializable
{

    private Ncp_Link ncp_Resp_Info_Link;

    @DdlField(Version = "2.0", QualName = "ncp-resp-info-link", ObjectClass = 0, Level = 0, Structure = 0, Offset = 0, ElementSize = 188, IdentifierElement = 0)
    public Ncp_Link getNcp_Resp_Info_Link() {
        return ncp_Resp_Info_Link;
    }

    public void setNcp_Resp_Info_Link(Ncp_Link ncp_Resp_Info_LinkParam) {
        this.ncp_Resp_Info_Link = ncp_Resp_Info_LinkParam;
    }

}
