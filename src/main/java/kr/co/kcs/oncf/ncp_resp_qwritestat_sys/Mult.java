
package kr.co.kcs.oncf.ncp_resp_qwritestat_sys;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_qwritestat_sys.mult.Qwrites;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "mult", ElementSize = 2884, LocalName = "mult")
public class Mult
    implements Serializable, Var_DataMarker
{

    private short num_Qwrites;
    private short fill041022_1314;
    private Qwrites[] qwrites = new Qwrites[ 40 ] ;

    @DdlField(Version = "2.0", QualName = "num-qwrites", ObjectClass = 1, Level = 2, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 24)
    public short getNum_Qwrites() {
        return num_Qwrites;
    }

    public void setNum_Qwrites(short num_QwritesParam) {
        this.num_Qwrites = num_QwritesParam;
    }

    @DdlField(Version = "2.0", QualName = "fill041022-1314", ObjectClass = 1, Level = 2, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 25)
    public short getFill041022_1314() {
        return fill041022_1314;
    }

    public void setFill041022_1314(short fill041022_1314Param) {
        this.fill041022_1314 = fill041022_1314Param;
    }

    @DdlField(Version = "2.0", QualName = "qwrites", ObjectClass = 0, Level = 2, Structure = 0, Offset = 6, ElementSize = 72, IdentifierElement = 26, OccursMax = 40)
    public Qwrites[] getQwrites() {
        return qwrites;
    }

    @DdlField(Version = "2.0", QualName = "qwrites", ObjectClass = 0, Level = 2, Structure = 0, Offset = 6, ElementSize = 72, IdentifierElement = 26, OccursMax = 40)
    public Qwrites getQwrites(int index) {
        return (qwrites[index]);
    }

    public void setQwrites(Qwrites[] qwritesParam) {
        this.qwrites = qwritesParam;
    }

    public void setQwrites(int index, Qwrites qwritesParam) {
        this.qwrites[index]=qwritesParam;
    }

}
