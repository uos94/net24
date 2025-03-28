
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "x25-host-ver-dte-addr", ElementSize = 2, LocalName = "x25-host-ver-dte-addr")
public class X25_Host_Ver_Dte_Addr
    implements Serializable, Verify_Dte_AddrMarker
{

    private short x25_Host_Ver_Dte_Addr;

    @DdlField(Version = "2.0", QualName = "x25-host-ver-dte-addr", ObjectClass = 1, Level = 1, Structure = 2, Offset = 212, ElementSize = 2, IdentifierElement = 173)
    public short getX25_Host_Ver_Dte_Addr() {
        return x25_Host_Ver_Dte_Addr;
    }

    public void setX25_Host_Ver_Dte_Addr(short x25_Host_Ver_Dte_AddrParam) {
        this.x25_Host_Ver_Dte_Addr = x25_Host_Ver_Dte_AddrParam;
    }

}
