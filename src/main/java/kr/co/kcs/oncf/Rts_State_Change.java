
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "rts-state-change", ElementSize = 4, LocalName = "rts-state-change")
public class Rts_State_Change
    implements Serializable
{

    private short cur_State;
    private short prev_State;

    @DdlField(Version = "2.0", QualName = "cur-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getCur_State() {
        return cur_State;
    }

    public void setCur_State(short cur_StateParam) {
        this.cur_State = cur_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "prev-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getPrev_State() {
        return prev_State;
    }

    public void setPrev_State(short prev_StateParam) {
        this.prev_State = prev_StateParam;
    }

}
