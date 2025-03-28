
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-alter-uint", ElementSize = 2, LocalName = "ncp-req-alter-uint")
public class Ncp_Req_Alter_Uint
    implements Serializable
{

    private short ncp_Req_Alter_Uint;

    @DdlField(Version = "2.0", QualName = "ncp-req-alter-uint", ObjectClass = 1, Level = 0, Structure = 3, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Req_Alter_Uint() {
        return ncp_Req_Alter_Uint;
    }

    public void setNcp_Req_Alter_Uint(short ncp_Req_Alter_UintParam) {
        this.ncp_Req_Alter_Uint = ncp_Req_Alter_UintParam;
    }

}
