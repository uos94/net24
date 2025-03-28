
package kr.co.kcs.oncf.ncp_node;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "logn-qmt", ElementSize = 2, LocalName = "logn-qmt")
public class Logn_Qmt
    implements Serializable, Logn_QlimMarker
{

    private short logn_Qmt;

    @DdlField(Version = "2.0", QualName = "logn-qmt", ObjectClass = 1, Level = 1, Structure = 2, Offset = 58, ElementSize = 2, IdentifierElement = 15)
    public short getLogn_Qmt() {
        return logn_Qmt;
    }

    public void setLogn_Qmt(short logn_QmtParam) {
        this.logn_Qmt = logn_QmtParam;
    }

}
