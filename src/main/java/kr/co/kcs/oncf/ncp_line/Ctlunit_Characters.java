
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ctlunit-characters", ElementSize = 2, LocalName = "ctlunit-characters")
public class Ctlunit_Characters
    implements Serializable, Ctlunit_CharactersMarker
{

    private short ctlunit_Characters;

    @DdlField(Version = "2.0", QualName = "ctlunit-characters", ObjectClass = 1, Level = 1, Structure = 2, Offset = 122, ElementSize = 2, IdentifierElement = 46)
    public short getCtlunit_Characters() {
        return ctlunit_Characters;
    }

    public void setCtlunit_Characters(short ctlunit_CharactersParam) {
        this.ctlunit_Characters = ctlunit_CharactersParam;
    }

}
