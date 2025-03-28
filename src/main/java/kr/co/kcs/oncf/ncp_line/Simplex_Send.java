
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "simplex-send", ElementSize = 2, LocalName = "simplex-send")
public class Simplex_Send
    implements Serializable, Simplex_SendMarker
{

    private short simplex_Send;

    @DdlField(Version = "2.0", QualName = "simplex-send", ObjectClass = 1, Level = 1, Structure = 2, Offset = 204, ElementSize = 2, IdentifierElement = 156)
    public short getSimplex_Send() {
        return simplex_Send;
    }

    public void setSimplex_Send(short simplex_SendParam) {
        this.simplex_Send = simplex_SendParam;
    }

}
