
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-status-lpro", ElementSize = 14, LocalName = "ncp-resp-status-lpro")
public class Ncp_Resp_Status_Lpro
    implements Serializable
{

    private short current_State;
    private short logical_State;
    private short queue_Count;
    private short queue_State;
    private short warmbackup_Logic;
    private int queue_Count32;

    @DdlField(Version = "2.0", QualName = "current-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getCurrent_State() {
        return current_State;
    }

    public void setCurrent_State(short current_StateParam) {
        this.current_State = current_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "logical-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getLogical_State() {
        return logical_State;
    }

    public void setLogical_State(short logical_StateParam) {
        this.logical_State = logical_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-count", ObjectClass = 1, Level = 1, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 3)
    public short getQueue_Count() {
        return queue_Count;
    }

    public void setQueue_Count(short queue_CountParam) {
        this.queue_Count = queue_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 6, ElementSize = 2, IdentifierElement = 4)
    public short getQueue_State() {
        return queue_State;
    }

    public void setQueue_State(short queue_StateParam) {
        this.queue_State = queue_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "warmbackup-logic", ObjectClass = 1, Level = 1, Structure = 2, Offset = 8, ElementSize = 2, IdentifierElement = 5)
    public short getWarmbackup_Logic() {
        return warmbackup_Logic;
    }

    public void setWarmbackup_Logic(short warmbackup_LogicParam) {
        this.warmbackup_Logic = warmbackup_LogicParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-count32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 10, ElementSize = 4, IdentifierElement = 6)
    public int getQueue_Count32() {
        return queue_Count32;
    }

    public void setQueue_Count32(int queue_Count32Param) {
        this.queue_Count32 = queue_Count32Param;
    }

}
