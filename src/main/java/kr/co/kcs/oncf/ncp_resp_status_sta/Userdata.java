
package kr.co.kcs.oncf.ncp_resp_status_sta;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "userdata", ElementSize = 218, LocalName = "userdata")
public class Userdata
    implements Serializable
{

    private String reserved;
    private short bytelen;
    private String value_Var1;

    @DdlField(Version = "2.0", QualName = "reserved", ObjectClass = 1, Level = 2, Structure = 0, Offset = 22, ElementSize = 16, IdentifierElement = 18)
    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reservedParam) {
        this.reserved = reservedParam;
    }

    @DdlField(Version = "2.0", QualName = "bytelen", ObjectClass = 1, Level = 2, Structure = 2, Offset = 38, ElementSize = 2, IdentifierElement = 19)
    public short getBytelen() {
        return bytelen;
    }

    public void setBytelen(short bytelenParam) {
        this.bytelen = bytelenParam;
    }

    @DdlField(Version = "2.0", QualName = "value-var1", ObjectClass = 1, Level = 2, Structure = 0, Offset = 40, ElementSize = 200, IdentifierElement = 20)
    public String getValue_Var1() {
        return value_Var1;
    }

    public void setValue_Var1(String value_Var1Param) {
        this.value_Var1 = value_Var1Param;
    }

}
