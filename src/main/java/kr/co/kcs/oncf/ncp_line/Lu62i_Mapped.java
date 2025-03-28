
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "lu62i-mapped", ElementSize = 2, LocalName = "lu62i-mapped")
public class Lu62i_Mapped
    implements Serializable, MappedMarker
{

    private short lu62i_Mapped;

    @DdlField(Version = "2.0", QualName = "lu62i-mapped", ObjectClass = 1, Level = 1, Structure = 2, Offset = 158, ElementSize = 2, IdentifierElement = 106)
    public short getLu62i_Mapped() {
        return lu62i_Mapped;
    }

    public void setLu62i_Mapped(short lu62i_MappedParam) {
        this.lu62i_Mapped = lu62i_MappedParam;
    }

}
