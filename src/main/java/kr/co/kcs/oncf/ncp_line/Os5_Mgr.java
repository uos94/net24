
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "os5-mgr", ElementSize = 16, LocalName = "os5-mgr")
public class Os5_Mgr
    implements Serializable, Os5_MgrMarker
{

    private String os5_Mgr;

    @DdlField(Version = "2.0", QualName = "os5-mgr", ObjectClass = 1, Level = 1, Structure = 0, Offset = 310, ElementSize = 16, IdentifierElement = 189)
    public String getOs5_Mgr() {
        return os5_Mgr;
    }

    public void setOs5_Mgr(String os5_MgrParam) {
        this.os5_Mgr = os5_MgrParam;
    }

}
