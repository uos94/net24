
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bimps-ctlunit-chars", ElementSize = 2, LocalName = "bimps-ctlunit-chars")
public class Bimps_Ctlunit_Chars
    implements Serializable, Ctlunit_CharactersMarker
{

    private short bimps_Ctlunit_Chars;

    @DdlField(Version = "2.0", QualName = "bimps-ctlunit-chars", ObjectClass = 1, Level = 1, Structure = 2, Offset = 122, ElementSize = 2, IdentifierElement = 47)
    public short getBimps_Ctlunit_Chars() {
        return bimps_Ctlunit_Chars;
    }

    public void setBimps_Ctlunit_Chars(short bimps_Ctlunit_CharsParam) {
        this.bimps_Ctlunit_Chars = bimps_Ctlunit_CharsParam;
    }

}
