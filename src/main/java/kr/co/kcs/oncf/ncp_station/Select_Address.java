
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "select-address", ElementSize = 8, LocalName = "select-address")
public class Select_Address
    implements Serializable, Select_AddressMarker
{

    private String select_Address;

    @DdlField(Version = "2.0", QualName = "select-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 202, ElementSize = 8, IdentifierElement = 51)
    public String getSelect_Address() {
        return select_Address;
    }

    public void setSelect_Address(String select_AddressParam) {
        this.select_Address = select_AddressParam;
    }

}
