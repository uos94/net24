
package kr.co.kcs.oncf.ncp_node;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "loge-qmt", ElementSize = 2, LocalName = "loge-qmt")
public class Loge_Qmt
    implements Serializable, Loge_QlimMarker
{

    private short loge_Qmt;

    @DdlField(Version = "2.0", QualName = "loge-qmt", ObjectClass = 1, Level = 1, Structure = 2, Offset = 54, ElementSize = 2, IdentifierElement = 12)
    public short getLoge_Qmt() {
        return loge_Qmt;
    }

    public void setLoge_Qmt(short loge_QmtParam) {
        this.loge_Qmt = loge_QmtParam;
    }

}
