
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "conversational", ElementSize = 2, LocalName = "conversational")
public class Conversational
    implements Serializable, ConversationalMarker
{

    private short conversational;

    @DdlField(Version = "2.0", QualName = "conversational", ObjectClass = 1, Level = 1, Structure = 2, Offset = 120, ElementSize = 2, IdentifierElement = 43)
    public short getConversational() {
        return conversational;
    }

    public void setConversational(short conversationalParam) {
        this.conversational = conversationalParam;
    }

}
