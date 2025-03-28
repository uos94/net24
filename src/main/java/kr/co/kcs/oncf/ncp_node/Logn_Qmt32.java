
package kr.co.kcs.oncf.ncp_node;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "logn-qmt32", ElementSize = 4, LocalName = "logn-qmt32")
public class Logn_Qmt32
    implements Serializable, Logn_Qlim32Marker
{

    private int logn_Qmt32;

    @DdlField(Version = "2.0", QualName = "logn-qmt32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 1176, ElementSize = 4, IdentifierElement = 151)
    public int getLogn_Qmt32() {
        return logn_Qmt32;
    }

    public void setLogn_Qmt32(int logn_Qmt32Param) {
        this.logn_Qmt32 = logn_Qmt32Param;
    }

}
