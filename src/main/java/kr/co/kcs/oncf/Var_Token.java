
package kr.co.kcs.oncf;

import java.io.Serializable;

import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "var-token", ElementSize = 3800, LocalName = "var-token")
public class Var_Token
    implements Serializable
{

    private short var_Ttl_Lgth;
    private short var_Typ;
    private short var_Data_Lgth;
    private Ncp_Resp_Struct var_Data_S;

    @DdlField(Version = "2.0", QualName = "var-ttl-lgth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getVar_Ttl_Lgth() {
        return var_Ttl_Lgth;
    }

    public void setVar_Ttl_Lgth(short var_Ttl_LgthParam) {
        this.var_Ttl_Lgth = var_Ttl_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "var-typ", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getVar_Typ() {
        return var_Typ;
    }

    public void setVar_Typ(short var_TypParam) {
        this.var_Typ = var_TypParam;
    }

    @DdlField(Version = "2.0", QualName = "var-data-lgth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 3)
    public short getVar_Data_Lgth() {
        return var_Data_Lgth;
    }

    public void setVar_Data_Lgth(short var_Data_LgthParam) {
        this.var_Data_Lgth = var_Data_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "var-data-s", ObjectClass = 1, Level = 1, Structure = 0, Offset = 6, ElementSize = 3794, IdentifierElement = 4, ValidationPattern = "\\p{Sc}{0,3794}")
    public Ncp_Resp_Struct getVar_Data_S() {
        return var_Data_S;
    }

    public void setVar_Data_S(Ncp_Resp_Struct var_Data_SParam) {
        this.var_Data_S = var_Data_SParam;
    }

}
