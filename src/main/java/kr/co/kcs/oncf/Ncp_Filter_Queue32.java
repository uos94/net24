
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-filter-queue32", ElementSize = 4, LocalName = "ncp-filter-queue32")
public class Ncp_Filter_Queue32
    implements Serializable
{

    private int ncp_Filter_Queue32;

    @DdlField(Version = "2.0", QualName = "ncp-filter-queue32", ObjectClass = 1, Level = 0, Structure = 4, Offset = 0, ElementSize = 4, IdentifierElement = 0)
    public int getNcp_Filter_Queue32() {
        return ncp_Filter_Queue32;
    }

    public void setNcp_Filter_Queue32(int ncp_Filter_Queue32Param) {
        this.ncp_Filter_Queue32 = ncp_Filter_Queue32Param;
    }

}
