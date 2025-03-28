
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "nc279-ctlunit-chars", ElementSize = 2, LocalName = "nc279-ctlunit-chars")
public class Nc279_Ctlunit_Chars
    implements Serializable, Ctlunit_CharactersMarker
{

    private short nc279_Ctlunit_Chars;

    @DdlField(Version = "2.0", QualName = "nc279-ctlunit-chars", ObjectClass = 1, Level = 1, Structure = 2, Offset = 122, ElementSize = 2, IdentifierElement = 51)
    public short getNc279_Ctlunit_Chars() {
        return nc279_Ctlunit_Chars;
    }

    public void setNc279_Ctlunit_Chars(short nc279_Ctlunit_CharsParam) {
        this.nc279_Ctlunit_Chars = nc279_Ctlunit_CharsParam;
    }

}
