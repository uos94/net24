
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-control-boolean", ElementSize = 2, LocalName = "ncp-req-control-boolean")
public class Ncp_Req_Control_Boolean
    implements Serializable
{

    private short ncp_Req_Control_Boolean;

    @DdlField(Version = "2.0", QualName = "ncp-req-control-boolean", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Req_Control_Boolean() {
        return ncp_Req_Control_Boolean;
    }

    public void setNcp_Req_Control_Boolean(short ncp_Req_Control_BooleanParam) {
        this.ncp_Req_Control_Boolean = ncp_Req_Control_BooleanParam;
    }

}
