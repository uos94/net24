
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-alter-int-big", ElementSize = 4, LocalName = "ncp-req-alter-int-big")
public class Ncp_Req_Alter_Int_Big
    implements Serializable
{

    private int ncp_Req_Alter_Int_Big;

    @DdlField(Version = "2.0", QualName = "ncp-req-alter-int-big", ObjectClass = 1, Level = 0, Structure = 4, Offset = 0, ElementSize = 4, IdentifierElement = 0)
    public int getNcp_Req_Alter_Int_Big() {
        return ncp_Req_Alter_Int_Big;
    }

    public void setNcp_Req_Alter_Int_Big(int ncp_Req_Alter_Int_BigParam) {
        this.ncp_Req_Alter_Int_Big = ncp_Req_Alter_Int_BigParam;
    }

}
