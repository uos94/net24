
package kr.co.kcs.oncf.ncp_resp_deststatus_sys;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "dests32", ElementSize = 8, LocalName = "dests32")
public class Dests32
    implements Serializable
{

    private int queue32;
    private int object_Queue32;

    @DdlField(Version = "2.0", QualName = "queue32", ObjectClass = 1, Level = 2, Structure = 4, Offset = 1150, ElementSize = 4, IdentifierElement = 17)
    public int getQueue32() {
        return queue32;
    }

    public void setQueue32(int queue32Param) {
        this.queue32 = queue32Param;
    }

    @DdlField(Version = "2.0", QualName = "object-queue32", ObjectClass = 1, Level = 2, Structure = 4, Offset = 1154, ElementSize = 4, IdentifierElement = 18)
    public int getObject_Queue32() {
        return object_Queue32;
    }

    public void setObject_Queue32(int object_Queue32Param) {
        this.object_Queue32 = object_Queue32Param;
    }

}
