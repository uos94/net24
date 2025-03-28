
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-info-sta-udata", ElementSize = 89, LocalName = "ncp-resp-info-sta-udata")
public class Ncp_Resp_Info_Sta_Udata
    implements Serializable
{

    private short userdata_Length;
    private String userdata_Name;
    private short userdata_Elem;
    private short userdata_Resident;
    private String userdata_Value;

    @DdlField(Version = "2.0", QualName = "userdata-length", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getUserdata_Length() {
        return userdata_Length;
    }

    public void setUserdata_Length(short userdata_LengthParam) {
        this.userdata_Length = userdata_LengthParam;
    }

    @DdlField(Version = "2.0", QualName = "userdata-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 2, ElementSize = 20, IdentifierElement = 2)
    public String getUserdata_Name() {
        return userdata_Name;
    }

    public void setUserdata_Name(String userdata_NameParam) {
        this.userdata_Name = userdata_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "userdata-elem", ObjectClass = 1, Level = 1, Structure = 2, Offset = 22, ElementSize = 2, IdentifierElement = 3)
    public short getUserdata_Elem() {
        return userdata_Elem;
    }

    public void setUserdata_Elem(short userdata_ElemParam) {
        this.userdata_Elem = userdata_ElemParam;
    }

    @DdlField(Version = "2.0", QualName = "userdata-resident", ObjectClass = 1, Level = 1, Structure = 2, Offset = 24, ElementSize = 2, IdentifierElement = 4)
    public short getUserdata_Resident() {
        return userdata_Resident;
    }

    public void setUserdata_Resident(short userdata_ResidentParam) {
        this.userdata_Resident = userdata_ResidentParam;
    }

    @DdlField(Version = "2.0", QualName = "userdata-value", ObjectClass = 1, Level = 1, Structure = 0, Offset = 26, ElementSize = 63, IdentifierElement = 5)
    public String getUserdata_Value() {
        return userdata_Value;
    }

    public void setUserdata_Value(String userdata_ValueParam) {
        this.userdata_Value = userdata_ValueParam;
    }

}
