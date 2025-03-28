
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "biptp-output-bias", ElementSize = 2, LocalName = "biptp-output-bias")
public class Biptp_Output_Bias
    implements Serializable, Output_BiasMarker
{

    private short biptp_Output_Bias;

    @DdlField(Version = "2.0", QualName = "biptp-output-bias", ObjectClass = 1, Level = 1, Structure = 2, Offset = 164, ElementSize = 2, IdentifierElement = 114)
    public short getBiptp_Output_Bias() {
        return biptp_Output_Bias;
    }

    public void setBiptp_Output_Bias(short biptp_Output_BiasParam) {
        this.biptp_Output_Bias = biptp_Output_BiasParam;
    }

}
