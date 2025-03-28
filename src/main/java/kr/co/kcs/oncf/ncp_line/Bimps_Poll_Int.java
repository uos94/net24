
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bimps-poll-int", ElementSize = 2, LocalName = "bimps-poll-int")
public class Bimps_Poll_Int
    implements Serializable, Poll_IntervalMarker
{

    private short bimps_Poll_Int;

    @DdlField(Version = "2.0", QualName = "bimps-poll-int", ObjectClass = 1, Level = 1, Structure = 2, Offset = 176, ElementSize = 2, IdentifierElement = 130)
    public short getBimps_Poll_Int() {
        return bimps_Poll_Int;
    }

    public void setBimps_Poll_Int(short bimps_Poll_IntParam) {
        this.bimps_Poll_Int = bimps_Poll_IntParam;
    }

}
