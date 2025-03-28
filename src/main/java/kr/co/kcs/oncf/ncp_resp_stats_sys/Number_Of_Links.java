
package kr.co.kcs.oncf.ncp_resp_stats_sys;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "number-of-links", ElementSize = 2, LocalName = "number-of-links")
public class Number_Of_Links
    implements Serializable, Number_Of_LprocessesMarker
{

    private short number_Of_Links;

    @DdlField(Version = "2.0", QualName = "number-of-links", ObjectClass = 1, Level = 1, Structure = 2, Offset = 30, ElementSize = 2, IdentifierElement = 11)
    public short getNumber_Of_Links() {
        return number_Of_Links;
    }

    public void setNumber_Of_Links(short number_Of_LinksParam) {
        this.number_Of_Links = number_Of_LinksParam;
    }

}
