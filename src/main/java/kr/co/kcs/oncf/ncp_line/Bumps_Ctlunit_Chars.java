
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bumps-ctlunit-chars", ElementSize = 2, LocalName = "bumps-ctlunit-chars")
public class Bumps_Ctlunit_Chars
    implements Serializable, Ctlunit_CharactersMarker
{

    private short bumps_Ctlunit_Chars;

    @DdlField(Version = "2.0", QualName = "bumps-ctlunit-chars", ObjectClass = 1, Level = 1, Structure = 2, Offset = 122, ElementSize = 2, IdentifierElement = 48)
    public short getBumps_Ctlunit_Chars() {
        return bumps_Ctlunit_Chars;
    }

    public void setBumps_Ctlunit_Chars(short bumps_Ctlunit_CharsParam) {
        this.bumps_Ctlunit_Chars = bumps_Ctlunit_CharsParam;
    }

}
