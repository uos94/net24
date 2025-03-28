
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "lu62i-send-flush", ElementSize = 2, LocalName = "lu62i-send-flush")
public class Lu62i_Send_Flush
    implements Serializable, Send_FlushMarker
{

    private short lu62i_Send_Flush;

    @DdlField(Version = "2.0", QualName = "lu62i-send-flush", ObjectClass = 1, Level = 1, Structure = 2, Offset = 206, ElementSize = 2, IdentifierElement = 159)
    public short getLu62i_Send_Flush() {
        return lu62i_Send_Flush;
    }

    public void setLu62i_Send_Flush(short lu62i_Send_FlushParam) {
        this.lu62i_Send_Flush = lu62i_Send_FlushParam;
    }

}
