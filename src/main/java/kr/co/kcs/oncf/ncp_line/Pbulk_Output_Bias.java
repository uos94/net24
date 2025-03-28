
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "pbulk-output-bias", ElementSize = 2, LocalName = "pbulk-output-bias")
public class Pbulk_Output_Bias
    implements Serializable, Output_BiasMarker
{

    private short pbulk_Output_Bias;

    @DdlField(Version = "2.0", QualName = "pbulk-output-bias", ObjectClass = 1, Level = 1, Structure = 2, Offset = 164, ElementSize = 2, IdentifierElement = 121)
    public short getPbulk_Output_Bias() {
        return pbulk_Output_Bias;
    }

    public void setPbulk_Output_Bias(short pbulk_Output_BiasParam) {
        this.pbulk_Output_Bias = pbulk_Output_BiasParam;
    }

}
