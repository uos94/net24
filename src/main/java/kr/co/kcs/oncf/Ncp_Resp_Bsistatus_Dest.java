
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_bsistatus_dest.Providers;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-bsistatus-dest", ElementSize = 3276, LocalName = "ncp-resp-bsistatus-dest")
public class Ncp_Resp_Bsistatus_Dest
    implements Serializable
{

    private String symbolic_Name;
    private short num_Providers;
    private Providers[] providers = new Providers[ 9 ] ;

    @DdlField(Version = "2.0", QualName = "symbolic-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 1)
    public String getSymbolic_Name() {
        return symbolic_Name;
    }

    public void setSymbolic_Name(String symbolic_NameParam) {
        this.symbolic_Name = symbolic_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "num-providers", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 2)
    public short getNum_Providers() {
        return num_Providers;
    }

    public void setNum_Providers(short num_ProvidersParam) {
        this.num_Providers = num_ProvidersParam;
    }

    @DdlField(Version = "2.0", QualName = "providers", ObjectClass = 0, Level = 1, Structure = 0, Offset = 18, ElementSize = 362, IdentifierElement = 3, OccursMax = 9)
    public Providers[] getProviders() {
        return providers;
    }

    @DdlField(Version = "2.0", QualName = "providers", ObjectClass = 0, Level = 1, Structure = 0, Offset = 18, ElementSize = 362, IdentifierElement = 3, OccursMax = 9)
    public Providers getProviders(int index) {
        return (providers[index]);
    }

    public void setProviders(Providers[] providersParam) {
        this.providers = providersParam;
    }

    public void setProviders(int index, Providers providersParam) {
        this.providers[index]=providersParam;
    }

}
