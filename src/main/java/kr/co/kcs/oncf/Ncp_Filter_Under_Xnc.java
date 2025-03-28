
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-filter-under-xnc", ElementSize = 47, LocalName = "ncp-filter-under-xnc")
public class Ncp_Filter_Under_Xnc
    implements Serializable
{

    private String ncp_Filter_Under_Xnc;

    @DdlField(Version = "2.0", QualName = "ncp-filter-under-xnc", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 47, IdentifierElement = 0)
    public String getNcp_Filter_Under_Xnc() {
        return ncp_Filter_Under_Xnc;
    }

    public void setNcp_Filter_Under_Xnc(String ncp_Filter_Under_XncParam) {
        this.ncp_Filter_Under_Xnc = ncp_Filter_Under_XncParam;
    }

}
