
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-alter-strtopts", ElementSize = 32, LocalName = "ncp-req-alter-strtopts")
public class Ncp_Req_Alter_Strtopts
    implements Serializable
{

    private String ncp_Req_Alter_Strtopts;

    @DdlField(Version = "2.0", QualName = "ncp-req-alter-strtopts", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 32, IdentifierElement = 0)
    public String getNcp_Req_Alter_Strtopts() {
        return ncp_Req_Alter_Strtopts;
    }

    public void setNcp_Req_Alter_Strtopts(String ncp_Req_Alter_StrtoptsParam) {
        this.ncp_Req_Alter_Strtopts = ncp_Req_Alter_StrtoptsParam;
    }

}
