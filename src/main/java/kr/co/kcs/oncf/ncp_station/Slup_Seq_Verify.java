
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "slup-seq-verify", ElementSize = 2, LocalName = "slup-seq-verify")
public class Slup_Seq_Verify
    implements Serializable, Seq_VerifyMarker
{

    private short slup_Seq_Verify;

    @DdlField(Version = "2.0", QualName = "slup-seq-verify", ObjectClass = 1, Level = 1, Structure = 2, Offset = 272, ElementSize = 2, IdentifierElement = 79)
    public short getSlup_Seq_Verify() {
        return slup_Seq_Verify;
    }

    public void setSlup_Seq_Verify(short slup_Seq_VerifyParam) {
        this.slup_Seq_Verify = slup_Seq_VerifyParam;
    }

}
