
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_process.Begin_TypeMarker;
import kr.co.kcs.oncf.ncp_process.Evt_Filt;
import kr.co.kcs.oncf.ncp_process.Object_FileMarker;
import kr.co.kcs.oncf.ncp_process.Queue_Limit32Marker;
import kr.co.kcs.oncf.ncp_process.Queue_LimitMarker;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

@DdlGroup(Version = "2.0", QualName = "ncp-process", ElementSize = 1358, LocalName = "ncp-process")
public class Ncp_Process
    implements Serializable
{

    private String alt_Qpro1;
    private String alt_Qpro2;
    private short audit_Input;
    private short audit_Output;
    private short backup_Cpu;
    private Begin_TypeMarker begin_Type;
    private String class_Var1;
    private short debug_On;
    private String library_File;
    private short netmode;
    private Object_FileMarker object_File;
    private short output_Enabled;
    private String ppd_Name;
    private short primary_Cpu;
    private short priority;
    private short process_Number;
    private short queue_Alert_Threshold;
    private Queue_LimitMarker queue_Limit;
    private short define_On;
    private short saveabend_On;
    private String swap_File;
    private String uc_Queue;
    private String uc_Rate;
    private String uc_State;
    private short runtimelib;
    private short qmi;
    private String srcclass;
    private String class32;
    private String hometerm;
    private String ext_Swap_File;
    private String service;
    private String startoptions;
    private String library_File_Xp30;
    private String program_File_Xp30;
    private String swap_File_Xp30;
    private String ext_Swap_File_Xp30;
    private String hometerm_Xp30;
    private String fillrr_01970417_1736;
    private String symbolic_Name;
    private short replace_Dest;
    private short enabled;
    private short invalid_Var1;
    private short linkprocess;
    private short xpnetstartseq;
    private short nskstartseq;
    private short smt;
    private short red;
    private short rmax;
    private short process_Type;
    private String config_File;
    private String fillrr_02010129_1130;
    private String device_Name;
    private String xnc_Alias;
    private String dest_Name;
    private Evt_Filt evt_Filt;
    private int queue_Alert_Threshold32;
    private Queue_Limit32Marker queue_Limit32;
    private int smt32;
    private String xnc_File;
    private byte xnc_File_Len;
    private String fillrr_050322_1334;
    private String rpc_File;
    private byte rpc_File_Len;
    private String fillrr_050322_1335;
    private int qgc_Depth;
    private int rpc;
    private int xnc_Pro;
    private long rpc_Seg_Alloc_Ts;
    private long xnc_Seg_Alloc_Ts;
    private long startup_Ts;
    private short adopt;
    private short auto_Start_Pri;
    private short warm_Start_Pri;
    private short msg_Process;
    private int rts_Sendtimer;
    private int rts_Awaittimer;
    private String rts_Raddr1;
    private String rts_Raddr2;
    private String rts_Raddr3;
    private short rts_Rport1;
    private short rts_Rport2;
    private short rts_Rport3;
    private String rts_Laddr;
    private String rts_Protocol;
    private String rts_Tcpip_Pro;
    private short rts_Conntype;
    private short rts_Init;
    private short rts_Onoff;
    private short tcp_Retries;

    @DdlField(Version = "2.0", QualName = "alt-qpro1", ObjectClass = 1, Level = 1, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 1)
    public String getAlt_Qpro1() {
        return alt_Qpro1;
    }

    public void setAlt_Qpro1(String alt_Qpro1Param) {
        this.alt_Qpro1 = alt_Qpro1Param;
    }

    @DdlField(Version = "2.0", QualName = "alt-qpro2", ObjectClass = 1, Level = 1, Structure = 0, Offset = 16, ElementSize = 16, IdentifierElement = 2)
    public String getAlt_Qpro2() {
        return alt_Qpro2;
    }

    public void setAlt_Qpro2(String alt_Qpro2Param) {
        this.alt_Qpro2 = alt_Qpro2Param;
    }

    @DdlField(Version = "2.0", QualName = "audit-input", ObjectClass = 1, Level = 1, Structure = 2, Offset = 32, ElementSize = 2, IdentifierElement = 3)
    public short getAudit_Input() {
        return audit_Input;
    }

    public void setAudit_Input(short audit_InputParam) {
        this.audit_Input = audit_InputParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-output", ObjectClass = 1, Level = 1, Structure = 2, Offset = 34, ElementSize = 2, IdentifierElement = 4)
    public short getAudit_Output() {
        return audit_Output;
    }

    public void setAudit_Output(short audit_OutputParam) {
        this.audit_Output = audit_OutputParam;
    }

    @DdlField(Version = "2.0", QualName = "backup-cpu", ObjectClass = 1, Level = 1, Structure = 2, Offset = 36, ElementSize = 2, IdentifierElement = 5)
    public short getBackup_Cpu() {
        return backup_Cpu;
    }

    public void setBackup_Cpu(short backup_CpuParam) {
        this.backup_Cpu = backup_CpuParam;
    }

    @DdlField(Version = "2.0", QualName = "begin-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 38, ElementSize = 2, IdentifierElement = 6)
    @ReturnType("kr.co.kcs.oncf.ncp_process.Begin_Type")
    public Begin_TypeMarker getBegin_Type() {
        return begin_Type;
    }

    public void setBegin_Type(Begin_TypeMarker begin_TypeParam) {
        this.begin_Type = begin_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "class-var1", ObjectClass = 1, Level = 1, Structure = 0, Offset = 40, ElementSize = 16, IdentifierElement = 8)
    public String getClass_Var1() {
        return class_Var1;
    }

    public void setClass_Var1(String class_Var1Param) {
        this.class_Var1 = class_Var1Param;
    }

    @DdlField(Version = "2.0", QualName = "debug-on", ObjectClass = 1, Level = 1, Structure = 2, Offset = 56, ElementSize = 2, IdentifierElement = 9)
    public short getDebug_On() {
        return debug_On;
    }

    public void setDebug_On(short debug_OnParam) {
        this.debug_On = debug_OnParam;
    }

    @DdlField(Version = "2.0", QualName = "library-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 58, ElementSize = 34, IdentifierElement = 10)
    public String getLibrary_File() {
        return library_File;
    }

    public void setLibrary_File(String library_FileParam) {
        this.library_File = library_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "netmode", ObjectClass = 1, Level = 1, Structure = 2, Offset = 92, ElementSize = 2, IdentifierElement = 11)
    public short getNetmode() {
        return netmode;
    }

    public void setNetmode(short netmodeParam) {
        this.netmode = netmodeParam;
    }

    @DdlField(Version = "2.0", QualName = "object-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 94, ElementSize = 34, IdentifierElement = 12)
    @ReturnType("kr.co.kcs.oncf.ncp_process.Object_File")
    public Object_FileMarker getObject_File() {
        return object_File;
    }

    public void setObject_File(Object_FileMarker object_FileParam) {
        this.object_File = object_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "output-enabled", ObjectClass = 1, Level = 1, Structure = 2, Offset = 128, ElementSize = 2, IdentifierElement = 14)
    public short getOutput_Enabled() {
        return output_Enabled;
    }

    public void setOutput_Enabled(short output_EnabledParam) {
        this.output_Enabled = output_EnabledParam;
    }

    @DdlField(Version = "2.0", QualName = "ppd-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 130, ElementSize = 16, IdentifierElement = 15)
    public String getPpd_Name() {
        return ppd_Name;
    }

    public void setPpd_Name(String ppd_NameParam) {
        this.ppd_Name = ppd_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "primary-cpu", ObjectClass = 1, Level = 1, Structure = 2, Offset = 146, ElementSize = 2, IdentifierElement = 16)
    public short getPrimary_Cpu() {
        return primary_Cpu;
    }

    public void setPrimary_Cpu(short primary_CpuParam) {
        this.primary_Cpu = primary_CpuParam;
    }

    @DdlField(Version = "2.0", QualName = "priority", ObjectClass = 1, Level = 1, Structure = 2, Offset = 148, ElementSize = 2, IdentifierElement = 17)
    public short getPriority() {
        return priority;
    }

    public void setPriority(short priorityParam) {
        this.priority = priorityParam;
    }

    @DdlField(Version = "2.0", QualName = "process-number", ObjectClass = 1, Level = 1, Structure = 2, Offset = 150, ElementSize = 2, IdentifierElement = 18)
    public short getProcess_Number() {
        return process_Number;
    }

    public void setProcess_Number(short process_NumberParam) {
        this.process_Number = process_NumberParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-alert-threshold", ObjectClass = 1, Level = 1, Structure = 2, Offset = 152, ElementSize = 2, IdentifierElement = 19)
    public short getQueue_Alert_Threshold() {
        return queue_Alert_Threshold;
    }

    public void setQueue_Alert_Threshold(short queue_Alert_ThresholdParam) {
        this.queue_Alert_Threshold = queue_Alert_ThresholdParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-limit", ObjectClass = 1, Level = 1, Structure = 2, Offset = 154, ElementSize = 2, IdentifierElement = 20)
    @ReturnType("kr.co.kcs.oncf.ncp_process.Queue_Limit")
    public Queue_LimitMarker getQueue_Limit() {
        return queue_Limit;
    }

    public void setQueue_Limit(Queue_LimitMarker queue_LimitParam) {
        this.queue_Limit = queue_LimitParam;
    }

    @DdlField(Version = "2.0", QualName = "define-on", ObjectClass = 1, Level = 1, Structure = 2, Offset = 156, ElementSize = 2, IdentifierElement = 22)
    public short getDefine_On() {
        return define_On;
    }

    public void setDefine_On(short define_OnParam) {
        this.define_On = define_OnParam;
    }

    @DdlField(Version = "2.0", QualName = "saveabend-on", ObjectClass = 1, Level = 1, Structure = 2, Offset = 158, ElementSize = 2, IdentifierElement = 23)
    public short getSaveabend_On() {
        return saveabend_On;
    }

    public void setSaveabend_On(short saveabend_OnParam) {
        this.saveabend_On = saveabend_OnParam;
    }

    @DdlField(Version = "2.0", QualName = "swap-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 160, ElementSize = 34, IdentifierElement = 24)
    public String getSwap_File() {
        return swap_File;
    }

    public void setSwap_File(String swap_FileParam) {
        this.swap_File = swap_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "uc-queue", ObjectClass = 1, Level = 1, Structure = 0, Offset = 194, ElementSize = 14, IdentifierElement = 25)
    public String getUc_Queue() {
        return uc_Queue;
    }

    public void setUc_Queue(String uc_QueueParam) {
        this.uc_Queue = uc_QueueParam;
    }

    @DdlField(Version = "2.0", QualName = "uc-rate", ObjectClass = 1, Level = 1, Structure = 0, Offset = 208, ElementSize = 14, IdentifierElement = 26)
    public String getUc_Rate() {
        return uc_Rate;
    }

    public void setUc_Rate(String uc_RateParam) {
        this.uc_Rate = uc_RateParam;
    }

    @DdlField(Version = "2.0", QualName = "uc-state", ObjectClass = 1, Level = 1, Structure = 0, Offset = 222, ElementSize = 14, IdentifierElement = 27)
    public String getUc_State() {
        return uc_State;
    }

    public void setUc_State(String uc_StateParam) {
        this.uc_State = uc_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "runtimelib", ObjectClass = 1, Level = 1, Structure = 2, Offset = 236, ElementSize = 2, IdentifierElement = 28)
    public short getRuntimelib() {
        return runtimelib;
    }

    public void setRuntimelib(short runtimelibParam) {
        this.runtimelib = runtimelibParam;
    }

    @DdlField(Version = "2.0", QualName = "qmi", ObjectClass = 1, Level = 1, Structure = 2, Offset = 238, ElementSize = 2, IdentifierElement = 29)
    public short getQmi() {
        return qmi;
    }

    public void setQmi(short qmiParam) {
        this.qmi = qmiParam;
    }

    @DdlField(Version = "2.0", QualName = "srcclass", ObjectClass = 1, Level = 1, Structure = 0, Offset = 240, ElementSize = 4, IdentifierElement = 30)
    public String getSrcclass() {
        return srcclass;
    }

    public void setSrcclass(String srcclassParam) {
        this.srcclass = srcclassParam;
    }

    @DdlField(Version = "2.0", QualName = "class32", ObjectClass = 1, Level = 1, Structure = 0, Offset = 244, ElementSize = 32, IdentifierElement = 31)
    public String getClass32() {
        return class32;
    }

    public void setClass32(String class32Param) {
        this.class32 = class32Param;
    }

    @DdlField(Version = "2.0", QualName = "hometerm", ObjectClass = 1, Level = 1, Structure = 0, Offset = 276, ElementSize = 34, IdentifierElement = 32)
    public String getHometerm() {
        return hometerm;
    }

    public void setHometerm(String hometermParam) {
        this.hometerm = hometermParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-swap-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 310, ElementSize = 34, IdentifierElement = 33)
    public String getExt_Swap_File() {
        return ext_Swap_File;
    }

    public void setExt_Swap_File(String ext_Swap_FileParam) {
        this.ext_Swap_File = ext_Swap_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "service", ObjectClass = 1, Level = 1, Structure = 0, Offset = 344, ElementSize = 32, IdentifierElement = 34)
    public String getService() {
        return service;
    }

    public void setService(String serviceParam) {
        this.service = serviceParam;
    }

    @DdlField(Version = "2.0", QualName = "startoptions", ObjectClass = 1, Level = 1, Structure = 0, Offset = 376, ElementSize = 256, IdentifierElement = 35)
    public String getStartoptions() {
        return startoptions;
    }

    public void setStartoptions(String startoptionsParam) {
        this.startoptions = startoptionsParam;
    }

    @DdlField(Version = "2.0", QualName = "library-file-xp30", ObjectClass = 1, Level = 1, Structure = 0, Offset = 632, ElementSize = 35, IdentifierElement = 36)
    public String getLibrary_File_Xp30() {
        return library_File_Xp30;
    }

    public void setLibrary_File_Xp30(String library_File_Xp30Param) {
        this.library_File_Xp30 = library_File_Xp30Param;
    }

    @DdlField(Version = "2.0", QualName = "program-file-xp30", ObjectClass = 1, Level = 1, Structure = 0, Offset = 667, ElementSize = 35, IdentifierElement = 37)
    public String getProgram_File_Xp30() {
        return program_File_Xp30;
    }

    public void setProgram_File_Xp30(String program_File_Xp30Param) {
        this.program_File_Xp30 = program_File_Xp30Param;
    }

    @DdlField(Version = "2.0", QualName = "swap-file-xp30", ObjectClass = 1, Level = 1, Structure = 0, Offset = 702, ElementSize = 35, IdentifierElement = 38)
    public String getSwap_File_Xp30() {
        return swap_File_Xp30;
    }

    public void setSwap_File_Xp30(String swap_File_Xp30Param) {
        this.swap_File_Xp30 = swap_File_Xp30Param;
    }

    @DdlField(Version = "2.0", QualName = "ext-swap-file-xp30", ObjectClass = 1, Level = 1, Structure = 0, Offset = 737, ElementSize = 35, IdentifierElement = 39)
    public String getExt_Swap_File_Xp30() {
        return ext_Swap_File_Xp30;
    }

    public void setExt_Swap_File_Xp30(String ext_Swap_File_Xp30Param) {
        this.ext_Swap_File_Xp30 = ext_Swap_File_Xp30Param;
    }

    @DdlField(Version = "2.0", QualName = "hometerm-xp30", ObjectClass = 1, Level = 1, Structure = 0, Offset = 772, ElementSize = 47, IdentifierElement = 40)
    public String getHometerm_Xp30() {
        return hometerm_Xp30;
    }

    public void setHometerm_Xp30(String hometerm_Xp30Param) {
        this.hometerm_Xp30 = hometerm_Xp30Param;
    }

    @DdlField(Version = "2.0", QualName = "fillrr-01970417-1736", ObjectClass = 1, Level = 1, Structure = 0, Offset = 819, ElementSize = 1, IdentifierElement = 41)
    public String getFillrr_01970417_1736() {
        return fillrr_01970417_1736;
    }

    public void setFillrr_01970417_1736(String fillrr_01970417_1736Param) {
        this.fillrr_01970417_1736 = fillrr_01970417_1736Param;
    }

    @DdlField(Version = "2.0", QualName = "symbolic-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 820, ElementSize = 16, IdentifierElement = 42)
    public String getSymbolic_Name() {
        return symbolic_Name;
    }

    public void setSymbolic_Name(String symbolic_NameParam) {
        this.symbolic_Name = symbolic_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "replace-dest", ObjectClass = 1, Level = 1, Structure = 2, Offset = 836, ElementSize = 2, IdentifierElement = 43)
    public short getReplace_Dest() {
        return replace_Dest;
    }

    public void setReplace_Dest(short replace_DestParam) {
        this.replace_Dest = replace_DestParam;
    }

    @DdlField(Version = "2.0", QualName = "enabled", ObjectClass = 1, Level = 1, Structure = 2, Offset = 838, ElementSize = 2, IdentifierElement = 44)
    public short getEnabled() {
        return enabled;
    }

    public void setEnabled(short enabledParam) {
        this.enabled = enabledParam;
    }

    @DdlField(Version = "2.0", QualName = "invalid-var1", ObjectClass = 1, Level = 1, Structure = 2, Offset = 840, ElementSize = 2, IdentifierElement = 45)
    public short getInvalid_Var1() {
        return invalid_Var1;
    }

    public void setInvalid_Var1(short invalid_Var1Param) {
        this.invalid_Var1 = invalid_Var1Param;
    }

    @DdlField(Version = "2.0", QualName = "linkprocess", ObjectClass = 1, Level = 1, Structure = 2, Offset = 842, ElementSize = 2, IdentifierElement = 46)
    public short getLinkprocess() {
        return linkprocess;
    }

    public void setLinkprocess(short linkprocessParam) {
        this.linkprocess = linkprocessParam;
    }

    @DdlField(Version = "2.0", QualName = "xpnetstartseq", ObjectClass = 1, Level = 1, Structure = 2, Offset = 844, ElementSize = 2, IdentifierElement = 47)
    public short getXpnetstartseq() {
        return xpnetstartseq;
    }

    public void setXpnetstartseq(short xpnetstartseqParam) {
        this.xpnetstartseq = xpnetstartseqParam;
    }

    @DdlField(Version = "2.0", QualName = "nskstartseq", ObjectClass = 1, Level = 1, Structure = 2, Offset = 846, ElementSize = 2, IdentifierElement = 48)
    public short getNskstartseq() {
        return nskstartseq;
    }

    public void setNskstartseq(short nskstartseqParam) {
        this.nskstartseq = nskstartseqParam;
    }

    @DdlField(Version = "2.0", QualName = "smt", ObjectClass = 1, Level = 1, Structure = 2, Offset = 848, ElementSize = 2, IdentifierElement = 49)
    public short getSmt() {
        return smt;
    }

    public void setSmt(short smtParam) {
        this.smt = smtParam;
    }

    @DdlField(Version = "2.0", QualName = "red", ObjectClass = 1, Level = 1, Structure = 2, Offset = 850, ElementSize = 2, IdentifierElement = 50)
    public short getRed() {
        return red;
    }

    public void setRed(short redParam) {
        this.red = redParam;
    }

    @DdlField(Version = "2.0", QualName = "rmax", ObjectClass = 1, Level = 1, Structure = 2, Offset = 852, ElementSize = 2, IdentifierElement = 51)
    public short getRmax() {
        return rmax;
    }

    public void setRmax(short rmaxParam) {
        this.rmax = rmaxParam;
    }

    @DdlField(Version = "2.0", QualName = "process-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 854, ElementSize = 2, IdentifierElement = 52)
    public short getProcess_Type() {
        return process_Type;
    }

    public void setProcess_Type(short process_TypeParam) {
        this.process_Type = process_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "config-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 856, ElementSize = 35, IdentifierElement = 53)
    public String getConfig_File() {
        return config_File;
    }

    public void setConfig_File(String config_FileParam) {
        this.config_File = config_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "fillrr-02010129-1130", ObjectClass = 1, Level = 1, Structure = 0, Offset = 891, ElementSize = 1, IdentifierElement = 54)
    public String getFillrr_02010129_1130() {
        return fillrr_02010129_1130;
    }

    public void setFillrr_02010129_1130(String fillrr_02010129_1130Param) {
        this.fillrr_02010129_1130 = fillrr_02010129_1130Param;
    }

    @DdlField(Version = "2.0", QualName = "device-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 892, ElementSize = 16, IdentifierElement = 55)
    public String getDevice_Name() {
        return device_Name;
    }

    public void setDevice_Name(String device_NameParam) {
        this.device_Name = device_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "xnc-alias", ObjectClass = 1, Level = 1, Structure = 0, Offset = 908, ElementSize = 16, IdentifierElement = 56)
    public String getXnc_Alias() {
        return xnc_Alias;
    }

    public void setXnc_Alias(String xnc_AliasParam) {
        this.xnc_Alias = xnc_AliasParam;
    }

    @DdlField(Version = "2.0", QualName = "dest-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 924, ElementSize = 16, IdentifierElement = 57)
    public String getDest_Name() {
        return dest_Name;
    }

    public void setDest_Name(String dest_NameParam) {
        this.dest_Name = dest_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "evt-filt", ObjectClass = 0, Level = 1, Structure = 0, Offset = 940, ElementSize = 32, IdentifierElement = 58)
    public Evt_Filt getEvt_Filt() {
        return evt_Filt;
    }

    public void setEvt_Filt(Evt_Filt evt_FiltParam) {
        this.evt_Filt = evt_FiltParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-alert-threshold32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 972, ElementSize = 4, IdentifierElement = 69)
    public int getQueue_Alert_Threshold32() {
        return queue_Alert_Threshold32;
    }

    public void setQueue_Alert_Threshold32(int queue_Alert_Threshold32Param) {
        this.queue_Alert_Threshold32 = queue_Alert_Threshold32Param;
    }

    @DdlField(Version = "2.0", QualName = "queue-limit32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 976, ElementSize = 4, IdentifierElement = 70)
    @ReturnType("kr.co.kcs.oncf.ncp_process.Queue_Limit32")
    public Queue_Limit32Marker getQueue_Limit32() {
        return queue_Limit32;
    }

    public void setQueue_Limit32(Queue_Limit32Marker queue_Limit32Param) {
        this.queue_Limit32 = queue_Limit32Param;
    }

    @DdlField(Version = "2.0", QualName = "smt32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 980, ElementSize = 4, IdentifierElement = 72)
    public int getSmt32() {
        return smt32;
    }

    public void setSmt32(int smt32Param) {
        this.smt32 = smt32Param;
    }

    @DdlField(Version = "2.0", QualName = "xnc-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 984, ElementSize = 35, IdentifierElement = 73)
    public String getXnc_File() {
        return xnc_File;
    }

    public void setXnc_File(String xnc_FileParam) {
        this.xnc_File = xnc_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "xnc-file-len", ObjectClass = 1, Level = 1, Structure = 22, Offset = 1019, ElementSize = 1, IdentifierElement = 74)
    public byte getXnc_File_Len() {
        return xnc_File_Len;
    }

    public void setXnc_File_Len(byte xnc_File_LenParam) {
        this.xnc_File_Len = xnc_File_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "fillrr-050322-1334", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1020, ElementSize = 72, IdentifierElement = 75)
    public String getFillrr_050322_1334() {
        return fillrr_050322_1334;
    }

    public void setFillrr_050322_1334(String fillrr_050322_1334Param) {
        this.fillrr_050322_1334 = fillrr_050322_1334Param;
    }

    @DdlField(Version = "2.0", QualName = "rpc-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1092, ElementSize = 35, IdentifierElement = 76)
    public String getRpc_File() {
        return rpc_File;
    }

    public void setRpc_File(String rpc_FileParam) {
        this.rpc_File = rpc_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "rpc-file-len", ObjectClass = 1, Level = 1, Structure = 22, Offset = 1127, ElementSize = 1, IdentifierElement = 77)
    public byte getRpc_File_Len() {
        return rpc_File_Len;
    }

    public void setRpc_File_Len(byte rpc_File_LenParam) {
        this.rpc_File_Len = rpc_File_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "fillrr-050322-1335", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1128, ElementSize = 72, IdentifierElement = 78)
    public String getFillrr_050322_1335() {
        return fillrr_050322_1335;
    }

    public void setFillrr_050322_1335(String fillrr_050322_1335Param) {
        this.fillrr_050322_1335 = fillrr_050322_1335Param;
    }

    @DdlField(Version = "2.0", QualName = "qgc-depth", ObjectClass = 1, Level = 1, Structure = 4, Offset = 1200, ElementSize = 4, IdentifierElement = 79)
    public int getQgc_Depth() {
        return qgc_Depth;
    }

    public void setQgc_Depth(int qgc_DepthParam) {
        this.qgc_Depth = qgc_DepthParam;
    }

    @DdlField(Version = "2.0", QualName = "rpc", ObjectClass = 1, Level = 1, Structure = 4, Offset = 1204, ElementSize = 4, IdentifierElement = 80)
    public int getRpc() {
        return rpc;
    }

    public void setRpc(int rpcParam) {
        this.rpc = rpcParam;
    }

    @DdlField(Version = "2.0", QualName = "xnc-pro", ObjectClass = 1, Level = 1, Structure = 4, Offset = 1208, ElementSize = 4, IdentifierElement = 81)
    public int getXnc_Pro() {
        return xnc_Pro;
    }

    public void setXnc_Pro(int xnc_ProParam) {
        this.xnc_Pro = xnc_ProParam;
    }

    @DdlField(Version = "2.0", QualName = "rpc-seg-alloc-ts", ObjectClass = 1, Level = 1, Structure = 6, Offset = 1212, ElementSize = 8, IdentifierElement = 82)
    public long getRpc_Seg_Alloc_Ts() {
        return rpc_Seg_Alloc_Ts;
    }

    public void setRpc_Seg_Alloc_Ts(long rpc_Seg_Alloc_TsParam) {
        this.rpc_Seg_Alloc_Ts = rpc_Seg_Alloc_TsParam;
    }

    @DdlField(Version = "2.0", QualName = "xnc-seg-alloc-ts", ObjectClass = 1, Level = 1, Structure = 6, Offset = 1220, ElementSize = 8, IdentifierElement = 83)
    public long getXnc_Seg_Alloc_Ts() {
        return xnc_Seg_Alloc_Ts;
    }

    public void setXnc_Seg_Alloc_Ts(long xnc_Seg_Alloc_TsParam) {
        this.xnc_Seg_Alloc_Ts = xnc_Seg_Alloc_TsParam;
    }

    @DdlField(Version = "2.0", QualName = "startup-ts", ObjectClass = 1, Level = 1, Structure = 6, Offset = 1228, ElementSize = 8, IdentifierElement = 84)
    public long getStartup_Ts() {
        return startup_Ts;
    }

    public void setStartup_Ts(long startup_TsParam) {
        this.startup_Ts = startup_TsParam;
    }

    @DdlField(Version = "2.0", QualName = "adopt", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1236, ElementSize = 2, IdentifierElement = 85)
    public short getAdopt() {
        return adopt;
    }

    public void setAdopt(short adoptParam) {
        this.adopt = adoptParam;
    }

    @DdlField(Version = "2.0", QualName = "auto-start-pri", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1238, ElementSize = 2, IdentifierElement = 86)
    public short getAuto_Start_Pri() {
        return auto_Start_Pri;
    }

    public void setAuto_Start_Pri(short auto_Start_PriParam) {
        this.auto_Start_Pri = auto_Start_PriParam;
    }

    @DdlField(Version = "2.0", QualName = "warm-start-pri", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1240, ElementSize = 2, IdentifierElement = 87)
    public short getWarm_Start_Pri() {
        return warm_Start_Pri;
    }

    public void setWarm_Start_Pri(short warm_Start_PriParam) {
        this.warm_Start_Pri = warm_Start_PriParam;
    }

    @DdlField(Version = "2.0", QualName = "msg-process", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1242, ElementSize = 2, IdentifierElement = 88)
    public short getMsg_Process() {
        return msg_Process;
    }

    public void setMsg_Process(short msg_ProcessParam) {
        this.msg_Process = msg_ProcessParam;
    }

    @DdlField(Version = "2.0", QualName = "rts-sendtimer", ObjectClass = 1, Level = 1, Structure = 4, Offset = 1244, ElementSize = 4, IdentifierElement = 89)
    public int getRts_Sendtimer() {
        return rts_Sendtimer;
    }

    public void setRts_Sendtimer(int rts_SendtimerParam) {
        this.rts_Sendtimer = rts_SendtimerParam;
    }

    @DdlField(Version = "2.0", QualName = "rts-awaittimer", ObjectClass = 1, Level = 1, Structure = 4, Offset = 1248, ElementSize = 4, IdentifierElement = 90)
    public int getRts_Awaittimer() {
        return rts_Awaittimer;
    }

    public void setRts_Awaittimer(int rts_AwaittimerParam) {
        this.rts_Awaittimer = rts_AwaittimerParam;
    }

    @DdlField(Version = "2.0", QualName = "rts-raddr1", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1252, ElementSize = 16, IdentifierElement = 91)
    public String getRts_Raddr1() {
        return rts_Raddr1;
    }

    public void setRts_Raddr1(String rts_Raddr1Param) {
        this.rts_Raddr1 = rts_Raddr1Param;
    }

    @DdlField(Version = "2.0", QualName = "rts-raddr2", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1268, ElementSize = 16, IdentifierElement = 92)
    public String getRts_Raddr2() {
        return rts_Raddr2;
    }

    public void setRts_Raddr2(String rts_Raddr2Param) {
        this.rts_Raddr2 = rts_Raddr2Param;
    }

    @DdlField(Version = "2.0", QualName = "rts-raddr3", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1284, ElementSize = 16, IdentifierElement = 93)
    public String getRts_Raddr3() {
        return rts_Raddr3;
    }

    public void setRts_Raddr3(String rts_Raddr3Param) {
        this.rts_Raddr3 = rts_Raddr3Param;
    }

    @DdlField(Version = "2.0", QualName = "rts-rport1", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1300, ElementSize = 2, IdentifierElement = 94)
    public short getRts_Rport1() {
        return rts_Rport1;
    }

    public void setRts_Rport1(short rts_Rport1Param) {
        this.rts_Rport1 = rts_Rport1Param;
    }

    @DdlField(Version = "2.0", QualName = "rts-rport2", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1302, ElementSize = 2, IdentifierElement = 95)
    public short getRts_Rport2() {
        return rts_Rport2;
    }

    public void setRts_Rport2(short rts_Rport2Param) {
        this.rts_Rport2 = rts_Rport2Param;
    }

    @DdlField(Version = "2.0", QualName = "rts-rport3", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1304, ElementSize = 2, IdentifierElement = 96)
    public short getRts_Rport3() {
        return rts_Rport3;
    }

    public void setRts_Rport3(short rts_Rport3Param) {
        this.rts_Rport3 = rts_Rport3Param;
    }

    @DdlField(Version = "2.0", QualName = "rts-laddr", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1306, ElementSize = 16, IdentifierElement = 97)
    public String getRts_Laddr() {
        return rts_Laddr;
    }

    public void setRts_Laddr(String rts_LaddrParam) {
        this.rts_Laddr = rts_LaddrParam;
    }

    @DdlField(Version = "2.0", QualName = "rts-protocol", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1322, ElementSize = 4, IdentifierElement = 98)
    public String getRts_Protocol() {
        return rts_Protocol;
    }

    public void setRts_Protocol(String rts_ProtocolParam) {
        this.rts_Protocol = rts_ProtocolParam;
    }

    @DdlField(Version = "2.0", QualName = "rts-tcpip-pro", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1326, ElementSize = 24, IdentifierElement = 99)
    public String getRts_Tcpip_Pro() {
        return rts_Tcpip_Pro;
    }

    public void setRts_Tcpip_Pro(String rts_Tcpip_ProParam) {
        this.rts_Tcpip_Pro = rts_Tcpip_ProParam;
    }

    @DdlField(Version = "2.0", QualName = "rts-conntype", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1350, ElementSize = 2, IdentifierElement = 100)
    public short getRts_Conntype() {
        return rts_Conntype;
    }

    public void setRts_Conntype(short rts_ConntypeParam) {
        this.rts_Conntype = rts_ConntypeParam;
    }

    @DdlField(Version = "2.0", QualName = "rts-init", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1352, ElementSize = 2, IdentifierElement = 101)
    public short getRts_Init() {
        return rts_Init;
    }

    public void setRts_Init(short rts_InitParam) {
        this.rts_Init = rts_InitParam;
    }

    @DdlField(Version = "2.0", QualName = "rts-onoff", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1354, ElementSize = 2, IdentifierElement = 102)
    public short getRts_Onoff() {
        return rts_Onoff;
    }

    public void setRts_Onoff(short rts_OnoffParam) {
        this.rts_Onoff = rts_OnoffParam;
    }

    @DdlField(Version = "2.0", QualName = "tcp-retries", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1356, ElementSize = 2, IdentifierElement = 103)
    public short getTcp_Retries() {
        return tcp_Retries;
    }

    public void setTcp_Retries(short tcp_RetriesParam) {
        this.tcp_Retries = tcp_RetriesParam;
    }

}
