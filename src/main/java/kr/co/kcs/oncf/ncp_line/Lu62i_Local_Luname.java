
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "lu62i-local-luname", ElementSize = 8, LocalName = "lu62i-local-luname")
public class Lu62i_Local_Luname
    implements Serializable, Local_LunameMarker
{

    private String lu62i_Local_Luname;

    @DdlField(Version = "2.0", QualName = "lu62i-local-luname", ObjectClass = 1, Level = 1, Structure = 0, Offset = 146, ElementSize = 8, IdentifierElement = 98)
    public String getLu62i_Local_Luname() {
        return lu62i_Local_Luname;
    }

    public void setLu62i_Local_Luname(String lu62i_Local_LunameParam) {
        this.lu62i_Local_Luname = lu62i_Local_LunameParam;
    }

}
