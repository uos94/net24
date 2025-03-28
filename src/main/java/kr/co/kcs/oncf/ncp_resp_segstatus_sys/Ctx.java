
package kr.co.kcs.oncf.ncp_resp_segstatus_sys;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ctx", ElementSize = 40, LocalName = "ctx")
public class Ctx
    implements Serializable
{

    private String last_Seg_Found;
    private short last_Seg_Found_Len;
    private short last_Segnum_Found;

    @DdlField(Version = "2.0", QualName = "last-seg-found", ObjectClass = 1, Level = 2, Structure = 0, Offset = 0, ElementSize = 36, IdentifierElement = 2)
    public String getLast_Seg_Found() {
        return last_Seg_Found;
    }

    public void setLast_Seg_Found(String last_Seg_FoundParam) {
        this.last_Seg_Found = last_Seg_FoundParam;
    }

    @DdlField(Version = "2.0", QualName = "last-seg-found-len", ObjectClass = 1, Level = 2, Structure = 2, Offset = 36, ElementSize = 2, IdentifierElement = 3)
    public short getLast_Seg_Found_Len() {
        return last_Seg_Found_Len;
    }

    public void setLast_Seg_Found_Len(short last_Seg_Found_LenParam) {
        this.last_Seg_Found_Len = last_Seg_Found_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "last-segnum-found", ObjectClass = 1, Level = 2, Structure = 2, Offset = 38, ElementSize = 2, IdentifierElement = 4)
    public short getLast_Segnum_Found() {
        return last_Segnum_Found;
    }

    public void setLast_Segnum_Found(short last_Segnum_FoundParam) {
        this.last_Segnum_Found = last_Segnum_FoundParam;
    }

}
