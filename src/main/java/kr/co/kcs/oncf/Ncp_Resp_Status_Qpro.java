
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-status-qpro", ElementSize = 6, LocalName = "ncp-resp-status-qpro")
public class Ncp_Resp_Status_Qpro
    implements Serializable
{

    private short qpro_Started_Processes;
    private short queue_Count;
    private short queue_State;

    @DdlField(Version = "2.0", QualName = "qpro-started-processes", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getQpro_Started_Processes() {
        return qpro_Started_Processes;
    }

    public void setQpro_Started_Processes(short qpro_Started_ProcessesParam) {
        this.qpro_Started_Processes = qpro_Started_ProcessesParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-count", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getQueue_Count() {
        return queue_Count;
    }

    public void setQueue_Count(short queue_CountParam) {
        this.queue_Count = queue_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 3)
    public short getQueue_State() {
        return queue_State;
    }

    public void setQueue_State(short queue_StateParam) {
        this.queue_State = queue_StateParam;
    }

}
