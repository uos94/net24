
package kr.co.kcs.oncf.ncp_resp_hstat_sys;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "num-lpros-started", ElementSize = 2, LocalName = "num-lpros-started")
public class Num_Lpros_Started
    implements Serializable, Num_Lpros_StartedMarker
{

    private short num_Lpros_Started;

    @DdlField(Version = "2.0", QualName = "num-lpros-started", ObjectClass = 1, Level = 1, Structure = 2, Offset = 262, ElementSize = 2, IdentifierElement = 53)
    public short getNum_Lpros_Started() {
        return num_Lpros_Started;
    }

    public void setNum_Lpros_Started(short num_Lpros_StartedParam) {
        this.num_Lpros_Started = num_Lpros_StartedParam;
    }

}
