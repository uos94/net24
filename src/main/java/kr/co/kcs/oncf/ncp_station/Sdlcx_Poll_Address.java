
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "sdlcx-poll-address", ElementSize = 8, LocalName = "sdlcx-poll-address")
public class Sdlcx_Poll_Address
    implements Serializable, Poll_AddressMarker
{

    private String sdlcx_Poll_Address;

    @DdlField(Version = "2.0", QualName = "sdlcx-poll-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 194, ElementSize = 8, IdentifierElement = 50)
    public String getSdlcx_Poll_Address() {
        return sdlcx_Poll_Address;
    }

    public void setSdlcx_Poll_Address(String sdlcx_Poll_AddressParam) {
        this.sdlcx_Poll_Address = sdlcx_Poll_AddressParam;
    }

}
