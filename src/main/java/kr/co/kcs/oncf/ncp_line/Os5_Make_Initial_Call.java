
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "os5-make-initial-call", ElementSize = 2, LocalName = "os5-make-initial-call")
public class Os5_Make_Initial_Call
    implements Serializable, Make_Initial_CallMarker
{

    private short os5_Make_Initial_Call;

    @DdlField(Version = "2.0", QualName = "os5-make-initial-call", ObjectClass = 1, Level = 1, Structure = 2, Offset = 156, ElementSize = 2, IdentifierElement = 103)
    public short getOs5_Make_Initial_Call() {
        return os5_Make_Initial_Call;
    }

    public void setOs5_Make_Initial_Call(short os5_Make_Initial_CallParam) {
        this.os5_Make_Initial_Call = os5_Make_Initial_CallParam;
    }

}
