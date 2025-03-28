
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "plu-seq-verify", ElementSize = 2, LocalName = "plu-seq-verify")
public class Plu_Seq_Verify
    implements Serializable, Seq_VerifyMarker
{

    private short plu_Seq_Verify;

    @DdlField(Version = "2.0", QualName = "plu-seq-verify", ObjectClass = 1, Level = 1, Structure = 2, Offset = 272, ElementSize = 2, IdentifierElement = 80)
    public short getPlu_Seq_Verify() {
        return plu_Seq_Verify;
    }

    public void setPlu_Seq_Verify(short plu_Seq_VerifyParam) {
        this.plu_Seq_Verify = plu_Seq_VerifyParam;
    }

}
