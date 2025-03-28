
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cbis-sta-pollable", ElementSize = 2, LocalName = "cbis-sta-pollable")
public class Cbis_Sta_Pollable
    implements Serializable, Sta_PollableMarker
{

    private short cbis_Sta_Pollable;

    @DdlField(Version = "2.0", QualName = "cbis-sta-pollable", ObjectClass = 1, Level = 1, Structure = 2, Offset = 212, ElementSize = 2, IdentifierElement = 66)
    public short getCbis_Sta_Pollable() {
        return cbis_Sta_Pollable;
    }

    public void setCbis_Sta_Pollable(short cbis_Sta_PollableParam) {
        this.cbis_Sta_Pollable = cbis_Sta_PollableParam;
    }

}
