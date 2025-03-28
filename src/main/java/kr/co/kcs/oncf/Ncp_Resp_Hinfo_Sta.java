
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_hinfo_sta.Dev;
import kr.co.kcs.oncf.ncp_resp_hinfo_sta.Lin;
import kr.co.kcs.oncf.ncp_resp_hinfo_sta.Sta;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-hinfo-sta", ElementSize = 702, LocalName = "ncp-resp-hinfo-sta")
public class Ncp_Resp_Hinfo_Sta
    implements Serializable
{

    private Lin lin;
    private Sta sta;
    private Dev dev;

    @DdlField(Version = "2.0", QualName = "lin", ObjectClass = 0, Level = 1, Structure = 0, Offset = 0, ElementSize = 90, IdentifierElement = 1)
    public Lin getLin() {
        return lin;
    }

    public void setLin(Lin linParam) {
        this.lin = linParam;
    }

    @DdlField(Version = "2.0", QualName = "sta", ObjectClass = 0, Level = 1, Structure = 0, Offset = 90, ElementSize = 474, IdentifierElement = 19)
    public Sta getSta() {
        return sta;
    }

    public void setSta(Sta staParam) {
        this.sta = staParam;
    }

    @DdlField(Version = "2.0", QualName = "dev", ObjectClass = 0, Level = 1, Structure = 0, Offset = 564, ElementSize = 138, IdentifierElement = 38)
    public Dev getDev() {
        return dev;
    }

    public void setDev(Dev devParam) {
        this.dev = devParam;
    }

}
