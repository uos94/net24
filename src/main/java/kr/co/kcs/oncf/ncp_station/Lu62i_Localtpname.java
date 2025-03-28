
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "lu62i-localtpname", ElementSize = 16, LocalName = "lu62i-localtpname")
public class Lu62i_Localtpname
    implements Serializable, LocaltpnameMarker
{

    private String lu62i_Localtpname;

    @DdlField(Version = "2.0", QualName = "lu62i-localtpname", ObjectClass = 1, Level = 1, Structure = 0, Offset = 154, ElementSize = 16, IdentifierElement = 36)
    public String getLu62i_Localtpname() {
        return lu62i_Localtpname;
    }

    public void setLu62i_Localtpname(String lu62i_LocaltpnameParam) {
        this.lu62i_Localtpname = lu62i_LocaltpnameParam;
    }

}
