
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-err-inv-hdr", ElementSize = 4, LocalName = "ncp-resp-err-inv-hdr")
public class Ncp_Resp_Err_Inv_Hdr
    implements Serializable
{

    private short offset;
    private short reason;

    @DdlField(Version = "2.0", QualName = "offset", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getOffset() {
        return offset;
    }

    public void setOffset(short offsetParam) {
        this.offset = offsetParam;
    }

    @DdlField(Version = "2.0", QualName = "reason", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getReason() {
        return reason;
    }

    public void setReason(short reasonParam) {
        this.reason = reasonParam;
    }

}
