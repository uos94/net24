
package kr.co.kcs.oncf.ncp_lex_struct_static;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "end-user-id", ElementSize = 32, LocalName = "end-user-id")
public class End_User_Id
    implements Serializable
{

    private String user;
    private String sess_Id;

    @DdlField(Version = "2.0", QualName = "user", ObjectClass = 1, Level = 2, Structure = 0, Offset = 38, ElementSize = 16, IdentifierElement = 8)
    public String getUser() {
        return user;
    }

    public void setUser(String userParam) {
        this.user = userParam;
    }

    @DdlField(Version = "2.0", QualName = "sess-id", ObjectClass = 1, Level = 2, Structure = 0, Offset = 54, ElementSize = 16, IdentifierElement = 9)
    public String getSess_Id() {
        return sess_Id;
    }

    public void setSess_Id(String sess_IdParam) {
        this.sess_Id = sess_IdParam;
    }

}
