
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x25-make-initial-call", ElementSize = 2, LocalName = "x25-make-initial-call")
public class X25_Make_Initial_Call
    implements Serializable, Make_Initial_CallMarker
{

    private short x25_Make_Initial_Call;

    @DdlField(Version = "2.0", QualName = "x25-make-initial-call", ObjectClass = 1, Level = 1, Structure = 2, Offset = 156, ElementSize = 2, IdentifierElement = 104)
    public short getX25_Make_Initial_Call() {
        return x25_Make_Initial_Call;
    }

    public void setX25_Make_Initial_Call(short x25_Make_Initial_CallParam) {
        this.x25_Make_Initial_Call = x25_Make_Initial_CallParam;
    }

}
