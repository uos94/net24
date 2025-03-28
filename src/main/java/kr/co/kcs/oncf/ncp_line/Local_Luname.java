
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "local-luname", ElementSize = 8, LocalName = "local-luname")
public class Local_Luname
    implements Serializable, Local_LunameMarker
{

    private String local_Luname;

    @DdlField(Version = "2.0", QualName = "local-luname", ObjectClass = 1, Level = 1, Structure = 0, Offset = 146, ElementSize = 8, IdentifierElement = 97)
    public String getLocal_Luname() {
        return local_Luname;
    }

    public void setLocal_Luname(String local_LunameParam) {
        this.local_Luname = local_LunameParam;
    }

}
