
package kr.co.kcs.oncf.ncp_resp_status_lin;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "circuit-established", ElementSize = 2, LocalName = "circuit-established")
public class Circuit_Established
    implements Serializable, Circuit_EstablishedMarker
{

    private short circuit_Established;

    @DdlField(Version = "2.0", QualName = "circuit-established", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 9)
    public short getCircuit_Established() {
        return circuit_Established;
    }

    public void setCircuit_Established(short circuit_EstablishedParam) {
        this.circuit_Established = circuit_EstablishedParam;
    }

}
