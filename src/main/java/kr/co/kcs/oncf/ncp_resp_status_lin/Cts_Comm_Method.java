
package kr.co.kcs.oncf.ncp_resp_status_lin;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cts-comm-method", ElementSize = 16, LocalName = "cts-comm-method")
public class Cts_Comm_Method
    implements Serializable, Comm_MethodMarker
{

    private String cts_Comm_Method;

    @DdlField(Version = "2.0", QualName = "cts-comm-method", ObjectClass = 1, Level = 1, Structure = 0, Offset = 32, ElementSize = 16, IdentifierElement = 19)
    public String getCts_Comm_Method() {
        return cts_Comm_Method;
    }

    public void setCts_Comm_Method(String cts_Comm_MethodParam) {
        this.cts_Comm_Method = cts_Comm_MethodParam;
    }

}
