
package kr.co.kcs.oncf.ncp_resp_status_lin;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "os5-circuit-timestamp", ElementSize = 12, LocalName = "os5-circuit-timestamp")
public class Os5_Circuit_Timestamp
    implements Serializable, Circuit_TimestampMarker
{

    private String os5_Circuit_Timestamp;

    @DdlField(Version = "2.0", QualName = "os5-circuit-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 18, ElementSize = 12, IdentifierElement = 14)
    public String getOs5_Circuit_Timestamp() {
        return os5_Circuit_Timestamp;
    }

    public void setOs5_Circuit_Timestamp(String os5_Circuit_TimestampParam) {
        this.os5_Circuit_Timestamp = os5_Circuit_TimestampParam;
    }

}
