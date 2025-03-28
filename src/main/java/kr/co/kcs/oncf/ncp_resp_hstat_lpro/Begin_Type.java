
package kr.co.kcs.oncf.ncp_resp_hstat_lpro;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "begin-type", ElementSize = 2, LocalName = "begin-type")
public class Begin_Type
    implements Serializable, Begin_TypeMarker
{

    private short begin_Type;

    @DdlField(Version = "2.0", QualName = "begin-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 86, ElementSize = 2, IdentifierElement = 20)
    public short getBegin_Type() {
        return begin_Type;
    }

    public void setBegin_Type(short begin_TypeParam) {
        this.begin_Type = begin_TypeParam;
    }

}
