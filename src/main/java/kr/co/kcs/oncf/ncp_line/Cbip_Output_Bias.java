
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cbip-output-bias", ElementSize = 2, LocalName = "cbip-output-bias")
public class Cbip_Output_Bias
    implements Serializable, Output_BiasMarker
{

    private short cbip_Output_Bias;

    @DdlField(Version = "2.0", QualName = "cbip-output-bias", ObjectClass = 1, Level = 1, Structure = 2, Offset = 164, ElementSize = 2, IdentifierElement = 116)
    public short getCbip_Output_Bias() {
        return cbip_Output_Bias;
    }

    public void setCbip_Output_Bias(short cbip_Output_BiasParam) {
        this.cbip_Output_Bias = cbip_Output_BiasParam;
    }

}
