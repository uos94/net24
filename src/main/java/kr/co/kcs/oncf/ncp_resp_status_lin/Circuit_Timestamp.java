
package kr.co.kcs.oncf.ncp_resp_status_lin;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "circuit-timestamp", ElementSize = 12, LocalName = "circuit-timestamp")
public class Circuit_Timestamp
    implements Serializable, Circuit_TimestampMarker
{

    private String circuit_Timestamp;

    @DdlField(Version = "2.0", QualName = "circuit-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 18, ElementSize = 12, IdentifierElement = 13)
    public String getCircuit_Timestamp() {
        return circuit_Timestamp;
    }

    public void setCircuit_Timestamp(String circuit_TimestampParam) {
        this.circuit_Timestamp = circuit_TimestampParam;
    }

}
