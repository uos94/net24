
package kr.co.kcs.oncf.ncp_req_alter_sta_udata;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "userdata", ElementSize = 220, LocalName = "userdata")
public class Userdata
    implements Serializable
{

    private String reserved;
    private short offset;
    private short bytelen;
    private String value_Var1;

    @DdlField(Version = "2.0", QualName = "reserved", ObjectClass = 1, Level = 2, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 2)
    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reservedParam) {
        this.reserved = reservedParam;
    }

    @DdlField(Version = "2.0", QualName = "offset", ObjectClass = 1, Level = 2, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 3)
    public short getOffset() {
        return offset;
    }

    public void setOffset(short offsetParam) {
        this.offset = offsetParam;
    }

    @DdlField(Version = "2.0", QualName = "bytelen", ObjectClass = 1, Level = 2, Structure = 2, Offset = 18, ElementSize = 2, IdentifierElement = 4)
    public short getBytelen() {
        return bytelen;
    }

    public void setBytelen(short bytelenParam) {
        this.bytelen = bytelenParam;
    }

    @DdlField(Version = "2.0", QualName = "value-var1", ObjectClass = 1, Level = 2, Structure = 0, Offset = 20, ElementSize = 200, IdentifierElement = 5)
    public String getValue_Var1() {
        return value_Var1;
    }

    public void setValue_Var1(String value_Var1Param) {
        this.value_Var1 = value_Var1Param;
    }

}
