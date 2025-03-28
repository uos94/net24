
package kr.co.kcs.oncf.ncp_link;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "qmt32", ElementSize = 4, LocalName = "qmt32")
public class Qmt32
    implements Serializable, Queue_Limit32Marker
{

    private int qmt32;

    @DdlField(Version = "2.0", QualName = "qmt32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 178, ElementSize = 4, IdentifierElement = 33)
    public int getQmt32() {
        return qmt32;
    }

    public void setQmt32(int qmt32Param) {
        this.qmt32 = qmt32Param;
    }

}
