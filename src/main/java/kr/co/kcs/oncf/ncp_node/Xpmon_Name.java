
package kr.co.kcs.oncf.ncp_node;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "xpmon-name", ElementSize = 47, LocalName = "xpmon-name")
public class Xpmon_Name
    implements Serializable, Pathmon_NameMarker
{

    private String xpmon_Name;

    @DdlField(Version = "2.0", QualName = "xpmon-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 654, ElementSize = 47, IdentifierElement = 46)
    public String getXpmon_Name() {
        return xpmon_Name;
    }

    public void setXpmon_Name(String xpmon_NameParam) {
        this.xpmon_Name = xpmon_NameParam;
    }

}
