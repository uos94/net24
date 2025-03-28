
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-err-rn-filsys", ElementSize = 2, LocalName = "ncp-resp-err-rn-filsys")
public class Ncp_Resp_Err_Rn_Filsys
    implements Serializable
{

    private short ncp_Resp_Err_Rn_Filsys;

    @DdlField(Version = "2.0", QualName = "ncp-resp-err-rn-filsys", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Resp_Err_Rn_Filsys() {
        return ncp_Resp_Err_Rn_Filsys;
    }

    public void setNcp_Resp_Err_Rn_Filsys(short ncp_Resp_Err_Rn_FilsysParam) {
        this.ncp_Resp_Err_Rn_Filsys = ncp_Resp_Err_Rn_FilsysParam;
    }

}
