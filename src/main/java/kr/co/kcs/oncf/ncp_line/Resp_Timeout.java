
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "resp-timeout", ElementSize = 2, LocalName = "resp-timeout")
public class Resp_Timeout
    implements Serializable, Resp_TimeoutMarker
{

    private short resp_Timeout;

    @DdlField(Version = "2.0", QualName = "resp-timeout", ObjectClass = 1, Level = 1, Structure = 2, Offset = 328, ElementSize = 2, IdentifierElement = 193)
    public short getResp_Timeout() {
        return resp_Timeout;
    }

    public void setResp_Timeout(short resp_TimeoutParam) {
        this.resp_Timeout = resp_TimeoutParam;
    }

}
