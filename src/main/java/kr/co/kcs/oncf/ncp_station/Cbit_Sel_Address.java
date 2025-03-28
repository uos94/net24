
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cbit-sel-address", ElementSize = 8, LocalName = "cbit-sel-address")
public class Cbit_Sel_Address
    implements Serializable, Select_AddressMarker
{

    private String cbit_Sel_Address;

    @DdlField(Version = "2.0", QualName = "cbit-sel-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 202, ElementSize = 8, IdentifierElement = 56)
    public String getCbit_Sel_Address() {
        return cbit_Sel_Address;
    }

    public void setCbit_Sel_Address(String cbit_Sel_AddressParam) {
        this.cbit_Sel_Address = cbit_Sel_AddressParam;
    }

}
