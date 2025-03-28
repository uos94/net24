
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bimpt-poll-address", ElementSize = 8, LocalName = "bimpt-poll-address")
public class Bimpt_Poll_Address
    implements Serializable, Poll_AddressMarker
{

    private String bimpt_Poll_Address;

    @DdlField(Version = "2.0", QualName = "bimpt-poll-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 194, ElementSize = 8, IdentifierElement = 43)
    public String getBimpt_Poll_Address() {
        return bimpt_Poll_Address;
    }

    public void setBimpt_Poll_Address(String bimpt_Poll_AddressParam) {
        this.bimpt_Poll_Address = bimpt_Poll_AddressParam;
    }

}
