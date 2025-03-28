
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-control-disc-obj", ElementSize = 16, LocalName = "ncp-req-control-disc-obj")
public class Ncp_Req_Control_Disc_Obj
    implements Serializable
{

    private String ncp_Req_Control_Disc_Obj;

    @DdlField(Version = "2.0", QualName = "ncp-req-control-disc-obj", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 0)
    public String getNcp_Req_Control_Disc_Obj() {
        return ncp_Req_Control_Disc_Obj;
    }

    public void setNcp_Req_Control_Disc_Obj(String ncp_Req_Control_Disc_ObjParam) {
        this.ncp_Req_Control_Disc_Obj = ncp_Req_Control_Disc_ObjParam;
    }

}
