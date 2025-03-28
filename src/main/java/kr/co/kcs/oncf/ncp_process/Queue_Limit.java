
package kr.co.kcs.oncf.ncp_process;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "queue-limit", ElementSize = 2, LocalName = "queue-limit")
public class Queue_Limit
    implements Serializable, Queue_LimitMarker
{

    private short queue_Limit;

    @DdlField(Version = "2.0", QualName = "queue-limit", ObjectClass = 1, Level = 1, Structure = 2, Offset = 154, ElementSize = 2, IdentifierElement = 20)
    public short getQueue_Limit() {
        return queue_Limit;
    }

    public void setQueue_Limit(short queue_LimitParam) {
        this.queue_Limit = queue_LimitParam;
    }

}
