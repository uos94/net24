
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-err-obj-not-supp", ElementSize = 2, LocalName = "ncp-resp-err-obj-not-supp")
public class Ncp_Resp_Err_Obj_Not_Supp
    implements Serializable
{

    private short ncp_Resp_Err_Obj_Not_Supp;

    @DdlField(Version = "2.0", QualName = "ncp-resp-err-obj-not-supp", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Resp_Err_Obj_Not_Supp() {
        return ncp_Resp_Err_Obj_Not_Supp;
    }

    public void setNcp_Resp_Err_Obj_Not_Supp(short ncp_Resp_Err_Obj_Not_SuppParam) {
        this.ncp_Resp_Err_Obj_Not_Supp = ncp_Resp_Err_Obj_Not_SuppParam;
    }

}
