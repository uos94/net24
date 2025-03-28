
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-wrn-obj-in-st", ElementSize = 2, LocalName = "ncp-resp-wrn-obj-in-st")
public class Ncp_Resp_Wrn_Obj_In_St
    implements Serializable
{

    private short ncp_Resp_Wrn_Obj_In_St;

    @DdlField(Version = "2.0", QualName = "ncp-resp-wrn-obj-in-st", ObjectClass = 1, Level = 0, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 0)
    public short getNcp_Resp_Wrn_Obj_In_St() {
        return ncp_Resp_Wrn_Obj_In_St;
    }

    public void setNcp_Resp_Wrn_Obj_In_St(short ncp_Resp_Wrn_Obj_In_StParam) {
        this.ncp_Resp_Wrn_Obj_In_St = ncp_Resp_Wrn_Obj_In_StParam;
    }

}
