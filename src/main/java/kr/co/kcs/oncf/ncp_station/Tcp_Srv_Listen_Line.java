
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "tcp-srv-listen-line", ElementSize = 2, LocalName = "tcp-srv-listen-line")
public class Tcp_Srv_Listen_Line
    implements Serializable, Tcp_Srv_Listen_Line_SMarker
{

    private short[] tcp_Srv_Listen_Line = new short[ 8 ] ;

    @DdlField(Version = "2.0", QualName = "tcp-srv-listen-line", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1072, ElementSize = 2, IdentifierElement = 141, OccursMax = 8)
    public short[] getTcp_Srv_Listen_Line() {
        return tcp_Srv_Listen_Line;
    }

    @DdlField(Version = "2.0", QualName = "tcp-srv-listen-line", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1072, ElementSize = 2, IdentifierElement = 141, OccursMax = 8)
    public short getTcp_Srv_Listen_Line(int index) {
        return (tcp_Srv_Listen_Line[index]);
    }

    public void setTcp_Srv_Listen_Line(short[] tcp_Srv_Listen_LineParam) {
        this.tcp_Srv_Listen_Line = tcp_Srv_Listen_LineParam;
    }

    public void setTcp_Srv_Listen_Line(int index, short tcp_Srv_Listen_LineParam) {
        this.tcp_Srv_Listen_Line[index]=tcp_Srv_Listen_LineParam;
    }

}
