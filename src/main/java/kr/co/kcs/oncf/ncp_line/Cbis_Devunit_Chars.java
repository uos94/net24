
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cbis-devunit-chars", ElementSize = 2, LocalName = "cbis-devunit-chars")
public class Cbis_Devunit_Chars
    implements Serializable, Devunit_CharactersMarker
{

    private short cbis_Devunit_Chars;

    @DdlField(Version = "2.0", QualName = "cbis-devunit-chars", ObjectClass = 1, Level = 1, Structure = 2, Offset = 124, ElementSize = 2, IdentifierElement = 55)
    public short getCbis_Devunit_Chars() {
        return cbis_Devunit_Chars;
    }

    public void setCbis_Devunit_Chars(short cbis_Devunit_CharsParam) {
        this.cbis_Devunit_Chars = cbis_Devunit_CharsParam;
    }

}
