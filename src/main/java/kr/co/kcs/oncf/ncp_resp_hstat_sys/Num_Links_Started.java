
package kr.co.kcs.oncf.ncp_resp_hstat_sys;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "num-links-started", ElementSize = 2, LocalName = "num-links-started")
public class Num_Links_Started
    implements Serializable, Num_Lpros_StartedMarker
{

    private short num_Links_Started;

    @DdlField(Version = "2.0", QualName = "num-links-started", ObjectClass = 1, Level = 1, Structure = 2, Offset = 262, ElementSize = 2, IdentifierElement = 54)
    public short getNum_Links_Started() {
        return num_Links_Started;
    }

    public void setNum_Links_Started(short num_Links_StartedParam) {
        this.num_Links_Started = num_Links_StartedParam;
    }

}
