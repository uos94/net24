
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "biptp-conversational", ElementSize = 2, LocalName = "biptp-conversational")
public class Biptp_Conversational
    implements Serializable, ConversationalMarker
{

    private short biptp_Conversational;

    @DdlField(Version = "2.0", QualName = "biptp-conversational", ObjectClass = 1, Level = 1, Structure = 2, Offset = 120, ElementSize = 2, IdentifierElement = 44)
    public short getBiptp_Conversational() {
        return biptp_Conversational;
    }

    public void setBiptp_Conversational(short biptp_ConversationalParam) {
        this.biptp_Conversational = biptp_ConversationalParam;
    }

}
