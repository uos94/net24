
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bimpt-sel-address", ElementSize = 8, LocalName = "bimpt-sel-address")
public class Bimpt_Sel_Address
    implements Serializable, Select_AddressMarker
{

    private String bimpt_Sel_Address;

    @DdlField(Version = "2.0", QualName = "bimpt-sel-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 202, ElementSize = 8, IdentifierElement = 53)
    public String getBimpt_Sel_Address() {
        return bimpt_Sel_Address;
    }

    public void setBimpt_Sel_Address(String bimpt_Sel_AddressParam) {
        this.bimpt_Sel_Address = bimpt_Sel_AddressParam;
    }

}
