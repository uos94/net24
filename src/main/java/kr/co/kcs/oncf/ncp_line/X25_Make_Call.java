
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x25-make-call", ElementSize = 2, LocalName = "x25-make-call")
public class X25_Make_Call
    implements Serializable, Make_CallMarker
{

    private short x25_Make_Call;

    @DdlField(Version = "2.0", QualName = "x25-make-call", ObjectClass = 1, Level = 1, Structure = 2, Offset = 154, ElementSize = 2, IdentifierElement = 101)
    public short getX25_Make_Call() {
        return x25_Make_Call;
    }

    public void setX25_Make_Call(short x25_Make_CallParam) {
        this.x25_Make_Call = x25_Make_CallParam;
    }

}
