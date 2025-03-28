
package kr.co.kcs.oncf.ncp_resp_deststatus_sys;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ctx", ElementSize = 304, LocalName = "ctx")
public class Ctx
    implements Serializable
{

    private String last_Dest_Found;
    private short[] pattern_State = new short[ 144 ] ;

    @DdlField(Version = "2.0", QualName = "last-dest-found", ObjectClass = 1, Level = 2, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 2)
    public String getLast_Dest_Found() {
        return last_Dest_Found;
    }

    public void setLast_Dest_Found(String last_Dest_FoundParam) {
        this.last_Dest_Found = last_Dest_FoundParam;
    }

    @DdlField(Version = "2.0", QualName = "pattern-state", ObjectClass = 1, Level = 2, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 3, OccursMax = 144)
    public short[] getPattern_State() {
        return pattern_State;
    }

    @DdlField(Version = "2.0", QualName = "pattern-state", ObjectClass = 1, Level = 2, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 3, OccursMax = 144)
    public short getPattern_State(int index) {
        return (pattern_State[index]);
    }

    public void setPattern_State(short[] pattern_StateParam) {
        this.pattern_State = pattern_StateParam;
    }

    public void setPattern_State(int index, short pattern_StateParam) {
        this.pattern_State[index]=pattern_StateParam;
    }

}
