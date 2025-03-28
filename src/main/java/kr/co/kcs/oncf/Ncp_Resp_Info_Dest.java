
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-info-dest", ElementSize = 162, LocalName = "ncp-resp-info-dest")
public class Ncp_Resp_Info_Dest
    implements Serializable
{

    private Ncp_Dest ncp_Resp_Info_Dest;

    @DdlField(Version = "2.0", QualName = "ncp-resp-info-dest", ObjectClass = 0, Level = 0, Structure = 0, Offset = 0, ElementSize = 162, IdentifierElement = 0)
    public Ncp_Dest getNcp_Resp_Info_Dest() {
        return ncp_Resp_Info_Dest;
    }

    public void setNcp_Resp_Info_Dest(Ncp_Dest ncp_Resp_Info_DestParam) {
        this.ncp_Resp_Info_Dest = ncp_Resp_Info_DestParam;
    }

}
