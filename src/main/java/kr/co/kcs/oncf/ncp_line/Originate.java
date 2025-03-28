
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "originate", ElementSize = 2, LocalName = "originate")
public class Originate
    implements Serializable, OriginateMarker
{

    private short originate;

    @DdlField(Version = "2.0", QualName = "originate", ObjectClass = 1, Level = 1, Structure = 2, Offset = 162, ElementSize = 2, IdentifierElement = 109)
    public short getOriginate() {
        return originate;
    }

    public void setOriginate(short originateParam) {
        this.originate = originateParam;
    }

}
