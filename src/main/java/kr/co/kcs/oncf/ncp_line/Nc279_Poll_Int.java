
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "nc279-poll-int", ElementSize = 2, LocalName = "nc279-poll-int")
public class Nc279_Poll_Int
    implements Serializable, Poll_IntervalMarker
{

    private short nc279_Poll_Int;

    @DdlField(Version = "2.0", QualName = "nc279-poll-int", ObjectClass = 1, Level = 1, Structure = 2, Offset = 176, ElementSize = 2, IdentifierElement = 134)
    public short getNc279_Poll_Int() {
        return nc279_Poll_Int;
    }

    public void setNc279_Poll_Int(short nc279_Poll_IntParam) {
        this.nc279_Poll_Int = nc279_Poll_IntParam;
    }

}
