
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-newpwd-numeric-min", ElementSize = 2, LocalName = "ncp-resp-newpwd-numeric-min")
public class Ncp_Resp_Newpwd_Numeric_Min
    implements Serializable
{

    private short ncp_Resp_Newpwd_Numeric_Min;

    @DdlField(Version = "2.0", QualName = "ncp-resp-newpwd-numeric-min", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Resp_Newpwd_Numeric_Min() {
        return ncp_Resp_Newpwd_Numeric_Min;
    }

    public void setNcp_Resp_Newpwd_Numeric_Min(short ncp_Resp_Newpwd_Numeric_MinParam) {
        this.ncp_Resp_Newpwd_Numeric_Min = ncp_Resp_Newpwd_Numeric_MinParam;
    }

}
