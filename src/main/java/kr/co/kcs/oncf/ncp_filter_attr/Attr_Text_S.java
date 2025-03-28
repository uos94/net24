
package kr.co.kcs.oncf.ncp_filter_attr;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "attr-text-s", ElementSize = 80, LocalName = "attr-text-s")
public class Attr_Text_S
    implements Serializable, Attr_Text_SMarker
{

    private String attr_Text_S;

    @DdlField(Version = "2.0", QualName = "attr-text-s", ObjectClass = 1, Level = 1, Structure = 0, Offset = 322, ElementSize = 80, IdentifierElement = 10, ValidationPattern = "\\p{Sc}{0,80}")
    public String getAttr_Text_S() {
        return attr_Text_S;
    }

    public void setAttr_Text_S(String attr_Text_SParam) {
        this.attr_Text_S = attr_Text_SParam;
    }

}
