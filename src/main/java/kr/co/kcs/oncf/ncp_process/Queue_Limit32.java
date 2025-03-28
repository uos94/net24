
package kr.co.kcs.oncf.ncp_process;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "queue-limit32", ElementSize = 4, LocalName = "queue-limit32")
public class Queue_Limit32
    implements Serializable, Queue_Limit32Marker
{

    private int queue_Limit32;

    @DdlField(Version = "2.0", QualName = "queue-limit32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 976, ElementSize = 4, IdentifierElement = 70)
    public int getQueue_Limit32() {
        return queue_Limit32;
    }

    public void setQueue_Limit32(int queue_Limit32Param) {
        this.queue_Limit32 = queue_Limit32Param;
    }

}
