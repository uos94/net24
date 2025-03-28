
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "localtpname", ElementSize = 16, LocalName = "localtpname")
public class Localtpname
    implements Serializable, LocaltpnameMarker
{

    private String localtpname;

    @DdlField(Version = "2.0", QualName = "localtpname", ObjectClass = 1, Level = 1, Structure = 0, Offset = 154, ElementSize = 16, IdentifierElement = 35)
    public String getLocaltpname() {
        return localtpname;
    }

    public void setLocaltpname(String localtpnameParam) {
        this.localtpname = localtpnameParam;
    }

}
