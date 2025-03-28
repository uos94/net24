
package kr.co.kcs.oncf.ncp_resp_srvcstatus_sys;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "srvcs32", ElementSize = 4, LocalName = "srvcs32")
public class Srvcs32
    implements Serializable
{

    private int queue32;

    @DdlField(Version = "2.0", QualName = "queue32", ObjectClass = 1, Level = 2, Structure = 4, Offset = 910, ElementSize = 4, IdentifierElement = 18)
    public int getQueue32() {
        return queue32;
    }

    public void setQueue32(int queue32Param) {
        this.queue32 = queue32Param;
    }

}
