
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-logon", ElementSize = 2, LocalName = "ncp-resp-logon")
public class Ncp_Resp_Logon
    implements Serializable
{

    private short ncp_Resp_Logon;

    @DdlField(Version = "2.0", QualName = "ncp-resp-logon", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Resp_Logon() {
        return ncp_Resp_Logon;
    }

    public void setNcp_Resp_Logon(short ncp_Resp_LogonParam) {
        this.ncp_Resp_Logon = ncp_Resp_LogonParam;
    }

}
