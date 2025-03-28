
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "sba-notify-service-s", ElementSize = 16, LocalName = "sba-notify-service-s")
public class Sba_Notify_Service_S
    implements Serializable, Sba_Notify_Service_SMarker
{

    private String sba_Notify_Service_S;

    @DdlField(Version = "2.0", QualName = "sba-notify-service-s", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1126, ElementSize = 16, IdentifierElement = 161)
    public String getSba_Notify_Service_S() {
        return sba_Notify_Service_S;
    }

    public void setSba_Notify_Service_S(String sba_Notify_Service_SParam) {
        this.sba_Notify_Service_S = sba_Notify_Service_SParam;
    }

}
