
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "modename", ElementSize = 8, LocalName = "modename")
public class Modename
    implements Serializable, ModenameMarker
{

    private String modename;

    @DdlField(Version = "2.0", QualName = "modename", ObjectClass = 1, Level = 1, Structure = 0, Offset = 170, ElementSize = 8, IdentifierElement = 37)
    public String getModename() {
        return modename;
    }

    public void setModename(String modenameParam) {
        this.modename = modenameParam;
    }

}
