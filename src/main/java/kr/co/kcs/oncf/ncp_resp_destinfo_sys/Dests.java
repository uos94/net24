
package kr.co.kcs.oncf.ncp_resp_destinfo_sys;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "dests", ElementSize = 38, LocalName = "dests")
public class Dests
    implements Serializable
{

    private String dest_Name;
    private short dest_Type;
    private short frozen;
    private short adapt;
    private int queue_Count;
    private int qat;
    private int qmt;
    private short qmi;
    private short fail;

    @DdlField(Version = "2.0", QualName = "dest-name", ObjectClass = 1, Level = 2, Structure = 0, Offset = 310, ElementSize = 16, IdentifierElement = 8)
    public String getDest_Name() {
        return dest_Name;
    }

    public void setDest_Name(String dest_NameParam) {
        this.dest_Name = dest_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "dest-type", ObjectClass = 1, Level = 2, Structure = 2, Offset = 326, ElementSize = 2, IdentifierElement = 9)
    public short getDest_Type() {
        return dest_Type;
    }

    public void setDest_Type(short dest_TypeParam) {
        this.dest_Type = dest_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "frozen", ObjectClass = 1, Level = 2, Structure = 2, Offset = 328, ElementSize = 2, IdentifierElement = 10)
    public short getFrozen() {
        return frozen;
    }

    public void setFrozen(short frozenParam) {
        this.frozen = frozenParam;
    }

    @DdlField(Version = "2.0", QualName = "adapt", ObjectClass = 1, Level = 2, Structure = 2, Offset = 330, ElementSize = 2, IdentifierElement = 11)
    public short getAdapt() {
        return adapt;
    }

    public void setAdapt(short adaptParam) {
        this.adapt = adaptParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-count", ObjectClass = 1, Level = 2, Structure = 4, Offset = 332, ElementSize = 4, IdentifierElement = 12)
    public int getQueue_Count() {
        return queue_Count;
    }

    public void setQueue_Count(int queue_CountParam) {
        this.queue_Count = queue_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "qat", ObjectClass = 1, Level = 2, Structure = 4, Offset = 336, ElementSize = 4, IdentifierElement = 13)
    public int getQat() {
        return qat;
    }

    public void setQat(int qatParam) {
        this.qat = qatParam;
    }

    @DdlField(Version = "2.0", QualName = "qmt", ObjectClass = 1, Level = 2, Structure = 4, Offset = 340, ElementSize = 4, IdentifierElement = 14)
    public int getQmt() {
        return qmt;
    }

    public void setQmt(int qmtParam) {
        this.qmt = qmtParam;
    }

    @DdlField(Version = "2.0", QualName = "qmi", ObjectClass = 1, Level = 2, Structure = 2, Offset = 344, ElementSize = 2, IdentifierElement = 15)
    public short getQmi() {
        return qmi;
    }

    public void setQmi(short qmiParam) {
        this.qmi = qmiParam;
    }

    @DdlField(Version = "2.0", QualName = "fail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 346, ElementSize = 2, IdentifierElement = 16)
    public short getFail() {
        return fail;
    }

    public void setFail(short failParam) {
        this.fail = failParam;
    }

}
