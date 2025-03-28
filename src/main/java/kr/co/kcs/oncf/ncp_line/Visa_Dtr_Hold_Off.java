
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "visa-dtr-hold-off", ElementSize = 2, LocalName = "visa-dtr-hold-off")
public class Visa_Dtr_Hold_Off
    implements Serializable, A_TimerMarker
{

    private short visa_Dtr_Hold_Off;

    @DdlField(Version = "2.0", QualName = "visa-dtr-hold-off", ObjectClass = 1, Level = 1, Structure = 2, Offset = 114, ElementSize = 2, IdentifierElement = 21)
    public short getVisa_Dtr_Hold_Off() {
        return visa_Dtr_Hold_Off;
    }

    public void setVisa_Dtr_Hold_Off(short visa_Dtr_Hold_OffParam) {
        this.visa_Dtr_Hold_Off = visa_Dtr_Hold_OffParam;
    }

}
