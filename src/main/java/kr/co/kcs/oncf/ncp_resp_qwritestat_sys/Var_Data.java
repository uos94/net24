
package kr.co.kcs.oncf.ncp_resp_qwritestat_sys;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "var-data", ElementSize = 2884, LocalName = "var-data")
public class Var_Data
    implements Serializable, Var_DataMarker
{

    private String var_Data;

    @DdlField(Version = "2.0", QualName = "var-data", ObjectClass = 1, Level = 1, Structure = 0, Offset = 2, ElementSize = 2884, IdentifierElement = 2)
    public String getVar_Data() {
        return var_Data;
    }

    public void setVar_Data(String var_DataParam) {
        this.var_Data = var_DataParam;
    }

}
