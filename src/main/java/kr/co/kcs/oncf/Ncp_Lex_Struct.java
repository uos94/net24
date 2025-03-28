
package kr.co.kcs.oncf;

import java.io.Serializable;

import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-lex-struct", ElementSize = 4012, LocalName = "ncp-lex-struct")
public class Ncp_Lex_Struct
    implements Serializable
{

    private Ncp_Lex_Struct_Static statics;
    private short dynamic_Area_Lgth;
    private Var_Token dynamic_Var1;

    @DdlField(Version = "2.0", QualName = "static", ObjectClass = 0, Level = 1, Structure = 0, Offset = 0, ElementSize = 210, IdentifierElement = 1)
    public Ncp_Lex_Struct_Static getStatic() {
        return statics;
    }

    public void setStatic(Ncp_Lex_Struct_Static staticParam) {
        this.statics = staticParam;
    }

    @DdlField(Version = "2.0", QualName = "dynamic-area-lgth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 210, ElementSize = 2, IdentifierElement = 35)
    public short getDynamic_Area_Lgth() {
        return dynamic_Area_Lgth;
    }

    public void setDynamic_Area_Lgth(short dynamic_Area_LgthParam) {
        this.dynamic_Area_Lgth = dynamic_Area_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "dynamic-var1", ObjectClass = 0, Level = 1, Structure = 0, Offset = 212, ElementSize = 3800, IdentifierElement = 36)
    public Var_Token getDynamic_Var1() {
        return dynamic_Var1;
    }

    public void setDynamic_Var1(Var_Token dynamic_Var1Param) {
        this.dynamic_Var1 = dynamic_Var1Param;
    }

}
