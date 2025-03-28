
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-add-lpro", ElementSize = 188, LocalName = "ncp-req-add-lpro")
public class Ncp_Req_Add_Lpro
    implements Serializable
{

    private Ncp_Link ncp_Req_Add_Lpro;

    @DdlField(Version = "2.0", QualName = "ncp-req-add-lpro", ObjectClass = 0, Level = 0, Structure = 0, Offset = 0, ElementSize = 188, IdentifierElement = 0)
    public Ncp_Link getNcp_Req_Add_Lpro() {
        return ncp_Req_Add_Lpro;
    }

    public void setNcp_Req_Add_Lpro(Ncp_Link ncp_Req_Add_LproParam) {
        this.ncp_Req_Add_Lpro = ncp_Req_Add_LproParam;
    }

}
