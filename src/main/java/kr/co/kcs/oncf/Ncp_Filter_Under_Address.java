
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-filter-under-address", ElementSize = 24, LocalName = "ncp-filter-under-address")
public class Ncp_Filter_Under_Address
    implements Serializable
{

    private String ncp_Filter_Under_Address;

    @DdlField(Version = "2.0", QualName = "ncp-filter-under-address", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 24, IdentifierElement = 0)
    public String getNcp_Filter_Under_Address() {
        return ncp_Filter_Under_Address;
    }

    public void setNcp_Filter_Under_Address(String ncp_Filter_Under_AddressParam) {
        this.ncp_Filter_Under_Address = ncp_Filter_Under_AddressParam;
    }

}
