
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bimps-output-bias", ElementSize = 2, LocalName = "bimps-output-bias")
public class Bimps_Output_Bias
    implements Serializable, Output_BiasMarker
{

    private short bimps_Output_Bias;

    @DdlField(Version = "2.0", QualName = "bimps-output-bias", ObjectClass = 1, Level = 1, Structure = 2, Offset = 164, ElementSize = 2, IdentifierElement = 112)
    public short getBimps_Output_Bias() {
        return bimps_Output_Bias;
    }

    public void setBimps_Output_Bias(short bimps_Output_BiasParam) {
        this.bimps_Output_Bias = bimps_Output_BiasParam;
    }

}
