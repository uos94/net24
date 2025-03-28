
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x25-dsp-poll-address", ElementSize = 8, LocalName = "x25-dsp-poll-address")
public class X25_Dsp_Poll_Address
    implements Serializable, Poll_AddressMarker
{

    private String x25_Dsp_Poll_Address;

    @DdlField(Version = "2.0", QualName = "x25-dsp-poll-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 194, ElementSize = 8, IdentifierElement = 48)
    public String getX25_Dsp_Poll_Address() {
        return x25_Dsp_Poll_Address;
    }

    public void setX25_Dsp_Poll_Address(String x25_Dsp_Poll_AddressParam) {
        this.x25_Dsp_Poll_Address = x25_Dsp_Poll_AddressParam;
    }

}
