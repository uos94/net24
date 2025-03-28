
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "sdlcx-sel-address", ElementSize = 8, LocalName = "sdlcx-sel-address")
public class Sdlcx_Sel_Address
    implements Serializable, Select_AddressMarker
{

    private String sdlcx_Sel_Address;

    @DdlField(Version = "2.0", QualName = "sdlcx-sel-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 202, ElementSize = 8, IdentifierElement = 59)
    public String getSdlcx_Sel_Address() {
        return sdlcx_Sel_Address;
    }

    public void setSdlcx_Sel_Address(String sdlcx_Sel_AddressParam) {
        this.sdlcx_Sel_Address = sdlcx_Sel_AddressParam;
    }

}
