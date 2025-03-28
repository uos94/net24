
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bumps-sel-address", ElementSize = 8, LocalName = "bumps-sel-address")
public class Bumps_Sel_Address
    implements Serializable, Select_AddressMarker
{

    private String bumps_Sel_Address;

    @DdlField(Version = "2.0", QualName = "bumps-sel-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 202, ElementSize = 8, IdentifierElement = 54)
    public String getBumps_Sel_Address() {
        return bumps_Sel_Address;
    }

    public void setBumps_Sel_Address(String bumps_Sel_AddressParam) {
        this.bumps_Sel_Address = bumps_Sel_AddressParam;
    }

}
