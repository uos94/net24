
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_station.Dsts_Prefix_SMarker;
import kr.co.kcs.oncf.ncp_station.End_BracketMarker;
import kr.co.kcs.oncf.ncp_station.Evt_Filt;
import kr.co.kcs.oncf.ncp_station.Fmtvars;
import kr.co.kcs.oncf.ncp_station.LocaltpnameMarker;
import kr.co.kcs.oncf.ncp_station.ModenameMarker;
import kr.co.kcs.oncf.ncp_station.PartnertpnameMarker;
import kr.co.kcs.oncf.ncp_station.Poll_AddressMarker;
import kr.co.kcs.oncf.ncp_station.Queue_Limit32Marker;
import kr.co.kcs.oncf.ncp_station.Queue_LimitMarker;
import kr.co.kcs.oncf.ncp_station.Saved_MsgsMarker;
import kr.co.kcs.oncf.ncp_station.Sba_Notify_Service_SMarker;
import kr.co.kcs.oncf.ncp_station.Select_AddressMarker;
import kr.co.kcs.oncf.ncp_station.Seq_VerifyMarker;
import kr.co.kcs.oncf.ncp_station.Sta_PollableMarker;
import kr.co.kcs.oncf.ncp_station.Start_TypeMarker;
import kr.co.kcs.oncf.ncp_station.Tcp_Inaddr_SMarker;
import kr.co.kcs.oncf.ncp_station.Tcp_Srv_Listen_Line_SMarker;
import kr.co.kcs.oncf.ncp_station.Userdata;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

@DdlGroup(Version = "2.0", QualName = "ncp-station", ElementSize = 1176, LocalName = "ncp-station")
public class Ncp_Station
    implements Serializable
{

    private String alt_Sta_Dest;
    private short alt_Sta_Dest_Number;
    private short alt_Sta_Dest_Type;
    private short audit_Before_Usi;
    private short audit_Input;
    private short audit_Output;
    private short autostart_Priority;
    private String class_Var1;
    private short device_Number;
    private short err_Action;
    private short group_Number;
    private String lin_Name;
    private short lin_Number;
    private short lin_Protocol;
    private short ete_Protocol;
    private short max_Retries;
    private short netmode;
    private short output_Interval;
    private short queue_Alert_Threshold;
    private Queue_LimitMarker queue_Limit;
    private short reinstate_Interval;
    private String sta_Dest;
    private short sta_Dest_Type;
    private short sta_Dest_Number;
    private short sta_Number;
    private short terminal_Type;
    private String uc_Queue;
    private String uc_Rate;
    private String uc_State;
    private short warmstart_Priority;
    private End_BracketMarker end_Bracket;
    private LocaltpnameMarker localtpname;
    private ModenameMarker modename;
    private PartnertpnameMarker partnertpname;
    private Poll_AddressMarker poll_Address;
    private Select_AddressMarker select_Address;
    private Start_TypeMarker start_Type;
    private Sta_PollableMarker sta_Pollable;
    private String local_Addr;
    private String remote_Addr;
    private String conn_Spec;
    private Saved_MsgsMarker saved_Msgs;
    private Seq_VerifyMarker seq_Verify;
    private short qmi;
    private String srcclass;
    private String class32;
    private short set_Nom_Override;
    private short passfmh;
    private short applrej;
    private String device_Name;
    private String service;
    private String tributary_Of;
    private String symbolic_Name;
    private short lin_Enabled;
    private short invalid_Var1;
    private short logical_Ack;
    private short sense_Status_Q_Cnt;
    private Fmtvars fmtvars;
    private Userdata userdata;
    private short smt;
    private short fmm_Priority;
    private short msg_Priority;
    private short fmm_Broadcast;
    private Evt_Filt evt_Filt;
    private int queue_Alert_Threshold32;
    private Queue_Limit32Marker queue_Limit32;
    private int smt32;
    private String cts_Local_Addr;
    private String cts_Remote_Addr;
    private int qgc_Depth;
    private String rpc_File;
    private byte rpc_File_Len;
    private String fillrr_050322_1332;
    private String partnerlink;
    private short routetype;
    private short sbr_Force_Local;
    private short sbr_Dist_Global;
    private Tcp_Inaddr_SMarker tcp_Inaddr_S;
    private short tcp_Keepalive;
    private short tcp_Nagle;
    private short tcp_Dialup;
    private short tcp_Zero_Len_Msgs;
    private short tcp_Raddr_In_Udata;
    private short tcp_Broken_Sock_Intrvl;
    private Tcp_Srv_Listen_Line_SMarker tcp_Srv_Listen_Line_S;
    private short ssl_Conn_Timeout;
    private short ssl_Sess_Timeout;
    private short ssl_Srv_Min_Pro_Ver;
    private short ssl_Cli_Min_Pro_Ver;
    private short ssl_Cli_Hello_Pro_Ver;
    private short ssl_Sess_Reuse;
    private short ssl_Client_Auth;
    private short ssl_Allow_Md5sig;
    private short ssl_Cipher_Null;
    private short ssl_Cipher_Des;
    private short ssl_Dn_Match;
    private short ssl_Encryptthenmac;
    private short ssl_Cipher_3des;
    private short ssl_Cipher_Aes128;
    private short ssl_Cipher_Aes256;
    private short ssl_Rfc5746_Init_Negot;
    private short ssl_Rfc5746_Legacy_Cli;
    private short ssl_Rfc5746_Legacy_Srv;
    private short sba_Enabled;
    private Sba_Notify_Service_SMarker sba_Notify_Service_S;
    private short upp_Hdr_Vsn;
    private short ignore_Connid;
    private short rts_Onoff;
    private short lmsg;
    private short dsts_Template;
    private short dsts_Max_Sta;
    private short dsts_Init_Sta;
    private short dsts_Int_Val;
    private Dsts_Prefix_SMarker dsts_Prefix_S;
    private short ssl_Cipher_Aes128gcm;
    private short ssl_Cipher_Aes256gcm;
    private short dsts_Dynamic_Sta;

    @DdlField(Version = "2.0", QualName = "alt-sta-dest", ObjectClass = 1, Level = 1, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 1)
    public String getAlt_Sta_Dest() {
        return alt_Sta_Dest;
    }

    public void setAlt_Sta_Dest(String alt_Sta_DestParam) {
        this.alt_Sta_Dest = alt_Sta_DestParam;
    }

    @DdlField(Version = "2.0", QualName = "alt-sta-dest-number", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 2)
    public short getAlt_Sta_Dest_Number() {
        return alt_Sta_Dest_Number;
    }

    public void setAlt_Sta_Dest_Number(short alt_Sta_Dest_NumberParam) {
        this.alt_Sta_Dest_Number = alt_Sta_Dest_NumberParam;
    }

    @DdlField(Version = "2.0", QualName = "alt-sta-dest-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 18, ElementSize = 2, IdentifierElement = 3)
    public short getAlt_Sta_Dest_Type() {
        return alt_Sta_Dest_Type;
    }

    public void setAlt_Sta_Dest_Type(short alt_Sta_Dest_TypeParam) {
        this.alt_Sta_Dest_Type = alt_Sta_Dest_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-before-usi", ObjectClass = 1, Level = 1, Structure = 2, Offset = 20, ElementSize = 2, IdentifierElement = 4)
    public short getAudit_Before_Usi() {
        return audit_Before_Usi;
    }

    public void setAudit_Before_Usi(short audit_Before_UsiParam) {
        this.audit_Before_Usi = audit_Before_UsiParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-input", ObjectClass = 1, Level = 1, Structure = 2, Offset = 22, ElementSize = 2, IdentifierElement = 5)
    public short getAudit_Input() {
        return audit_Input;
    }

    public void setAudit_Input(short audit_InputParam) {
        this.audit_Input = audit_InputParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-output", ObjectClass = 1, Level = 1, Structure = 2, Offset = 24, ElementSize = 2, IdentifierElement = 6)
    public short getAudit_Output() {
        return audit_Output;
    }

    public void setAudit_Output(short audit_OutputParam) {
        this.audit_Output = audit_OutputParam;
    }

    @DdlField(Version = "2.0", QualName = "autostart-priority", ObjectClass = 1, Level = 1, Structure = 2, Offset = 26, ElementSize = 2, IdentifierElement = 7)
    public short getAutostart_Priority() {
        return autostart_Priority;
    }

    public void setAutostart_Priority(short autostart_PriorityParam) {
        this.autostart_Priority = autostart_PriorityParam;
    }

    @DdlField(Version = "2.0", QualName = "class-var1", ObjectClass = 1, Level = 1, Structure = 0, Offset = 28, ElementSize = 16, IdentifierElement = 8)
    public String getClass_Var1() {
        return class_Var1;
    }

    public void setClass_Var1(String class_Var1Param) {
        this.class_Var1 = class_Var1Param;
    }

    @DdlField(Version = "2.0", QualName = "device-number", ObjectClass = 1, Level = 1, Structure = 2, Offset = 44, ElementSize = 2, IdentifierElement = 9)
    public short getDevice_Number() {
        return device_Number;
    }

    public void setDevice_Number(short device_NumberParam) {
        this.device_Number = device_NumberParam;
    }

    @DdlField(Version = "2.0", QualName = "err-action", ObjectClass = 1, Level = 1, Structure = 2, Offset = 46, ElementSize = 2, IdentifierElement = 10)
    public short getErr_Action() {
        return err_Action;
    }

    public void setErr_Action(short err_ActionParam) {
        this.err_Action = err_ActionParam;
    }

    @DdlField(Version = "2.0", QualName = "group-number", ObjectClass = 1, Level = 1, Structure = 2, Offset = 48, ElementSize = 2, IdentifierElement = 11)
    public short getGroup_Number() {
        return group_Number;
    }

    public void setGroup_Number(short group_NumberParam) {
        this.group_Number = group_NumberParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 50, ElementSize = 16, IdentifierElement = 12)
    public String getLin_Name() {
        return lin_Name;
    }

    public void setLin_Name(String lin_NameParam) {
        this.lin_Name = lin_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-number", ObjectClass = 1, Level = 1, Structure = 2, Offset = 66, ElementSize = 2, IdentifierElement = 13)
    public short getLin_Number() {
        return lin_Number;
    }

    public void setLin_Number(short lin_NumberParam) {
        this.lin_Number = lin_NumberParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-protocol", ObjectClass = 1, Level = 1, Structure = 2, Offset = 68, ElementSize = 2, IdentifierElement = 14)
    public short getLin_Protocol() {
        return lin_Protocol;
    }

    public void setLin_Protocol(short lin_ProtocolParam) {
        this.lin_Protocol = lin_ProtocolParam;
    }

    @DdlField(Version = "2.0", QualName = "ete-protocol", ObjectClass = 1, Level = 1, Structure = 2, Offset = 70, ElementSize = 2, IdentifierElement = 15)
    public short getEte_Protocol() {
        return ete_Protocol;
    }

    public void setEte_Protocol(short ete_ProtocolParam) {
        this.ete_Protocol = ete_ProtocolParam;
    }

    @DdlField(Version = "2.0", QualName = "max-retries", ObjectClass = 1, Level = 1, Structure = 2, Offset = 72, ElementSize = 2, IdentifierElement = 16)
    public short getMax_Retries() {
        return max_Retries;
    }

    public void setMax_Retries(short max_RetriesParam) {
        this.max_Retries = max_RetriesParam;
    }

    @DdlField(Version = "2.0", QualName = "netmode", ObjectClass = 1, Level = 1, Structure = 2, Offset = 74, ElementSize = 2, IdentifierElement = 17)
    public short getNetmode() {
        return netmode;
    }

    public void setNetmode(short netmodeParam) {
        this.netmode = netmodeParam;
    }

    @DdlField(Version = "2.0", QualName = "output-interval", ObjectClass = 1, Level = 1, Structure = 2, Offset = 76, ElementSize = 2, IdentifierElement = 18)
    public short getOutput_Interval() {
        return output_Interval;
    }

    public void setOutput_Interval(short output_IntervalParam) {
        this.output_Interval = output_IntervalParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-alert-threshold", ObjectClass = 1, Level = 1, Structure = 2, Offset = 78, ElementSize = 2, IdentifierElement = 19)
    public short getQueue_Alert_Threshold() {
        return queue_Alert_Threshold;
    }

    public void setQueue_Alert_Threshold(short queue_Alert_ThresholdParam) {
        this.queue_Alert_Threshold = queue_Alert_ThresholdParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-limit", ObjectClass = 1, Level = 1, Structure = 2, Offset = 80, ElementSize = 2, IdentifierElement = 20)
    @ReturnType("kr.co.kcs.oncf.ncp_station.Queue_Limit")
    public Queue_LimitMarker getQueue_Limit() {
        return queue_Limit;
    }

    public void setQueue_Limit(Queue_LimitMarker queue_LimitParam) {
        this.queue_Limit = queue_LimitParam;
    }

    @DdlField(Version = "2.0", QualName = "reinstate-interval", ObjectClass = 1, Level = 1, Structure = 2, Offset = 82, ElementSize = 2, IdentifierElement = 22)
    public short getReinstate_Interval() {
        return reinstate_Interval;
    }

    public void setReinstate_Interval(short reinstate_IntervalParam) {
        this.reinstate_Interval = reinstate_IntervalParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-dest", ObjectClass = 1, Level = 1, Structure = 0, Offset = 84, ElementSize = 16, IdentifierElement = 23)
    public String getSta_Dest() {
        return sta_Dest;
    }

    public void setSta_Dest(String sta_DestParam) {
        this.sta_Dest = sta_DestParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-dest-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 100, ElementSize = 2, IdentifierElement = 24)
    public short getSta_Dest_Type() {
        return sta_Dest_Type;
    }

    public void setSta_Dest_Type(short sta_Dest_TypeParam) {
        this.sta_Dest_Type = sta_Dest_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-dest-number", ObjectClass = 1, Level = 1, Structure = 2, Offset = 102, ElementSize = 2, IdentifierElement = 25)
    public short getSta_Dest_Number() {
        return sta_Dest_Number;
    }

    public void setSta_Dest_Number(short sta_Dest_NumberParam) {
        this.sta_Dest_Number = sta_Dest_NumberParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-number", ObjectClass = 1, Level = 1, Structure = 2, Offset = 104, ElementSize = 2, IdentifierElement = 26)
    public short getSta_Number() {
        return sta_Number;
    }

    public void setSta_Number(short sta_NumberParam) {
        this.sta_Number = sta_NumberParam;
    }

    @DdlField(Version = "2.0", QualName = "terminal-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 106, ElementSize = 2, IdentifierElement = 27)
    public short getTerminal_Type() {
        return terminal_Type;
    }

    public void setTerminal_Type(short terminal_TypeParam) {
        this.terminal_Type = terminal_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "uc-queue", ObjectClass = 1, Level = 1, Structure = 0, Offset = 108, ElementSize = 14, IdentifierElement = 28)
    public String getUc_Queue() {
        return uc_Queue;
    }

    public void setUc_Queue(String uc_QueueParam) {
        this.uc_Queue = uc_QueueParam;
    }

    @DdlField(Version = "2.0", QualName = "uc-rate", ObjectClass = 1, Level = 1, Structure = 0, Offset = 122, ElementSize = 14, IdentifierElement = 29)
    public String getUc_Rate() {
        return uc_Rate;
    }

    public void setUc_Rate(String uc_RateParam) {
        this.uc_Rate = uc_RateParam;
    }

    @DdlField(Version = "2.0", QualName = "uc-state", ObjectClass = 1, Level = 1, Structure = 0, Offset = 136, ElementSize = 14, IdentifierElement = 30)
    public String getUc_State() {
        return uc_State;
    }

    public void setUc_State(String uc_StateParam) {
        this.uc_State = uc_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "warmstart-priority", ObjectClass = 1, Level = 1, Structure = 2, Offset = 150, ElementSize = 2, IdentifierElement = 31)
    public short getWarmstart_Priority() {
        return warmstart_Priority;
    }

    public void setWarmstart_Priority(short warmstart_PriorityParam) {
        this.warmstart_Priority = warmstart_PriorityParam;
    }

    @DdlField(Version = "2.0", QualName = "end-bracket", ObjectClass = 1, Level = 1, Structure = 2, Offset = 152, ElementSize = 2, IdentifierElement = 32)
    @ReturnType("kr.co.kcs.oncf.ncp_station.End_Bracket")
    public End_BracketMarker getEnd_Bracket() {
        return end_Bracket;
    }

    public void setEnd_Bracket(End_BracketMarker end_BracketParam) {
        this.end_Bracket = end_BracketParam;
    }

    @DdlField(Version = "2.0", QualName = "localtpname", ObjectClass = 1, Level = 1, Structure = 0, Offset = 154, ElementSize = 16, IdentifierElement = 35)
    @ReturnType("kr.co.kcs.oncf.ncp_station.Localtpname")
    public LocaltpnameMarker getLocaltpname() {
        return localtpname;
    }

    public void setLocaltpname(LocaltpnameMarker localtpnameParam) {
        this.localtpname = localtpnameParam;
    }

    @DdlField(Version = "2.0", QualName = "modename", ObjectClass = 1, Level = 1, Structure = 0, Offset = 170, ElementSize = 8, IdentifierElement = 37)
    @ReturnType("kr.co.kcs.oncf.ncp_station.Modename")
    public ModenameMarker getModename() {
        return modename;
    }

    public void setModename(ModenameMarker modenameParam) {
        this.modename = modenameParam;
    }

    @DdlField(Version = "2.0", QualName = "partnertpname", ObjectClass = 1, Level = 1, Structure = 0, Offset = 178, ElementSize = 16, IdentifierElement = 39)
    @ReturnType("kr.co.kcs.oncf.ncp_station.Partnertpname")
    public PartnertpnameMarker getPartnertpname() {
        return partnertpname;
    }

    public void setPartnertpname(PartnertpnameMarker partnertpnameParam) {
        this.partnertpname = partnertpnameParam;
    }

    @DdlField(Version = "2.0", QualName = "poll-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 194, ElementSize = 8, IdentifierElement = 41)
    @ReturnType("kr.co.kcs.oncf.ncp_station.Poll_Address")
    public Poll_AddressMarker getPoll_Address() {
        return poll_Address;
    }

    public void setPoll_Address(Poll_AddressMarker poll_AddressParam) {
        this.poll_Address = poll_AddressParam;
    }

    @DdlField(Version = "2.0", QualName = "select-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 202, ElementSize = 8, IdentifierElement = 51)
    @ReturnType("kr.co.kcs.oncf.ncp_station.Select_Address")
    public Select_AddressMarker getSelect_Address() {
        return select_Address;
    }

    public void setSelect_Address(Select_AddressMarker select_AddressParam) {
        this.select_Address = select_AddressParam;
    }

    @DdlField(Version = "2.0", QualName = "start-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 210, ElementSize = 2, IdentifierElement = 60)
    @ReturnType("kr.co.kcs.oncf.ncp_station.Start_Type")
    public Start_TypeMarker getStart_Type() {
        return start_Type;
    }

    public void setStart_Type(Start_TypeMarker start_TypeParam) {
        this.start_Type = start_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-pollable", ObjectClass = 1, Level = 1, Structure = 2, Offset = 212, ElementSize = 2, IdentifierElement = 62)
    @ReturnType("kr.co.kcs.oncf.ncp_station.Sta_Pollable")
    public Sta_PollableMarker getSta_Pollable() {
        return sta_Pollable;
    }

    public void setSta_Pollable(Sta_PollableMarker sta_PollableParam) {
        this.sta_Pollable = sta_PollableParam;
    }

    @DdlField(Version = "2.0", QualName = "local-addr", ObjectClass = 1, Level = 1, Structure = 0, Offset = 214, ElementSize = 24, IdentifierElement = 72)
    public String getLocal_Addr() {
        return local_Addr;
    }

    public void setLocal_Addr(String local_AddrParam) {
        this.local_Addr = local_AddrParam;
    }

    @DdlField(Version = "2.0", QualName = "remote-addr", ObjectClass = 1, Level = 1, Structure = 0, Offset = 238, ElementSize = 24, IdentifierElement = 73)
    public String getRemote_Addr() {
        return remote_Addr;
    }

    public void setRemote_Addr(String remote_AddrParam) {
        this.remote_Addr = remote_AddrParam;
    }

    @DdlField(Version = "2.0", QualName = "conn-spec", ObjectClass = 1, Level = 1, Structure = 0, Offset = 262, ElementSize = 8, IdentifierElement = 74)
    public String getConn_Spec() {
        return conn_Spec;
    }

    public void setConn_Spec(String conn_SpecParam) {
        this.conn_Spec = conn_SpecParam;
    }

    @DdlField(Version = "2.0", QualName = "saved-msgs", ObjectClass = 1, Level = 1, Structure = 2, Offset = 270, ElementSize = 2, IdentifierElement = 75)
    @ReturnType("kr.co.kcs.oncf.ncp_station.Saved_Msgs")
    public Saved_MsgsMarker getSaved_Msgs() {
        return saved_Msgs;
    }

    public void setSaved_Msgs(Saved_MsgsMarker saved_MsgsParam) {
        this.saved_Msgs = saved_MsgsParam;
    }

    @DdlField(Version = "2.0", QualName = "seq-verify", ObjectClass = 1, Level = 1, Structure = 2, Offset = 272, ElementSize = 2, IdentifierElement = 78)
    @ReturnType("kr.co.kcs.oncf.ncp_station.Seq_Verify")
    public Seq_VerifyMarker getSeq_Verify() {
        return seq_Verify;
    }

    public void setSeq_Verify(Seq_VerifyMarker seq_VerifyParam) {
        this.seq_Verify = seq_VerifyParam;
    }

    @DdlField(Version = "2.0", QualName = "qmi", ObjectClass = 1, Level = 1, Structure = 2, Offset = 274, ElementSize = 2, IdentifierElement = 81)
    public short getQmi() {
        return qmi;
    }

    public void setQmi(short qmiParam) {
        this.qmi = qmiParam;
    }

    @DdlField(Version = "2.0", QualName = "srcclass", ObjectClass = 1, Level = 1, Structure = 0, Offset = 276, ElementSize = 4, IdentifierElement = 82)
    public String getSrcclass() {
        return srcclass;
    }

    public void setSrcclass(String srcclassParam) {
        this.srcclass = srcclassParam;
    }

    @DdlField(Version = "2.0", QualName = "class32", ObjectClass = 1, Level = 1, Structure = 0, Offset = 280, ElementSize = 32, IdentifierElement = 83)
    public String getClass32() {
        return class32;
    }

    public void setClass32(String class32Param) {
        this.class32 = class32Param;
    }

    @DdlField(Version = "2.0", QualName = "set-nom-override", ObjectClass = 1, Level = 1, Structure = 2, Offset = 312, ElementSize = 2, IdentifierElement = 84)
    public short getSet_Nom_Override() {
        return set_Nom_Override;
    }

    public void setSet_Nom_Override(short set_Nom_OverrideParam) {
        this.set_Nom_Override = set_Nom_OverrideParam;
    }

    @DdlField(Version = "2.0", QualName = "passfmh", ObjectClass = 1, Level = 1, Structure = 2, Offset = 314, ElementSize = 2, IdentifierElement = 85)
    public short getPassfmh() {
        return passfmh;
    }

    public void setPassfmh(short passfmhParam) {
        this.passfmh = passfmhParam;
    }

    @DdlField(Version = "2.0", QualName = "applrej", ObjectClass = 1, Level = 1, Structure = 2, Offset = 316, ElementSize = 2, IdentifierElement = 86)
    public short getApplrej() {
        return applrej;
    }

    public void setApplrej(short applrejParam) {
        this.applrej = applrejParam;
    }

    @DdlField(Version = "2.0", QualName = "device-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 318, ElementSize = 16, IdentifierElement = 87)
    public String getDevice_Name() {
        return device_Name;
    }

    public void setDevice_Name(String device_NameParam) {
        this.device_Name = device_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "service", ObjectClass = 1, Level = 1, Structure = 0, Offset = 334, ElementSize = 32, IdentifierElement = 88)
    public String getService() {
        return service;
    }

    public void setService(String serviceParam) {
        this.service = serviceParam;
    }

    @DdlField(Version = "2.0", QualName = "tributary-of", ObjectClass = 1, Level = 1, Structure = 0, Offset = 366, ElementSize = 16, IdentifierElement = 89)
    public String getTributary_Of() {
        return tributary_Of;
    }

    public void setTributary_Of(String tributary_OfParam) {
        this.tributary_Of = tributary_OfParam;
    }

    @DdlField(Version = "2.0", QualName = "symbolic-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 382, ElementSize = 16, IdentifierElement = 90)
    public String getSymbolic_Name() {
        return symbolic_Name;
    }

    public void setSymbolic_Name(String symbolic_NameParam) {
        this.symbolic_Name = symbolic_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-enabled", ObjectClass = 1, Level = 1, Structure = 2, Offset = 398, ElementSize = 2, IdentifierElement = 91)
    public short getLin_Enabled() {
        return lin_Enabled;
    }

    public void setLin_Enabled(short lin_EnabledParam) {
        this.lin_Enabled = lin_EnabledParam;
    }

    @DdlField(Version = "2.0", QualName = "invalid-var1", ObjectClass = 1, Level = 1, Structure = 2, Offset = 400, ElementSize = 2, IdentifierElement = 92)
    public short getInvalid_Var1() {
        return invalid_Var1;
    }

    public void setInvalid_Var1(short invalid_Var1Param) {
        this.invalid_Var1 = invalid_Var1Param;
    }

    @DdlField(Version = "2.0", QualName = "logical-ack", ObjectClass = 1, Level = 1, Structure = 2, Offset = 402, ElementSize = 2, IdentifierElement = 93)
    public short getLogical_Ack() {
        return logical_Ack;
    }

    public void setLogical_Ack(short logical_AckParam) {
        this.logical_Ack = logical_AckParam;
    }

    @DdlField(Version = "2.0", QualName = "sense-status-q-cnt", ObjectClass = 1, Level = 1, Structure = 2, Offset = 404, ElementSize = 2, IdentifierElement = 94)
    public short getSense_Status_Q_Cnt() {
        return sense_Status_Q_Cnt;
    }

    public void setSense_Status_Q_Cnt(short sense_Status_Q_CntParam) {
        this.sense_Status_Q_Cnt = sense_Status_Q_CntParam;
    }

    @DdlField(Version = "2.0", QualName = "fmtvars", ObjectClass = 0, Level = 1, Structure = 0, Offset = 406, ElementSize = 82, IdentifierElement = 95)
    public Fmtvars getFmtvars() {
        return fmtvars;
    }

    public void setFmtvars(Fmtvars fmtvarsParam) {
        this.fmtvars = fmtvarsParam;
    }

    @DdlField(Version = "2.0", QualName = "userdata", ObjectClass = 0, Level = 1, Structure = 0, Offset = 488, ElementSize = 218, IdentifierElement = 98)
    public Userdata getUserdata() {
        return userdata;
    }

    public void setUserdata(Userdata userdataParam) {
        this.userdata = userdataParam;
    }

    @DdlField(Version = "2.0", QualName = "smt", ObjectClass = 1, Level = 1, Structure = 2, Offset = 706, ElementSize = 2, IdentifierElement = 102)
    public short getSmt() {
        return smt;
    }

    public void setSmt(short smtParam) {
        this.smt = smtParam;
    }

    @DdlField(Version = "2.0", QualName = "fmm-priority", ObjectClass = 1, Level = 1, Structure = 2, Offset = 708, ElementSize = 2, IdentifierElement = 103)
    public short getFmm_Priority() {
        return fmm_Priority;
    }

    public void setFmm_Priority(short fmm_PriorityParam) {
        this.fmm_Priority = fmm_PriorityParam;
    }

    @DdlField(Version = "2.0", QualName = "msg-priority", ObjectClass = 1, Level = 1, Structure = 2, Offset = 710, ElementSize = 2, IdentifierElement = 104)
    public short getMsg_Priority() {
        return msg_Priority;
    }

    public void setMsg_Priority(short msg_PriorityParam) {
        this.msg_Priority = msg_PriorityParam;
    }

    @DdlField(Version = "2.0", QualName = "fmm-broadcast", ObjectClass = 1, Level = 1, Structure = 2, Offset = 712, ElementSize = 2, IdentifierElement = 105)
    public short getFmm_Broadcast() {
        return fmm_Broadcast;
    }

    public void setFmm_Broadcast(short fmm_BroadcastParam) {
        this.fmm_Broadcast = fmm_BroadcastParam;
    }

    @DdlField(Version = "2.0", QualName = "evt-filt", ObjectClass = 0, Level = 1, Structure = 0, Offset = 714, ElementSize = 32, IdentifierElement = 106)
    public Evt_Filt getEvt_Filt() {
        return evt_Filt;
    }

    public void setEvt_Filt(Evt_Filt evt_FiltParam) {
        this.evt_Filt = evt_FiltParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-alert-threshold32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 746, ElementSize = 4, IdentifierElement = 118)
    public int getQueue_Alert_Threshold32() {
        return queue_Alert_Threshold32;
    }

    public void setQueue_Alert_Threshold32(int queue_Alert_Threshold32Param) {
        this.queue_Alert_Threshold32 = queue_Alert_Threshold32Param;
    }

    @DdlField(Version = "2.0", QualName = "queue-limit32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 750, ElementSize = 4, IdentifierElement = 119)
    @ReturnType("kr.co.kcs.oncf.ncp_station.Queue_Limit32")
    public Queue_Limit32Marker getQueue_Limit32() {
        return queue_Limit32;
    }

    public void setQueue_Limit32(Queue_Limit32Marker queue_Limit32Param) {
        this.queue_Limit32 = queue_Limit32Param;
    }

    @DdlField(Version = "2.0", QualName = "smt32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 754, ElementSize = 4, IdentifierElement = 121)
    public int getSmt32() {
        return smt32;
    }

    public void setSmt32(int smt32Param) {
        this.smt32 = smt32Param;
    }

    @DdlField(Version = "2.0", QualName = "cts-local-addr", ObjectClass = 1, Level = 1, Structure = 0, Offset = 758, ElementSize = 56, IdentifierElement = 122)
    public String getCts_Local_Addr() {
        return cts_Local_Addr;
    }

    public void setCts_Local_Addr(String cts_Local_AddrParam) {
        this.cts_Local_Addr = cts_Local_AddrParam;
    }

    @DdlField(Version = "2.0", QualName = "cts-remote-addr", ObjectClass = 1, Level = 1, Structure = 0, Offset = 814, ElementSize = 56, IdentifierElement = 123)
    public String getCts_Remote_Addr() {
        return cts_Remote_Addr;
    }

    public void setCts_Remote_Addr(String cts_Remote_AddrParam) {
        this.cts_Remote_Addr = cts_Remote_AddrParam;
    }

    @DdlField(Version = "2.0", QualName = "qgc-depth", ObjectClass = 1, Level = 1, Structure = 4, Offset = 870, ElementSize = 4, IdentifierElement = 124)
    public int getQgc_Depth() {
        return qgc_Depth;
    }

    public void setQgc_Depth(int qgc_DepthParam) {
        this.qgc_Depth = qgc_DepthParam;
    }

    @DdlField(Version = "2.0", QualName = "rpc-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 874, ElementSize = 35, IdentifierElement = 125)
    public String getRpc_File() {
        return rpc_File;
    }

    public void setRpc_File(String rpc_FileParam) {
        this.rpc_File = rpc_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "rpc-file-len", ObjectClass = 1, Level = 1, Structure = 22, Offset = 909, ElementSize = 1, IdentifierElement = 126)
    public byte getRpc_File_Len() {
        return rpc_File_Len;
    }

    public void setRpc_File_Len(byte rpc_File_LenParam) {
        this.rpc_File_Len = rpc_File_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "fillrr-050322-1332", ObjectClass = 1, Level = 1, Structure = 0, Offset = 910, ElementSize = 72, IdentifierElement = 127)
    public String getFillrr_050322_1332() {
        return fillrr_050322_1332;
    }

    public void setFillrr_050322_1332(String fillrr_050322_1332Param) {
        this.fillrr_050322_1332 = fillrr_050322_1332Param;
    }

    @DdlField(Version = "2.0", QualName = "partnerlink", ObjectClass = 1, Level = 1, Structure = 0, Offset = 982, ElementSize = 16, IdentifierElement = 128)
    public String getPartnerlink() {
        return partnerlink;
    }

    public void setPartnerlink(String partnerlinkParam) {
        this.partnerlink = partnerlinkParam;
    }

    @DdlField(Version = "2.0", QualName = "routetype", ObjectClass = 1, Level = 1, Structure = 2, Offset = 998, ElementSize = 2, IdentifierElement = 129)
    public short getRoutetype() {
        return routetype;
    }

    public void setRoutetype(short routetypeParam) {
        this.routetype = routetypeParam;
    }

    @DdlField(Version = "2.0", QualName = "sbr-force-local", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1000, ElementSize = 2, IdentifierElement = 130)
    public short getSbr_Force_Local() {
        return sbr_Force_Local;
    }

    public void setSbr_Force_Local(short sbr_Force_LocalParam) {
        this.sbr_Force_Local = sbr_Force_LocalParam;
    }

    @DdlField(Version = "2.0", QualName = "sbr-dist-global", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1002, ElementSize = 2, IdentifierElement = 131)
    public short getSbr_Dist_Global() {
        return sbr_Dist_Global;
    }

    public void setSbr_Dist_Global(short sbr_Dist_GlobalParam) {
        this.sbr_Dist_Global = sbr_Dist_GlobalParam;
    }

    @DdlField(Version = "2.0", QualName = "tcp-inaddr-s", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1004, ElementSize = 56, IdentifierElement = 132)
    @ReturnType("kr.co.kcs.oncf.ncp_station.Tcp_Inaddr_S")
    public Tcp_Inaddr_SMarker getTcp_Inaddr_S() {
        return tcp_Inaddr_S;
    }

    public void setTcp_Inaddr_S(Tcp_Inaddr_SMarker tcp_Inaddr_SParam) {
        this.tcp_Inaddr_S = tcp_Inaddr_SParam;
    }

    @DdlField(Version = "2.0", QualName = "tcp-keepalive", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1060, ElementSize = 2, IdentifierElement = 134)
    public short getTcp_Keepalive() {
        return tcp_Keepalive;
    }

    public void setTcp_Keepalive(short tcp_KeepaliveParam) {
        this.tcp_Keepalive = tcp_KeepaliveParam;
    }

    @DdlField(Version = "2.0", QualName = "tcp-nagle", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1062, ElementSize = 2, IdentifierElement = 135)
    public short getTcp_Nagle() {
        return tcp_Nagle;
    }

    public void setTcp_Nagle(short tcp_NagleParam) {
        this.tcp_Nagle = tcp_NagleParam;
    }

    @DdlField(Version = "2.0", QualName = "tcp-dialup", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1064, ElementSize = 2, IdentifierElement = 136)
    public short getTcp_Dialup() {
        return tcp_Dialup;
    }

    public void setTcp_Dialup(short tcp_DialupParam) {
        this.tcp_Dialup = tcp_DialupParam;
    }

    @DdlField(Version = "2.0", QualName = "tcp-zero-len-msgs", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1066, ElementSize = 2, IdentifierElement = 137)
    public short getTcp_Zero_Len_Msgs() {
        return tcp_Zero_Len_Msgs;
    }

    public void setTcp_Zero_Len_Msgs(short tcp_Zero_Len_MsgsParam) {
        this.tcp_Zero_Len_Msgs = tcp_Zero_Len_MsgsParam;
    }

    @DdlField(Version = "2.0", QualName = "tcp-raddr-in-udata", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1068, ElementSize = 2, IdentifierElement = 138)
    public short getTcp_Raddr_In_Udata() {
        return tcp_Raddr_In_Udata;
    }

    public void setTcp_Raddr_In_Udata(short tcp_Raddr_In_UdataParam) {
        this.tcp_Raddr_In_Udata = tcp_Raddr_In_UdataParam;
    }

    @DdlField(Version = "2.0", QualName = "tcp-broken-sock-intrvl", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1070, ElementSize = 2, IdentifierElement = 139)
    public short getTcp_Broken_Sock_Intrvl() {
        return tcp_Broken_Sock_Intrvl;
    }

    public void setTcp_Broken_Sock_Intrvl(short tcp_Broken_Sock_IntrvlParam) {
        this.tcp_Broken_Sock_Intrvl = tcp_Broken_Sock_IntrvlParam;
    }

    @DdlField(Version = "2.0", QualName = "tcp-srv-listen-line-s", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1072, ElementSize = 16, IdentifierElement = 140)
    @ReturnType("kr.co.kcs.oncf.ncp_station.Tcp_Srv_Listen_Line_S")
    public Tcp_Srv_Listen_Line_SMarker getTcp_Srv_Listen_Line_S() {
        return tcp_Srv_Listen_Line_S;
    }

    public void setTcp_Srv_Listen_Line_S(Tcp_Srv_Listen_Line_SMarker tcp_Srv_Listen_Line_SParam) {
        this.tcp_Srv_Listen_Line_S = tcp_Srv_Listen_Line_SParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-conn-timeout", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1088, ElementSize = 2, IdentifierElement = 142)
    public short getSsl_Conn_Timeout() {
        return ssl_Conn_Timeout;
    }

    public void setSsl_Conn_Timeout(short ssl_Conn_TimeoutParam) {
        this.ssl_Conn_Timeout = ssl_Conn_TimeoutParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-sess-timeout", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1090, ElementSize = 2, IdentifierElement = 143)
    public short getSsl_Sess_Timeout() {
        return ssl_Sess_Timeout;
    }

    public void setSsl_Sess_Timeout(short ssl_Sess_TimeoutParam) {
        this.ssl_Sess_Timeout = ssl_Sess_TimeoutParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-srv-min-pro-ver", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1092, ElementSize = 2, IdentifierElement = 144)
    public short getSsl_Srv_Min_Pro_Ver() {
        return ssl_Srv_Min_Pro_Ver;
    }

    public void setSsl_Srv_Min_Pro_Ver(short ssl_Srv_Min_Pro_VerParam) {
        this.ssl_Srv_Min_Pro_Ver = ssl_Srv_Min_Pro_VerParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-cli-min-pro-ver", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1094, ElementSize = 2, IdentifierElement = 145)
    public short getSsl_Cli_Min_Pro_Ver() {
        return ssl_Cli_Min_Pro_Ver;
    }

    public void setSsl_Cli_Min_Pro_Ver(short ssl_Cli_Min_Pro_VerParam) {
        this.ssl_Cli_Min_Pro_Ver = ssl_Cli_Min_Pro_VerParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-cli-hello-pro-ver", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1096, ElementSize = 2, IdentifierElement = 146)
    public short getSsl_Cli_Hello_Pro_Ver() {
        return ssl_Cli_Hello_Pro_Ver;
    }

    public void setSsl_Cli_Hello_Pro_Ver(short ssl_Cli_Hello_Pro_VerParam) {
        this.ssl_Cli_Hello_Pro_Ver = ssl_Cli_Hello_Pro_VerParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-sess-reuse", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1098, ElementSize = 2, IdentifierElement = 147)
    public short getSsl_Sess_Reuse() {
        return ssl_Sess_Reuse;
    }

    public void setSsl_Sess_Reuse(short ssl_Sess_ReuseParam) {
        this.ssl_Sess_Reuse = ssl_Sess_ReuseParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-client-auth", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1100, ElementSize = 2, IdentifierElement = 148)
    public short getSsl_Client_Auth() {
        return ssl_Client_Auth;
    }

    public void setSsl_Client_Auth(short ssl_Client_AuthParam) {
        this.ssl_Client_Auth = ssl_Client_AuthParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-allow-md5sig", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1102, ElementSize = 2, IdentifierElement = 149)
    public short getSsl_Allow_Md5sig() {
        return ssl_Allow_Md5sig;
    }

    public void setSsl_Allow_Md5sig(short ssl_Allow_Md5sigParam) {
        this.ssl_Allow_Md5sig = ssl_Allow_Md5sigParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-cipher-null", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1104, ElementSize = 2, IdentifierElement = 150)
    public short getSsl_Cipher_Null() {
        return ssl_Cipher_Null;
    }

    public void setSsl_Cipher_Null(short ssl_Cipher_NullParam) {
        this.ssl_Cipher_Null = ssl_Cipher_NullParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-cipher-des", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1106, ElementSize = 2, IdentifierElement = 151)
    public short getSsl_Cipher_Des() {
        return ssl_Cipher_Des;
    }

    public void setSsl_Cipher_Des(short ssl_Cipher_DesParam) {
        this.ssl_Cipher_Des = ssl_Cipher_DesParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-dn-match", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1108, ElementSize = 2, IdentifierElement = 152)
    public short getSsl_Dn_Match() {
        return ssl_Dn_Match;
    }

    public void setSsl_Dn_Match(short ssl_Dn_MatchParam) {
        this.ssl_Dn_Match = ssl_Dn_MatchParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-encryptthenmac", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1110, ElementSize = 2, IdentifierElement = 153)
    public short getSsl_Encryptthenmac() {
        return ssl_Encryptthenmac;
    }

    public void setSsl_Encryptthenmac(short ssl_EncryptthenmacParam) {
        this.ssl_Encryptthenmac = ssl_EncryptthenmacParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-cipher-3des", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1112, ElementSize = 2, IdentifierElement = 154)
    public short getSsl_Cipher_3des() {
        return ssl_Cipher_3des;
    }

    public void setSsl_Cipher_3des(short ssl_Cipher_3desParam) {
        this.ssl_Cipher_3des = ssl_Cipher_3desParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-cipher-aes128", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1114, ElementSize = 2, IdentifierElement = 155)
    public short getSsl_Cipher_Aes128() {
        return ssl_Cipher_Aes128;
    }

    public void setSsl_Cipher_Aes128(short ssl_Cipher_Aes128Param) {
        this.ssl_Cipher_Aes128 = ssl_Cipher_Aes128Param;
    }

    @DdlField(Version = "2.0", QualName = "ssl-cipher-aes256", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1116, ElementSize = 2, IdentifierElement = 156)
    public short getSsl_Cipher_Aes256() {
        return ssl_Cipher_Aes256;
    }

    public void setSsl_Cipher_Aes256(short ssl_Cipher_Aes256Param) {
        this.ssl_Cipher_Aes256 = ssl_Cipher_Aes256Param;
    }

    @DdlField(Version = "2.0", QualName = "ssl-rfc5746-init-negot", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1118, ElementSize = 2, IdentifierElement = 157)
    public short getSsl_Rfc5746_Init_Negot() {
        return ssl_Rfc5746_Init_Negot;
    }

    public void setSsl_Rfc5746_Init_Negot(short ssl_Rfc5746_Init_NegotParam) {
        this.ssl_Rfc5746_Init_Negot = ssl_Rfc5746_Init_NegotParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-rfc5746-legacy-cli", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1120, ElementSize = 2, IdentifierElement = 158)
    public short getSsl_Rfc5746_Legacy_Cli() {
        return ssl_Rfc5746_Legacy_Cli;
    }

    public void setSsl_Rfc5746_Legacy_Cli(short ssl_Rfc5746_Legacy_CliParam) {
        this.ssl_Rfc5746_Legacy_Cli = ssl_Rfc5746_Legacy_CliParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-rfc5746-legacy-srv", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1122, ElementSize = 2, IdentifierElement = 159)
    public short getSsl_Rfc5746_Legacy_Srv() {
        return ssl_Rfc5746_Legacy_Srv;
    }

    public void setSsl_Rfc5746_Legacy_Srv(short ssl_Rfc5746_Legacy_SrvParam) {
        this.ssl_Rfc5746_Legacy_Srv = ssl_Rfc5746_Legacy_SrvParam;
    }

    @DdlField(Version = "2.0", QualName = "sba-enabled", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1124, ElementSize = 2, IdentifierElement = 160)
    public short getSba_Enabled() {
        return sba_Enabled;
    }

    public void setSba_Enabled(short sba_EnabledParam) {
        this.sba_Enabled = sba_EnabledParam;
    }

    @DdlField(Version = "2.0", QualName = "sba-notify-service-s", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1126, ElementSize = 16, IdentifierElement = 161)
    @ReturnType("kr.co.kcs.oncf.ncp_station.Sba_Notify_Service_S")
    public Sba_Notify_Service_SMarker getSba_Notify_Service_S() {
        return sba_Notify_Service_S;
    }

    public void setSba_Notify_Service_S(Sba_Notify_Service_SMarker sba_Notify_Service_SParam) {
        this.sba_Notify_Service_S = sba_Notify_Service_SParam;
    }

    @DdlField(Version = "2.0", QualName = "upp-hdr-vsn", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1142, ElementSize = 2, IdentifierElement = 163)
    public short getUpp_Hdr_Vsn() {
        return upp_Hdr_Vsn;
    }

    public void setUpp_Hdr_Vsn(short upp_Hdr_VsnParam) {
        this.upp_Hdr_Vsn = upp_Hdr_VsnParam;
    }

    @DdlField(Version = "2.0", QualName = "ignore-connid", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1144, ElementSize = 2, IdentifierElement = 164)
    public short getIgnore_Connid() {
        return ignore_Connid;
    }

    public void setIgnore_Connid(short ignore_ConnidParam) {
        this.ignore_Connid = ignore_ConnidParam;
    }

    @DdlField(Version = "2.0", QualName = "rts-onoff", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1146, ElementSize = 2, IdentifierElement = 165)
    public short getRts_Onoff() {
        return rts_Onoff;
    }

    public void setRts_Onoff(short rts_OnoffParam) {
        this.rts_Onoff = rts_OnoffParam;
    }

    @DdlField(Version = "2.0", QualName = "lmsg", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1148, ElementSize = 2, IdentifierElement = 166)
    public short getLmsg() {
        return lmsg;
    }

    public void setLmsg(short lmsgParam) {
        this.lmsg = lmsgParam;
    }

    @DdlField(Version = "2.0", QualName = "dsts-template", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1150, ElementSize = 2, IdentifierElement = 167)
    public short getDsts_Template() {
        return dsts_Template;
    }

    public void setDsts_Template(short dsts_TemplateParam) {
        this.dsts_Template = dsts_TemplateParam;
    }

    @DdlField(Version = "2.0", QualName = "dsts-max-sta", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1152, ElementSize = 2, IdentifierElement = 168)
    public short getDsts_Max_Sta() {
        return dsts_Max_Sta;
    }

    public void setDsts_Max_Sta(short dsts_Max_StaParam) {
        this.dsts_Max_Sta = dsts_Max_StaParam;
    }

    @DdlField(Version = "2.0", QualName = "dsts-init-sta", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1154, ElementSize = 2, IdentifierElement = 169)
    public short getDsts_Init_Sta() {
        return dsts_Init_Sta;
    }

    public void setDsts_Init_Sta(short dsts_Init_StaParam) {
        this.dsts_Init_Sta = dsts_Init_StaParam;
    }

    @DdlField(Version = "2.0", QualName = "dsts-int-val", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1156, ElementSize = 2, IdentifierElement = 170)
    public short getDsts_Int_Val() {
        return dsts_Int_Val;
    }

    public void setDsts_Int_Val(short dsts_Int_ValParam) {
        this.dsts_Int_Val = dsts_Int_ValParam;
    }

    @DdlField(Version = "2.0", QualName = "dsts-prefix-s", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1158, ElementSize = 12, IdentifierElement = 171)
    @ReturnType("kr.co.kcs.oncf.ncp_station.Dsts_Prefix_S")
    public Dsts_Prefix_SMarker getDsts_Prefix_S() {
        return dsts_Prefix_S;
    }

    public void setDsts_Prefix_S(Dsts_Prefix_SMarker dsts_Prefix_SParam) {
        this.dsts_Prefix_S = dsts_Prefix_SParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-cipher-aes128gcm", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1170, ElementSize = 2, IdentifierElement = 173)
    public short getSsl_Cipher_Aes128gcm() {
        return ssl_Cipher_Aes128gcm;
    }

    public void setSsl_Cipher_Aes128gcm(short ssl_Cipher_Aes128gcmParam) {
        this.ssl_Cipher_Aes128gcm = ssl_Cipher_Aes128gcmParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-cipher-aes256gcm", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1172, ElementSize = 2, IdentifierElement = 174)
    public short getSsl_Cipher_Aes256gcm() {
        return ssl_Cipher_Aes256gcm;
    }

    public void setSsl_Cipher_Aes256gcm(short ssl_Cipher_Aes256gcmParam) {
        this.ssl_Cipher_Aes256gcm = ssl_Cipher_Aes256gcmParam;
    }

    @DdlField(Version = "2.0", QualName = "dsts-dynamic-sta", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1174, ElementSize = 2, IdentifierElement = 175)
    public short getDsts_Dynamic_Sta() {
        return dsts_Dynamic_Sta;
    }

    public void setDsts_Dynamic_Sta(short dsts_Dynamic_StaParam) {
        this.dsts_Dynamic_Sta = dsts_Dynamic_StaParam;
    }

}
