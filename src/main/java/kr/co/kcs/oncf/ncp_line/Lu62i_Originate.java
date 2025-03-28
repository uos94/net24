
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "lu62i-originate", ElementSize = 2, LocalName = "lu62i-originate")
public class Lu62i_Originate
    implements Serializable, OriginateMarker
{

    private short lu62i_Originate;

    @DdlField(Version = "2.0", QualName = "lu62i-originate", ObjectClass = 1, Level = 1, Structure = 2, Offset = 162, ElementSize = 2, IdentifierElement = 110)
    public short getLu62i_Originate() {
        return lu62i_Originate;
    }

    public void setLu62i_Originate(short lu62i_OriginateParam) {
        this.lu62i_Originate = lu62i_OriginateParam;
    }

}
