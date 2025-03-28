
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "devunit-characters", ElementSize = 2, LocalName = "devunit-characters")
public class Devunit_Characters
    implements Serializable, Devunit_CharactersMarker
{

    private short devunit_Characters;

    @DdlField(Version = "2.0", QualName = "devunit-characters", ObjectClass = 1, Level = 1, Structure = 2, Offset = 124, ElementSize = 2, IdentifierElement = 52)
    public short getDevunit_Characters() {
        return devunit_Characters;
    }

    public void setDevunit_Characters(short devunit_CharactersParam) {
        this.devunit_Characters = devunit_CharactersParam;
    }

}
