
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-filter-under-class", ElementSize = 32, LocalName = "ncp-filter-under-class")
public class Ncp_Filter_Under_Class
    implements Serializable
{

    private String ncp_Filter_Under_Class;

    @DdlField(Version = "2.0", QualName = "ncp-filter-under-class", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 32, IdentifierElement = 0)
    public String getNcp_Filter_Under_Class() {
        return ncp_Filter_Under_Class;
    }

    public void setNcp_Filter_Under_Class(String ncp_Filter_Under_ClassParam) {
        this.ncp_Filter_Under_Class = ncp_Filter_Under_ClassParam;
    }

}
