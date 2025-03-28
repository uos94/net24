
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-getvsn", ElementSize = 6, LocalName = "ncp-resp-getvsn")
public class Ncp_Resp_Getvsn
    implements Serializable
{

    private String ncp_Resp_Getvsn;

    @DdlField(Version = "2.0", QualName = "ncp-resp-getvsn", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 6, IdentifierElement = 0)
    public String getNcp_Resp_Getvsn() {
        return ncp_Resp_Getvsn;
    }

    public void setNcp_Resp_Getvsn(String ncp_Resp_GetvsnParam) {
        this.ncp_Resp_Getvsn = ncp_Resp_GetvsnParam;
    }

}
