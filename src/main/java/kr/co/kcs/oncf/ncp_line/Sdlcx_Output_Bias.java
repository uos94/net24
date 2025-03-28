
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "sdlcx-output-bias", ElementSize = 2, LocalName = "sdlcx-output-bias")
public class Sdlcx_Output_Bias
    implements Serializable, Output_BiasMarker
{

    private short sdlcx_Output_Bias;

    @DdlField(Version = "2.0", QualName = "sdlcx-output-bias", ObjectClass = 1, Level = 1, Structure = 2, Offset = 164, ElementSize = 2, IdentifierElement = 122)
    public short getSdlcx_Output_Bias() {
        return sdlcx_Output_Bias;
    }

    public void setSdlcx_Output_Bias(short sdlcx_Output_BiasParam) {
        this.sdlcx_Output_Bias = sdlcx_Output_BiasParam;
    }

}
