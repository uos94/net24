
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cbis-poll-address", ElementSize = 8, LocalName = "cbis-poll-address")
public class Cbis_Poll_Address
    implements Serializable, Poll_AddressMarker
{

    private String cbis_Poll_Address;

    @DdlField(Version = "2.0", QualName = "cbis-poll-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 194, ElementSize = 8, IdentifierElement = 45)
    public String getCbis_Poll_Address() {
        return cbis_Poll_Address;
    }

    public void setCbis_Poll_Address(String cbis_Poll_AddressParam) {
        this.cbis_Poll_Address = cbis_Poll_AddressParam;
    }

}
