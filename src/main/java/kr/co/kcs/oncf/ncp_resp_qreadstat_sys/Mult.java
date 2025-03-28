
package kr.co.kcs.oncf.ncp_resp_qreadstat_sys;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_qreadstat_sys.mult.Qreads;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "mult", ElementSize = 2884, LocalName = "mult")
public class Mult
    implements Serializable, Var_DataMarker
{

    private short num_Qreads;
    private short fill041022_1240;
    private Qreads[] qreads = new Qreads[ 40 ] ;

    @DdlField(Version = "2.0", QualName = "num-qreads", ObjectClass = 1, Level = 2, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 27)
    public short getNum_Qreads() {
        return num_Qreads;
    }

    public void setNum_Qreads(short num_QreadsParam) {
        this.num_Qreads = num_QreadsParam;
    }

    @DdlField(Version = "2.0", QualName = "fill041022-1240", ObjectClass = 1, Level = 2, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 28)
    public short getFill041022_1240() {
        return fill041022_1240;
    }

    public void setFill041022_1240(short fill041022_1240Param) {
        this.fill041022_1240 = fill041022_1240Param;
    }

    @DdlField(Version = "2.0", QualName = "qreads", ObjectClass = 0, Level = 2, Structure = 0, Offset = 6, ElementSize = 72, IdentifierElement = 29, OccursMax = 40)
    public Qreads[] getQreads() {
        return qreads;
    }

    @DdlField(Version = "2.0", QualName = "qreads", ObjectClass = 0, Level = 2, Structure = 0, Offset = 6, ElementSize = 72, IdentifierElement = 29, OccursMax = 40)
    public Qreads getQreads(int index) {
        return (qreads[index]);
    }

    public void setQreads(Qreads[] qreadsParam) {
        this.qreads = qreadsParam;
    }

    public void setQreads(int index, Qreads qreadsParam) {
        this.qreads[index]=qreadsParam;
    }

}
