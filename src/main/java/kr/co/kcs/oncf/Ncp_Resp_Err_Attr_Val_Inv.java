
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_err_attr_val_inv.Reason;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-err-attr-val-inv", ElementSize = 4, LocalName = "ncp-resp-err-attr-val-inv")
public class Ncp_Resp_Err_Attr_Val_Inv
    implements Serializable
{

    private short attr_Vty;
    private Reason reason;

    @DdlField(Version = "2.0", QualName = "attr-vty", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getAttr_Vty() {
        return attr_Vty;
    }

    public void setAttr_Vty(short attr_VtyParam) {
        this.attr_Vty = attr_VtyParam;
    }

    @DdlField(Version = "2.0", QualName = "reason", ObjectClass = 1, Level = 1, Structure = 25, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public Reason getReason() {
        return reason;
    }

    public void setReason(Reason reasonParam) {
        this.reason = reasonParam;
    }

}
