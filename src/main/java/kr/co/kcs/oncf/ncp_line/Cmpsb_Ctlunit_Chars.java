
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cmpsb-ctlunit-chars", ElementSize = 2, LocalName = "cmpsb-ctlunit-chars")
public class Cmpsb_Ctlunit_Chars
    implements Serializable, Ctlunit_CharactersMarker
{

    private short cmpsb_Ctlunit_Chars;

    @DdlField(Version = "2.0", QualName = "cmpsb-ctlunit-chars", ObjectClass = 1, Level = 1, Structure = 2, Offset = 122, ElementSize = 2, IdentifierElement = 50)
    public short getCmpsb_Ctlunit_Chars() {
        return cmpsb_Ctlunit_Chars;
    }

    public void setCmpsb_Ctlunit_Chars(short cmpsb_Ctlunit_CharsParam) {
        this.cmpsb_Ctlunit_Chars = cmpsb_Ctlunit_CharsParam;
    }

}
