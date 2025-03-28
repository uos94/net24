
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "lu62i-lin-type", ElementSize = 2, LocalName = "lu62i-lin-type")
public class Lu62i_Lin_Type
    implements Serializable, Lin_TypeMarker
{

    private short lu62i_Lin_Type;

    @DdlField(Version = "2.0", QualName = "lu62i-lin-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 144, ElementSize = 2, IdentifierElement = 96)
    public short getLu62i_Lin_Type() {
        return lu62i_Lin_Type;
    }

    public void setLu62i_Lin_Type(short lu62i_Lin_TypeParam) {
        this.lu62i_Lin_Type = lu62i_Lin_TypeParam;
    }

}
