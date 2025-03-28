
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cbip-conversational", ElementSize = 2, LocalName = "cbip-conversational")
public class Cbip_Conversational
    implements Serializable, ConversationalMarker
{

    private short cbip_Conversational;

    @DdlField(Version = "2.0", QualName = "cbip-conversational", ObjectClass = 1, Level = 1, Structure = 2, Offset = 120, ElementSize = 2, IdentifierElement = 45)
    public short getCbip_Conversational() {
        return cbip_Conversational;
    }

    public void setCbip_Conversational(short cbip_ConversationalParam) {
        this.cbip_Conversational = cbip_ConversationalParam;
    }

}
