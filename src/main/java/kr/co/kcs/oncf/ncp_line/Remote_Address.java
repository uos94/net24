
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "remote-address", ElementSize = 16, LocalName = "remote-address")
public class Remote_Address
    implements Serializable, Remote_AddressMarker
{

    private String remote_Address;

    @DdlField(Version = "2.0", QualName = "remote-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 182, ElementSize = 16, IdentifierElement = 142)
    public String getRemote_Address() {
        return remote_Address;
    }

    public void setRemote_Address(String remote_AddressParam) {
        this.remote_Address = remote_AddressParam;
    }

}
