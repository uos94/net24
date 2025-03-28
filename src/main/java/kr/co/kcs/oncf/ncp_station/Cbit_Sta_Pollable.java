
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cbit-sta-pollable", ElementSize = 2, LocalName = "cbit-sta-pollable")
public class Cbit_Sta_Pollable
    implements Serializable, Sta_PollableMarker
{

    private short cbit_Sta_Pollable;

    @DdlField(Version = "2.0", QualName = "cbit-sta-pollable", ObjectClass = 1, Level = 1, Structure = 2, Offset = 212, ElementSize = 2, IdentifierElement = 67)
    public short getCbit_Sta_Pollable() {
        return cbit_Sta_Pollable;
    }

    public void setCbit_Sta_Pollable(short cbit_Sta_PollableParam) {
        this.cbit_Sta_Pollable = cbit_Sta_PollableParam;
    }

}
