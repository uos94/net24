
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "nc279-devunit-chars", ElementSize = 2, LocalName = "nc279-devunit-chars")
public class Nc279_Devunit_Chars
    implements Serializable, Devunit_CharactersMarker
{

    private short nc279_Devunit_Chars;

    @DdlField(Version = "2.0", QualName = "nc279-devunit-chars", ObjectClass = 1, Level = 1, Structure = 2, Offset = 124, ElementSize = 2, IdentifierElement = 57)
    public short getNc279_Devunit_Chars() {
        return nc279_Devunit_Chars;
    }

    public void setNc279_Devunit_Chars(short nc279_Devunit_CharsParam) {
        this.nc279_Devunit_Chars = nc279_Devunit_CharsParam;
    }

}
