
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bimps-devunit-chars", ElementSize = 2, LocalName = "bimps-devunit-chars")
public class Bimps_Devunit_Chars
    implements Serializable, Devunit_CharactersMarker
{

    private short bimps_Devunit_Chars;

    @DdlField(Version = "2.0", QualName = "bimps-devunit-chars", ObjectClass = 1, Level = 1, Structure = 2, Offset = 124, ElementSize = 2, IdentifierElement = 53)
    public short getBimps_Devunit_Chars() {
        return bimps_Devunit_Chars;
    }

    public void setBimps_Devunit_Chars(short bimps_Devunit_CharsParam) {
        this.bimps_Devunit_Chars = bimps_Devunit_CharsParam;
    }

}
