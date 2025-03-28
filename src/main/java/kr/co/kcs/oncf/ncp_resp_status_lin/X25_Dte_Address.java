
package kr.co.kcs.oncf.ncp_resp_status_lin;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x25-dte-address", ElementSize = 16, LocalName = "x25-dte-address")
public class X25_Dte_Address
    implements Serializable, Comm_MethodMarker
{

    private String x25_Dte_Address;

    @DdlField(Version = "2.0", QualName = "x25-dte-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 32, ElementSize = 16, IdentifierElement = 20)
    public String getX25_Dte_Address() {
        return x25_Dte_Address;
    }

    public void setX25_Dte_Address(String x25_Dte_AddressParam) {
        this.x25_Dte_Address = x25_Dte_AddressParam;
    }

}
