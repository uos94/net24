
package kr.co.kcs.oncf.ncp_lex_struct_static;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "fillrr1", ElementSize = 28, LocalName = "fillrr1")
public class Fillrr1
    implements Serializable, Fillrr1Marker
{

    private String fillrr1;

    @DdlField(Version = "2.0", QualName = "fillrr1", ObjectClass = 1, Level = 1, Structure = 0, Offset = 182, ElementSize = 28, IdentifierElement = 27, ValidationPattern = "\\p{Sc}{0,28}")
    public String getFillrr1() {
        return fillrr1;
    }

    public void setFillrr1(String fillrr1Param) {
        this.fillrr1 = fillrr1Param;
    }

}
