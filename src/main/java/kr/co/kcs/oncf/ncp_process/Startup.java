
package kr.co.kcs.oncf.ncp_process;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "startup", ElementSize = 2, LocalName = "startup")
public class Startup
    implements Serializable, Begin_TypeMarker
{

    private short startup;

    @DdlField(Version = "2.0", QualName = "startup", ObjectClass = 1, Level = 1, Structure = 2, Offset = 38, ElementSize = 2, IdentifierElement = 7)
    public short getStartup() {
        return startup;
    }

    public void setStartup(short startupParam) {
        this.startup = startupParam;
    }

}
