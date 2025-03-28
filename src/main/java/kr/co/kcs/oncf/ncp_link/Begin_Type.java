
package kr.co.kcs.oncf.ncp_link;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "begin-type", ElementSize = 2, LocalName = "begin-type")
public class Begin_Type
    implements Serializable, Begin_TypeMarker
{

    private short begin_Type;

    @DdlField(Version = "2.0", QualName = "begin-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 3)
    public short getBegin_Type() {
        return begin_Type;
    }

    public void setBegin_Type(short begin_TypeParam) {
        this.begin_Type = begin_TypeParam;
    }

}
