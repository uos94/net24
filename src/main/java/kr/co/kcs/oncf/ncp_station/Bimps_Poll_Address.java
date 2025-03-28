
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bimps-poll-address", ElementSize = 8, LocalName = "bimps-poll-address")
public class Bimps_Poll_Address
    implements Serializable, Poll_AddressMarker
{

    private String bimps_Poll_Address;

    @DdlField(Version = "2.0", QualName = "bimps-poll-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 194, ElementSize = 8, IdentifierElement = 42)
    public String getBimps_Poll_Address() {
        return bimps_Poll_Address;
    }

    public void setBimps_Poll_Address(String bimps_Poll_AddressParam) {
        this.bimps_Poll_Address = bimps_Poll_AddressParam;
    }

}
