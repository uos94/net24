
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-control-symname", ElementSize = 16, LocalName = "ncp-req-control-symname")
public class Ncp_Req_Control_Symname
    implements Serializable
{

    private String ncp_Req_Control_Symname;

    @DdlField(Version = "2.0", QualName = "ncp-req-control-symname", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 0)
    public String getNcp_Req_Control_Symname() {
        return ncp_Req_Control_Symname;
    }

    public void setNcp_Req_Control_Symname(String ncp_Req_Control_SymnameParam) {
        this.ncp_Req_Control_Symname = ncp_Req_Control_SymnameParam;
    }

}
