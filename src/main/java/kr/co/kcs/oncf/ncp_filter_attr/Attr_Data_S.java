
package kr.co.kcs.oncf.ncp_filter_attr;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "attr-data-s", ElementSize = 300, LocalName = "attr-data-s")
public class Attr_Data_S
    implements Serializable, Attr_Data_SMarker
{

    private String attr_Data_S;

    @DdlField(Version = "2.0", QualName = "attr-data-s", ObjectClass = 1, Level = 1, Structure = 0, Offset = 20, ElementSize = 300, IdentifierElement = 7, ValidationPattern = "\\p{Sc}{0,300}")
    public String getAttr_Data_S() {
        return attr_Data_S;
    }

    public void setAttr_Data_S(String attr_Data_SParam) {
        this.attr_Data_S = attr_Data_SParam;
    }

}
