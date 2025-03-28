
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cbit-output-bias", ElementSize = 2, LocalName = "cbit-output-bias")
public class Cbit_Output_Bias
    implements Serializable, Output_BiasMarker
{

    private short cbit_Output_Bias;

    @DdlField(Version = "2.0", QualName = "cbit-output-bias", ObjectClass = 1, Level = 1, Structure = 2, Offset = 164, ElementSize = 2, IdentifierElement = 118)
    public short getCbit_Output_Bias() {
        return cbit_Output_Bias;
    }

    public void setCbit_Output_Bias(short cbit_Output_BiasParam) {
        this.cbit_Output_Bias = cbit_Output_BiasParam;
    }

}
