
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-info-udata", ElementSize = 2, LocalName = "ncp-req-info-udata")
public class Ncp_Req_Info_Udata
    implements Serializable
{

    private short ncp_Req_Info_Udata;

    @DdlField(Version = "2.0", QualName = "ncp-req-info-udata", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Req_Info_Udata() {
        return ncp_Req_Info_Udata;
    }

    public void setNcp_Req_Info_Udata(short ncp_Req_Info_UdataParam) {
        this.ncp_Req_Info_Udata = ncp_Req_Info_UdataParam;
    }

}
