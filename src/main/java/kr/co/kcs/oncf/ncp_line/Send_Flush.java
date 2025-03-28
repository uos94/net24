
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "send-flush", ElementSize = 2, LocalName = "send-flush")
public class Send_Flush
    implements Serializable, Send_FlushMarker
{

    private short send_Flush;

    @DdlField(Version = "2.0", QualName = "send-flush", ObjectClass = 1, Level = 1, Structure = 2, Offset = 206, ElementSize = 2, IdentifierElement = 158)
    public short getSend_Flush() {
        return send_Flush;
    }

    public void setSend_Flush(short send_FlushParam) {
        this.send_Flush = send_FlushParam;
    }

}
