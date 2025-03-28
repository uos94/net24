
package kr.co.kcs.oncf.ncp_resp_segstatus_sys;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "segs", ElementSize = 80, LocalName = "segs")
public class Segs
    implements Serializable
{

    private String seg_Fname;
    private short seg_Fname_Len;
    private String seg_Aname;
    private short seg_Aname_Len;
    private short seg_Type;
    private short seg_Num;

    @DdlField(Version = "2.0", QualName = "seg-fname", ObjectClass = 1, Level = 2, Structure = 0, Offset = 46, ElementSize = 36, IdentifierElement = 9)
    public String getSeg_Fname() {
        return seg_Fname;
    }

    public void setSeg_Fname(String seg_FnameParam) {
        this.seg_Fname = seg_FnameParam;
    }

    @DdlField(Version = "2.0", QualName = "seg-fname-len", ObjectClass = 1, Level = 2, Structure = 2, Offset = 82, ElementSize = 2, IdentifierElement = 10)
    public short getSeg_Fname_Len() {
        return seg_Fname_Len;
    }

    public void setSeg_Fname_Len(short seg_Fname_LenParam) {
        this.seg_Fname_Len = seg_Fname_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "seg-aname", ObjectClass = 1, Level = 2, Structure = 0, Offset = 84, ElementSize = 36, IdentifierElement = 11)
    public String getSeg_Aname() {
        return seg_Aname;
    }

    public void setSeg_Aname(String seg_AnameParam) {
        this.seg_Aname = seg_AnameParam;
    }

    @DdlField(Version = "2.0", QualName = "seg-aname-len", ObjectClass = 1, Level = 2, Structure = 2, Offset = 120, ElementSize = 2, IdentifierElement = 12)
    public short getSeg_Aname_Len() {
        return seg_Aname_Len;
    }

    public void setSeg_Aname_Len(short seg_Aname_LenParam) {
        this.seg_Aname_Len = seg_Aname_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "seg-type", ObjectClass = 1, Level = 2, Structure = 2, Offset = 122, ElementSize = 2, IdentifierElement = 13)
    public short getSeg_Type() {
        return seg_Type;
    }

    public void setSeg_Type(short seg_TypeParam) {
        this.seg_Type = seg_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "seg-num", ObjectClass = 1, Level = 2, Structure = 2, Offset = 124, ElementSize = 2, IdentifierElement = 14)
    public short getSeg_Num() {
        return seg_Num;
    }

    public void setSeg_Num(short seg_NumParam) {
        this.seg_Num = seg_NumParam;
    }

}
