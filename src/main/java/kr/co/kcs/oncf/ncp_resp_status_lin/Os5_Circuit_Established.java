
package kr.co.kcs.oncf.ncp_resp_status_lin;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "os5-circuit-established", ElementSize = 2, LocalName = "os5-circuit-established")
public class Os5_Circuit_Established
    implements Serializable, Circuit_EstablishedMarker
{

    private short os5_Circuit_Established;

    @DdlField(Version = "2.0", QualName = "os5-circuit-established", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 10)
    public short getOs5_Circuit_Established() {
        return os5_Circuit_Established;
    }

    public void setOs5_Circuit_Established(short os5_Circuit_EstablishedParam) {
        this.os5_Circuit_Established = os5_Circuit_EstablishedParam;
    }

}
