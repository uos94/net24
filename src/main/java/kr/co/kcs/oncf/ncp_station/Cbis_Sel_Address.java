
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cbis-sel-address", ElementSize = 8, LocalName = "cbis-sel-address")
public class Cbis_Sel_Address
    implements Serializable, Select_AddressMarker
{

    private String cbis_Sel_Address;

    @DdlField(Version = "2.0", QualName = "cbis-sel-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 202, ElementSize = 8, IdentifierElement = 55)
    public String getCbis_Sel_Address() {
        return cbis_Sel_Address;
    }

    public void setCbis_Sel_Address(String cbis_Sel_AddressParam) {
        this.cbis_Sel_Address = cbis_Sel_AddressParam;
    }

}
