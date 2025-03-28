
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-filter-under-srcclass", ElementSize = 4, LocalName = "ncp-filter-under-srcclass")
public class Ncp_Filter_Under_Srcclass
    implements Serializable
{

    private String ncp_Filter_Under_Srcclass;

    @DdlField(Version = "2.0", QualName = "ncp-filter-under-srcclass", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 4, IdentifierElement = 0)
    public String getNcp_Filter_Under_Srcclass() {
        return ncp_Filter_Under_Srcclass;
    }

    public void setNcp_Filter_Under_Srcclass(String ncp_Filter_Under_SrcclassParam) {
        this.ncp_Filter_Under_Srcclass = ncp_Filter_Under_SrcclassParam;
    }

}
