
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cmpsb-output-bias", ElementSize = 2, LocalName = "cmpsb-output-bias")
public class Cmpsb_Output_Bias
    implements Serializable, Output_BiasMarker
{

    private short cmpsb_Output_Bias;

    @DdlField(Version = "2.0", QualName = "cmpsb-output-bias", ObjectClass = 1, Level = 1, Structure = 2, Offset = 164, ElementSize = 2, IdentifierElement = 119)
    public short getCmpsb_Output_Bias() {
        return cmpsb_Output_Bias;
    }

    public void setCmpsb_Output_Bias(short cmpsb_Output_BiasParam) {
        this.cmpsb_Output_Bias = cmpsb_Output_BiasParam;
    }

}
