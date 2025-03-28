
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cbis-output-bias", ElementSize = 2, LocalName = "cbis-output-bias")
public class Cbis_Output_Bias
    implements Serializable, Output_BiasMarker
{

    private short cbis_Output_Bias;

    @DdlField(Version = "2.0", QualName = "cbis-output-bias", ObjectClass = 1, Level = 1, Structure = 2, Offset = 164, ElementSize = 2, IdentifierElement = 117)
    public short getCbis_Output_Bias() {
        return cbis_Output_Bias;
    }

    public void setCbis_Output_Bias(short cbis_Output_BiasParam) {
        this.cbis_Output_Bias = cbis_Output_BiasParam;
    }

}
