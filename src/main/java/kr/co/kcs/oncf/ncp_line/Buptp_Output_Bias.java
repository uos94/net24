
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "buptp-output-bias", ElementSize = 2, LocalName = "buptp-output-bias")
public class Buptp_Output_Bias
    implements Serializable, Output_BiasMarker
{

    private short buptp_Output_Bias;

    @DdlField(Version = "2.0", QualName = "buptp-output-bias", ObjectClass = 1, Level = 1, Structure = 2, Offset = 164, ElementSize = 2, IdentifierElement = 115)
    public short getBuptp_Output_Bias() {
        return buptp_Output_Bias;
    }

    public void setBuptp_Output_Bias(short buptp_Output_BiasParam) {
        this.buptp_Output_Bias = buptp_Output_BiasParam;
    }

}
