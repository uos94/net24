
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-filter-queue", ElementSize = 2, LocalName = "ncp-filter-queue")
public class Ncp_Filter_Queue
    implements Serializable
{

    private short ncp_Filter_Queue;

    @DdlField(Version = "2.0", QualName = "ncp-filter-queue", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Filter_Queue() {
        return ncp_Filter_Queue;
    }

    public void setNcp_Filter_Queue(short ncp_Filter_QueueParam) {
        this.ncp_Filter_Queue = ncp_Filter_QueueParam;
    }

}
