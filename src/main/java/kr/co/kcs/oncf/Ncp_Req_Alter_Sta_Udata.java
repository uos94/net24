
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_req_alter_sta_udata.Userdata;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-alter-sta-udata", ElementSize = 220, LocalName = "ncp-req-alter-sta-udata")
public class Ncp_Req_Alter_Sta_Udata
    implements Serializable
{

    private Userdata userdata;

    @DdlField(Version = "2.0", QualName = "userdata", ObjectClass = 0, Level = 1, Structure = 0, Offset = 0, ElementSize = 220, IdentifierElement = 1)
    public Userdata getUserdata() {
        return userdata;
    }

    public void setUserdata(Userdata userdataParam) {
        this.userdata = userdataParam;
    }

}
