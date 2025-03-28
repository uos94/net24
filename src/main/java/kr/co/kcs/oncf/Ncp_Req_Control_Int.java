
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-control-int", ElementSize = 2, LocalName = "ncp-req-control-int")
public class Ncp_Req_Control_Int
    implements Serializable
{

    private short ncp_Req_Control_Int;

    @DdlField(Version = "2.0", QualName = "ncp-req-control-int", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Req_Control_Int() {
        return ncp_Req_Control_Int;
    }

    public void setNcp_Req_Control_Int(short ncp_Req_Control_IntParam) {
        this.ncp_Req_Control_Int = ncp_Req_Control_IntParam;
    }

}
