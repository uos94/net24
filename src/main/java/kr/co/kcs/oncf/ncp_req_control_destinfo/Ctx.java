
package kr.co.kcs.oncf.ncp_req_control_destinfo;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ctx", ElementSize = 304, LocalName = "ctx")
public class Ctx
    implements Serializable
{

    private String control_Val_Lastname;
    private short[] control_Val_Pattern_State = new short[ 144 ] ;

    @DdlField(Version = "2.0", QualName = "control-val-lastname", ObjectClass = 1, Level = 2, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 2)
    public String getControl_Val_Lastname() {
        return control_Val_Lastname;
    }

    public void setControl_Val_Lastname(String control_Val_LastnameParam) {
        this.control_Val_Lastname = control_Val_LastnameParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-pattern-state", ObjectClass = 1, Level = 2, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 3, OccursMax = 144)
    public short[] getControl_Val_Pattern_State() {
        return control_Val_Pattern_State;
    }

    @DdlField(Version = "2.0", QualName = "control-val-pattern-state", ObjectClass = 1, Level = 2, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 3, OccursMax = 144)
    public short getControl_Val_Pattern_State(int index) {
        return (control_Val_Pattern_State[index]);
    }

    public void setControl_Val_Pattern_State(short[] control_Val_Pattern_StateParam) {
        this.control_Val_Pattern_State = control_Val_Pattern_StateParam;
    }

    public void setControl_Val_Pattern_State(int index, short control_Val_Pattern_StateParam) {
        this.control_Val_Pattern_State[index]=control_Val_Pattern_StateParam;
    }

}
