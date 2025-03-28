
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "tty-output-bias", ElementSize = 2, LocalName = "tty-output-bias")
public class Tty_Output_Bias
    implements Serializable, Output_BiasMarker
{

    private short tty_Output_Bias;

    @DdlField(Version = "2.0", QualName = "tty-output-bias", ObjectClass = 1, Level = 1, Structure = 2, Offset = 164, ElementSize = 2, IdentifierElement = 123)
    public short getTty_Output_Bias() {
        return tty_Output_Bias;
    }

    public void setTty_Output_Bias(short tty_Output_BiasParam) {
        this.tty_Output_Bias = tty_Output_BiasParam;
    }

}
