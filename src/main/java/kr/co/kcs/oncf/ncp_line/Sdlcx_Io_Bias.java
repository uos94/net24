
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "sdlcx-io-bias", ElementSize = 2, LocalName = "sdlcx-io-bias")
public class Sdlcx_Io_Bias
    implements Serializable, Io_BiasMarker
{

    private short sdlcx_Io_Bias;

    @DdlField(Version = "2.0", QualName = "sdlcx-io-bias", ObjectClass = 1, Level = 1, Structure = 2, Offset = 136, ElementSize = 2, IdentifierElement = 75)
    public short getSdlcx_Io_Bias() {
        return sdlcx_Io_Bias;
    }

    public void setSdlcx_Io_Bias(short sdlcx_Io_BiasParam) {
        this.sdlcx_Io_Bias = sdlcx_Io_BiasParam;
    }

}
