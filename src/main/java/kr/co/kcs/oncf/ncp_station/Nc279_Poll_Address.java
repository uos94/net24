
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "nc279-poll-address", ElementSize = 8, LocalName = "nc279-poll-address")
public class Nc279_Poll_Address
    implements Serializable, Poll_AddressMarker
{

    private String nc279_Poll_Address;

    @DdlField(Version = "2.0", QualName = "nc279-poll-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 194, ElementSize = 8, IdentifierElement = 49)
    public String getNc279_Poll_Address() {
        return nc279_Poll_Address;
    }

    public void setNc279_Poll_Address(String nc279_Poll_AddressParam) {
        this.nc279_Poll_Address = nc279_Poll_AddressParam;
    }

}
