
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-cmd-inv-for-obj-st", ElementSize = 4, LocalName = "ncp-resp-cmd-inv-for-obj-st")
public class Ncp_Resp_Cmd_Inv_For_Obj_St
    implements Serializable
{

    private short reason;
    private short type_Var1;

    @DdlField(Version = "2.0", QualName = "reason", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getReason() {
        return reason;
    }

    public void setReason(short reasonParam) {
        this.reason = reasonParam;
    }

    @DdlField(Version = "2.0", QualName = "type-var1", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getType_Var1() {
        return type_Var1;
    }

    public void setType_Var1(short type_Var1Param) {
        this.type_Var1 = type_Var1Param;
    }

}
