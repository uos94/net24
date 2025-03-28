
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "data-timeout", ElementSize = 2, LocalName = "data-timeout")
public class Data_Timeout
    implements Serializable, Data_TimeoutMarker
{

    private short data_Timeout;

    @DdlField(Version = "2.0", QualName = "data-timeout", ObjectClass = 1, Level = 1, Structure = 2, Offset = 326, ElementSize = 2, IdentifierElement = 191)
    public short getData_Timeout() {
        return data_Timeout;
    }

    public void setData_Timeout(short data_TimeoutParam) {
        this.data_Timeout = data_TimeoutParam;
    }

}
