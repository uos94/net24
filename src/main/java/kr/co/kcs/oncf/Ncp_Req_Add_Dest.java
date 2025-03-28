
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-add-dest", ElementSize = 162, LocalName = "ncp-req-add-dest")
public class Ncp_Req_Add_Dest
    implements Serializable
{

    private Ncp_Dest ncp_Req_Add_Dest;

    @DdlField(Version = "2.0", QualName = "ncp-req-add-dest", ObjectClass = 0, Level = 0, Structure = 0, Offset = 0, ElementSize = 162, IdentifierElement = 0)
    public Ncp_Dest getNcp_Req_Add_Dest() {
        return ncp_Req_Add_Dest;
    }

    public void setNcp_Req_Add_Dest(Ncp_Dest ncp_Req_Add_DestParam) {
        this.ncp_Req_Add_Dest = ncp_Req_Add_DestParam;
    }

}
