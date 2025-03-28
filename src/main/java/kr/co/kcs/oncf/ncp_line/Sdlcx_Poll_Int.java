
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "sdlcx-poll-int", ElementSize = 2, LocalName = "sdlcx-poll-int")
public class Sdlcx_Poll_Int
    implements Serializable, Poll_IntervalMarker
{

    private short sdlcx_Poll_Int;

    @DdlField(Version = "2.0", QualName = "sdlcx-poll-int", ObjectClass = 1, Level = 1, Structure = 2, Offset = 176, ElementSize = 2, IdentifierElement = 135)
    public short getSdlcx_Poll_Int() {
        return sdlcx_Poll_Int;
    }

    public void setSdlcx_Poll_Int(short sdlcx_Poll_IntParam) {
        this.sdlcx_Poll_Int = sdlcx_Poll_IntParam;
    }

}
