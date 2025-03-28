
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-alter-boolean", ElementSize = 2, LocalName = "ncp-req-alter-boolean")
public class Ncp_Req_Alter_Boolean
    implements Serializable
{

    private short ncp_Req_Alter_Boolean;

    @DdlField(Version = "2.0", QualName = "ncp-req-alter-boolean", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Req_Alter_Boolean() {
        return ncp_Req_Alter_Boolean;
    }

    public void setNcp_Req_Alter_Boolean(short ncp_Req_Alter_BooleanParam) {
        this.ncp_Req_Alter_Boolean = ncp_Req_Alter_BooleanParam;
    }

}
