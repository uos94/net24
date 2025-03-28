
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "lu62i-simplex-send", ElementSize = 2, LocalName = "lu62i-simplex-send")
public class Lu62i_Simplex_Send
    implements Serializable, Simplex_SendMarker
{

    private short lu62i_Simplex_Send;

    @DdlField(Version = "2.0", QualName = "lu62i-simplex-send", ObjectClass = 1, Level = 1, Structure = 2, Offset = 204, ElementSize = 2, IdentifierElement = 157)
    public short getLu62i_Simplex_Send() {
        return lu62i_Simplex_Send;
    }

    public void setLu62i_Simplex_Send(short lu62i_Simplex_SendParam) {
        this.lu62i_Simplex_Send = lu62i_Simplex_SendParam;
    }

}
