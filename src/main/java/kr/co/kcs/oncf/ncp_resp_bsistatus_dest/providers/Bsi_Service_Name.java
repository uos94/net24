
package kr.co.kcs.oncf.ncp_resp_bsistatus_dest.providers;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bsi-service-name", ElementSize = 80, LocalName = "bsi-service-name")
public class Bsi_Service_Name
    implements Serializable, Bsi_Service_NameMarker
{

    private String bsi_Service_Name;

    @DdlField(Version = "2.0", QualName = "bsi-service-name", ObjectClass = 1, Level = 2, Structure = 0, Offset = 190, ElementSize = 80, IdentifierElement = 12)
    public String getBsi_Service_Name() {
        return bsi_Service_Name;
    }

    public void setBsi_Service_Name(String bsi_Service_NameParam) {
        this.bsi_Service_Name = bsi_Service_NameParam;
    }

}
