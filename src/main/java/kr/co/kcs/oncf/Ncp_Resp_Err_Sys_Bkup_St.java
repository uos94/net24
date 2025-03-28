
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-err-sys-bkup-st", ElementSize = 2, LocalName = "ncp-resp-err-sys-bkup-st")
public class Ncp_Resp_Err_Sys_Bkup_St
    implements Serializable
{

    private short ncp_Resp_Err_Sys_Bkup_St;

    @DdlField(Version = "2.0", QualName = "ncp-resp-err-sys-bkup-st", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Resp_Err_Sys_Bkup_St() {
        return ncp_Resp_Err_Sys_Bkup_St;
    }

    public void setNcp_Resp_Err_Sys_Bkup_St(short ncp_Resp_Err_Sys_Bkup_StParam) {
        this.ncp_Resp_Err_Sys_Bkup_St = ncp_Resp_Err_Sys_Bkup_StParam;
    }

}
