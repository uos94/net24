
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "lu62i-partnertpname", ElementSize = 16, LocalName = "lu62i-partnertpname")
public class Lu62i_Partnertpname
    implements Serializable, PartnertpnameMarker
{

    private String lu62i_Partnertpname;

    @DdlField(Version = "2.0", QualName = "lu62i-partnertpname", ObjectClass = 1, Level = 1, Structure = 0, Offset = 178, ElementSize = 16, IdentifierElement = 40)
    public String getLu62i_Partnertpname() {
        return lu62i_Partnertpname;
    }

    public void setLu62i_Partnertpname(String lu62i_PartnertpnameParam) {
        this.lu62i_Partnertpname = lu62i_PartnertpnameParam;
    }

}
