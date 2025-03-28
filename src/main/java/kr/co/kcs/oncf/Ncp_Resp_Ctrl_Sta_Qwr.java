
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-ctrl-sta-qwr", ElementSize = 12, LocalName = "ncp-resp-ctrl-sta-qwr")
public class Ncp_Resp_Ctrl_Sta_Qwr
    implements Serializable
{

    private short count_Var1;
    private short total_Count;
    private int count32;
    private int total_Count32;

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

    @DdlField(Version = "2.0", QualName = "count32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 4, ElementSize = 4, IdentifierElement = 3)
    public int getCount32() {
        return count32;
    }

    public void setCount32(int count32Param) {
        this.count32 = count32Param;
    }

    @DdlField(Version = "2.0", QualName = "total-count32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 8, ElementSize = 4, IdentifierElement = 4)
    public int getTotal_Count32() {
        return total_Count32;
    }

    public void setTotal_Count32(int total_Count32Param) {
        this.total_Count32 = total_Count32Param;
    }

}
