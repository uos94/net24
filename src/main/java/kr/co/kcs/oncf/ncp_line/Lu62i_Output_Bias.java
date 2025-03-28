
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "lu62i-output-bias", ElementSize = 2, LocalName = "lu62i-output-bias")
public class Lu62i_Output_Bias
    implements Serializable, Output_BiasMarker
{

    private short lu62i_Output_Bias;

    @DdlField(Version = "2.0", QualName = "lu62i-output-bias", ObjectClass = 1, Level = 1, Structure = 2, Offset = 164, ElementSize = 2, IdentifierElement = 124)
    public short getLu62i_Output_Bias() {
        return lu62i_Output_Bias;
    }

    public void setLu62i_Output_Bias(short lu62i_Output_BiasParam) {
        this.lu62i_Output_Bias = lu62i_Output_BiasParam;
    }

}
