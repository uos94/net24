
package kr.co.kcs.oncf.ncp_filter_attr;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "attr-data", ElementSize = 2, LocalName = "attr-data")
public class Attr_Data
    implements Serializable, Attr_Data_SMarker
{

    private short[] attr_Data = new short[ 150 ] ;

    @DdlField(Version = "2.0", QualName = "attr-data", ObjectClass = 1, Level = 1, Structure = 2, Offset = 20, ElementSize = 2, IdentifierElement = 8, OccursMax = 150)
    public short[] getAttr_Data() {
        return attr_Data;
    }

    @DdlField(Version = "2.0", QualName = "attr-data", ObjectClass = 1, Level = 1, Structure = 2, Offset = 20, ElementSize = 2, IdentifierElement = 8, OccursMax = 150)
    public short getAttr_Data(int index) {
        return (attr_Data[index]);
    }

    public void setAttr_Data(short[] attr_DataParam) {
        this.attr_Data = attr_DataParam;
    }

    public void setAttr_Data(int index, short attr_DataParam) {
        this.attr_Data[index]=attr_DataParam;
    }

}
