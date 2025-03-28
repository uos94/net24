
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-err-save", ElementSize = 4, LocalName = "ncp-resp-err-save")
public class Ncp_Resp_Err_Save
    implements Serializable
{

    private short reason;
    private short fserror;

    @DdlField(Version = "2.0", QualName = "reason", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getReason() {
        return reason;
    }

    public void setReason(short reasonParam) {
        this.reason = reasonParam;
    }

    @DdlField(Version = "2.0", QualName = "fserror", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getFserror() {
        return fserror;
    }

    public void setFserror(short fserrorParam) {
        this.fserror = fserrorParam;
    }

}
