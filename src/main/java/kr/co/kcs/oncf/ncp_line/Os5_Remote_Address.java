
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "os5-remote-address", ElementSize = 16, LocalName = "os5-remote-address")
public class Os5_Remote_Address
    implements Serializable, Os5_MgrMarker
{

    private String os5_Remote_Address;

    @DdlField(Version = "2.0", QualName = "os5-remote-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 310, ElementSize = 16, IdentifierElement = 190)
    public String getOs5_Remote_Address() {
        return os5_Remote_Address;
    }

    public void setOs5_Remote_Address(String os5_Remote_AddressParam) {
        this.os5_Remote_Address = os5_Remote_AddressParam;
    }

}
