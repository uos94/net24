
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "os5-wait-for-call", ElementSize = 2, LocalName = "os5-wait-for-call")
public class Os5_Wait_For_Call
    implements Serializable, Wait_For_CallMarker
{

    private short os5_Wait_For_Call;

    @DdlField(Version = "2.0", QualName = "os5-wait-for-call", ObjectClass = 1, Level = 1, Structure = 2, Offset = 214, ElementSize = 2, IdentifierElement = 175)
    public short getOs5_Wait_For_Call() {
        return os5_Wait_For_Call;
    }

    public void setOs5_Wait_For_Call(short os5_Wait_For_CallParam) {
        this.os5_Wait_For_Call = os5_Wait_For_CallParam;
    }

}
