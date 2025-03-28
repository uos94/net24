
package kr.co.kcs.oncf.ncp_resp_hinfo_sta.sta;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "tcp-srv-listen-line-s", ElementSize = 16, LocalName = "tcp-srv-listen-line-s")
public class Tcp_Srv_Listen_Line_S
    implements Serializable, Tcp_Srv_Listen_Line_SMarker
{

    private String tcp_Srv_Listen_Line_S;

    @DdlField(Version = "2.0", QualName = "tcp-srv-listen-line-s", ObjectClass = 1, Level = 2, Structure = 0, Offset = 344, ElementSize = 16, IdentifierElement = 31)
    public String getTcp_Srv_Listen_Line_S() {
        return tcp_Srv_Listen_Line_S;
    }

    public void setTcp_Srv_Listen_Line_S(String tcp_Srv_Listen_Line_SParam) {
        this.tcp_Srv_Listen_Line_S = tcp_Srv_Listen_Line_SParam;
    }

}
