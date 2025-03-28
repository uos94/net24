
package kr.co.kcs.oncf.ncp_resp_hinfo_sta.sta;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "tcp-inaddr-s", ElementSize = 56, LocalName = "tcp-inaddr-s")
public class Tcp_Inaddr_S
    implements Serializable, Tcp_Inaddr_SMarker
{

    private String tcp_Inaddr_S;

    @DdlField(Version = "2.0", QualName = "tcp-inaddr-s", ObjectClass = 1, Level = 2, Structure = 0, Offset = 286, ElementSize = 56, IdentifierElement = 28)
    public String getTcp_Inaddr_S() {
        return tcp_Inaddr_S;
    }

    public void setTcp_Inaddr_S(String tcp_Inaddr_SParam) {
        this.tcp_Inaddr_S = tcp_Inaddr_SParam;
    }

}
