
package kr.co.kcs.oncf.ncp_node;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "loge-qlim32", ElementSize = 4, LocalName = "loge-qlim32")
public class Loge_Qlim32
    implements Serializable, Loge_Qlim32Marker
{

    private int loge_Qlim32;

    @DdlField(Version = "2.0", QualName = "loge-qlim32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 1168, ElementSize = 4, IdentifierElement = 147)
    public int getLoge_Qlim32() {
        return loge_Qlim32;
    }

    public void setLoge_Qlim32(int loge_Qlim32Param) {
        this.loge_Qlim32 = loge_Qlim32Param;
    }

}
