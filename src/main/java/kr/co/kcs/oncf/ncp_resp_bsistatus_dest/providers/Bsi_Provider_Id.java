
package kr.co.kcs.oncf.ncp_resp_bsistatus_dest.providers;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bsi-provider-id", ElementSize = 100, LocalName = "bsi-provider-id")
public class Bsi_Provider_Id
    implements Serializable, Bsi_Provider_IdMarker
{

    private String bsi_Provider_Id;

    @DdlField(Version = "2.0", QualName = "bsi-provider-id", ObjectClass = 1, Level = 2, Structure = 0, Offset = 54, ElementSize = 100, IdentifierElement = 7)
    public String getBsi_Provider_Id() {
        return bsi_Provider_Id;
    }

    public void setBsi_Provider_Id(String bsi_Provider_IdParam) {
        this.bsi_Provider_Id = bsi_Provider_IdParam;
    }

}
