
package kr.co.kcs.oncf.ncp_resp_hinfo_sta;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_hinfo_sta.sta.Tcp_Inaddr_SMarker;
import kr.co.kcs.oncf.ncp_resp_hinfo_sta.sta.Tcp_Srv_Listen_Line_SMarker;
import kr.co.kcs.oncf.ncp_resp_hinfo_sta.sta.Udata;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

@DdlGroup(Version = "2.0", QualName = "sta", ElementSize = 474, LocalName = "sta")
public class Sta
    implements Serializable
{

    private short err_Action;
    private short reinstate_Interval;
    private String sta_Dest;
    private String device_Name;
    private String service;
    private String symbolic_Name;
    private String local_Addr;
    private String remote_Addr;
    private Tcp_Inaddr_SMarker tcp_Inaddr_S;
    private short tcp_Keepalive;
    private Tcp_Srv_Listen_Line_SMarker tcp_Srv_Listen_Line_S;
    private Udata udata;
    private short dsts_Dynamic_Sta;

    @DdlField(Version = "2.0", QualName = "err-action", ObjectClass = 1, Level = 2, Structure = 2, Offset = 90, ElementSize = 2, IdentifierElement = 20)
    public short getErr_Action() {
        return err_Action;
    }

    public void setErr_Action(short err_ActionParam) {
        this.err_Action = err_ActionParam;
    }

    @DdlField(Version = "2.0", QualName = "reinstate-interval", ObjectClass = 1, Level = 2, Structure = 2, Offset = 92, ElementSize = 2, IdentifierElement = 21)
    public short getReinstate_Interval() {
        return reinstate_Interval;
    }

    public void setReinstate_Interval(short reinstate_IntervalParam) {
        this.reinstate_Interval = reinstate_IntervalParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-dest", ObjectClass = 1, Level = 2, Structure = 0, Offset = 94, ElementSize = 16, IdentifierElement = 22)
    public String getSta_Dest() {
        return sta_Dest;
    }

    public void setSta_Dest(String sta_DestParam) {
        this.sta_Dest = sta_DestParam;
    }

    @DdlField(Version = "2.0", QualName = "device-name", ObjectClass = 1, Level = 2, Structure = 0, Offset = 110, ElementSize = 16, IdentifierElement = 23)
    public String getDevice_Name() {
        return device_Name;
    }

    public void setDevice_Name(String device_NameParam) {
        this.device_Name = device_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "service", ObjectClass = 1, Level = 2, Structure = 0, Offset = 126, ElementSize = 32, IdentifierElement = 24)
    public String getService() {
        return service;
    }

    public void setService(String serviceParam) {
        this.service = serviceParam;
    }

    @DdlField(Version = "2.0", QualName = "symbolic-name", ObjectClass = 1, Level = 2, Structure = 0, Offset = 158, ElementSize = 16, IdentifierElement = 25)
    public String getSymbolic_Name() {
        return symbolic_Name;
    }

    public void setSymbolic_Name(String symbolic_NameParam) {
        this.symbolic_Name = symbolic_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "local-addr", ObjectClass = 1, Level = 2, Structure = 0, Offset = 174, ElementSize = 56, IdentifierElement = 26)
    public String getLocal_Addr() {
        return local_Addr;
    }

    public void setLocal_Addr(String local_AddrParam) {
        this.local_Addr = local_AddrParam;
    }

    @DdlField(Version = "2.0", QualName = "remote-addr", ObjectClass = 1, Level = 2, Structure = 0, Offset = 230, ElementSize = 56, IdentifierElement = 27)
    public String getRemote_Addr() {
        return remote_Addr;
    }

    public void setRemote_Addr(String remote_AddrParam) {
        this.remote_Addr = remote_AddrParam;
    }

    @DdlField(Version = "2.0", QualName = "tcp-inaddr-s", ObjectClass = 1, Level = 2, Structure = 0, Offset = 286, ElementSize = 56, IdentifierElement = 28)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_hinfo_sta.sta.Tcp_Inaddr_S")
    public Tcp_Inaddr_SMarker getTcp_Inaddr_S() {
        return tcp_Inaddr_S;
    }

    public void setTcp_Inaddr_S(Tcp_Inaddr_SMarker tcp_Inaddr_SParam) {
        this.tcp_Inaddr_S = tcp_Inaddr_SParam;
    }

    @DdlField(Version = "2.0", QualName = "tcp-keepalive", ObjectClass = 1, Level = 2, Structure = 3, Offset = 342, ElementSize = 2, IdentifierElement = 30)
    public short getTcp_Keepalive() {
        return tcp_Keepalive;
    }

    public void setTcp_Keepalive(short tcp_KeepaliveParam) {
        this.tcp_Keepalive = tcp_KeepaliveParam;
    }

    @DdlField(Version = "2.0", QualName = "tcp-srv-listen-line-s", ObjectClass = 1, Level = 2, Structure = 0, Offset = 344, ElementSize = 16, IdentifierElement = 31)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_hinfo_sta.sta.Tcp_Srv_Listen_Line_S")
    public Tcp_Srv_Listen_Line_SMarker getTcp_Srv_Listen_Line_S() {
        return tcp_Srv_Listen_Line_S;
    }

    public void setTcp_Srv_Listen_Line_S(Tcp_Srv_Listen_Line_SMarker tcp_Srv_Listen_Line_SParam) {
        this.tcp_Srv_Listen_Line_S = tcp_Srv_Listen_Line_SParam;
    }

    @DdlField(Version = "2.0", QualName = "udata", ObjectClass = 0, Level = 2, Structure = 0, Offset = 360, ElementSize = 202, IdentifierElement = 33)
    public Udata getUdata() {
        return udata;
    }

    public void setUdata(Udata udataParam) {
        this.udata = udataParam;
    }

    @DdlField(Version = "2.0", QualName = "dsts-dynamic-sta", ObjectClass = 1, Level = 2, Structure = 2, Offset = 562, ElementSize = 2, IdentifierElement = 37)
    public short getDsts_Dynamic_Sta() {
        return dsts_Dynamic_Sta;
    }

    public void setDsts_Dynamic_Sta(short dsts_Dynamic_StaParam) {
        this.dsts_Dynamic_Sta = dsts_Dynamic_StaParam;
    }

}
