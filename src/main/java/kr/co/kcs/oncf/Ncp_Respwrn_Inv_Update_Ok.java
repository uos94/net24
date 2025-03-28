
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-respwrn-inv-update-ok", ElementSize = 4, LocalName = "ncp-respwrn-inv-update-ok")
public class Ncp_Respwrn_Inv_Update_Ok
    implements Serializable
{

    private short reason;
    private short vty;

    @DdlField(Version = "2.0", QualName = "reason", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getReason() {
        return reason;
    }

    public void setReason(short reasonParam) {
        this.reason = reasonParam;
    }

    @DdlField(Version = "2.0", QualName = "vty", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getVty() {
        return vty;
    }

    public void setVty(short vtyParam) {
        this.vty = vtyParam;
    }

}
