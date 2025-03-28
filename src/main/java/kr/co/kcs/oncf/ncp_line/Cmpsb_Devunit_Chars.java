
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cmpsb-devunit-chars", ElementSize = 2, LocalName = "cmpsb-devunit-chars")
public class Cmpsb_Devunit_Chars
    implements Serializable, Devunit_CharactersMarker
{

    private short cmpsb_Devunit_Chars;

    @DdlField(Version = "2.0", QualName = "cmpsb-devunit-chars", ObjectClass = 1, Level = 1, Structure = 2, Offset = 124, ElementSize = 2, IdentifierElement = 56)
    public short getCmpsb_Devunit_Chars() {
        return cmpsb_Devunit_Chars;
    }

    public void setCmpsb_Devunit_Chars(short cmpsb_Devunit_CharsParam) {
        this.cmpsb_Devunit_Chars = cmpsb_Devunit_CharsParam;
    }

}
