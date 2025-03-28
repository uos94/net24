
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "io-bias", ElementSize = 2, LocalName = "io-bias")
public class Io_Bias
    implements Serializable, Io_BiasMarker
{

    private short io_Bias;

    @DdlField(Version = "2.0", QualName = "io-bias", ObjectClass = 1, Level = 1, Structure = 2, Offset = 136, ElementSize = 2, IdentifierElement = 74)
    public short getIo_Bias() {
        return io_Bias;
    }

    public void setIo_Bias(short io_BiasParam) {
        this.io_Bias = io_BiasParam;
    }

}
