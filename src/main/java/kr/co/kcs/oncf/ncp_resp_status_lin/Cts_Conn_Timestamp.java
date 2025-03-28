
package kr.co.kcs.oncf.ncp_resp_status_lin;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cts-conn-timestamp", ElementSize = 12, LocalName = "cts-conn-timestamp")
public class Cts_Conn_Timestamp
    implements Serializable, Circuit_TimestampMarker
{

    private String cts_Conn_Timestamp;

    @DdlField(Version = "2.0", QualName = "cts-conn-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 18, ElementSize = 12, IdentifierElement = 16)
    public String getCts_Conn_Timestamp() {
        return cts_Conn_Timestamp;
    }

    public void setCts_Conn_Timestamp(String cts_Conn_TimestampParam) {
        this.cts_Conn_Timestamp = cts_Conn_TimestampParam;
    }

}
