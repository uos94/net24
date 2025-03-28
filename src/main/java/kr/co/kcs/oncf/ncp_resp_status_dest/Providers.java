
package kr.co.kcs.oncf.ncp_resp_status_dest;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "providers", ElementSize = 32, LocalName = "providers")
public class Providers
    implements Serializable
{

    private String prov_Symname;
    private short prov_Type;
    private short usable_Cnt;
    private short avail_Cnt;
    private short frozen;
    private int dest_Qcount;
    private int obj_Qcount;

    @DdlField(Version = "2.0", QualName = "prov-symname", ObjectClass = 1, Level = 2, Structure = 0, Offset = 48, ElementSize = 16, IdentifierElement = 17)
    public String getProv_Symname() {
        return prov_Symname;
    }

    public void setProv_Symname(String prov_SymnameParam) {
        this.prov_Symname = prov_SymnameParam;
    }

    @DdlField(Version = "2.0", QualName = "prov-type", ObjectClass = 1, Level = 2, Structure = 2, Offset = 64, ElementSize = 2, IdentifierElement = 18)
    public short getProv_Type() {
        return prov_Type;
    }

    public void setProv_Type(short prov_TypeParam) {
        this.prov_Type = prov_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "usable-cnt", ObjectClass = 1, Level = 2, Structure = 2, Offset = 66, ElementSize = 2, IdentifierElement = 19)
    public short getUsable_Cnt() {
        return usable_Cnt;
    }

    public void setUsable_Cnt(short usable_CntParam) {
        this.usable_Cnt = usable_CntParam;
    }

    @DdlField(Version = "2.0", QualName = "avail-cnt", ObjectClass = 1, Level = 2, Structure = 2, Offset = 68, ElementSize = 2, IdentifierElement = 20)
    public short getAvail_Cnt() {
        return avail_Cnt;
    }

    public void setAvail_Cnt(short avail_CntParam) {
        this.avail_Cnt = avail_CntParam;
    }

    @DdlField(Version = "2.0", QualName = "frozen", ObjectClass = 1, Level = 2, Structure = 2, Offset = 70, ElementSize = 2, IdentifierElement = 21)
    public short getFrozen() {
        return frozen;
    }

    public void setFrozen(short frozenParam) {
        this.frozen = frozenParam;
    }

    @DdlField(Version = "2.0", QualName = "dest-qcount", ObjectClass = 1, Level = 2, Structure = 4, Offset = 72, ElementSize = 4, IdentifierElement = 22)
    public int getDest_Qcount() {
        return dest_Qcount;
    }

    public void setDest_Qcount(int dest_QcountParam) {
        this.dest_Qcount = dest_QcountParam;
    }

    @DdlField(Version = "2.0", QualName = "obj-qcount", ObjectClass = 1, Level = 2, Structure = 4, Offset = 76, ElementSize = 4, IdentifierElement = 23)
    public int getObj_Qcount() {
        return obj_Qcount;
    }

    public void setObj_Qcount(int obj_QcountParam) {
        this.obj_Qcount = obj_QcountParam;
    }

}
