
package kr.co.kcs.oncf.ncp_resp_stats_sys;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "number-of-lprocesses", ElementSize = 2, LocalName = "number-of-lprocesses")
public class Number_Of_Lprocesses
    implements Serializable, Number_Of_LprocessesMarker
{

    private short number_Of_Lprocesses;

    @DdlField(Version = "2.0", QualName = "number-of-lprocesses", ObjectClass = 1, Level = 1, Structure = 2, Offset = 30, ElementSize = 2, IdentifierElement = 10)
    public short getNumber_Of_Lprocesses() {
        return number_Of_Lprocesses;
    }

    public void setNumber_Of_Lprocesses(short number_Of_LprocessesParam) {
        this.number_Of_Lprocesses = number_Of_LprocessesParam;
    }

}
