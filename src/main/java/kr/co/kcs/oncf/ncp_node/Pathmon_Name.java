
package kr.co.kcs.oncf.ncp_node;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "pathmon-name", ElementSize = 47, LocalName = "pathmon-name")
public class Pathmon_Name
    implements Serializable, Pathmon_NameMarker
{

    private String pathmon_Name;

    @DdlField(Version = "2.0", QualName = "pathmon-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 654, ElementSize = 47, IdentifierElement = 45)
    public String getPathmon_Name() {
        return pathmon_Name;
    }

    public void setPathmon_Name(String pathmon_NameParam) {
        this.pathmon_Name = pathmon_NameParam;
    }

}
