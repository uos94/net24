
package kr.co.kcs.oncf.ncp_resp_struct;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "resp-data-s", ElementSize = 3718, LocalName = "resp-data-s")
public class Resp_Data_S
    implements Serializable, Resp_Data_SMarker
{

    private String resp_Data_S;

    @DdlField(Version = "2.0", QualName = "resp-data-s", ObjectClass = 1, Level = 1, Structure = 0, Offset = 72, ElementSize = 3718, IdentifierElement = 9, ValidationPattern = "\\p{Sc}{0,3718}")
    public String getResp_Data_S() {
        return resp_Data_S;
    }

    public void setResp_Data_S(String resp_Data_SParam) {
        this.resp_Data_S = resp_Data_SParam;
    }

}
