
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-alter-sysname", ElementSize = 8, LocalName = "ncp-req-alter-sysname")
public class Ncp_Req_Alter_Sysname
    implements Serializable
{

    private String ncp_Req_Alter_Sysname;

    @DdlField(Version = "2.0", QualName = "ncp-req-alter-sysname", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 8, IdentifierElement = 0)
    public String getNcp_Req_Alter_Sysname() {
        return ncp_Req_Alter_Sysname;
    }

    public void setNcp_Req_Alter_Sysname(String ncp_Req_Alter_SysnameParam) {
        this.ncp_Req_Alter_Sysname = ncp_Req_Alter_SysnameParam;
    }

}
