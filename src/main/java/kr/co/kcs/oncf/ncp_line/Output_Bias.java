
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "output-bias", ElementSize = 2, LocalName = "output-bias")
public class Output_Bias
    implements Serializable, Output_BiasMarker
{

    private short output_Bias;

    @DdlField(Version = "2.0", QualName = "output-bias", ObjectClass = 1, Level = 1, Structure = 2, Offset = 164, ElementSize = 2, IdentifierElement = 111)
    public short getOutput_Bias() {
        return output_Bias;
    }

    public void setOutput_Bias(short output_BiasParam) {
        this.output_Bias = output_BiasParam;
    }

}
