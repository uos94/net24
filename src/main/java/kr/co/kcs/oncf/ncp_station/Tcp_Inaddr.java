
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "tcp-inaddr", ElementSize = 2, LocalName = "tcp-inaddr")
public class Tcp_Inaddr
    implements Serializable, Tcp_Inaddr_SMarker
{

    private short[] tcp_Inaddr = new short[ 28 ] ;

    @DdlField(Version = "2.0", QualName = "tcp-inaddr", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1004, ElementSize = 2, IdentifierElement = 133, OccursMax = 28)
    public short[] getTcp_Inaddr() {
        return tcp_Inaddr;
    }

    @DdlField(Version = "2.0", QualName = "tcp-inaddr", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1004, ElementSize = 2, IdentifierElement = 133, OccursMax = 28)
    public short getTcp_Inaddr(int index) {
        return (tcp_Inaddr[index]);
    }

    public void setTcp_Inaddr(short[] tcp_InaddrParam) {
        this.tcp_Inaddr = tcp_InaddrParam;
    }

    public void setTcp_Inaddr(int index, short tcp_InaddrParam) {
        this.tcp_Inaddr[index]=tcp_InaddrParam;
    }

}
