
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "partnertpname", ElementSize = 16, LocalName = "partnertpname")
public class Partnertpname
    implements Serializable, PartnertpnameMarker
{

    private String partnertpname;

    @DdlField(Version = "2.0", QualName = "partnertpname", ObjectClass = 1, Level = 1, Structure = 0, Offset = 178, ElementSize = 16, IdentifierElement = 39)
    public String getPartnertpname() {
        return partnertpname;
    }

    public void setPartnertpname(String partnertpnameParam) {
        this.partnertpname = partnertpnameParam;
    }

}
