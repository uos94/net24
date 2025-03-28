
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-err-under-fail", ElementSize = 2, LocalName = "ncp-resp-err-under-fail")
public class Ncp_Resp_Err_Under_Fail
    implements Serializable
{

    private short ncp_Resp_Err_Under_Fail;

    @DdlField(Version = "2.0", QualName = "ncp-resp-err-under-fail", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Resp_Err_Under_Fail() {
        return ncp_Resp_Err_Under_Fail;
    }

    public void setNcp_Resp_Err_Under_Fail(short ncp_Resp_Err_Under_FailParam) {
        this.ncp_Resp_Err_Under_Fail = ncp_Resp_Err_Under_FailParam;
    }

}
