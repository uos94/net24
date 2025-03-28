
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-info-lin", ElementSize = 430, LocalName = "ncp-resp-info-lin")
public class Ncp_Resp_Info_Lin
    implements Serializable
{

    private Ncp_Line ncp_Resp_Info_Lin;

    @DdlField(Version = "2.0", QualName = "ncp-resp-info-lin", ObjectClass = 0, Level = 0, Structure = 0, Offset = 0, ElementSize = 430, IdentifierElement = 0)
    public Ncp_Line getNcp_Resp_Info_Lin() {
        return ncp_Resp_Info_Lin;
    }

    public void setNcp_Resp_Info_Lin(Ncp_Line ncp_Resp_Info_LinParam) {
        this.ncp_Resp_Info_Lin = ncp_Resp_Info_LinParam;
    }

}
