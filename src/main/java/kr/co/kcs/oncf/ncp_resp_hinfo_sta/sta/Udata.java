
package kr.co.kcs.oncf.ncp_resp_hinfo_sta.sta;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_hinfo_sta.sta.udata.Data_SMarker;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

@DdlGroup(Version = "2.0", QualName = "udata", ElementSize = 202, LocalName = "udata")
public class Udata
    implements Serializable
{

    private short bytelen;
    private Data_SMarker data_S;

    @DdlField(Version = "2.0", QualName = "bytelen", ObjectClass = 1, Level = 3, Structure = 2, Offset = 360, ElementSize = 2, IdentifierElement = 34)
    public short getBytelen() {
        return bytelen;
    }

    public void setBytelen(short bytelenParam) {
        this.bytelen = bytelenParam;
    }

    @DdlField(Version = "2.0", QualName = "data-s", ObjectClass = 1, Level = 3, Structure = 0, Offset = 362, ElementSize = 200, IdentifierElement = 35)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_hinfo_sta.sta.udata.Data_S")
    public Data_SMarker getData_S() {
        return data_S;
    }

    public void setData_S(Data_SMarker data_SParam) {
        this.data_S = data_SParam;
    }

}
