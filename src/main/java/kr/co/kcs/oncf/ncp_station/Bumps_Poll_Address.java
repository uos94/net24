
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bumps-poll-address", ElementSize = 8, LocalName = "bumps-poll-address")
public class Bumps_Poll_Address
    implements Serializable, Poll_AddressMarker
{

    private String bumps_Poll_Address;

    @DdlField(Version = "2.0", QualName = "bumps-poll-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 194, ElementSize = 8, IdentifierElement = 44)
    public String getBumps_Poll_Address() {
        return bumps_Poll_Address;
    }

    public void setBumps_Poll_Address(String bumps_Poll_AddressParam) {
        this.bumps_Poll_Address = bumps_Poll_AddressParam;
    }

}
