
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-filter-pri-range", ElementSize = 4, LocalName = "ncp-filter-pri-range")
public class Ncp_Filter_Pri_Range
    implements Serializable
{

    private short pri_Lower_Bnd;
    private short pri_Upper_Bnd;

    @DdlField(Version = "2.0", QualName = "pri-lower-bnd", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getPri_Lower_Bnd() {
        return pri_Lower_Bnd;
    }

    public void setPri_Lower_Bnd(short pri_Lower_BndParam) {
        this.pri_Lower_Bnd = pri_Lower_BndParam;
    }

    @DdlField(Version = "2.0", QualName = "pri-upper-bnd", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getPri_Upper_Bnd() {
        return pri_Upper_Bnd;
    }

    public void setPri_Upper_Bnd(short pri_Upper_BndParam) {
        this.pri_Upper_Bnd = pri_Upper_BndParam;
    }

}
