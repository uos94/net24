
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "lu62i-interface", ElementSize = 2, LocalName = "lu62i-interface")
public class Lu62i_Interface
    implements Serializable, InterfaceMarker
{

    private short lu62i_Interface;

    @DdlField(Version = "2.0", QualName = "lu62i-interface", ObjectClass = 1, Level = 1, Structure = 2, Offset = 134, ElementSize = 2, IdentifierElement = 73)
    public short getLu62i_Interface() {
        return lu62i_Interface;
    }

    public void setLu62i_Interface(short lu62i_InterfaceParam) {
        this.lu62i_Interface = lu62i_InterfaceParam;
    }

}
