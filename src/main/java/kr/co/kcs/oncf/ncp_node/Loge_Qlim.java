
package kr.co.kcs.oncf.ncp_node;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "loge-qlim", ElementSize = 2, LocalName = "loge-qlim")
public class Loge_Qlim
    implements Serializable, Loge_QlimMarker
{

    private short loge_Qlim;

    @DdlField(Version = "2.0", QualName = "loge-qlim", ObjectClass = 1, Level = 1, Structure = 2, Offset = 54, ElementSize = 2, IdentifierElement = 11)
    public short getLoge_Qlim() {
        return loge_Qlim;
    }

    public void setLoge_Qlim(short loge_QlimParam) {
        this.loge_Qlim = loge_QlimParam;
    }

}
