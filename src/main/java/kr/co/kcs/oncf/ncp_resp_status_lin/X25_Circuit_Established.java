
package kr.co.kcs.oncf.ncp_resp_status_lin;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x25-circuit-established", ElementSize = 2, LocalName = "x25-circuit-established")
public class X25_Circuit_Established
    implements Serializable, Circuit_EstablishedMarker
{

    private short x25_Circuit_Established;

    @DdlField(Version = "2.0", QualName = "x25-circuit-established", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 11)
    public short getX25_Circuit_Established() {
        return x25_Circuit_Established;
    }

    public void setX25_Circuit_Established(short x25_Circuit_EstablishedParam) {
        this.x25_Circuit_Established = x25_Circuit_EstablishedParam;
    }

}
