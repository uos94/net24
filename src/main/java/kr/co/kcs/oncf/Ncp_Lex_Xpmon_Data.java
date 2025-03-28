
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-lex-xpmon-data", ElementSize = 28, LocalName = "ncp-lex-xpmon-data")
public class Ncp_Lex_Xpmon_Data
    implements Serializable
{

    private String eye_Catcher;
    private String srv_Class;
    private short srv_Class_Len;
    private short vsn;
    private int tim_Out;

    @DdlField(Version = "2.0", QualName = "eye-catcher", ObjectClass = 1, Level = 1, Structure = 0, Offset = 0, ElementSize = 5, IdentifierElement = 1)
    public String getEye_Catcher() {
        return eye_Catcher;
    }

    public void setEye_Catcher(String eye_CatcherParam) {
        this.eye_Catcher = eye_CatcherParam;
    }

    @DdlField(Version = "2.0", QualName = "srv-class", ObjectClass = 1, Level = 1, Structure = 0, Offset = 5, ElementSize = 15, IdentifierElement = 2)
    public String getSrv_Class() {
        return srv_Class;
    }

    public void setSrv_Class(String srv_ClassParam) {
        this.srv_Class = srv_ClassParam;
    }

    @DdlField(Version = "2.0", QualName = "srv-class-len", ObjectClass = 1, Level = 1, Structure = 2, Offset = 20, ElementSize = 2, IdentifierElement = 3)
    public short getSrv_Class_Len() {
        return srv_Class_Len;
    }

    public void setSrv_Class_Len(short srv_Class_LenParam) {
        this.srv_Class_Len = srv_Class_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "vsn", ObjectClass = 1, Level = 1, Structure = 2, Offset = 22, ElementSize = 2, IdentifierElement = 4)
    public short getVsn() {
        return vsn;
    }

    public void setVsn(short vsnParam) {
        this.vsn = vsnParam;
    }

    @DdlField(Version = "2.0", QualName = "tim-out", ObjectClass = 1, Level = 1, Structure = 4, Offset = 24, ElementSize = 4, IdentifierElement = 5)
    public int getTim_Out() {
        return tim_Out;
    }

    public void setTim_Out(int tim_OutParam) {
        this.tim_Out = tim_OutParam;
    }

}
