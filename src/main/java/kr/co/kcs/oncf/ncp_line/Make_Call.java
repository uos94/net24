
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "make-call", ElementSize = 2, LocalName = "make-call")
public class Make_Call
    implements Serializable, Make_CallMarker
{

    private short make_Call;

    @DdlField(Version = "2.0", QualName = "make-call", ObjectClass = 1, Level = 1, Structure = 2, Offset = 154, ElementSize = 2, IdentifierElement = 99)
    public short getMake_Call() {
        return make_Call;
    }

    public void setMake_Call(short make_CallParam) {
        this.make_Call = make_CallParam;
    }

}
