
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "service-interval", ElementSize = 2, LocalName = "service-interval")
public class Service_Interval
    implements Serializable, Service_IntervalMarker
{

    private short service_Interval;

    @DdlField(Version = "2.0", QualName = "service-interval", ObjectClass = 1, Level = 1, Structure = 2, Offset = 200, ElementSize = 2, IdentifierElement = 152)
    public short getService_Interval() {
        return service_Interval;
    }

    public void setService_Interval(short service_IntervalParam) {
        this.service_Interval = service_IntervalParam;
    }

}
