
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-alter-class", ElementSize = 32, LocalName = "ncp-req-alter-class")
public class Ncp_Req_Alter_Class
    implements Serializable
{

    private String ncp_Req_Alter_Class;

    @DdlField(Version = "2.0", QualName = "ncp-req-alter-class", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 32, IdentifierElement = 0)
    public String getNcp_Req_Alter_Class() {
        return ncp_Req_Alter_Class;
    }

    public void setNcp_Req_Alter_Class(String ncp_Req_Alter_ClassParam) {
        this.ncp_Req_Alter_Class = ncp_Req_Alter_ClassParam;
    }

}
