
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-err-val-inv", ElementSize = 8, LocalName = "ncp-resp-err-val-inv")
public class Ncp_Resp_Err_Val_Inv
    implements Serializable
{

    private short offset;
    private short reason;
    private short fserror;
    private short field_In_Error;

    @DdlField(Version = "2.0", QualName = "offset", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getOffset() {
        return offset;
    }

    public void setOffset(short offsetParam) {
        this.offset = offsetParam;
    }

    @DdlField(Version = "2.0", QualName = "reason", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getReason() {
        return reason;
    }

    public void setReason(short reasonParam) {
        this.reason = reasonParam;
    }

    @DdlField(Version = "2.0", QualName = "fserror", ObjectClass = 1, Level = 1, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 3)
    public short getFserror() {
        return fserror;
    }

    public void setFserror(short fserrorParam) {
        this.fserror = fserrorParam;
    }

    @DdlField(Version = "2.0", QualName = "field-in-error", ObjectClass = 1, Level = 1, Structure = 2, Offset = 6, ElementSize = 2, IdentifierElement = 4)
    public short getField_In_Error() {
        return field_In_Error;
    }

    public void setField_In_Error(short field_In_ErrorParam) {
        this.field_In_Error = field_In_ErrorParam;
    }

}
