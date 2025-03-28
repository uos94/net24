
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "lu62i-modename", ElementSize = 8, LocalName = "lu62i-modename")
public class Lu62i_Modename
    implements Serializable, ModenameMarker
{

    private String lu62i_Modename;

    @DdlField(Version = "2.0", QualName = "lu62i-modename", ObjectClass = 1, Level = 1, Structure = 0, Offset = 170, ElementSize = 8, IdentifierElement = 38)
    public String getLu62i_Modename() {
        return lu62i_Modename;
    }

    public void setLu62i_Modename(String lu62i_ModenameParam) {
        this.lu62i_Modename = lu62i_ModenameParam;
    }

}
