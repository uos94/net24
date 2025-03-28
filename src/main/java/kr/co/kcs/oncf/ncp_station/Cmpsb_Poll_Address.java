
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cmpsb-poll-address", ElementSize = 8, LocalName = "cmpsb-poll-address")
public class Cmpsb_Poll_Address
    implements Serializable, Poll_AddressMarker
{

    private String cmpsb_Poll_Address;

    @DdlField(Version = "2.0", QualName = "cmpsb-poll-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 194, ElementSize = 8, IdentifierElement = 47)
    public String getCmpsb_Poll_Address() {
        return cmpsb_Poll_Address;
    }

    public void setCmpsb_Poll_Address(String cmpsb_Poll_AddressParam) {
        this.cmpsb_Poll_Address = cmpsb_Poll_AddressParam;
    }

}
