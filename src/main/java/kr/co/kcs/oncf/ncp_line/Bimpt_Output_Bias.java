
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bimpt-output-bias", ElementSize = 2, LocalName = "bimpt-output-bias")
public class Bimpt_Output_Bias
    implements Serializable, Output_BiasMarker
{

    private short bimpt_Output_Bias;

    @DdlField(Version = "2.0", QualName = "bimpt-output-bias", ObjectClass = 1, Level = 1, Structure = 2, Offset = 164, ElementSize = 2, IdentifierElement = 113)
    public short getBimpt_Output_Bias() {
        return bimpt_Output_Bias;
    }

    public void setBimpt_Output_Bias(short bimpt_Output_BiasParam) {
        this.bimpt_Output_Bias = bimpt_Output_BiasParam;
    }

}
