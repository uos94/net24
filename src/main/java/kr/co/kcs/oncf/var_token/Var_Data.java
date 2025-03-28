
package kr.co.kcs.oncf.var_token;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "var-data", ElementSize = 2, LocalName = "var-data")
public class Var_Data
    implements Serializable, Var_Data_SMarker
{

    private short[] var_Data = new short[ 1897 ] ;

    @DdlField(Version = "2.0", QualName = "var-data", ObjectClass = 1, Level = 1, Structure = 2, Offset = 6, ElementSize = 2, IdentifierElement = 5, OccursMax = 1897)
    public short[] getVar_Data() {
        return var_Data;
    }

    @DdlField(Version = "2.0", QualName = "var-data", ObjectClass = 1, Level = 1, Structure = 2, Offset = 6, ElementSize = 2, IdentifierElement = 5, OccursMax = 1897)
    public short getVar_Data(int index) {
        return (var_Data[index]);
    }

    public void setVar_Data(short[] var_DataParam) {
        this.var_Data = var_DataParam;
    }

    public void setVar_Data(int index, short var_DataParam) {
        this.var_Data[index]=var_DataParam;
    }

}
