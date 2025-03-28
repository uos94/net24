
package kr.co.kcs.oncf.ncp_resp_status_lin;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cts-connected", ElementSize = 2, LocalName = "cts-connected")
public class Cts_Connected
    implements Serializable, Circuit_EstablishedMarker
{

    private short cts_Connected;

    @DdlField(Version = "2.0", QualName = "cts-connected", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 12)
    public short getCts_Connected() {
        return cts_Connected;
    }

    public void setCts_Connected(short cts_ConnectedParam) {
        this.cts_Connected = cts_ConnectedParam;
    }

}
