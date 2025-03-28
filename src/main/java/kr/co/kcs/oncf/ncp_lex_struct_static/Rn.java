
package kr.co.kcs.oncf.ncp_lex_struct_static;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "rn", ElementSize = 16, LocalName = "rn")
public class Rn
    implements Serializable, RnMarker
{

    private String rn;

    @DdlField(Version = "2.0", QualName = "rn", ObjectClass = 1, Level = 1, Structure = 0, Offset = 22, ElementSize = 16, IdentifierElement = 5)
    public String getRn() {
        return rn;
    }

    public void setRn(String rnParam) {
        this.rn = rnParam;
    }

}
