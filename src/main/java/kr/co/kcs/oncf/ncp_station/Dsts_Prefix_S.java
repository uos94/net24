
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "dsts-prefix-s", ElementSize = 12, LocalName = "dsts-prefix-s")
public class Dsts_Prefix_S
    implements Serializable, Dsts_Prefix_SMarker
{

    private String dsts_Prefix_S;

    @DdlField(Version = "2.0", QualName = "dsts-prefix-s", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1158, ElementSize = 12, IdentifierElement = 171)
    public String getDsts_Prefix_S() {
        return dsts_Prefix_S;
    }

    public void setDsts_Prefix_S(String dsts_Prefix_SParam) {
        this.dsts_Prefix_S = dsts_Prefix_SParam;
    }

}
