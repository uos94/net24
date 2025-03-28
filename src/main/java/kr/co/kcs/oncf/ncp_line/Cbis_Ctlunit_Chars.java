
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "cbis-ctlunit-chars", ElementSize = 2, LocalName = "cbis-ctlunit-chars")
public class Cbis_Ctlunit_Chars
    implements Serializable, Ctlunit_CharactersMarker
{

    private short cbis_Ctlunit_Chars;

    @DdlField(Version = "2.0", QualName = "cbis-ctlunit-chars", ObjectClass = 1, Level = 1, Structure = 2, Offset = 122, ElementSize = 2, IdentifierElement = 49)
    public short getCbis_Ctlunit_Chars() {
        return cbis_Ctlunit_Chars;
    }

    public void setCbis_Ctlunit_Chars(short cbis_Ctlunit_CharsParam) {
        this.cbis_Ctlunit_Chars = cbis_Ctlunit_CharsParam;
    }

}
