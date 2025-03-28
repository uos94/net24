
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x25-wait-for-call", ElementSize = 2, LocalName = "x25-wait-for-call")
public class X25_Wait_For_Call
    implements Serializable, Wait_For_CallMarker
{

    private short x25_Wait_For_Call;

    @DdlField(Version = "2.0", QualName = "x25-wait-for-call", ObjectClass = 1, Level = 1, Structure = 2, Offset = 214, ElementSize = 2, IdentifierElement = 176)
    public short getX25_Wait_For_Call() {
        return x25_Wait_For_Call;
    }

    public void setX25_Wait_For_Call(short x25_Wait_For_CallParam) {
        this.x25_Wait_For_Call = x25_Wait_For_CallParam;
    }

}
