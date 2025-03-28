
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "sdlcx-ctl-bias", ElementSize = 2, LocalName = "sdlcx-ctl-bias")
public class Sdlcx_Ctl_Bias
    implements Serializable, Control_BiasMarker
{

    private short sdlcx_Ctl_Bias;

    @DdlField(Version = "2.0", QualName = "sdlcx-ctl-bias", ObjectClass = 1, Level = 1, Structure = 2, Offset = 118, ElementSize = 2, IdentifierElement = 42)
    public short getSdlcx_Ctl_Bias() {
        return sdlcx_Ctl_Bias;
    }

    public void setSdlcx_Ctl_Bias(short sdlcx_Ctl_BiasParam) {
        this.sdlcx_Ctl_Bias = sdlcx_Ctl_BiasParam;
    }

}
