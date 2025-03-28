
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "partner-luname", ElementSize = 8, LocalName = "partner-luname")
public class Partner_Luname
    implements Serializable, Partner_LunameMarker
{

    private String partner_Luname;

    @DdlField(Version = "2.0", QualName = "partner-luname", ObjectClass = 1, Level = 1, Structure = 0, Offset = 166, ElementSize = 8, IdentifierElement = 125)
    public String getPartner_Luname() {
        return partner_Luname;
    }

    public void setPartner_Luname(String partner_LunameParam) {
        this.partner_Luname = partner_LunameParam;
    }

}
