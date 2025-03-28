
package kr.co.kcs.oncf.ncp_filter_attr;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "attr-text", ElementSize = 2, LocalName = "attr-text")
public class Attr_Text
    implements Serializable, Attr_Text_SMarker
{

    private short[] attr_Text = new short[ 40 ] ;

    @DdlField(Version = "2.0", QualName = "attr-text", ObjectClass = 1, Level = 1, Structure = 2, Offset = 322, ElementSize = 2, IdentifierElement = 11, OccursMax = 40)
    public short[] getAttr_Text() {
        return attr_Text;
    }

    @DdlField(Version = "2.0", QualName = "attr-text", ObjectClass = 1, Level = 1, Structure = 2, Offset = 322, ElementSize = 2, IdentifierElement = 11, OccursMax = 40)
    public short getAttr_Text(int index) {
        return (attr_Text[index]);
    }

    public void setAttr_Text(short[] attr_TextParam) {
        this.attr_Text = attr_TextParam;
    }

    public void setAttr_Text(int index, short attr_TextParam) {
        this.attr_Text[index]=attr_TextParam;
    }

}
