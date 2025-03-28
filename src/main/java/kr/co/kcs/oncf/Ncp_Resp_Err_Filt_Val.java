
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-err-filt-val", ElementSize = 4, LocalName = "ncp-resp-err-filt-val")
public class Ncp_Resp_Err_Filt_Val
    implements Serializable
{

    private short filt_Vty;
    private short reason;

    @DdlField(Version = "2.0", QualName = "filt-vty", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getFilt_Vty() {
        return filt_Vty;
    }

    public void setFilt_Vty(short filt_VtyParam) {
        this.filt_Vty = filt_VtyParam;
    }

    @DdlField(Version = "2.0", QualName = "reason", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getReason() {
        return reason;
    }

    public void setReason(short reasonParam) {
        this.reason = reasonParam;
    }

}
