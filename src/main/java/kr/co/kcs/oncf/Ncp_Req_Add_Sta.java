
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-add-sta", ElementSize = 1176, LocalName = "ncp-req-add-sta")
public class Ncp_Req_Add_Sta
    implements Serializable
{

    private Ncp_Station ncp_Req_Add_Sta;

    @DdlField(Version = "2.0", QualName = "ncp-req-add-sta", ObjectClass = 0, Level = 0, Structure = 0, Offset = 0, ElementSize = 1176, IdentifierElement = 0)
    public Ncp_Station getNcp_Req_Add_Sta() {
        return ncp_Req_Add_Sta;
    }

    public void setNcp_Req_Add_Sta(Ncp_Station ncp_Req_Add_StaParam) {
        this.ncp_Req_Add_Sta = ncp_Req_Add_StaParam;
    }

}
