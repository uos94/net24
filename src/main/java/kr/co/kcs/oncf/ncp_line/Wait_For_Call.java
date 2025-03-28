
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "wait-for-call", ElementSize = 2, LocalName = "wait-for-call")
public class Wait_For_Call
    implements Serializable, Wait_For_CallMarker
{

    private short wait_For_Call;

    @DdlField(Version = "2.0", QualName = "wait-for-call", ObjectClass = 1, Level = 1, Structure = 2, Offset = 214, ElementSize = 2, IdentifierElement = 174)
    public short getWait_For_Call() {
        return wait_For_Call;
    }

    public void setWait_For_Call(short wait_For_CallParam) {
        this.wait_For_Call = wait_For_CallParam;
    }

}
