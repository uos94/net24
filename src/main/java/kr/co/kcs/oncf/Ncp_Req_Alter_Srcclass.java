
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-alter-srcclass", ElementSize = 4, LocalName = "ncp-req-alter-srcclass")
public class Ncp_Req_Alter_Srcclass
    implements Serializable
{

    private String ncp_Req_Alter_Srcclass;

    @DdlField(Version = "2.0", QualName = "ncp-req-alter-srcclass", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 4, IdentifierElement = 0)
    public String getNcp_Req_Alter_Srcclass() {
        return ncp_Req_Alter_Srcclass;
    }

    public void setNcp_Req_Alter_Srcclass(String ncp_Req_Alter_SrcclassParam) {
        this.ncp_Req_Alter_Srcclass = ncp_Req_Alter_SrcclassParam;
    }

}
