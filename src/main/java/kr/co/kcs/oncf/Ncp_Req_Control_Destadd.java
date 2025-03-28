
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-control-destadd", ElementSize = 34, LocalName = "ncp-req-control-destadd")
public class Ncp_Req_Control_Destadd
    implements Serializable
{

    private short control_Val_Objtype;
    private String control_Val_Symname;
    private String control_Val_Link;

    @DdlField(Version = "2.0", QualName = "control-val-objtype", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getControl_Val_Objtype() {
        return control_Val_Objtype;
    }

    public void setControl_Val_Objtype(short control_Val_ObjtypeParam) {
        this.control_Val_Objtype = control_Val_ObjtypeParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-symname", ObjectClass = 1, Level = 1, Structure = 0, Offset = 2, ElementSize = 16, IdentifierElement = 2)
    public String getControl_Val_Symname() {
        return control_Val_Symname;
    }

    public void setControl_Val_Symname(String control_Val_SymnameParam) {
        this.control_Val_Symname = control_Val_SymnameParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-link", ObjectClass = 1, Level = 1, Structure = 0, Offset = 18, ElementSize = 16, IdentifierElement = 3)
    public String getControl_Val_Link() {
        return control_Val_Link;
    }

    public void setControl_Val_Link(String control_Val_LinkParam) {
        this.control_Val_Link = control_Val_LinkParam;
    }

}
