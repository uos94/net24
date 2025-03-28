
package kr.co.kcs.oncf.ncp_resp_bsistatus_dest.providers;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bsi-srv", ElementSize = 80, LocalName = "bsi-srv")
public class Bsi_Srv
    implements Serializable, Bsi_Service_NameMarker
{

    private String serv_1;
    private String serv_2;

    @DdlField(Version = "2.0", QualName = "serv-1", ObjectClass = 1, Level = 3, Structure = 0, Offset = 190, ElementSize = 40, IdentifierElement = 14)
    public String getServ_1() {
        return serv_1;
    }

    public void setServ_1(String serv_1Param) {
        this.serv_1 = serv_1Param;
    }

    @DdlField(Version = "2.0", QualName = "serv-2", ObjectClass = 1, Level = 3, Structure = 0, Offset = 230, ElementSize = 40, IdentifierElement = 15)
    public String getServ_2() {
        return serv_2;
    }

    public void setServ_2(String serv_2Param) {
        this.serv_2 = serv_2Param;
    }

}
