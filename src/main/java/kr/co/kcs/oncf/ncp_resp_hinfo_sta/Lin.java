
package kr.co.kcs.oncf.ncp_resp_hinfo_sta;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_hinfo_sta.lin.Timer_DisMarker;
import kr.co.kcs.oncf.ncp_resp_hinfo_sta.lin.Timer_IntervalMarker;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

@DdlGroup(Version = "2.0", QualName = "lin", ElementSize = 90, LocalName = "lin")
public class Lin
    implements Serializable
{

    private short ete_Protocol;
    private String lin_Name;
    private short lin_Protocol;
    private short lin_Enabled;
    private String port_Name;
    private short sta_Count;
    private Timer_DisMarker timer_Dis;
    private Timer_IntervalMarker timer_Interval;
    private short conn_Method;
    private short conn_Init;
    private short fmm;
    private String symbolic_Name;
    private short enabled;
    private short tcp_Srv_Listen_Port;
    private short ssl;

    @DdlField(Version = "2.0", QualName = "ete-protocol", ObjectClass = 1, Level = 2, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 2)
    public short getEte_Protocol() {
        return ete_Protocol;
    }

    public void setEte_Protocol(short ete_ProtocolParam) {
        this.ete_Protocol = ete_ProtocolParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-name", ObjectClass = 1, Level = 2, Structure = 0, Offset = 2, ElementSize = 16, IdentifierElement = 3)
    public String getLin_Name() {
        return lin_Name;
    }

    public void setLin_Name(String lin_NameParam) {
        this.lin_Name = lin_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-protocol", ObjectClass = 1, Level = 2, Structure = 2, Offset = 18, ElementSize = 2, IdentifierElement = 4)
    public short getLin_Protocol() {
        return lin_Protocol;
    }

    public void setLin_Protocol(short lin_ProtocolParam) {
        this.lin_Protocol = lin_ProtocolParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-enabled", ObjectClass = 1, Level = 2, Structure = 2, Offset = 20, ElementSize = 2, IdentifierElement = 5)
    public short getLin_Enabled() {
        return lin_Enabled;
    }

    public void setLin_Enabled(short lin_EnabledParam) {
        this.lin_Enabled = lin_EnabledParam;
    }

    @DdlField(Version = "2.0", QualName = "port-name", ObjectClass = 1, Level = 2, Structure = 0, Offset = 22, ElementSize = 34, IdentifierElement = 6)
    public String getPort_Name() {
        return port_Name;
    }

    public void setPort_Name(String port_NameParam) {
        this.port_Name = port_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-count", ObjectClass = 1, Level = 2, Structure = 2, Offset = 56, ElementSize = 2, IdentifierElement = 7)
    public short getSta_Count() {
        return sta_Count;
    }

    public void setSta_Count(short sta_CountParam) {
        this.sta_Count = sta_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "timer-dis", ObjectClass = 1, Level = 2, Structure = 2, Offset = 58, ElementSize = 2, IdentifierElement = 8)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_hinfo_sta.lin.Timer_Dis")
    public Timer_DisMarker getTimer_Dis() {
        return timer_Dis;
    }

    public void setTimer_Dis(Timer_DisMarker timer_DisParam) {
        this.timer_Dis = timer_DisParam;
    }

    @DdlField(Version = "2.0", QualName = "timer-interval", ObjectClass = 1, Level = 2, Structure = 2, Offset = 60, ElementSize = 2, IdentifierElement = 10)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_hinfo_sta.lin.Timer_Interval")
    public Timer_IntervalMarker getTimer_Interval() {
        return timer_Interval;
    }

    public void setTimer_Interval(Timer_IntervalMarker timer_IntervalParam) {
        this.timer_Interval = timer_IntervalParam;
    }

    @DdlField(Version = "2.0", QualName = "conn-method", ObjectClass = 1, Level = 2, Structure = 2, Offset = 62, ElementSize = 2, IdentifierElement = 12)
    public short getConn_Method() {
        return conn_Method;
    }

    public void setConn_Method(short conn_MethodParam) {
        this.conn_Method = conn_MethodParam;
    }

    @DdlField(Version = "2.0", QualName = "conn-init", ObjectClass = 1, Level = 2, Structure = 2, Offset = 64, ElementSize = 2, IdentifierElement = 13)
    public short getConn_Init() {
        return conn_Init;
    }

    public void setConn_Init(short conn_InitParam) {
        this.conn_Init = conn_InitParam;
    }

    @DdlField(Version = "2.0", QualName = "fmm", ObjectClass = 1, Level = 2, Structure = 2, Offset = 66, ElementSize = 2, IdentifierElement = 14)
    public short getFmm() {
        return fmm;
    }

    public void setFmm(short fmmParam) {
        this.fmm = fmmParam;
    }

    @DdlField(Version = "2.0", QualName = "symbolic-name", ObjectClass = 1, Level = 2, Structure = 0, Offset = 68, ElementSize = 16, IdentifierElement = 15)
    public String getSymbolic_Name() {
        return symbolic_Name;
    }

    public void setSymbolic_Name(String symbolic_NameParam) {
        this.symbolic_Name = symbolic_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "enabled", ObjectClass = 1, Level = 2, Structure = 2, Offset = 84, ElementSize = 2, IdentifierElement = 16)
    public short getEnabled() {
        return enabled;
    }

    public void setEnabled(short enabledParam) {
        this.enabled = enabledParam;
    }

    @DdlField(Version = "2.0", QualName = "tcp-srv-listen-port", ObjectClass = 1, Level = 2, Structure = 3, Offset = 86, ElementSize = 2, IdentifierElement = 17)
    public short getTcp_Srv_Listen_Port() {
        return tcp_Srv_Listen_Port;
    }

    public void setTcp_Srv_Listen_Port(short tcp_Srv_Listen_PortParam) {
        this.tcp_Srv_Listen_Port = tcp_Srv_Listen_PortParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl", ObjectClass = 1, Level = 2, Structure = 3, Offset = 88, ElementSize = 2, IdentifierElement = 18)
    public short getSsl() {
        return ssl;
    }

    public void setSsl(short sslParam) {
        this.ssl = sslParam;
    }

}
