
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "control-bias", ElementSize = 2, LocalName = "control-bias")
public class Control_Bias
    implements Serializable, Control_BiasMarker
{

    private short control_Bias;

    @DdlField(Version = "2.0", QualName = "control-bias", ObjectClass = 1, Level = 1, Structure = 2, Offset = 118, ElementSize = 2, IdentifierElement = 41)
    public short getControl_Bias() {
        return control_Bias;
    }

    public void setControl_Bias(short control_BiasParam) {
        this.control_Bias = control_BiasParam;
    }

}
