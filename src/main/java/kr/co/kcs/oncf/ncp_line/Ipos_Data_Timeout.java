
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ipos-data-timeout", ElementSize = 2, LocalName = "ipos-data-timeout")
public class Ipos_Data_Timeout
    implements Serializable, Data_TimeoutMarker
{

    private short ipos_Data_Timeout;

    @DdlField(Version = "2.0", QualName = "ipos-data-timeout", ObjectClass = 1, Level = 1, Structure = 2, Offset = 326, ElementSize = 2, IdentifierElement = 192)
    public short getIpos_Data_Timeout() {
        return ipos_Data_Timeout;
    }

    public void setIpos_Data_Timeout(short ipos_Data_TimeoutParam) {
        this.ipos_Data_Timeout = ipos_Data_TimeoutParam;
    }

}
