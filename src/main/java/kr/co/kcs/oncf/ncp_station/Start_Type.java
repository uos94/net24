
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "start-type", ElementSize = 2, LocalName = "start-type")
public class Start_Type
    implements Serializable, Start_TypeMarker
{

    private short start_Type;

    @DdlField(Version = "2.0", QualName = "start-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 210, ElementSize = 2, IdentifierElement = 60)
    public short getStart_Type() {
        return start_Type;
    }

    public void setStart_Type(short start_TypeParam) {
        this.start_Type = start_TypeParam;
    }

}
