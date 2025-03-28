
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "make-initial-call", ElementSize = 2, LocalName = "make-initial-call")
public class Make_Initial_Call
    implements Serializable, Make_Initial_CallMarker
{

    private short make_Initial_Call;

    @DdlField(Version = "2.0", QualName = "make-initial-call", ObjectClass = 1, Level = 1, Structure = 2, Offset = 156, ElementSize = 2, IdentifierElement = 102)
    public short getMake_Initial_Call() {
        return make_Initial_Call;
    }

    public void setMake_Initial_Call(short make_Initial_CallParam) {
        this.make_Initial_Call = make_Initial_CallParam;
    }

}
