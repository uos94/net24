
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cbis-poll-int", ElementSize = 2, LocalName = "cbis-poll-int")
public class Cbis_Poll_Int
    implements Serializable, Poll_IntervalMarker
{

    private short cbis_Poll_Int;

    @DdlField(Version = "2.0", QualName = "cbis-poll-int", ObjectClass = 1, Level = 1, Structure = 2, Offset = 176, ElementSize = 2, IdentifierElement = 132)
    public short getCbis_Poll_Int() {
        return cbis_Poll_Int;
    }

    public void setCbis_Poll_Int(short cbis_Poll_IntParam) {
        this.cbis_Poll_Int = cbis_Poll_IntParam;
    }

}
