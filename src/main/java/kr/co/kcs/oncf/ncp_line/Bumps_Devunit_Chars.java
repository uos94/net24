
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bumps-devunit-chars", ElementSize = 2, LocalName = "bumps-devunit-chars")
public class Bumps_Devunit_Chars
    implements Serializable, Devunit_CharactersMarker
{

    private short bumps_Devunit_Chars;

    @DdlField(Version = "2.0", QualName = "bumps-devunit-chars", ObjectClass = 1, Level = 1, Structure = 2, Offset = 124, ElementSize = 2, IdentifierElement = 54)
    public short getBumps_Devunit_Chars() {
        return bumps_Devunit_Chars;
    }

    public void setBumps_Devunit_Chars(short bumps_Devunit_CharsParam) {
        this.bumps_Devunit_Chars = bumps_Devunit_CharsParam;
    }

}
