
package kr.co.kcs.oncf.ncp_resp_srvcstatus_sys;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "srvcs", ElementSize = 28, LocalName = "srvcs")
public class Srvcs
    implements Serializable
{

    private String srvc_Name;
    private short frozen;
    private short queue_Var1;
    private short lcl_Providers;
    private short lcl_Usable;
    private short lcl_Available;
    private short ext_Available;

    @DdlField(Version = "2.0", QualName = "srvc-name", ObjectClass = 1, Level = 2, Structure = 0, Offset = 310, ElementSize = 16, IdentifierElement = 8)
    public String getSrvc_Name() {
        return srvc_Name;
    }

    public void setSrvc_Name(String srvc_NameParam) {
        this.srvc_Name = srvc_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "frozen", ObjectClass = 1, Level = 2, Structure = 2, Offset = 326, ElementSize = 2, IdentifierElement = 9)
    public short getFrozen() {
        return frozen;
    }

    public void setFrozen(short frozenParam) {
        this.frozen = frozenParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-var1", ObjectClass = 1, Level = 2, Structure = 2, Offset = 328, ElementSize = 2, IdentifierElement = 10)
    public short getQueue_Var1() {
        return queue_Var1;
    }

    public void setQueue_Var1(short queue_Var1Param) {
        this.queue_Var1 = queue_Var1Param;
    }

    @DdlField(Version = "2.0", QualName = "lcl-providers", ObjectClass = 1, Level = 2, Structure = 2, Offset = 330, ElementSize = 2, IdentifierElement = 11)
    public short getLcl_Providers() {
        return lcl_Providers;
    }

    public void setLcl_Providers(short lcl_ProvidersParam) {
        this.lcl_Providers = lcl_ProvidersParam;
    }

    @DdlField(Version = "2.0", QualName = "lcl-usable", ObjectClass = 1, Level = 2, Structure = 2, Offset = 332, ElementSize = 2, IdentifierElement = 12)
    public short getLcl_Usable() {
        return lcl_Usable;
    }

    public void setLcl_Usable(short lcl_UsableParam) {
        this.lcl_Usable = lcl_UsableParam;
    }

    @DdlField(Version = "2.0", QualName = "lcl-available", ObjectClass = 1, Level = 2, Structure = 2, Offset = 334, ElementSize = 2, IdentifierElement = 13)
    public short getLcl_Available() {
        return lcl_Available;
    }

    public void setLcl_Available(short lcl_AvailableParam) {
        this.lcl_Available = lcl_AvailableParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-available", ObjectClass = 1, Level = 2, Structure = 2, Offset = 336, ElementSize = 2, IdentifierElement = 14)
    public short getExt_Available() {
        return ext_Available;
    }

    public void setExt_Available(short ext_AvailableParam) {
        this.ext_Available = ext_AvailableParam;
    }

}
