
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-alter-int", ElementSize = 2, LocalName = "ncp-req-alter-int")
public class Ncp_Req_Alter_Int
    implements Serializable
{

    private short ncp_Req_Alter_Int;

    @DdlField(Version = "2.0", QualName = "ncp-req-alter-int", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Req_Alter_Int() {
        return ncp_Req_Alter_Int;
    }

    public void setNcp_Req_Alter_Int(short ncp_Req_Alter_IntParam) {
        this.ncp_Req_Alter_Int = ncp_Req_Alter_IntParam;
    }

}
