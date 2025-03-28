
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "nc279-output-bias", ElementSize = 2, LocalName = "nc279-output-bias")
public class Nc279_Output_Bias
    implements Serializable, Output_BiasMarker
{

    private short nc279_Output_Bias;

    @DdlField(Version = "2.0", QualName = "nc279-output-bias", ObjectClass = 1, Level = 1, Structure = 2, Offset = 164, ElementSize = 2, IdentifierElement = 120)
    public short getNc279_Output_Bias() {
        return nc279_Output_Bias;
    }

    public void setNc279_Output_Bias(short nc279_Output_BiasParam) {
        this.nc279_Output_Bias = nc279_Output_BiasParam;
    }

}
