
package kr.co.kcs.oncf.ncp_resp_hinfo_sta.sta.udata;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "data-s", ElementSize = 200, LocalName = "data-s")
public class Data_S
    implements Serializable, Data_SMarker
{

    private String data_S;

    @DdlField(Version = "2.0", QualName = "data-s", ObjectClass = 1, Level = 3, Structure = 0, Offset = 362, ElementSize = 200, IdentifierElement = 35)
    public String getData_S() {
        return data_S;
    }

    public void setData_S(String data_SParam) {
        this.data_S = data_SParam;
    }

}
