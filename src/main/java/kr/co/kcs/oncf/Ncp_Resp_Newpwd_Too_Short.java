
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-newpwd-too-short", ElementSize = 2, LocalName = "ncp-resp-newpwd-too-short")
public class Ncp_Resp_Newpwd_Too_Short
    implements Serializable
{

    private short ncp_Resp_Newpwd_Too_Short;

    @DdlField(Version = "2.0", QualName = "ncp-resp-newpwd-too-short", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Resp_Newpwd_Too_Short() {
        return ncp_Resp_Newpwd_Too_Short;
    }

    public void setNcp_Resp_Newpwd_Too_Short(short ncp_Resp_Newpwd_Too_ShortParam) {
        this.ncp_Resp_Newpwd_Too_Short = ncp_Resp_Newpwd_Too_ShortParam;
    }

}
