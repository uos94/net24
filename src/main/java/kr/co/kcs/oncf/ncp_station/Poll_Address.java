
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "poll-address", ElementSize = 8, LocalName = "poll-address")
public class Poll_Address
    implements Serializable, Poll_AddressMarker
{

    private String poll_Address;

    @DdlField(Version = "2.0", QualName = "poll-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 194, ElementSize = 8, IdentifierElement = 41)
    public String getPoll_Address() {
        return poll_Address;
    }

    public void setPoll_Address(String poll_AddressParam) {
        this.poll_Address = poll_AddressParam;
    }

}
