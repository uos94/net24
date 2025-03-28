
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cmpsb-sel-address", ElementSize = 8, LocalName = "cmpsb-sel-address")
public class Cmpsb_Sel_Address
    implements Serializable, Select_AddressMarker
{

    private String cmpsb_Sel_Address;

    @DdlField(Version = "2.0", QualName = "cmpsb-sel-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 202, ElementSize = 8, IdentifierElement = 57)
    public String getCmpsb_Sel_Address() {
        return cmpsb_Sel_Address;
    }

    public void setCmpsb_Sel_Address(String cmpsb_Sel_AddressParam) {
        this.cmpsb_Sel_Address = cmpsb_Sel_AddressParam;
    }

}
