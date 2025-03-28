
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "verify-dte-addr", ElementSize = 2, LocalName = "verify-dte-addr")
public class Verify_Dte_Addr
    implements Serializable, Verify_Dte_AddrMarker
{

    private short verify_Dte_Addr;

    @DdlField(Version = "2.0", QualName = "verify-dte-addr", ObjectClass = 1, Level = 1, Structure = 2, Offset = 212, ElementSize = 2, IdentifierElement = 172)
    public short getVerify_Dte_Addr() {
        return verify_Dte_Addr;
    }

    public void setVerify_Dte_Addr(short verify_Dte_AddrParam) {
        this.verify_Dte_Addr = verify_Dte_AddrParam;
    }

}
