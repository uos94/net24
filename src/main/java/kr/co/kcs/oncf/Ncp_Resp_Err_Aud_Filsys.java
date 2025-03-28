
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-err-aud-filsys", ElementSize = 4, LocalName = "ncp-resp-err-aud-filsys")
public class Ncp_Resp_Err_Aud_Filsys
    implements Serializable
{

    private short reason;
    private short fs_Err;

    @DdlField(Version = "2.0", QualName = "reason", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getReason() {
        return reason;
    }

    public void setReason(short reasonParam) {
        this.reason = reasonParam;
    }

    @DdlField(Version = "2.0", QualName = "fs-err", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getFs_Err() {
        return fs_Err;
    }

    public void setFs_Err(short fs_ErrParam) {
        this.fs_Err = fs_ErrParam;
    }

}
