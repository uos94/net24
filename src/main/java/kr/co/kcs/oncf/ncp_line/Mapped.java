
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "mapped", ElementSize = 2, LocalName = "mapped")
public class Mapped
    implements Serializable, MappedMarker
{

    private short mapped;

    @DdlField(Version = "2.0", QualName = "mapped", ObjectClass = 1, Level = 1, Structure = 2, Offset = 158, ElementSize = 2, IdentifierElement = 105)
    public short getMapped() {
        return mapped;
    }

    public void setMapped(short mappedParam) {
        this.mapped = mappedParam;
    }

}
