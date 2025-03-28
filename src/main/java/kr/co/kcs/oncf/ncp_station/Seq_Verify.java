
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "seq-verify", ElementSize = 2, LocalName = "seq-verify")
public class Seq_Verify
    implements Serializable, Seq_VerifyMarker
{

    private short seq_Verify;

    @DdlField(Version = "2.0", QualName = "seq-verify", ObjectClass = 1, Level = 1, Structure = 2, Offset = 272, ElementSize = 2, IdentifierElement = 78)
    public short getSeq_Verify() {
        return seq_Verify;
    }

    public void setSeq_Verify(short seq_VerifyParam) {
        this.seq_Verify = seq_VerifyParam;
    }

}
