
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-alter-enum", ElementSize = 2, LocalName = "ncp-req-alter-enum")
public class Ncp_Req_Alter_Enum
    implements Serializable
{

    private short ncp_Req_Alter_Enum;

    @DdlField(Version = "2.0", QualName = "ncp-req-alter-enum", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Req_Alter_Enum() {
        return ncp_Req_Alter_Enum;
    }

    public void setNcp_Req_Alter_Enum(short ncp_Req_Alter_EnumParam) {
        this.ncp_Req_Alter_Enum = ncp_Req_Alter_EnumParam;
    }

}
