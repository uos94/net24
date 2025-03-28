
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "lu62i-partner-luname", ElementSize = 8, LocalName = "lu62i-partner-luname")
public class Lu62i_Partner_Luname
    implements Serializable, Partner_LunameMarker
{

    private String lu62i_Partner_Luname;

    @DdlField(Version = "2.0", QualName = "lu62i-partner-luname", ObjectClass = 1, Level = 1, Structure = 0, Offset = 166, ElementSize = 8, IdentifierElement = 126)
    public String getLu62i_Partner_Luname() {
        return lu62i_Partner_Luname;
    }

    public void setLu62i_Partner_Luname(String lu62i_Partner_LunameParam) {
        this.lu62i_Partner_Luname = lu62i_Partner_LunameParam;
    }

}
