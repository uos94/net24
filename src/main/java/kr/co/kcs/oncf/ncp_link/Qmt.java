
package kr.co.kcs.oncf.ncp_link;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "qmt", ElementSize = 2, LocalName = "qmt")
public class Qmt
    implements Serializable, Queue_LimitMarker
{

    private short qmt;

    @DdlField(Version = "2.0", QualName = "qmt", ObjectClass = 1, Level = 1, Structure = 2, Offset = 44, ElementSize = 2, IdentifierElement = 11)
    public short getQmt() {
        return qmt;
    }

    public void setQmt(short qmtParam) {
        this.qmt = qmtParam;
    }

}
