
package kr.co.kcs.oncf.ncp_resp_status_lin;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x25-circuit-timestamp", ElementSize = 12, LocalName = "x25-circuit-timestamp")
public class X25_Circuit_Timestamp
    implements Serializable, Circuit_TimestampMarker
{

    private String x25_Circuit_Timestamp;

    @DdlField(Version = "2.0", QualName = "x25-circuit-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 18, ElementSize = 12, IdentifierElement = 15)
    public String getX25_Circuit_Timestamp() {
        return x25_Circuit_Timestamp;
    }

    public void setX25_Circuit_Timestamp(String x25_Circuit_TimestampParam) {
        this.x25_Circuit_Timestamp = x25_Circuit_TimestampParam;
    }

}
