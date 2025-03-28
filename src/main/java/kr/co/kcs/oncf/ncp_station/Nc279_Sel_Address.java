
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "nc279-sel-address", ElementSize = 8, LocalName = "nc279-sel-address")
public class Nc279_Sel_Address
    implements Serializable, Select_AddressMarker
{

    private String nc279_Sel_Address;

    @DdlField(Version = "2.0", QualName = "nc279-sel-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 202, ElementSize = 8, IdentifierElement = 58)
    public String getNc279_Sel_Address() {
        return nc279_Sel_Address;
    }

    public void setNc279_Sel_Address(String nc279_Sel_AddressParam) {
        this.nc279_Sel_Address = nc279_Sel_AddressParam;
    }

}
