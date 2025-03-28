
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-filter-under-uc", ElementSize = 14, LocalName = "ncp-filter-under-uc")
public class Ncp_Filter_Under_Uc
    implements Serializable
{

    private String ncp_Filter_Under_Uc;

    @DdlField(Version = "2.0", QualName = "ncp-filter-under-uc", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 14, IdentifierElement = 0)
    public String getNcp_Filter_Under_Uc() {
        return ncp_Filter_Under_Uc;
    }

    public void setNcp_Filter_Under_Uc(String ncp_Filter_Under_UcParam) {
        this.ncp_Filter_Under_Uc = ncp_Filter_Under_UcParam;
    }

}
