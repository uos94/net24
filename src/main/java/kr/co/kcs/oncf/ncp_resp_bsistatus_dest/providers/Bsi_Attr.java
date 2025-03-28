
package kr.co.kcs.oncf.ncp_resp_bsistatus_dest.providers;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bsi-attr", ElementSize = 100, LocalName = "bsi-attr")
public class Bsi_Attr
    implements Serializable, Bsi_Attr_DataMarker
{

    private String attr_1;
    private String attr_2;

    @DdlField(Version = "2.0", QualName = "attr-1", ObjectClass = 1, Level = 3, Structure = 0, Offset = 280, ElementSize = 50, IdentifierElement = 21)
    public String getAttr_1() {
        return attr_1;
    }

    public void setAttr_1(String attr_1Param) {
        this.attr_1 = attr_1Param;
    }

    @DdlField(Version = "2.0", QualName = "attr-2", ObjectClass = 1, Level = 3, Structure = 0, Offset = 330, ElementSize = 50, IdentifierElement = 22)
    public String getAttr_2() {
        return attr_2;
    }

    public void setAttr_2(String attr_2Param) {
        this.attr_2 = attr_2Param;
    }

}
