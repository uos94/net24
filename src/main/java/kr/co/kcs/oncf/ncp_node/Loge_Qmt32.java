
package kr.co.kcs.oncf.ncp_node;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "loge-qmt32", ElementSize = 4, LocalName = "loge-qmt32")
public class Loge_Qmt32
    implements Serializable, Loge_Qlim32Marker
{

    private int loge_Qmt32;

    @DdlField(Version = "2.0", QualName = "loge-qmt32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 1168, ElementSize = 4, IdentifierElement = 148)
    public int getLoge_Qmt32() {
        return loge_Qmt32;
    }

    public void setLoge_Qmt32(int loge_Qmt32Param) {
        this.loge_Qmt32 = loge_Qmt32Param;
    }

}
