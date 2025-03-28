
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-add-lin", ElementSize = 430, LocalName = "ncp-req-add-lin")
public class Ncp_Req_Add_Lin
    implements Serializable
{

    private Ncp_Line ncp_Req_Add_Lin;

    @DdlField(Version = "2.0", QualName = "ncp-req-add-lin", ObjectClass = 0, Level = 0, Structure = 0, Offset = 0, ElementSize = 430, IdentifierElement = 0)
    public Ncp_Line getNcp_Req_Add_Lin() {
        return ncp_Req_Add_Lin;
    }

    public void setNcp_Req_Add_Lin(Ncp_Line ncp_Req_Add_LinParam) {
        this.ncp_Req_Add_Lin = ncp_Req_Add_LinParam;
    }

}
