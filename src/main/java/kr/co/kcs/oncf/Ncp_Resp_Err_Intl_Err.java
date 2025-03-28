
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-err-intl-err", ElementSize = 2, LocalName = "ncp-resp-err-intl-err")
public class Ncp_Resp_Err_Intl_Err
    implements Serializable
{

    private short ncp_Resp_Err_Intl_Err;

    @DdlField(Version = "2.0", QualName = "ncp-resp-err-intl-err", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Resp_Err_Intl_Err() {
        return ncp_Resp_Err_Intl_Err;
    }

    public void setNcp_Resp_Err_Intl_Err(short ncp_Resp_Err_Intl_ErrParam) {
        this.ncp_Resp_Err_Intl_Err = ncp_Resp_Err_Intl_ErrParam;
    }

}
