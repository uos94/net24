
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x25-remote-address", ElementSize = 16, LocalName = "x25-remote-address")
public class X25_Remote_Address
    implements Serializable, Remote_AddressMarker
{

    private String x25_Remote_Address;

    @DdlField(Version = "2.0", QualName = "x25-remote-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 182, ElementSize = 16, IdentifierElement = 143)
    public String getX25_Remote_Address() {
        return x25_Remote_Address;
    }

    public void setX25_Remote_Address(String x25_Remote_AddressParam) {
        this.x25_Remote_Address = x25_Remote_AddressParam;
    }

}
