
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-newpwd-too-long", ElementSize = 2, LocalName = "ncp-resp-newpwd-too-long")
public class Ncp_Resp_Newpwd_Too_Long
    implements Serializable
{

    private short ncp_Resp_Newpwd_Too_Long;

    @DdlField(Version = "2.0", QualName = "ncp-resp-newpwd-too-long", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Resp_Newpwd_Too_Long() {
        return ncp_Resp_Newpwd_Too_Long;
    }

    public void setNcp_Resp_Newpwd_Too_Long(short ncp_Resp_Newpwd_Too_LongParam) {
        this.ncp_Resp_Newpwd_Too_Long = ncp_Resp_Newpwd_Too_LongParam;
    }

}
