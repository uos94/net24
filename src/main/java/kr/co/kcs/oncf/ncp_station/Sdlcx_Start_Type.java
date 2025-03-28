
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "sdlcx-start-type", ElementSize = 2, LocalName = "sdlcx-start-type")
public class Sdlcx_Start_Type
    implements Serializable, Start_TypeMarker
{

    private short sdlcx_Start_Type;

    @DdlField(Version = "2.0", QualName = "sdlcx-start-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 210, ElementSize = 2, IdentifierElement = 61)
    public short getSdlcx_Start_Type() {
        return sdlcx_Start_Type;
    }

    public void setSdlcx_Start_Type(short sdlcx_Start_TypeParam) {
        this.sdlcx_Start_Type = sdlcx_Start_TypeParam;
    }

}
