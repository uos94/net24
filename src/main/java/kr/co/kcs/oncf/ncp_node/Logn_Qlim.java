
package kr.co.kcs.oncf.ncp_node;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "logn-qlim", ElementSize = 2, LocalName = "logn-qlim")
public class Logn_Qlim
    implements Serializable, Logn_QlimMarker
{

    private short logn_Qlim;

    @DdlField(Version = "2.0", QualName = "logn-qlim", ObjectClass = 1, Level = 1, Structure = 2, Offset = 58, ElementSize = 2, IdentifierElement = 14)
    public short getLogn_Qlim() {
        return logn_Qlim;
    }

    public void setLogn_Qlim(short logn_QlimParam) {
        this.logn_Qlim = logn_QlimParam;
    }

}
