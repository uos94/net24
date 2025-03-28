
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-control-dest", ElementSize = 32, LocalName = "ncp-req-control-dest")
public class Ncp_Req_Control_Dest
    implements Serializable
{

    private String control_Val_Symname;
    private String control_Val_Link;

    @DdlField(Version = "2.0", QualName = "control-val-symname", ObjectClass = 1, Level = 1, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 1)
    public String getControl_Val_Symname() {
        return control_Val_Symname;
    }

    public void setControl_Val_Symname(String control_Val_SymnameParam) {
        this.control_Val_Symname = control_Val_SymnameParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-link", ObjectClass = 1, Level = 1, Structure = 0, Offset = 16, ElementSize = 16, IdentifierElement = 2)
    public String getControl_Val_Link() {
        return control_Val_Link;
    }

    public void setControl_Val_Link(String control_Val_LinkParam) {
        this.control_Val_Link = control_Val_LinkParam;
    }

}
