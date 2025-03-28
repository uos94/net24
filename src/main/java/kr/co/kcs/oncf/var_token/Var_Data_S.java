
package kr.co.kcs.oncf.var_token;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "var-data-s", ElementSize = 3794, LocalName = "var-data-s")
public class Var_Data_S
    implements Serializable, Var_Data_SMarker
{

    private String var_Data_S;

    @DdlField(Version = "2.0", QualName = "var-data-s", ObjectClass = 1, Level = 1, Structure = 0, Offset = 6, ElementSize = 3794, IdentifierElement = 4, ValidationPattern = "\\p{Sc}{0,3794}")
    public String getVar_Data_S() {
        return var_Data_S;
    }

    public void setVar_Data_S(String var_Data_SParam) {
        this.var_Data_S = var_Data_SParam;
    }

}
