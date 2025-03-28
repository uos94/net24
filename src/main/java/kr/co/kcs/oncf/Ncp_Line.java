
package kr.co.kcs.oncf;

import java.io.Serializable;

import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

import kr.co.kcs.oncf.ncp_line.A_TimerMarker;
import kr.co.kcs.oncf.ncp_line.B_TimerMarker;
import kr.co.kcs.oncf.ncp_line.Control_BiasMarker;
import kr.co.kcs.oncf.ncp_line.ConversationalMarker;
import kr.co.kcs.oncf.ncp_line.Ctlunit_CharactersMarker;
import kr.co.kcs.oncf.ncp_line.Data_TimeoutMarker;
import kr.co.kcs.oncf.ncp_line.Devunit_CharactersMarker;
import kr.co.kcs.oncf.ncp_line.Disconnect_AfterMarker;
import kr.co.kcs.oncf.ncp_line.DuplexMarker;
import kr.co.kcs.oncf.ncp_line.Enq_DelayMarker;
import kr.co.kcs.oncf.ncp_line.Evt_Filt;
import kr.co.kcs.oncf.ncp_line.Give_TknsMarker;
import kr.co.kcs.oncf.ncp_line.InterfaceMarker;
import kr.co.kcs.oncf.ncp_line.Io_BiasMarker;
import kr.co.kcs.oncf.ncp_line.Lin_ModeMarker;
import kr.co.kcs.oncf.ncp_line.Lin_PrimaryMarker;
import kr.co.kcs.oncf.ncp_line.Lin_SpeedMarker;
import kr.co.kcs.oncf.ncp_line.Lin_TypeMarker;
import kr.co.kcs.oncf.ncp_line.Local_LunameMarker;
import kr.co.kcs.oncf.ncp_line.Make_CallMarker;
import kr.co.kcs.oncf.ncp_line.Make_Initial_CallMarker;
import kr.co.kcs.oncf.ncp_line.MappedMarker;
import kr.co.kcs.oncf.ncp_line.No_Connect_MsgMarker;
import kr.co.kcs.oncf.ncp_line.OriginateMarker;
import kr.co.kcs.oncf.ncp_line.Os5_MgrMarker;
import kr.co.kcs.oncf.ncp_line.Output_BiasMarker;
import kr.co.kcs.oncf.ncp_line.Parity_FlgMarker;
import kr.co.kcs.oncf.ncp_line.Partner_LunameMarker;
import kr.co.kcs.oncf.ncp_line.Permanent_CircuitMarker;
import kr.co.kcs.oncf.ncp_line.Poll_IntervalMarker;
import kr.co.kcs.oncf.ncp_line.Poll_MethodMarker;
import kr.co.kcs.oncf.ncp_line.Recall_DelayMarker;
import kr.co.kcs.oncf.ncp_line.Remote_AddressMarker;
import kr.co.kcs.oncf.ncp_line.Resp_TimeoutMarker;
import kr.co.kcs.oncf.ncp_line.Rvi_LevelMarker;
import kr.co.kcs.oncf.ncp_line.Send_FlushMarker;
import kr.co.kcs.oncf.ncp_line.Service_IntervalMarker;
import kr.co.kcs.oncf.ncp_line.Simplex_SendMarker;
import kr.co.kcs.oncf.ncp_line.Sync_LevelMarker;
import kr.co.kcs.oncf.ncp_line.Timer_DisMarker;
import kr.co.kcs.oncf.ncp_line.Timer_IntervalMarker;
import kr.co.kcs.oncf.ncp_line.Verify_Dte_AddrMarker;
import kr.co.kcs.oncf.ncp_line.Wait_For_CallMarker;

@DdlGroup(Version = "2.0", QualName = "ncp-line", ElementSize = 430, LocalName = "ncp-line")
public class Ncp_Line
    implements Serializable
{

    private String class_Var1;
    private short ete_Protocol;
    private short input_Disabled;
    private short lin_Absent;
    private short lin_Number;
    private short lin_Protocol;
    private short lin_Timeout;
    private short output_Disabled;
    private String port_Name;
    private short reset_Interval;
    private short retry_Limit;
    private short sta_Count;
    private short reserved01;
    private String uc_Queue;
    private String uc_Rate;
    private String uc_State;
    private A_TimerMarker a_Timer;
    private B_TimerMarker b_Timer;
    private Control_BiasMarker control_Bias;
    private ConversationalMarker conversational;
    private Ctlunit_CharactersMarker ctlunit_Characters;
    private Devunit_CharactersMarker devunit_Characters;
    private Disconnect_AfterMarker disconnect_After;
    private DuplexMarker duplex;
    private Enq_DelayMarker enq_Delay;
    private Give_TknsMarker give_Tkns;
    private InterfaceMarker interfaces;
    private Io_BiasMarker io_Bias;
    private Lin_ModeMarker lin_Mode;
    private Lin_PrimaryMarker lin_Primary;
    private Lin_SpeedMarker lin_Speed;
    private Lin_TypeMarker lin_Type;
    private Local_LunameMarker local_Luname;
    private Make_CallMarker make_Call;
    private Make_Initial_CallMarker make_Initial_Call;
    private MappedMarker mapped;
    private No_Connect_MsgMarker no_Connect_Msg;
    private OriginateMarker originate;
    private Output_BiasMarker output_Bias;
    private Partner_LunameMarker partner_Luname;
    private Permanent_CircuitMarker permanent_Circuit;
    private Poll_IntervalMarker poll_Interval;
    private Poll_MethodMarker poll_Method;
    private Recall_DelayMarker recall_Delay;
    private Remote_AddressMarker remote_Address;
    private Rvi_LevelMarker rvi_Level;
    private Service_IntervalMarker service_Interval;
    private Sync_LevelMarker sync_Level;
    private Simplex_SendMarker simplex_Send;
    private Send_FlushMarker send_Flush;
    private Timer_DisMarker timer_Dis;
    private Timer_IntervalMarker timer_Interval;
    private Verify_Dte_AddrMarker verify_Dte_Addr;
    private Wait_For_CallMarker wait_For_Call;
    private String comm_Method;
    private String local_Appl;
    private String remote_Appl;
    private short conn_Method;
    private short conn_Init;
    private short send_Conf;
    private short exp_Data;
    private short fmm;
    private String class32;
    private String symbolic_Name;
    private short enabled;
    private short invalid_Var1;
    private Os5_MgrMarker os5_Mgr;
    private Data_TimeoutMarker data_Timeout;
    private Resp_TimeoutMarker resp_Timeout;
    private Parity_FlgMarker parity_Flg;
    private Evt_Filt evt_Filt;
    private String cts_Local_Appl;
    private short tcp_Srv_Listen_Port;
    private short tcp_Conn_Timeout;
    private short tcp_Msr_Burst_Count;
    private short tcp_Msr_Burst_Timer;
    private short tcp_Msr_Burst_Supptmr;
    private short tcp_Lastconn;
    private short tcp_Rrconn;
    private short ssl;
    private short dsts_Dynamic_Sta;

    @DdlField(Version = "2.0", QualName = "class-var1", ObjectClass = 1, Level = 1, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 1)
    public String getClass_Var1() {
        return class_Var1;
    }

    public void setClass_Var1(String class_Var1Param) {
        this.class_Var1 = class_Var1Param;
    }

    @DdlField(Version = "2.0", QualName = "ete-protocol", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 2)
    public short getEte_Protocol() {
        return ete_Protocol;
    }

    public void setEte_Protocol(short ete_ProtocolParam) {
        this.ete_Protocol = ete_ProtocolParam;
    }

    @DdlField(Version = "2.0", QualName = "input-disabled", ObjectClass = 1, Level = 1, Structure = 2, Offset = 18, ElementSize = 2, IdentifierElement = 3)
    public short getInput_Disabled() {
        return input_Disabled;
    }

    public void setInput_Disabled(short input_DisabledParam) {
        this.input_Disabled = input_DisabledParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-absent", ObjectClass = 1, Level = 1, Structure = 2, Offset = 20, ElementSize = 2, IdentifierElement = 4)
    public short getLin_Absent() {
        return lin_Absent;
    }

    public void setLin_Absent(short lin_AbsentParam) {
        this.lin_Absent = lin_AbsentParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-number", ObjectClass = 1, Level = 1, Structure = 2, Offset = 22, ElementSize = 2, IdentifierElement = 5)
    public short getLin_Number() {
        return lin_Number;
    }

    public void setLin_Number(short lin_NumberParam) {
        this.lin_Number = lin_NumberParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-protocol", ObjectClass = 1, Level = 1, Structure = 2, Offset = 24, ElementSize = 2, IdentifierElement = 6)
    public short getLin_Protocol() {
        return lin_Protocol;
    }

    public void setLin_Protocol(short lin_ProtocolParam) {
        this.lin_Protocol = lin_ProtocolParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-timeout", ObjectClass = 1, Level = 1, Structure = 2, Offset = 26, ElementSize = 2, IdentifierElement = 7)
    public short getLin_Timeout() {
        return lin_Timeout;
    }

    public void setLin_Timeout(short lin_TimeoutParam) {
        this.lin_Timeout = lin_TimeoutParam;
    }

    @DdlField(Version = "2.0", QualName = "output-disabled", ObjectClass = 1, Level = 1, Structure = 2, Offset = 28, ElementSize = 2, IdentifierElement = 8)
    public short getOutput_Disabled() {
        return output_Disabled;
    }

    public void setOutput_Disabled(short output_DisabledParam) {
        this.output_Disabled = output_DisabledParam;
    }

    @DdlField(Version = "2.0", QualName = "port-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 30, ElementSize = 34, IdentifierElement = 9)
    public String getPort_Name() {
        return port_Name;
    }

    public void setPort_Name(String port_NameParam) {
        this.port_Name = port_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "reset-interval", ObjectClass = 1, Level = 1, Structure = 2, Offset = 64, ElementSize = 2, IdentifierElement = 10)
    public short getReset_Interval() {
        return reset_Interval;
    }

    public void setReset_Interval(short reset_IntervalParam) {
        this.reset_Interval = reset_IntervalParam;
    }

    @DdlField(Version = "2.0", QualName = "retry-limit", ObjectClass = 1, Level = 1, Structure = 2, Offset = 66, ElementSize = 2, IdentifierElement = 11)
    public short getRetry_Limit() {
        return retry_Limit;
    }

    public void setRetry_Limit(short retry_LimitParam) {
        this.retry_Limit = retry_LimitParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-count", ObjectClass = 1, Level = 1, Structure = 2, Offset = 68, ElementSize = 2, IdentifierElement = 12)
    public short getSta_Count() {
        return sta_Count;
    }

    public void setSta_Count(short sta_CountParam) {
        this.sta_Count = sta_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "reserved01", ObjectClass = 1, Level = 1, Structure = 2, Offset = 70, ElementSize = 2, IdentifierElement = 13)
    public short getReserved01() {
        return reserved01;
    }

    public void setReserved01(short reserved01Param) {
        this.reserved01 = reserved01Param;
    }

    @DdlField(Version = "2.0", QualName = "uc-queue", ObjectClass = 1, Level = 1, Structure = 0, Offset = 72, ElementSize = 14, IdentifierElement = 14)
    public String getUc_Queue() {
        return uc_Queue;
    }

    public void setUc_Queue(String uc_QueueParam) {
        this.uc_Queue = uc_QueueParam;
    }

    @DdlField(Version = "2.0", QualName = "uc-rate", ObjectClass = 1, Level = 1, Structure = 0, Offset = 86, ElementSize = 14, IdentifierElement = 15)
    public String getUc_Rate() {
        return uc_Rate;
    }

    public void setUc_Rate(String uc_RateParam) {
        this.uc_Rate = uc_RateParam;
    }

    @DdlField(Version = "2.0", QualName = "uc-state", ObjectClass = 1, Level = 1, Structure = 0, Offset = 100, ElementSize = 14, IdentifierElement = 16)
    public String getUc_State() {
        return uc_State;
    }

    public void setUc_State(String uc_StateParam) {
        this.uc_State = uc_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "a-timer", ObjectClass = 1, Level = 1, Structure = 2, Offset = 114, ElementSize = 2, IdentifierElement = 17)
    @ReturnType("kr.co.kcs.oncf.ncp_line.A_Timer")
    public A_TimerMarker getA_Timer() {
        return a_Timer;
    }

    public void setA_Timer(A_TimerMarker a_TimerParam) {
        this.a_Timer = a_TimerParam;
    }

    @DdlField(Version = "2.0", QualName = "b-timer", ObjectClass = 1, Level = 1, Structure = 2, Offset = 116, ElementSize = 2, IdentifierElement = 33)
    @ReturnType("kr.co.kcs.oncf.ncp_line.B_Timer")
    public B_TimerMarker getB_Timer() {
        return b_Timer;
    }

    public void setB_Timer(B_TimerMarker b_TimerParam) {
        this.b_Timer = b_TimerParam;
    }

    @DdlField(Version = "2.0", QualName = "control-bias", ObjectClass = 1, Level = 1, Structure = 2, Offset = 118, ElementSize = 2, IdentifierElement = 41)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Control_Bias")
    public Control_BiasMarker getControl_Bias() {
        return control_Bias;
    }

    public void setControl_Bias(Control_BiasMarker control_BiasParam) {
        this.control_Bias = control_BiasParam;
    }

    @DdlField(Version = "2.0", QualName = "conversational", ObjectClass = 1, Level = 1, Structure = 2, Offset = 120, ElementSize = 2, IdentifierElement = 43)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Conversational")
    public ConversationalMarker getConversational() {
        return conversational;
    }

    public void setConversational(ConversationalMarker conversationalParam) {
        this.conversational = conversationalParam;
    }

    @DdlField(Version = "2.0", QualName = "ctlunit-characters", ObjectClass = 1, Level = 1, Structure = 2, Offset = 122, ElementSize = 2, IdentifierElement = 46)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Ctlunit_Characters")
    public Ctlunit_CharactersMarker getCtlunit_Characters() {
        return ctlunit_Characters;
    }

    public void setCtlunit_Characters(Ctlunit_CharactersMarker ctlunit_CharactersParam) {
        this.ctlunit_Characters = ctlunit_CharactersParam;
    }

    @DdlField(Version = "2.0", QualName = "devunit-characters", ObjectClass = 1, Level = 1, Structure = 2, Offset = 124, ElementSize = 2, IdentifierElement = 52)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Devunit_Characters")
    public Devunit_CharactersMarker getDevunit_Characters() {
        return devunit_Characters;
    }

    public void setDevunit_Characters(Devunit_CharactersMarker devunit_CharactersParam) {
        this.devunit_Characters = devunit_CharactersParam;
    }

    @DdlField(Version = "2.0", QualName = "disconnect-after", ObjectClass = 1, Level = 1, Structure = 2, Offset = 126, ElementSize = 2, IdentifierElement = 58)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Disconnect_After")
    public Disconnect_AfterMarker getDisconnect_After() {
        return disconnect_After;
    }

    public void setDisconnect_After(Disconnect_AfterMarker disconnect_AfterParam) {
        this.disconnect_After = disconnect_AfterParam;
    }

    @DdlField(Version = "2.0", QualName = "duplex", ObjectClass = 1, Level = 1, Structure = 2, Offset = 128, ElementSize = 2, IdentifierElement = 63)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Duplex")
    public DuplexMarker getDuplex() {
        return duplex;
    }

    public void setDuplex(DuplexMarker duplexParam) {
        this.duplex = duplexParam;
    }

    @DdlField(Version = "2.0", QualName = "enq-delay", ObjectClass = 1, Level = 1, Structure = 2, Offset = 130, ElementSize = 2, IdentifierElement = 67)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Enq_Delay")
    public Enq_DelayMarker getEnq_Delay() {
        return enq_Delay;
    }

    public void setEnq_Delay(Enq_DelayMarker enq_DelayParam) {
        this.enq_Delay = enq_DelayParam;
    }

    @DdlField(Version = "2.0", QualName = "give-tkns", ObjectClass = 1, Level = 1, Structure = 2, Offset = 132, ElementSize = 2, IdentifierElement = 70)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Give_Tkns")
    public Give_TknsMarker getGive_Tkns() {
        return give_Tkns;
    }

    public void setGive_Tkns(Give_TknsMarker give_TknsParam) {
        this.give_Tkns = give_TknsParam;
    }

    @DdlField(Version = "2.0", QualName = "interface", ObjectClass = 1, Level = 1, Structure = 2, Offset = 134, ElementSize = 2, IdentifierElement = 72)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Interface")
    public InterfaceMarker getInterface() {
        return interfaces;
    }

    public void setInterface(InterfaceMarker interfaceParam) {
        this.interfaces = interfaceParam;
    }

    @DdlField(Version = "2.0", QualName = "io-bias", ObjectClass = 1, Level = 1, Structure = 2, Offset = 136, ElementSize = 2, IdentifierElement = 74)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Io_Bias")
    public Io_BiasMarker getIo_Bias() {
        return io_Bias;
    }

    public void setIo_Bias(Io_BiasMarker io_BiasParam) {
        this.io_Bias = io_BiasParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-mode", ObjectClass = 1, Level = 1, Structure = 2, Offset = 138, ElementSize = 2, IdentifierElement = 76)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Lin_Mode")
    public Lin_ModeMarker getLin_Mode() {
        return lin_Mode;
    }

    public void setLin_Mode(Lin_ModeMarker lin_ModeParam) {
        this.lin_Mode = lin_ModeParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-primary", ObjectClass = 1, Level = 1, Structure = 2, Offset = 140, ElementSize = 2, IdentifierElement = 82)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Lin_Primary")
    public Lin_PrimaryMarker getLin_Primary() {
        return lin_Primary;
    }

    public void setLin_Primary(Lin_PrimaryMarker lin_PrimaryParam) {
        this.lin_Primary = lin_PrimaryParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-speed", ObjectClass = 1, Level = 1, Structure = 2, Offset = 142, ElementSize = 2, IdentifierElement = 86)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Lin_Speed")
    public Lin_SpeedMarker getLin_Speed() {
        return lin_Speed;
    }

    public void setLin_Speed(Lin_SpeedMarker lin_SpeedParam) {
        this.lin_Speed = lin_SpeedParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 144, ElementSize = 2, IdentifierElement = 90)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Lin_Type")
    public Lin_TypeMarker getLin_Type() {
        return lin_Type;
    }

    public void setLin_Type(Lin_TypeMarker lin_TypeParam) {
        this.lin_Type = lin_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "local-luname", ObjectClass = 1, Level = 1, Structure = 0, Offset = 146, ElementSize = 8, IdentifierElement = 97)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Local_Luname")
    public Local_LunameMarker getLocal_Luname() {
        return local_Luname;
    }

    public void setLocal_Luname(Local_LunameMarker local_LunameParam) {
        this.local_Luname = local_LunameParam;
    }

    @DdlField(Version = "2.0", QualName = "make-call", ObjectClass = 1, Level = 1, Structure = 2, Offset = 154, ElementSize = 2, IdentifierElement = 99)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Make_Call")
    public Make_CallMarker getMake_Call() {
        return make_Call;
    }

    public void setMake_Call(Make_CallMarker make_CallParam) {
        this.make_Call = make_CallParam;
    }

    @DdlField(Version = "2.0", QualName = "make-initial-call", ObjectClass = 1, Level = 1, Structure = 2, Offset = 156, ElementSize = 2, IdentifierElement = 102)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Make_Initial_Call")
    public Make_Initial_CallMarker getMake_Initial_Call() {
        return make_Initial_Call;
    }

    public void setMake_Initial_Call(Make_Initial_CallMarker make_Initial_CallParam) {
        this.make_Initial_Call = make_Initial_CallParam;
    }

    @DdlField(Version = "2.0", QualName = "mapped", ObjectClass = 1, Level = 1, Structure = 2, Offset = 158, ElementSize = 2, IdentifierElement = 105)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Mapped")
    public MappedMarker getMapped() {
        return mapped;
    }

    public void setMapped(MappedMarker mappedParam) {
        this.mapped = mappedParam;
    }

    @DdlField(Version = "2.0", QualName = "no-connect-msg", ObjectClass = 1, Level = 1, Structure = 2, Offset = 160, ElementSize = 2, IdentifierElement = 107)
    @ReturnType("kr.co.kcs.oncf.ncp_line.No_Connect_Msg")
    public No_Connect_MsgMarker getNo_Connect_Msg() {
        return no_Connect_Msg;
    }

    public void setNo_Connect_Msg(No_Connect_MsgMarker no_Connect_MsgParam) {
        this.no_Connect_Msg = no_Connect_MsgParam;
    }

    @DdlField(Version = "2.0", QualName = "originate", ObjectClass = 1, Level = 1, Structure = 2, Offset = 162, ElementSize = 2, IdentifierElement = 109)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Originate")
    public OriginateMarker getOriginate() {
        return originate;
    }

    public void setOriginate(OriginateMarker originateParam) {
        this.originate = originateParam;
    }

    @DdlField(Version = "2.0", QualName = "output-bias", ObjectClass = 1, Level = 1, Structure = 2, Offset = 164, ElementSize = 2, IdentifierElement = 111)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Output_Bias")
    public Output_BiasMarker getOutput_Bias() {
        return output_Bias;
    }

    public void setOutput_Bias(Output_BiasMarker output_BiasParam) {
        this.output_Bias = output_BiasParam;
    }

    @DdlField(Version = "2.0", QualName = "partner-luname", ObjectClass = 1, Level = 1, Structure = 0, Offset = 166, ElementSize = 8, IdentifierElement = 125)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Partner_Luname")
    public Partner_LunameMarker getPartner_Luname() {
        return partner_Luname;
    }

    public void setPartner_Luname(Partner_LunameMarker partner_LunameParam) {
        this.partner_Luname = partner_LunameParam;
    }

    @DdlField(Version = "2.0", QualName = "permanent-circuit", ObjectClass = 1, Level = 1, Structure = 2, Offset = 174, ElementSize = 2, IdentifierElement = 127)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Permanent_Circuit")
    public Permanent_CircuitMarker getPermanent_Circuit() {
        return permanent_Circuit;
    }

    public void setPermanent_Circuit(Permanent_CircuitMarker permanent_CircuitParam) {
        this.permanent_Circuit = permanent_CircuitParam;
    }

    @DdlField(Version = "2.0", QualName = "poll-interval", ObjectClass = 1, Level = 1, Structure = 2, Offset = 176, ElementSize = 2, IdentifierElement = 129)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Poll_Interval")
    public Poll_IntervalMarker getPoll_Interval() {
        return poll_Interval;
    }

    public void setPoll_Interval(Poll_IntervalMarker poll_IntervalParam) {
        this.poll_Interval = poll_IntervalParam;
    }

    @DdlField(Version = "2.0", QualName = "poll-method", ObjectClass = 1, Level = 1, Structure = 2, Offset = 178, ElementSize = 2, IdentifierElement = 136)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Poll_Method")
    public Poll_MethodMarker getPoll_Method() {
        return poll_Method;
    }

    public void setPoll_Method(Poll_MethodMarker poll_MethodParam) {
        this.poll_Method = poll_MethodParam;
    }

    @DdlField(Version = "2.0", QualName = "recall-delay", ObjectClass = 1, Level = 1, Structure = 2, Offset = 180, ElementSize = 2, IdentifierElement = 138)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Recall_Delay")
    public Recall_DelayMarker getRecall_Delay() {
        return recall_Delay;
    }

    public void setRecall_Delay(Recall_DelayMarker recall_DelayParam) {
        this.recall_Delay = recall_DelayParam;
    }

    @DdlField(Version = "2.0", QualName = "remote-address", ObjectClass = 1, Level = 1, Structure = 0, Offset = 182, ElementSize = 16, IdentifierElement = 142)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Remote_Address")
    public Remote_AddressMarker getRemote_Address() {
        return remote_Address;
    }

    public void setRemote_Address(Remote_AddressMarker remote_AddressParam) {
        this.remote_Address = remote_AddressParam;
    }

    @DdlField(Version = "2.0", QualName = "rvi-level", ObjectClass = 1, Level = 1, Structure = 2, Offset = 198, ElementSize = 2, IdentifierElement = 144)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Rvi_Level")
    public Rvi_LevelMarker getRvi_Level() {
        return rvi_Level;
    }

    public void setRvi_Level(Rvi_LevelMarker rvi_LevelParam) {
        this.rvi_Level = rvi_LevelParam;
    }

    @DdlField(Version = "2.0", QualName = "service-interval", ObjectClass = 1, Level = 1, Structure = 2, Offset = 200, ElementSize = 2, IdentifierElement = 152)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Service_Interval")
    public Service_IntervalMarker getService_Interval() {
        return service_Interval;
    }

    public void setService_Interval(Service_IntervalMarker service_IntervalParam) {
        this.service_Interval = service_IntervalParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-level", ObjectClass = 1, Level = 1, Structure = 2, Offset = 202, ElementSize = 2, IdentifierElement = 154)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Sync_Level")
    public Sync_LevelMarker getSync_Level() {
        return sync_Level;
    }

    public void setSync_Level(Sync_LevelMarker sync_LevelParam) {
        this.sync_Level = sync_LevelParam;
    }

    @DdlField(Version = "2.0", QualName = "simplex-send", ObjectClass = 1, Level = 1, Structure = 2, Offset = 204, ElementSize = 2, IdentifierElement = 156)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Simplex_Send")
    public Simplex_SendMarker getSimplex_Send() {
        return simplex_Send;
    }

    public void setSimplex_Send(Simplex_SendMarker simplex_SendParam) {
        this.simplex_Send = simplex_SendParam;
    }

    @DdlField(Version = "2.0", QualName = "send-flush", ObjectClass = 1, Level = 1, Structure = 2, Offset = 206, ElementSize = 2, IdentifierElement = 158)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Send_Flush")
    public Send_FlushMarker getSend_Flush() {
        return send_Flush;
    }

    public void setSend_Flush(Send_FlushMarker send_FlushParam) {
        this.send_Flush = send_FlushParam;
    }

    @DdlField(Version = "2.0", QualName = "timer-dis", ObjectClass = 1, Level = 1, Structure = 2, Offset = 208, ElementSize = 2, IdentifierElement = 160)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Timer_Dis")
    public Timer_DisMarker getTimer_Dis() {
        return timer_Dis;
    }

    public void setTimer_Dis(Timer_DisMarker timer_DisParam) {
        this.timer_Dis = timer_DisParam;
    }

    @DdlField(Version = "2.0", QualName = "timer-interval", ObjectClass = 1, Level = 1, Structure = 2, Offset = 210, ElementSize = 2, IdentifierElement = 166)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Timer_Interval")
    public Timer_IntervalMarker getTimer_Interval() {
        return timer_Interval;
    }

    public void setTimer_Interval(Timer_IntervalMarker timer_IntervalParam) {
        this.timer_Interval = timer_IntervalParam;
    }

    @DdlField(Version = "2.0", QualName = "verify-dte-addr", ObjectClass = 1, Level = 1, Structure = 2, Offset = 212, ElementSize = 2, IdentifierElement = 172)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Verify_Dte_Addr")
    public Verify_Dte_AddrMarker getVerify_Dte_Addr() {
        return verify_Dte_Addr;
    }

    public void setVerify_Dte_Addr(Verify_Dte_AddrMarker verify_Dte_AddrParam) {
        this.verify_Dte_Addr = verify_Dte_AddrParam;
    }

    @DdlField(Version = "2.0", QualName = "wait-for-call", ObjectClass = 1, Level = 1, Structure = 2, Offset = 214, ElementSize = 2, IdentifierElement = 174)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Wait_For_Call")
    public Wait_For_CallMarker getWait_For_Call() {
        return wait_For_Call;
    }

    public void setWait_For_Call(Wait_For_CallMarker wait_For_CallParam) {
        this.wait_For_Call = wait_For_CallParam;
    }

    @DdlField(Version = "2.0", QualName = "comm-method", ObjectClass = 1, Level = 1, Structure = 0, Offset = 216, ElementSize = 16, IdentifierElement = 177)
    public String getComm_Method() {
        return comm_Method;
    }

    public void setComm_Method(String comm_MethodParam) {
        this.comm_Method = comm_MethodParam;
    }

    @DdlField(Version = "2.0", QualName = "local-appl", ObjectClass = 1, Level = 1, Structure = 0, Offset = 232, ElementSize = 8, IdentifierElement = 178)
    public String getLocal_Appl() {
        return local_Appl;
    }

    public void setLocal_Appl(String local_ApplParam) {
        this.local_Appl = local_ApplParam;
    }

    @DdlField(Version = "2.0", QualName = "remote-appl", ObjectClass = 1, Level = 1, Structure = 0, Offset = 240, ElementSize = 8, IdentifierElement = 179)
    public String getRemote_Appl() {
        return remote_Appl;
    }

    public void setRemote_Appl(String remote_ApplParam) {
        this.remote_Appl = remote_ApplParam;
    }

    @DdlField(Version = "2.0", QualName = "conn-method", ObjectClass = 1, Level = 1, Structure = 2, Offset = 248, ElementSize = 2, IdentifierElement = 180)
    public short getConn_Method() {
        return conn_Method;
    }

    public void setConn_Method(short conn_MethodParam) {
        this.conn_Method = conn_MethodParam;
    }

    @DdlField(Version = "2.0", QualName = "conn-init", ObjectClass = 1, Level = 1, Structure = 2, Offset = 250, ElementSize = 2, IdentifierElement = 181)
    public short getConn_Init() {
        return conn_Init;
    }

    public void setConn_Init(short conn_InitParam) {
        this.conn_Init = conn_InitParam;
    }

    @DdlField(Version = "2.0", QualName = "send-conf", ObjectClass = 1, Level = 1, Structure = 2, Offset = 252, ElementSize = 2, IdentifierElement = 182)
    public short getSend_Conf() {
        return send_Conf;
    }

    public void setSend_Conf(short send_ConfParam) {
        this.send_Conf = send_ConfParam;
    }

    @DdlField(Version = "2.0", QualName = "exp-data", ObjectClass = 1, Level = 1, Structure = 2, Offset = 254, ElementSize = 2, IdentifierElement = 183)
    public short getExp_Data() {
        return exp_Data;
    }

    public void setExp_Data(short exp_DataParam) {
        this.exp_Data = exp_DataParam;
    }

    @DdlField(Version = "2.0", QualName = "fmm", ObjectClass = 1, Level = 1, Structure = 2, Offset = 256, ElementSize = 2, IdentifierElement = 184)
    public short getFmm() {
        return fmm;
    }

    public void setFmm(short fmmParam) {
        this.fmm = fmmParam;
    }

    @DdlField(Version = "2.0", QualName = "class32", ObjectClass = 1, Level = 1, Structure = 0, Offset = 258, ElementSize = 32, IdentifierElement = 185)
    public String getClass32() {
        return class32;
    }

    public void setClass32(String class32Param) {
        this.class32 = class32Param;
    }

    @DdlField(Version = "2.0", QualName = "symbolic-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 290, ElementSize = 16, IdentifierElement = 186)
    public String getSymbolic_Name() {
        return symbolic_Name;
    }

    public void setSymbolic_Name(String symbolic_NameParam) {
        this.symbolic_Name = symbolic_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "enabled", ObjectClass = 1, Level = 1, Structure = 2, Offset = 306, ElementSize = 2, IdentifierElement = 187)
    public short getEnabled() {
        return enabled;
    }

    public void setEnabled(short enabledParam) {
        this.enabled = enabledParam;
    }

    @DdlField(Version = "2.0", QualName = "invalid-var1", ObjectClass = 1, Level = 1, Structure = 2, Offset = 308, ElementSize = 2, IdentifierElement = 188)
    public short getInvalid_Var1() {
        return invalid_Var1;
    }

    public void setInvalid_Var1(short invalid_Var1Param) {
        this.invalid_Var1 = invalid_Var1Param;
    }

    @DdlField(Version = "2.0", QualName = "os5-mgr", ObjectClass = 1, Level = 1, Structure = 0, Offset = 310, ElementSize = 16, IdentifierElement = 189)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Os5_Mgr")
    public Os5_MgrMarker getOs5_Mgr() {
        return os5_Mgr;
    }

    public void setOs5_Mgr(Os5_MgrMarker os5_MgrParam) {
        this.os5_Mgr = os5_MgrParam;
    }

    @DdlField(Version = "2.0", QualName = "data-timeout", ObjectClass = 1, Level = 1, Structure = 2, Offset = 326, ElementSize = 2, IdentifierElement = 191)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Data_Timeout")
    public Data_TimeoutMarker getData_Timeout() {
        return data_Timeout;
    }

    public void setData_Timeout(Data_TimeoutMarker data_TimeoutParam) {
        this.data_Timeout = data_TimeoutParam;
    }

    @DdlField(Version = "2.0", QualName = "resp-timeout", ObjectClass = 1, Level = 1, Structure = 2, Offset = 328, ElementSize = 2, IdentifierElement = 193)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Resp_Timeout")
    public Resp_TimeoutMarker getResp_Timeout() {
        return resp_Timeout;
    }

    public void setResp_Timeout(Resp_TimeoutMarker resp_TimeoutParam) {
        this.resp_Timeout = resp_TimeoutParam;
    }

    @DdlField(Version = "2.0", QualName = "parity-flg", ObjectClass = 1, Level = 1, Structure = 2, Offset = 330, ElementSize = 2, IdentifierElement = 195)
    @ReturnType("kr.co.kcs.oncf.ncp_line.Parity_Flg")
    public Parity_FlgMarker getParity_Flg() {
        return parity_Flg;
    }

    public void setParity_Flg(Parity_FlgMarker parity_FlgParam) {
        this.parity_Flg = parity_FlgParam;
    }

    @DdlField(Version = "2.0", QualName = "evt-filt", ObjectClass = 0, Level = 1, Structure = 0, Offset = 332, ElementSize = 32, IdentifierElement = 197)
    public Evt_Filt getEvt_Filt() {
        return evt_Filt;
    }

    public void setEvt_Filt(Evt_Filt evt_FiltParam) {
        this.evt_Filt = evt_FiltParam;
    }

    @DdlField(Version = "2.0", QualName = "cts-local-appl", ObjectClass = 1, Level = 1, Structure = 0, Offset = 364, ElementSize = 48, IdentifierElement = 209)
    public String getCts_Local_Appl() {
        return cts_Local_Appl;
    }

    public void setCts_Local_Appl(String cts_Local_ApplParam) {
        this.cts_Local_Appl = cts_Local_ApplParam;
    }

    @DdlField(Version = "2.0", QualName = "tcp-srv-listen-port", ObjectClass = 1, Level = 1, Structure = 3, Offset = 412, ElementSize = 2, IdentifierElement = 210)
    public short getTcp_Srv_Listen_Port() {
        return tcp_Srv_Listen_Port;
    }

    public void setTcp_Srv_Listen_Port(short tcp_Srv_Listen_PortParam) {
        this.tcp_Srv_Listen_Port = tcp_Srv_Listen_PortParam;
    }

    @DdlField(Version = "2.0", QualName = "tcp-conn-timeout", ObjectClass = 1, Level = 1, Structure = 2, Offset = 414, ElementSize = 2, IdentifierElement = 211)
    public short getTcp_Conn_Timeout() {
        return tcp_Conn_Timeout;
    }

    public void setTcp_Conn_Timeout(short tcp_Conn_TimeoutParam) {
        this.tcp_Conn_Timeout = tcp_Conn_TimeoutParam;
    }

    @DdlField(Version = "2.0", QualName = "tcp-msr-burst-count", ObjectClass = 1, Level = 1, Structure = 3, Offset = 416, ElementSize = 2, IdentifierElement = 212)
    public short getTcp_Msr_Burst_Count() {
        return tcp_Msr_Burst_Count;
    }

    public void setTcp_Msr_Burst_Count(short tcp_Msr_Burst_CountParam) {
        this.tcp_Msr_Burst_Count = tcp_Msr_Burst_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "tcp-msr-burst-timer", ObjectClass = 1, Level = 1, Structure = 3, Offset = 418, ElementSize = 2, IdentifierElement = 213)
    public short getTcp_Msr_Burst_Timer() {
        return tcp_Msr_Burst_Timer;
    }

    public void setTcp_Msr_Burst_Timer(short tcp_Msr_Burst_TimerParam) {
        this.tcp_Msr_Burst_Timer = tcp_Msr_Burst_TimerParam;
    }

    @DdlField(Version = "2.0", QualName = "tcp-msr-burst-supptmr", ObjectClass = 1, Level = 1, Structure = 3, Offset = 420, ElementSize = 2, IdentifierElement = 214)
    public short getTcp_Msr_Burst_Supptmr() {
        return tcp_Msr_Burst_Supptmr;
    }

    public void setTcp_Msr_Burst_Supptmr(short tcp_Msr_Burst_SupptmrParam) {
        this.tcp_Msr_Burst_Supptmr = tcp_Msr_Burst_SupptmrParam;
    }

    @DdlField(Version = "2.0", QualName = "tcp-lastconn", ObjectClass = 1, Level = 1, Structure = 3, Offset = 422, ElementSize = 2, IdentifierElement = 215)
    public short getTcp_Lastconn() {
        return tcp_Lastconn;
    }

    public void setTcp_Lastconn(short tcp_LastconnParam) {
        this.tcp_Lastconn = tcp_LastconnParam;
    }

    @DdlField(Version = "2.0", QualName = "tcp-rrconn", ObjectClass = 1, Level = 1, Structure = 3, Offset = 424, ElementSize = 2, IdentifierElement = 216)
    public short getTcp_Rrconn() {
        return tcp_Rrconn;
    }

    public void setTcp_Rrconn(short tcp_RrconnParam) {
        this.tcp_Rrconn = tcp_RrconnParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl", ObjectClass = 1, Level = 1, Structure = 3, Offset = 426, ElementSize = 2, IdentifierElement = 217)
    public short getSsl() {
        return ssl;
    }

    public void setSsl(short sslParam) {
        this.ssl = sslParam;
    }

    @DdlField(Version = "2.0", QualName = "dsts-dynamic-sta", ObjectClass = 1, Level = 1, Structure = 2, Offset = 428, ElementSize = 2, IdentifierElement = 218)
    public short getDsts_Dynamic_Sta() {
        return dsts_Dynamic_Sta;
    }

    public void setDsts_Dynamic_Sta(short dsts_Dynamic_StaParam) {
        this.dsts_Dynamic_Sta = dsts_Dynamic_StaParam;
    }

}
