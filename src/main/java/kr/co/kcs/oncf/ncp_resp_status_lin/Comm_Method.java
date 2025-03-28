
package kr.co.kcs.oncf.ncp_resp_status_lin;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "comm-method", ElementSize = 16, LocalName = "comm-method")
public class Comm_Method
    implements Serializable, Comm_MethodMarker
{

    private String comm_Method;

    @DdlField(Version = "2.0", QualName = "comm-method", ObjectClass = 1, Level = 1, Structure = 0, Offset = 32, ElementSize = 16, IdentifierElement = 18)
    public String getComm_Method() {
        return comm_Method;
    }

    public void setComm_Method(String comm_MethodParam) {
        this.comm_Method = comm_MethodParam;
    }

}
