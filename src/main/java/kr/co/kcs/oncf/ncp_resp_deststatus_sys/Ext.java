
package kr.co.kcs.oncf.ncp_resp_deststatus_sys;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ext", ElementSize = 2, LocalName = "ext")
public class Ext
    implements Serializable
{

    private short fail;

    @DdlField(Version = "2.0", QualName = "fail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1110, ElementSize = 2, IdentifierElement = 15)
    public short getFail() {
        return fail;
    }

    public void setFail(short failParam) {
        this.fail = failParam;
    }

}
