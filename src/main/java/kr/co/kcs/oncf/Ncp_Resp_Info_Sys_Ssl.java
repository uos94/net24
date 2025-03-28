
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-info-sys-ssl", ElementSize = 48, LocalName = "ncp-resp-info-sys-ssl")
public class Ncp_Resp_Info_Sys_Ssl
    implements Serializable
{

    private short ssl_Ext_Seg_Pages;
    private short ssl_Mem_Threshold;
    private short ssl_Memdelay;
    private short ssl_Cert_Exp_Lead;
    private short ssl_Cert_Exp_Intrvl;
    private String[] hsm_Port = new String[ 35 ] ;
    private String fil130613_0001;
    private byte hsm_Port_Len;
    private String fil130613_0002;

    @DdlField(Version = "2.0", QualName = "ssl-ext-seg-pages", ObjectClass = 1, Level = 1, Structure = 3, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getSsl_Ext_Seg_Pages() {
        return ssl_Ext_Seg_Pages;
    }

    public void setSsl_Ext_Seg_Pages(short ssl_Ext_Seg_PagesParam) {
        this.ssl_Ext_Seg_Pages = ssl_Ext_Seg_PagesParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-mem-threshold", ObjectClass = 1, Level = 1, Structure = 3, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getSsl_Mem_Threshold() {
        return ssl_Mem_Threshold;
    }

    public void setSsl_Mem_Threshold(short ssl_Mem_ThresholdParam) {
        this.ssl_Mem_Threshold = ssl_Mem_ThresholdParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-memdelay", ObjectClass = 1, Level = 1, Structure = 3, Offset = 4, ElementSize = 2, IdentifierElement = 3)
    public short getSsl_Memdelay() {
        return ssl_Memdelay;
    }

    public void setSsl_Memdelay(short ssl_MemdelayParam) {
        this.ssl_Memdelay = ssl_MemdelayParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-cert-exp-lead", ObjectClass = 1, Level = 1, Structure = 3, Offset = 6, ElementSize = 2, IdentifierElement = 4)
    public short getSsl_Cert_Exp_Lead() {
        return ssl_Cert_Exp_Lead;
    }

    public void setSsl_Cert_Exp_Lead(short ssl_Cert_Exp_LeadParam) {
        this.ssl_Cert_Exp_Lead = ssl_Cert_Exp_LeadParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-cert-exp-intrvl", ObjectClass = 1, Level = 1, Structure = 3, Offset = 8, ElementSize = 2, IdentifierElement = 5)
    public short getSsl_Cert_Exp_Intrvl() {
        return ssl_Cert_Exp_Intrvl;
    }

    public void setSsl_Cert_Exp_Intrvl(short ssl_Cert_Exp_IntrvlParam) {
        this.ssl_Cert_Exp_Intrvl = ssl_Cert_Exp_IntrvlParam;
    }

    @DdlField(Version = "2.0", QualName = "hsm-port", ObjectClass = 1, Level = 1, Structure = 0, Offset = 10, ElementSize = 1, IdentifierElement = 6, OccursMax = 35)
    public String[] getHsm_Port() {
        return hsm_Port;
    }

    @DdlField(Version = "2.0", QualName = "hsm-port", ObjectClass = 1, Level = 1, Structure = 0, Offset = 10, ElementSize = 1, IdentifierElement = 6, OccursMax = 35)
    public String getHsm_Port(int index) {
        return (hsm_Port[index]);
    }

    public void setHsm_Port(String[] hsm_PortParam) {
        this.hsm_Port = hsm_PortParam;
    }

    public void setHsm_Port(int index, String hsm_PortParam) {
        this.hsm_Port[index]=hsm_PortParam;
    }

    @DdlField(Version = "2.0", QualName = "fil130613-0001", ObjectClass = 1, Level = 1, Structure = 0, Offset = 45, ElementSize = 1, IdentifierElement = 7)
    public String getFil130613_0001() {
        return fil130613_0001;
    }

    public void setFil130613_0001(String fil130613_0001Param) {
        this.fil130613_0001 = fil130613_0001Param;
    }

    @DdlField(Version = "2.0", QualName = "hsm-port-len", ObjectClass = 1, Level = 1, Structure = 23, Offset = 46, ElementSize = 1, IdentifierElement = 8)
    public byte getHsm_Port_Len() {
        return hsm_Port_Len;
    }

    public void setHsm_Port_Len(byte hsm_Port_LenParam) {
        this.hsm_Port_Len = hsm_Port_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "fil130613-0002", ObjectClass = 1, Level = 1, Structure = 0, Offset = 47, ElementSize = 1, IdentifierElement = 9)
    public String getFil130613_0002() {
        return fil130613_0002;
    }

    public void setFil130613_0002(String fil130613_0002Param) {
        this.fil130613_0002 = fil130613_0002Param;
    }

}
