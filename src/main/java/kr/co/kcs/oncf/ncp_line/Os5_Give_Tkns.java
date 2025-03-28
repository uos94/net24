
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "os5-give-tkns", ElementSize = 2, LocalName = "os5-give-tkns")
public class Os5_Give_Tkns
    implements Serializable, Give_TknsMarker
{

    private short os5_Give_Tkns;

    @DdlField(Version = "2.0", QualName = "os5-give-tkns", ObjectClass = 1, Level = 1, Structure = 2, Offset = 132, ElementSize = 2, IdentifierElement = 71)
    public short getOs5_Give_Tkns() {
        return os5_Give_Tkns;
    }

    public void setOs5_Give_Tkns(short os5_Give_TknsParam) {
        this.os5_Give_Tkns = os5_Give_TknsParam;
    }

}
