
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "sdlcx-poll-method", ElementSize = 2, LocalName = "sdlcx-poll-method")
public class Sdlcx_Poll_Method
    implements Serializable, Poll_MethodMarker
{

    private short sdlcx_Poll_Method;

    @DdlField(Version = "2.0", QualName = "sdlcx-poll-method", ObjectClass = 1, Level = 1, Structure = 2, Offset = 178, ElementSize = 2, IdentifierElement = 137)
    public short getSdlcx_Poll_Method() {
        return sdlcx_Poll_Method;
    }

    public void setSdlcx_Poll_Method(short sdlcx_Poll_MethodParam) {
        this.sdlcx_Poll_Method = sdlcx_Poll_MethodParam;
    }

}
