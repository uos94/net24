
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "sba-notify-service", ElementSize = 2, LocalName = "sba-notify-service")
public class Sba_Notify_Service
    implements Serializable, Sba_Notify_Service_SMarker
{

    private short[] sba_Notify_Service = new short[ 8 ] ;

    @DdlField(Version = "2.0", QualName = "sba-notify-service", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1126, ElementSize = 2, IdentifierElement = 162, OccursMax = 8)
    public short[] getSba_Notify_Service() {
        return sba_Notify_Service;
    }

    @DdlField(Version = "2.0", QualName = "sba-notify-service", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1126, ElementSize = 2, IdentifierElement = 162, OccursMax = 8)
    public short getSba_Notify_Service(int index) {
        return (sba_Notify_Service[index]);
    }

    public void setSba_Notify_Service(short[] sba_Notify_ServiceParam) {
        this.sba_Notify_Service = sba_Notify_ServiceParam;
    }

    public void setSba_Notify_Service(int index, short sba_Notify_ServiceParam) {
        this.sba_Notify_Service[index]=sba_Notify_ServiceParam;
    }

}
