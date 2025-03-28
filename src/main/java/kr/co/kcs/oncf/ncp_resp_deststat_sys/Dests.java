
package kr.co.kcs.oncf.ncp_resp_deststat_sys;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "dests", ElementSize = 38, LocalName = "dests")
public class Dests
    implements Serializable
{

    private String dest_Name;
    private short dest_Type;
    private short frozen;
    private int queue_Count;
    private int max_Queue;
    private int msgs_Dropped;
    private int msg_Drop_Rate;
    private short fail;

    @DdlField(Version = "2.0", QualName = "dest-name", ObjectClass = 1, Level = 2, Structure = 0, Offset = 310, ElementSize = 16, IdentifierElement = 8)
    public String getDest_Name() {
        return dest_Name;
    }

    public void setDest_Name(String dest_NameParam) {
        this.dest_Name = dest_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "dest-type", ObjectClass = 1, Level = 2, Structure = 2, Offset = 326, ElementSize = 2, IdentifierElement = 9)
    public short getDest_Type() {
        return dest_Type;
    }

    public void setDest_Type(short dest_TypeParam) {
        this.dest_Type = dest_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "frozen", ObjectClass = 1, Level = 2, Structure = 2, Offset = 328, ElementSize = 2, IdentifierElement = 10)
    public short getFrozen() {
        return frozen;
    }

    public void setFrozen(short frozenParam) {
        this.frozen = frozenParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-count", ObjectClass = 1, Level = 2, Structure = 4, Offset = 330, ElementSize = 4, IdentifierElement = 11)
    public int getQueue_Count() {
        return queue_Count;
    }

    public void setQueue_Count(int queue_CountParam) {
        this.queue_Count = queue_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "max-queue", ObjectClass = 1, Level = 2, Structure = 4, Offset = 334, ElementSize = 4, IdentifierElement = 12)
    public int getMax_Queue() {
        return max_Queue;
    }

    public void setMax_Queue(int max_QueueParam) {
        this.max_Queue = max_QueueParam;
    }

    @DdlField(Version = "2.0", QualName = "msgs-dropped", ObjectClass = 1, Level = 2, Structure = 4, Offset = 338, ElementSize = 4, IdentifierElement = 13)
    public int getMsgs_Dropped() {
        return msgs_Dropped;
    }

    public void setMsgs_Dropped(int msgs_DroppedParam) {
        this.msgs_Dropped = msgs_DroppedParam;
    }

    @DdlField(Version = "2.0", QualName = "msg-drop-rate", ObjectClass = 1, Level = 2, Structure = 4, Offset = 342, ElementSize = 4, IdentifierElement = 14)
    public int getMsg_Drop_Rate() {
        return msg_Drop_Rate;
    }

    public void setMsg_Drop_Rate(int msg_Drop_RateParam) {
        this.msg_Drop_Rate = msg_Drop_RateParam;
    }

    @DdlField(Version = "2.0", QualName = "fail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 346, ElementSize = 2, IdentifierElement = 15)
    public short getFail() {
        return fail;
    }

    public void setFail(short failParam) {
        this.fail = failParam;
    }

}
