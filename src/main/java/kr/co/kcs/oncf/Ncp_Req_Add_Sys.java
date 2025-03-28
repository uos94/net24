
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-add-sys", ElementSize = 1656, LocalName = "ncp-req-add-sys")
public class Ncp_Req_Add_Sys
    implements Serializable
{

    private Ncp_Node ncp_Req_Add_Sys;

    @DdlField(Version = "2.0", QualName = "ncp-req-add-sys", ObjectClass = 0, Level = 0, Structure = 0, Offset = 0, ElementSize = 1656, IdentifierElement = 0)
    public Ncp_Node getNcp_Req_Add_Sys() {
        return ncp_Req_Add_Sys;
    }

    public void setNcp_Req_Add_Sys(Ncp_Node ncp_Req_Add_SysParam) {
        this.ncp_Req_Add_Sys = ncp_Req_Add_SysParam;
    }

}
