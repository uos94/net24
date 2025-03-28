
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-control-register", ElementSize = 16, LocalName = "ncp-req-control-register")
public class Ncp_Req_Control_Register
    implements Serializable
{

    private String ncp_Req_Control_Register;

    @DdlField(Version = "2.0", QualName = "ncp-req-control-register", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 0)
    public String getNcp_Req_Control_Register() {
        return ncp_Req_Control_Register;
    }

    public void setNcp_Req_Control_Register(String ncp_Req_Control_RegisterParam) {
        this.ncp_Req_Control_Register = ncp_Req_Control_RegisterParam;
    }

}
