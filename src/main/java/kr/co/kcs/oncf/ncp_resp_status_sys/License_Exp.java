
package kr.co.kcs.oncf.ncp_resp_status_sys;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "license-exp", ElementSize = 6, LocalName = "license-exp")
public class License_Exp
    implements Serializable
{

    private short yyyy;
    private short mo;
    private short dd;

    @DdlField(Version = "2.0", QualName = "yyyy", ObjectClass = 1, Level = 2, Structure = 2, Offset = 606, ElementSize = 2, IdentifierElement = 88)
    public short getYyyy() {
        return yyyy;
    }

    public void setYyyy(short yyyyParam) {
        this.yyyy = yyyyParam;
    }

    @DdlField(Version = "2.0", QualName = "mo", ObjectClass = 1, Level = 2, Structure = 2, Offset = 608, ElementSize = 2, IdentifierElement = 89)
    public short getMo() {
        return mo;
    }

    public void setMo(short moParam) {
        this.mo = moParam;
    }

    @DdlField(Version = "2.0", QualName = "dd", ObjectClass = 1, Level = 2, Structure = 2, Offset = 610, ElementSize = 2, IdentifierElement = 90)
    public short getDd() {
        return dd;
    }

    public void setDd(short ddParam) {
        this.dd = ddParam;
    }

}
