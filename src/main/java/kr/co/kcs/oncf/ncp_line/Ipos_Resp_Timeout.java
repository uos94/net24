
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ipos-resp-timeout", ElementSize = 2, LocalName = "ipos-resp-timeout")
public class Ipos_Resp_Timeout
    implements Serializable, Resp_TimeoutMarker
{

    private short ipos_Resp_Timeout;

    @DdlField(Version = "2.0", QualName = "ipos-resp-timeout", ObjectClass = 1, Level = 1, Structure = 2, Offset = 328, ElementSize = 2, IdentifierElement = 194)
    public short getIpos_Resp_Timeout() {
        return ipos_Resp_Timeout;
    }

    public void setIpos_Resp_Timeout(short ipos_Resp_TimeoutParam) {
        this.ipos_Resp_Timeout = ipos_Resp_TimeoutParam;
    }

}
