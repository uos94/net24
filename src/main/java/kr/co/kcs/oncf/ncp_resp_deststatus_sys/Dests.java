
package kr.co.kcs.oncf.ncp_resp_deststatus_sys;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "dests", ElementSize = 40, LocalName = "dests")
public class Dests
    implements Serializable
{

    private String dest_Name;
    private short type_Var1;
    private short frozen;
    private String link_Name;
    private short queue_Var1;
    private short object_Queue;

    @DdlField(Version = "2.0", QualName = "dest-name", ObjectClass = 1, Level = 2, Structure = 0, Offset = 310, ElementSize = 16, IdentifierElement = 8)
    public String getDest_Name() {
        return dest_Name;
    }

    public void setDest_Name(String dest_NameParam) {
        this.dest_Name = dest_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "type-var1", ObjectClass = 1, Level = 2, Structure = 2, Offset = 326, ElementSize = 2, IdentifierElement = 9)
    public short getType_Var1() {
        return type_Var1;
    }

    public void setType_Var1(short type_Var1Param) {
        this.type_Var1 = type_Var1Param;
    }

    @DdlField(Version = "2.0", QualName = "frozen", ObjectClass = 1, Level = 2, Structure = 2, Offset = 328, ElementSize = 2, IdentifierElement = 10)
    public short getFrozen() {
        return frozen;
    }

    public void setFrozen(short frozenParam) {
        this.frozen = frozenParam;
    }

    @DdlField(Version = "2.0", QualName = "link-name", ObjectClass = 1, Level = 2, Structure = 0, Offset = 330, ElementSize = 16, IdentifierElement = 11)
    public String getLink_Name() {
        return link_Name;
    }

    public void setLink_Name(String link_NameParam) {
        this.link_Name = link_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-var1", ObjectClass = 1, Level = 2, Structure = 2, Offset = 346, ElementSize = 2, IdentifierElement = 12)
    public short getQueue_Var1() {
        return queue_Var1;
    }

    public void setQueue_Var1(short queue_Var1Param) {
        this.queue_Var1 = queue_Var1Param;
    }

    @DdlField(Version = "2.0", QualName = "object-queue", ObjectClass = 1, Level = 2, Structure = 2, Offset = 348, ElementSize = 2, IdentifierElement = 13)
    public short getObject_Queue() {
        return object_Queue;
    }

    public void setObject_Queue(short object_QueueParam) {
        this.object_Queue = object_QueueParam;
    }

}
