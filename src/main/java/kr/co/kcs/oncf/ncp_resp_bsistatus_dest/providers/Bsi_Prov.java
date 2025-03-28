
package kr.co.kcs.oncf.ncp_resp_bsistatus_dest.providers;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bsi-prov", ElementSize = 100, LocalName = "bsi-prov")
public class Bsi_Prov
    implements Serializable, Bsi_Provider_IdMarker
{

    private String prov_1;
    private String prov_2;

    @DdlField(Version = "2.0", QualName = "prov-1", ObjectClass = 1, Level = 3, Structure = 0, Offset = 54, ElementSize = 50, IdentifierElement = 9)
    public String getProv_1() {
        return prov_1;
    }

    public void setProv_1(String prov_1Param) {
        this.prov_1 = prov_1Param;
    }

    @DdlField(Version = "2.0", QualName = "prov-2", ObjectClass = 1, Level = 3, Structure = 0, Offset = 104, ElementSize = 50, IdentifierElement = 10)
    public String getProv_2() {
        return prov_2;
    }

    public void setProv_2(String prov_2Param) {
        this.prov_2 = prov_2Param;
    }

}
