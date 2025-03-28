
package kr.co.kcs.oncf.ncp_node;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "logn-qlim32", ElementSize = 4, LocalName = "logn-qlim32")
public class Logn_Qlim32
    implements Serializable, Logn_Qlim32Marker
{

    private int logn_Qlim32;

    @DdlField(Version = "2.0", QualName = "logn-qlim32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 1176, ElementSize = 4, IdentifierElement = 150)
    public int getLogn_Qlim32() {
        return logn_Qlim32;
    }

    public void setLogn_Qlim32(int logn_Qlim32Param) {
        this.logn_Qlim32 = logn_Qlim32Param;
    }

}
