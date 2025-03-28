
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-filter-under-device", ElementSize = 16, LocalName = "ncp-filter-under-device")
public class Ncp_Filter_Under_Device
    implements Serializable
{

    private String ncp_Filter_Under_Device;

    @DdlField(Version = "2.0", QualName = "ncp-filter-under-device", ObjectClass = 1, Level = 0, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 0)
    public String getNcp_Filter_Under_Device() {
        return ncp_Filter_Under_Device;
    }

    public void setNcp_Filter_Under_Device(String ncp_Filter_Under_DeviceParam) {
        this.ncp_Filter_Under_Device = ncp_Filter_Under_DeviceParam;
    }

}
