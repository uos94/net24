
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-alter-dest", ElementSize = 18, LocalName = "ncp-req-alter-dest")
public class Ncp_Req_Alter_Dest
    implements Serializable
{

    private String alter_Val_Dest_Name;
    private short alter_Val_Dest_Type;

    @DdlField(Version = "2.0", QualName = "alter-val-dest-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 1)
    public String getAlter_Val_Dest_Name() {
        return alter_Val_Dest_Name;
    }

    public void setAlter_Val_Dest_Name(String alter_Val_Dest_NameParam) {
        this.alter_Val_Dest_Name = alter_Val_Dest_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "alter-val-dest-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 2)
    public short getAlter_Val_Dest_Type() {
        return alter_Val_Dest_Type;
    }

    public void setAlter_Val_Dest_Type(short alter_Val_Dest_TypeParam) {
        this.alter_Val_Dest_Type = alter_Val_Dest_TypeParam;
    }

}
