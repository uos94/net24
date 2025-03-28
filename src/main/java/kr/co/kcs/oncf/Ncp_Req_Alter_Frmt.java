
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-alter-frmt", ElementSize = 32, LocalName = "ncp-req-alter-frmt")
public class Ncp_Req_Alter_Frmt
    implements Serializable
{

    private short[] alter_Val_Frmt = new short[ 16 ] ;

    @DdlField(Version = "2.0", QualName = "alter-val-frmt", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1, OccursMax = 16)
    public short[] getAlter_Val_Frmt() {
        return alter_Val_Frmt;
    }

    @DdlField(Version = "2.0", QualName = "alter-val-frmt", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1, OccursMax = 16)
    public short getAlter_Val_Frmt(int index) {
        return (alter_Val_Frmt[index]);
    }

    public void setAlter_Val_Frmt(short[] alter_Val_FrmtParam) {
        this.alter_Val_Frmt = alter_Val_FrmtParam;
    }

    public void setAlter_Val_Frmt(int index, short alter_Val_FrmtParam) {
        this.alter_Val_Frmt[index]=alter_Val_FrmtParam;
    }

}
