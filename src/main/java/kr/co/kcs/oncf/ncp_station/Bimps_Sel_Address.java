
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bimps-sel-address", ElementSize = 8, LocalName = "bimps-sel-address")
public class Bimps_Sel_Address
    implements Serializable, Select_AddressMarker
{

    private String bimps_Sel_Address;

    @DdlField(Version = "2.0", QualName = "bimps-sel-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 202, ElementSize = 8, IdentifierElement = 52)
    public String getBimps_Sel_Address() {
        return bimps_Sel_Address;
    }

    public void setBimps_Sel_Address(String bimps_Sel_AddressParam) {
        this.bimps_Sel_Address = bimps_Sel_AddressParam;
    }

}
