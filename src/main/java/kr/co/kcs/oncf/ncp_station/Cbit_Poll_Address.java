
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cbit-poll-address", ElementSize = 8, LocalName = "cbit-poll-address")
public class Cbit_Poll_Address
    implements Serializable, Poll_AddressMarker
{

    private String cbit_Poll_Address;

    @DdlField(Version = "2.0", QualName = "cbit-poll-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 194, ElementSize = 8, IdentifierElement = 46)
    public String getCbit_Poll_Address() {
        return cbit_Poll_Address;
    }

    public void setCbit_Poll_Address(String cbit_Poll_AddressParam) {
        this.cbit_Poll_Address = cbit_Poll_AddressParam;
    }

}
