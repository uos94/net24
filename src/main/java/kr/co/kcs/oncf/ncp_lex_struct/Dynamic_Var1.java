
package kr.co.kcs.oncf.ncp_lex_struct;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_lex_struct.dynamic_var1.Dynamic_Area_SMarker;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

@DdlGroup(Version = "2.0", QualName = "dynamic-var1", ElementSize = 3800, LocalName = "dynamic-var1")
public class Dynamic_Var1
    implements Serializable
{

    private Dynamic_Area_SMarker dynamic_Area_S;

    @DdlField(Version = "2.0", QualName = "dynamic-area-s", ObjectClass = 1, Level = 2, Structure = 0, Offset = 212, ElementSize = 3800, IdentifierElement = 37, ValidationPattern = "\\p{Sc}{0,3800}")
    @ReturnType("kr.co.kcs.oncf.ncp_lex_struct.dynamic_var1.Dynamic_Area_S")
    public Dynamic_Area_SMarker getDynamic_Area_S() {
        return dynamic_Area_S;
    }

    public void setDynamic_Area_S(Dynamic_Area_SMarker dynamic_Area_SParam) {
        this.dynamic_Area_S = dynamic_Area_SParam;
    }

}
