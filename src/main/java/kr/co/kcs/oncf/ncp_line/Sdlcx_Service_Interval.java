
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "sdlcx-service-interval", ElementSize = 2, LocalName = "sdlcx-service-interval")
public class Sdlcx_Service_Interval
    implements Serializable, Service_IntervalMarker
{

    private short sdlcx_Service_Interval;

    @DdlField(Version = "2.0", QualName = "sdlcx-service-interval", ObjectClass = 1, Level = 1, Structure = 2, Offset = 200, ElementSize = 2, IdentifierElement = 153)
    public short getSdlcx_Service_Interval() {
        return sdlcx_Service_Interval;
    }

    public void setSdlcx_Service_Interval(short sdlcx_Service_IntervalParam) {
        this.sdlcx_Service_Interval = sdlcx_Service_IntervalParam;
    }

}
