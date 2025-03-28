
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-ctrl-qpro-qwr", ElementSize = 4, LocalName = "ncp-resp-ctrl-qpro-qwr")
public class Ncp_Resp_Ctrl_Qpro_Qwr
    implements Serializable
{

    private short count_Var1;
    private short total_Count;

    @DdlField(Version = "2.0", QualName = "count-var1", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getCount_Var1() {
        return count_Var1;
    }

    public void setCount_Var1(short count_Var1Param) {
        this.count_Var1 = count_Var1Param;
    }

    @DdlField(Version = "2.0", QualName = "total-count", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getTotal_Count() {
        return total_Count;
    }

    public void setTotal_Count(short total_CountParam) {
        this.total_Count = total_CountParam;
    }

}
