
package com.aci.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "interface", ElementSize = 2, LocalName = "interface")
public class Interface
    implements Serializable, InterfaceMarker
{

    private short interface;

    @DdlField(Version = "2.0", QualName = "interface", ObjectClass = 1, Level = 1, Structure = 2, Offset = 134, ElementSize = 2, IdentifierElement = 72)
    public short getInterface() {
        return interface;
    }

    public void setInterface(short interfaceParam) {
        this.interface = interfaceParam;
    }

}
