
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-err-dup-dest", ElementSize = 2, LocalName = "ncp-resp-err-dup-dest")
public class Ncp_Resp_Err_Dup_Dest
    implements Serializable
{

    private short ncp_Resp_Err_Dup_Dest;

    @DdlField(Version = "2.0", QualName = "ncp-resp-err-dup-dest", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Resp_Err_Dup_Dest() {
        return ncp_Resp_Err_Dup_Dest;
    }

    public void setNcp_Resp_Err_Dup_Dest(short ncp_Resp_Err_Dup_DestParam) {
        this.ncp_Resp_Err_Dup_Dest = ncp_Resp_Err_Dup_DestParam;
    }

}
