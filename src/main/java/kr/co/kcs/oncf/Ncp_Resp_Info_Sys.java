
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-info-sys", ElementSize = 1656, LocalName = "ncp-resp-info-sys")
public class Ncp_Resp_Info_Sys
    implements Serializable
{

    private Ncp_Node ncp_Resp_Info_Sys;

    @DdlField(Version = "2.0", QualName = "ncp-resp-info-sys", ObjectClass = 0, Level = 0, Structure = 0, Offset = 0, ElementSize = 1656, IdentifierElement = 0)
    public Ncp_Node getNcp_Resp_Info_Sys() {
        return ncp_Resp_Info_Sys;
    }

    public void setNcp_Resp_Info_Sys(Ncp_Node ncp_Resp_Info_SysParam) {
        this.ncp_Resp_Info_Sys = ncp_Resp_Info_SysParam;
    }

}
