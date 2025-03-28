
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-alter-uint-big", ElementSize = 4, LocalName = "ncp-req-alter-uint-big")
public class Ncp_Req_Alter_Uint_Big
    implements Serializable
{

    private int ncp_Req_Alter_Uint_Big;

    @DdlField(Version = "2.0", QualName = "ncp-req-alter-uint-big", ObjectClass = 1, Level = 0, Structure = 5, Offset = 0, ElementSize = 4, IdentifierElement = 0)
    public int getNcp_Req_Alter_Uint_Big() {
        return ncp_Req_Alter_Uint_Big;
    }

    public void setNcp_Req_Alter_Uint_Big(int ncp_Req_Alter_Uint_BigParam) {
        this.ncp_Req_Alter_Uint_Big = ncp_Req_Alter_Uint_BigParam;
    }

}
