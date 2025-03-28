
package kr.co.kcs.oncf.ncp_lex_struct.dynamic_var1;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "dynamic-area", ElementSize = 2, LocalName = "dynamic-area")
public class Dynamic_Area
    implements Serializable, Dynamic_Area_SMarker
{

    private short[] dynamic_Area = new short[ 1900 ] ;

    @DdlField(Version = "2.0", QualName = "dynamic-area", ObjectClass = 1, Level = 2, Structure = 2, Offset = 212, ElementSize = 2, IdentifierElement = 38, OccursMax = 1900)
    public short[] getDynamic_Area() {
        return dynamic_Area;
    }

    @DdlField(Version = "2.0", QualName = "dynamic-area", ObjectClass = 1, Level = 2, Structure = 2, Offset = 212, ElementSize = 2, IdentifierElement = 38, OccursMax = 1900)
    public short getDynamic_Area(int index) {
        return (dynamic_Area[index]);
    }

    public void setDynamic_Area(short[] dynamic_AreaParam) {
        this.dynamic_Area = dynamic_AreaParam;
    }

    public void setDynamic_Area(int index, short dynamic_AreaParam) {
        this.dynamic_Area[index]=dynamic_AreaParam;
    }

}
