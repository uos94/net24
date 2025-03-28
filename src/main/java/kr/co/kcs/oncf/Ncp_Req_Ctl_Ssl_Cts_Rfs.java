
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-ctl-ssl-cts-rfs", ElementSize = 64, LocalName = "ncp-req-ctl-ssl-cts-rfs")
public class Ncp_Req_Ctl_Ssl_Cts_Rfs
    implements Serializable
{

    private String cert_Filename;
    private String fil130721_1636;
    private String cert_Pwd;

    @DdlField(Version = "2.0", QualName = "cert-filename", ObjectClass = 1, Level = 1, Structure = 0, Offset = 0, ElementSize = 47, IdentifierElement = 1)
    public String getCert_Filename() {
        return cert_Filename;
    }

    public void setCert_Filename(String cert_FilenameParam) {
        this.cert_Filename = cert_FilenameParam;
    }

    @DdlField(Version = "2.0", QualName = "fil130721-1636", ObjectClass = 1, Level = 1, Structure = 0, Offset = 47, ElementSize = 1, IdentifierElement = 2)
    public String getFil130721_1636() {
        return fil130721_1636;
    }

    public void setFil130721_1636(String fil130721_1636Param) {
        this.fil130721_1636 = fil130721_1636Param;
    }

    @DdlField(Version = "2.0", QualName = "cert-pwd", ObjectClass = 1, Level = 1, Structure = 0, Offset = 48, ElementSize = 16, IdentifierElement = 3)
    public String getCert_Pwd() {
        return cert_Pwd;
    }

    public void setCert_Pwd(String cert_PwdParam) {
        this.cert_Pwd = cert_PwdParam;
    }

}
