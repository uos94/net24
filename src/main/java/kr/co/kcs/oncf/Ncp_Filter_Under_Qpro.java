
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-filter-under-qpro", ElementSize = 16, LocalName = "ncp-filter-under-qpro")
public class Ncp_Filter_Under_Qpro
    implements Serializable
{

    private String ncp_Filter_Under_Qpro;

    @DdlField(Version = "2.0", QualName = "ncp-filter-under-qpro", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 0)
    public String getNcp_Filter_Under_Qpro() {
        return ncp_Filter_Under_Qpro;
    }

    public void setNcp_Filter_Under_Qpro(String ncp_Filter_Under_QproParam) {
        this.ncp_Filter_Under_Qpro = ncp_Filter_Under_QproParam;
    }

}
