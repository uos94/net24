
package kr.co.kcs.oncf.ncp_lex_struct.dynamic_var1;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "dynamic-area-s", ElementSize = 3800, LocalName = "dynamic-area-s")
public class Dynamic_Area_S
    implements Serializable, Dynamic_Area_SMarker
{

    private String dynamic_Area_S;

    @DdlField(Version = "2.0", QualName = "dynamic-area-s", ObjectClass = 1, Level = 2, Structure = 0, Offset = 212, ElementSize = 3800, IdentifierElement = 37, ValidationPattern = "\\p{Sc}{0,3800}")
    public String getDynamic_Area_S() {
        return dynamic_Area_S;
    }

    public void setDynamic_Area_S(String dynamic_Area_SParam) {
        this.dynamic_Area_S = dynamic_Area_SParam;
    }

}
