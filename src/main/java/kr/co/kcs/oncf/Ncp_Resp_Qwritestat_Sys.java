
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_qwritestat_sys.Var_DataMarker;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-qwritestat-sys", ElementSize = 2886, LocalName = "ncp-resp-qwritestat-sys")
public class Ncp_Resp_Qwritestat_Sys
    implements Serializable
{

    private short qwrite_Id;
    private Var_DataMarker var_Data;

    @DdlField(Version = "2.0", QualName = "qwrite-id", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getQwrite_Id() {
        return qwrite_Id;
    }

    public void setQwrite_Id(short qwrite_IdParam) {
        this.qwrite_Id = qwrite_IdParam;
    }

    @DdlField(Version = "2.0", QualName = "var-data", ObjectClass = 1, Level = 1, Structure = 0, Offset = 2, ElementSize = 2884, IdentifierElement = 2)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_qwritestat_sys.Var_Data")
    public Var_DataMarker getVar_Data() {
        return var_Data;
    }

    public void setVar_Data(Var_DataMarker var_DataParam) {
        this.var_Data = var_DataParam;
    }

}
