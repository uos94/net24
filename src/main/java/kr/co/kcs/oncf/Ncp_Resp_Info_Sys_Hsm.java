
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-info-sys-hsm", ElementSize = 138, LocalName = "ncp-resp-info-sys-hsm")
public class Ncp_Resp_Info_Sys_Hsm
    implements Serializable
{

    private int hsm_Timer;
    private String[] hsm_Protocol = new String[ 3 ] ;
    private String[] fil130603_1433 = new String[ 3 ] ;
    private short hsm_Rport;
    private String[] hsm_Raddr = new String[ 16 ] ;
    private String[] hsm_Key = new String[ 80 ] ;
    private String[] hsm_Sec_Box = new String[ 6 ] ;
    private String[] hsm_Tcpip_Pro = new String[ 24 ] ;

    @DdlField(Version = "2.0", QualName = "hsm-timer", ObjectClass = 1, Level = 1, Structure = 4, Offset = 0, ElementSize = 4, IdentifierElement = 1)
    public int getHsm_Timer() {
        return hsm_Timer;
    }

    public void setHsm_Timer(int hsm_TimerParam) {
        this.hsm_Timer = hsm_TimerParam;
    }

    @DdlField(Version = "2.0", QualName = "hsm-protocol", ObjectClass = 1, Level = 1, Structure = 0, Offset = 4, ElementSize = 1, IdentifierElement = 2, OccursMax = 3)
    public String[] getHsm_Protocol() {
        return hsm_Protocol;
    }

    @DdlField(Version = "2.0", QualName = "hsm-protocol", ObjectClass = 1, Level = 1, Structure = 0, Offset = 4, ElementSize = 1, IdentifierElement = 2, OccursMax = 3)
    public String getHsm_Protocol(int index) {
        return (hsm_Protocol[index]);
    }

    public void setHsm_Protocol(String[] hsm_ProtocolParam) {
        this.hsm_Protocol = hsm_ProtocolParam;
    }

    public void setHsm_Protocol(int index, String hsm_ProtocolParam) {
        this.hsm_Protocol[index]=hsm_ProtocolParam;
    }

    @DdlField(Version = "2.0", QualName = "fil130603-1433", ObjectClass = 1, Level = 1, Structure = 0, Offset = 7, ElementSize = 1, IdentifierElement = 3, OccursMax = 3)
    public String[] getFil130603_1433() {
        return fil130603_1433;
    }

    @DdlField(Version = "2.0", QualName = "fil130603-1433", ObjectClass = 1, Level = 1, Structure = 0, Offset = 7, ElementSize = 1, IdentifierElement = 3, OccursMax = 3)
    public String getFil130603_1433(int index) {
        return (fil130603_1433[index]);
    }

    public void setFil130603_1433(String[] fil130603_1433Param) {
        this.fil130603_1433 = fil130603_1433Param;
    }

    public void setFil130603_1433(int index, String fil130603_1433Param) {
        this.fil130603_1433[index]=fil130603_1433Param;
    }

    @DdlField(Version = "2.0", QualName = "hsm-rport", ObjectClass = 1, Level = 1, Structure = 2, Offset = 10, ElementSize = 2, IdentifierElement = 4)
    public short getHsm_Rport() {
        return hsm_Rport;
    }

    public void setHsm_Rport(short hsm_RportParam) {
        this.hsm_Rport = hsm_RportParam;
    }

    @DdlField(Version = "2.0", QualName = "hsm-raddr", ObjectClass = 1, Level = 1, Structure = 0, Offset = 12, ElementSize = 1, IdentifierElement = 5, OccursMax = 16)
    public String[] getHsm_Raddr() {
        return hsm_Raddr;
    }

    @DdlField(Version = "2.0", QualName = "hsm-raddr", ObjectClass = 1, Level = 1, Structure = 0, Offset = 12, ElementSize = 1, IdentifierElement = 5, OccursMax = 16)
    public String getHsm_Raddr(int index) {
        return (hsm_Raddr[index]);
    }

    public void setHsm_Raddr(String[] hsm_RaddrParam) {
        this.hsm_Raddr = hsm_RaddrParam;
    }

    public void setHsm_Raddr(int index, String hsm_RaddrParam) {
        this.hsm_Raddr[index]=hsm_RaddrParam;
    }

    @DdlField(Version = "2.0", QualName = "hsm-key", ObjectClass = 1, Level = 1, Structure = 0, Offset = 28, ElementSize = 1, IdentifierElement = 6, OccursMax = 80)
    public String[] getHsm_Key() {
        return hsm_Key;
    }

    @DdlField(Version = "2.0", QualName = "hsm-key", ObjectClass = 1, Level = 1, Structure = 0, Offset = 28, ElementSize = 1, IdentifierElement = 6, OccursMax = 80)
    public String getHsm_Key(int index) {
        return (hsm_Key[index]);
    }

    public void setHsm_Key(String[] hsm_KeyParam) {
        this.hsm_Key = hsm_KeyParam;
    }

    public void setHsm_Key(int index, String hsm_KeyParam) {
        this.hsm_Key[index]=hsm_KeyParam;
    }

    @DdlField(Version = "2.0", QualName = "hsm-sec-box", ObjectClass = 1, Level = 1, Structure = 0, Offset = 108, ElementSize = 1, IdentifierElement = 7, OccursMax = 6)
    public String[] getHsm_Sec_Box() {
        return hsm_Sec_Box;
    }

    @DdlField(Version = "2.0", QualName = "hsm-sec-box", ObjectClass = 1, Level = 1, Structure = 0, Offset = 108, ElementSize = 1, IdentifierElement = 7, OccursMax = 6)
    public String getHsm_Sec_Box(int index) {
        return (hsm_Sec_Box[index]);
    }

    public void setHsm_Sec_Box(String[] hsm_Sec_BoxParam) {
        this.hsm_Sec_Box = hsm_Sec_BoxParam;
    }

    public void setHsm_Sec_Box(int index, String hsm_Sec_BoxParam) {
        this.hsm_Sec_Box[index]=hsm_Sec_BoxParam;
    }

    @DdlField(Version = "2.0", QualName = "hsm-tcpip-pro", ObjectClass = 1, Level = 1, Structure = 0, Offset = 114, ElementSize = 1, IdentifierElement = 8, OccursMax = 24)
    public String[] getHsm_Tcpip_Pro() {
        return hsm_Tcpip_Pro;
    }

    @DdlField(Version = "2.0", QualName = "hsm-tcpip-pro", ObjectClass = 1, Level = 1, Structure = 0, Offset = 114, ElementSize = 1, IdentifierElement = 8, OccursMax = 24)
    public String getHsm_Tcpip_Pro(int index) {
        return (hsm_Tcpip_Pro[index]);
    }

    public void setHsm_Tcpip_Pro(String[] hsm_Tcpip_ProParam) {
        this.hsm_Tcpip_Pro = hsm_Tcpip_ProParam;
    }

    public void setHsm_Tcpip_Pro(int index, String hsm_Tcpip_ProParam) {
        this.hsm_Tcpip_Pro[index]=hsm_Tcpip_ProParam;
    }

}
