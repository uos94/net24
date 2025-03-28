
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_node.Audadd;
import kr.co.kcs.oncf.ncp_node.Evtadd;
import kr.co.kcs.oncf.ncp_node.Loge_Qlim32Marker;
import kr.co.kcs.oncf.ncp_node.Loge_QlimMarker;
import kr.co.kcs.oncf.ncp_node.Logn_Qlim32Marker;
import kr.co.kcs.oncf.ncp_node.Logn_QlimMarker;
import kr.co.kcs.oncf.ncp_node.Pathmon_NameMarker;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

@DdlGroup(Version = "2.0", QualName = "ncp-node", ElementSize = 1656, LocalName = "ncp-node")
public class Ncp_Node
    implements Serializable
{

    private String audit_File_Name;
    private short audit_Dev_Type;
    private short audit_Record_Blocking;
    private short audit_Character_Blocking;
    private short audit_Extent_Size;
    private short autostart_Load_Level;
    private int available_Queue_Memory;
    private short backup_Cpu;
    private short backup_Pri;
    private short loge_Qat;
    private Loge_QlimMarker loge_Qlim;
    private short logn_Qat;
    private Logn_QlimMarker logn_Qlim;
    private short non_Resident_Userdata_Length;
    private short primary_Cpu;
    private short primary_Pri;
    private String ppd_Name;
    private short queue_Eval_Delay;
    private int queue_Threshold;
    private short resident_Userdata_Length;
    private short statistics_Interval;
    private short sys_Hardcopy_Stats;
    private short warmstart_Load_Level;
    private short backup_State;
    private short loge_Qmi;
    private short logn_Qmi;
    private short mat;
    private short med;
    private short initial_Run_Priority;
    private short ext_Seg_Pages;
    private String program_File;
    private String library_File;
    private String swap_File;
    private String ext_Swap_File;
    private String log_File;
    private String alt_Log_File;
    private String hometerm;
    private String fillrr_1;
    private short defines;
    private short saveabend;
    private short pfs_Size;
    private String startoptions;
    private Pathmon_NameMarker pathmon_Name;
    private String ncpi_Server_Name;
    private short monitor_States;
    private short monitor_Nom;
    private short monitor_Qat;
    private short highpin;
    private short startup;
    private short udqat;
    private short udqmt;
    private short udqmi;
    private short discoverydelay;
    private short nom_Pages;
    private String noma;
    private String nomb;
    private String nomc;
    private short cj_Pages;
    private String cja_File;
    private String cjb_File;
    private String cjc_File;
    private String symbolic_Name;
    private short enabled;
    private short invalid_Var1;
    private short mmt;
    private short max_Pro_Msg_Size;
    private short x25_Trunk_Short_Delay;
    private short osi_Enable;
    private short debug;
    private short svc_Transmit_Delay;
    private Audadd audadd;
    private Evtadd evtadd;
    private short bretrydelay;
    private short nom_To_Disk;
    private short cj;
    private short usqat;
    private short usqmt;
    private short usqmi;
    private short udfail;
    private short payloadpages;
    private short payloadtimeout;
    private short msgpriority;
    private short msgtimeout;
    private int loge_Qat32;
    private Loge_Qlim32Marker loge_Qlim32;
    private int logn_Qat32;
    private Logn_Qlim32Marker logn_Qlim32;
    private int udqat32;
    private int udqmt32;
    private int usqat32;
    private int usqmt32;
    private int maxlargemsgsize;
    private short mem_Frag_Alert_Pages;
    private short nom_File_Code;
    private short qwr_File_Code;
    private short sec_Backup_Cpu;
    private short ssl_Ext_Seg_Pages;
    private short ssl_Mem_Threshold;
    private short ssl_Memdelay;
    private short ssl_Cert_Exp_Lead;
    private short ssl_Cert_Exp_Intrvl;
    private int hsm_Timer;
    private String hsm_Protocol;
    private String fil130603_1433;
    private short msg_Process;
    private short hsm_Rport;
    private short hsm_Rport2;
    private String hsm_Raddr;
    private String hsm_Raddr2;
    private String hsm_Key;
    private short hsm_Sec_Box;
    private String hsm_Tcpip_Pro;
    private String hsm_Chk_Digits;
    private int n_Hsm_Timer;
    private String n_Hsm_Protocol;
    private String fil130812_1548;
    private short n_Hsm_Rport;
    private short n_Hsm_Rport2;
    private String n_Hsm_Raddr;
    private String n_Hsm_Raddr2;
    private String n_Hsm_Key;
    private short n_Hsm_Sec_Box;
    private String n_Hsm_Tcpip_Pro;
    private String n_Hsm_Chk_Digits;
    private String hsm_Laddr;
    private String n_Hsm_Laddr;
    private short sba_Staletimer;
    private short sba_Staletimout;
    private short sba_Staleaction;
    private short ext_Increment;
    private short ext_Current;
    private String ext_Aud_Pri;
    private String ext_Aud_Bkup;
    private short ext_Aud_File_Code;
    private short ext_Aud_Flag;
    private short ext_Aud_Io;
    private short ext_Aud_Ret_Days;
    private short ext_Aud_Stat_Int;
    private int ext_Aud_Qat;
    private int ext_Aud_Qmt;
    private short ext_Aud_Qmi;
    private short ext_Aud_Pages;
    private short ext_Aud_Extent_Size;
    private short ext_Aud_Max_Extents;
    private short ext_Aud_Tcpip;
    private short rts_Onoff;

    @DdlField(Version = "2.0", QualName = "audit-file-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 0, ElementSize = 34, IdentifierElement = 1)
    public String getAudit_File_Name() {
        return audit_File_Name;
    }

    public void setAudit_File_Name(String audit_File_NameParam) {
        this.audit_File_Name = audit_File_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-dev-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 34, ElementSize = 2, IdentifierElement = 2)
    public short getAudit_Dev_Type() {
        return audit_Dev_Type;
    }

    public void setAudit_Dev_Type(short audit_Dev_TypeParam) {
        this.audit_Dev_Type = audit_Dev_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-record-blocking", ObjectClass = 1, Level = 1, Structure = 2, Offset = 36, ElementSize = 2, IdentifierElement = 3)
    public short getAudit_Record_Blocking() {
        return audit_Record_Blocking;
    }

    public void setAudit_Record_Blocking(short audit_Record_BlockingParam) {
        this.audit_Record_Blocking = audit_Record_BlockingParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-character-blocking", ObjectClass = 1, Level = 1, Structure = 2, Offset = 38, ElementSize = 2, IdentifierElement = 4)
    public short getAudit_Character_Blocking() {
        return audit_Character_Blocking;
    }

    public void setAudit_Character_Blocking(short audit_Character_BlockingParam) {
        this.audit_Character_Blocking = audit_Character_BlockingParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-extent-size", ObjectClass = 1, Level = 1, Structure = 2, Offset = 40, ElementSize = 2, IdentifierElement = 5)
    public short getAudit_Extent_Size() {
        return audit_Extent_Size;
    }

    public void setAudit_Extent_Size(short audit_Extent_SizeParam) {
        this.audit_Extent_Size = audit_Extent_SizeParam;
    }

    @DdlField(Version = "2.0", QualName = "autostart-load-level", ObjectClass = 1, Level = 1, Structure = 2, Offset = 42, ElementSize = 2, IdentifierElement = 6)
    public short getAutostart_Load_Level() {
        return autostart_Load_Level;
    }

    public void setAutostart_Load_Level(short autostart_Load_LevelParam) {
        this.autostart_Load_Level = autostart_Load_LevelParam;
    }

    @DdlField(Version = "2.0", QualName = "available-queue-memory", ObjectClass = 1, Level = 1, Structure = 4, Offset = 44, ElementSize = 4, IdentifierElement = 7)
    public int getAvailable_Queue_Memory() {
        return available_Queue_Memory;
    }

    public void setAvailable_Queue_Memory(int available_Queue_MemoryParam) {
        this.available_Queue_Memory = available_Queue_MemoryParam;
    }

    @DdlField(Version = "2.0", QualName = "backup-cpu", ObjectClass = 1, Level = 1, Structure = 2, Offset = 48, ElementSize = 2, IdentifierElement = 8)
    public short getBackup_Cpu() {
        return backup_Cpu;
    }

    public void setBackup_Cpu(short backup_CpuParam) {
        this.backup_Cpu = backup_CpuParam;
    }

    @DdlField(Version = "2.0", QualName = "backup-pri", ObjectClass = 1, Level = 1, Structure = 2, Offset = 50, ElementSize = 2, IdentifierElement = 9)
    public short getBackup_Pri() {
        return backup_Pri;
    }

    public void setBackup_Pri(short backup_PriParam) {
        this.backup_Pri = backup_PriParam;
    }

    @DdlField(Version = "2.0", QualName = "loge-qat", ObjectClass = 1, Level = 1, Structure = 2, Offset = 52, ElementSize = 2, IdentifierElement = 10)
    public short getLoge_Qat() {
        return loge_Qat;
    }

    public void setLoge_Qat(short loge_QatParam) {
        this.loge_Qat = loge_QatParam;
    }

    @DdlField(Version = "2.0", QualName = "loge-qlim", ObjectClass = 1, Level = 1, Structure = 2, Offset = 54, ElementSize = 2, IdentifierElement = 11)
    @ReturnType("kr.co.kcs.oncf.ncp_node.Loge_Qlim")
    public Loge_QlimMarker getLoge_Qlim() {
        return loge_Qlim;
    }

    public void setLoge_Qlim(Loge_QlimMarker loge_QlimParam) {
        this.loge_Qlim = loge_QlimParam;
    }

    @DdlField(Version = "2.0", QualName = "logn-qat", ObjectClass = 1, Level = 1, Structure = 2, Offset = 56, ElementSize = 2, IdentifierElement = 13)
    public short getLogn_Qat() {
        return logn_Qat;
    }

    public void setLogn_Qat(short logn_QatParam) {
        this.logn_Qat = logn_QatParam;
    }

    @DdlField(Version = "2.0", QualName = "logn-qlim", ObjectClass = 1, Level = 1, Structure = 2, Offset = 58, ElementSize = 2, IdentifierElement = 14)
    @ReturnType("kr.co.kcs.oncf.ncp_node.Logn_Qlim")
    public Logn_QlimMarker getLogn_Qlim() {
        return logn_Qlim;
    }

    public void setLogn_Qlim(Logn_QlimMarker logn_QlimParam) {
        this.logn_Qlim = logn_QlimParam;
    }

    @DdlField(Version = "2.0", QualName = "non-resident-userdata-length", ObjectClass = 1, Level = 1, Structure = 2, Offset = 60, ElementSize = 2, IdentifierElement = 16)
    public short getNon_Resident_Userdata_Length() {
        return non_Resident_Userdata_Length;
    }

    public void setNon_Resident_Userdata_Length(short non_Resident_Userdata_LengthParam) {
        this.non_Resident_Userdata_Length = non_Resident_Userdata_LengthParam;
    }

    @DdlField(Version = "2.0", QualName = "primary-cpu", ObjectClass = 1, Level = 1, Structure = 2, Offset = 62, ElementSize = 2, IdentifierElement = 17)
    public short getPrimary_Cpu() {
        return primary_Cpu;
    }

    public void setPrimary_Cpu(short primary_CpuParam) {
        this.primary_Cpu = primary_CpuParam;
    }

    @DdlField(Version = "2.0", QualName = "primary-pri", ObjectClass = 1, Level = 1, Structure = 2, Offset = 64, ElementSize = 2, IdentifierElement = 18)
    public short getPrimary_Pri() {
        return primary_Pri;
    }

    public void setPrimary_Pri(short primary_PriParam) {
        this.primary_Pri = primary_PriParam;
    }

    @DdlField(Version = "2.0", QualName = "ppd-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 66, ElementSize = 16, IdentifierElement = 19)
    public String getPpd_Name() {
        return ppd_Name;
    }

    public void setPpd_Name(String ppd_NameParam) {
        this.ppd_Name = ppd_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-eval-delay", ObjectClass = 1, Level = 1, Structure = 3, Offset = 82, ElementSize = 2, IdentifierElement = 20)
    public short getQueue_Eval_Delay() {
        return queue_Eval_Delay;
    }

    public void setQueue_Eval_Delay(short queue_Eval_DelayParam) {
        this.queue_Eval_Delay = queue_Eval_DelayParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-threshold", ObjectClass = 1, Level = 1, Structure = 4, Offset = 84, ElementSize = 4, IdentifierElement = 21)
    public int getQueue_Threshold() {
        return queue_Threshold;
    }

    public void setQueue_Threshold(int queue_ThresholdParam) {
        this.queue_Threshold = queue_ThresholdParam;
    }

    @DdlField(Version = "2.0", QualName = "resident-userdata-length", ObjectClass = 1, Level = 1, Structure = 2, Offset = 88, ElementSize = 2, IdentifierElement = 22)
    public short getResident_Userdata_Length() {
        return resident_Userdata_Length;
    }

    public void setResident_Userdata_Length(short resident_Userdata_LengthParam) {
        this.resident_Userdata_Length = resident_Userdata_LengthParam;
    }

    @DdlField(Version = "2.0", QualName = "statistics-interval", ObjectClass = 1, Level = 1, Structure = 2, Offset = 90, ElementSize = 2, IdentifierElement = 23)
    public short getStatistics_Interval() {
        return statistics_Interval;
    }

    public void setStatistics_Interval(short statistics_IntervalParam) {
        this.statistics_Interval = statistics_IntervalParam;
    }

    @DdlField(Version = "2.0", QualName = "sys-hardcopy-stats", ObjectClass = 1, Level = 1, Structure = 2, Offset = 92, ElementSize = 2, IdentifierElement = 24)
    public short getSys_Hardcopy_Stats() {
        return sys_Hardcopy_Stats;
    }

    public void setSys_Hardcopy_Stats(short sys_Hardcopy_StatsParam) {
        this.sys_Hardcopy_Stats = sys_Hardcopy_StatsParam;
    }

    @DdlField(Version = "2.0", QualName = "warmstart-load-level", ObjectClass = 1, Level = 1, Structure = 2, Offset = 94, ElementSize = 2, IdentifierElement = 25)
    public short getWarmstart_Load_Level() {
        return warmstart_Load_Level;
    }

    public void setWarmstart_Load_Level(short warmstart_Load_LevelParam) {
        this.warmstart_Load_Level = warmstart_Load_LevelParam;
    }

    @DdlField(Version = "2.0", QualName = "backup-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 96, ElementSize = 2, IdentifierElement = 26)
    public short getBackup_State() {
        return backup_State;
    }

    public void setBackup_State(short backup_StateParam) {
        this.backup_State = backup_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "loge-qmi", ObjectClass = 1, Level = 1, Structure = 2, Offset = 98, ElementSize = 2, IdentifierElement = 27)
    public short getLoge_Qmi() {
        return loge_Qmi;
    }

    public void setLoge_Qmi(short loge_QmiParam) {
        this.loge_Qmi = loge_QmiParam;
    }

    @DdlField(Version = "2.0", QualName = "logn-qmi", ObjectClass = 1, Level = 1, Structure = 2, Offset = 100, ElementSize = 2, IdentifierElement = 28)
    public short getLogn_Qmi() {
        return logn_Qmi;
    }

    public void setLogn_Qmi(short logn_QmiParam) {
        this.logn_Qmi = logn_QmiParam;
    }

    @DdlField(Version = "2.0", QualName = "mat", ObjectClass = 1, Level = 1, Structure = 2, Offset = 102, ElementSize = 2, IdentifierElement = 29)
    public short getMat() {
        return mat;
    }

    public void setMat(short matParam) {
        this.mat = matParam;
    }

    @DdlField(Version = "2.0", QualName = "med", ObjectClass = 1, Level = 1, Structure = 2, Offset = 104, ElementSize = 2, IdentifierElement = 30)
    public short getMed() {
        return med;
    }

    public void setMed(short medParam) {
        this.med = medParam;
    }

    @DdlField(Version = "2.0", QualName = "initial-run-priority", ObjectClass = 1, Level = 1, Structure = 2, Offset = 106, ElementSize = 2, IdentifierElement = 31)
    public short getInitial_Run_Priority() {
        return initial_Run_Priority;
    }

    public void setInitial_Run_Priority(short initial_Run_PriorityParam) {
        this.initial_Run_Priority = initial_Run_PriorityParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-seg-pages", ObjectClass = 1, Level = 1, Structure = 2, Offset = 108, ElementSize = 2, IdentifierElement = 32)
    public short getExt_Seg_Pages() {
        return ext_Seg_Pages;
    }

    public void setExt_Seg_Pages(short ext_Seg_PagesParam) {
        this.ext_Seg_Pages = ext_Seg_PagesParam;
    }

    @DdlField(Version = "2.0", QualName = "program-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 110, ElementSize = 35, IdentifierElement = 33)
    public String getProgram_File() {
        return program_File;
    }

    public void setProgram_File(String program_FileParam) {
        this.program_File = program_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "library-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 145, ElementSize = 35, IdentifierElement = 34)
    public String getLibrary_File() {
        return library_File;
    }

    public void setLibrary_File(String library_FileParam) {
        this.library_File = library_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "swap-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 180, ElementSize = 35, IdentifierElement = 35)
    public String getSwap_File() {
        return swap_File;
    }

    public void setSwap_File(String swap_FileParam) {
        this.swap_File = swap_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-swap-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 215, ElementSize = 35, IdentifierElement = 36)
    public String getExt_Swap_File() {
        return ext_Swap_File;
    }

    public void setExt_Swap_File(String ext_Swap_FileParam) {
        this.ext_Swap_File = ext_Swap_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "log-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 250, ElementSize = 47, IdentifierElement = 37)
    public String getLog_File() {
        return log_File;
    }

    public void setLog_File(String log_FileParam) {
        this.log_File = log_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "alt-log-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 297, ElementSize = 47, IdentifierElement = 38)
    public String getAlt_Log_File() {
        return alt_Log_File;
    }

    public void setAlt_Log_File(String alt_Log_FileParam) {
        this.alt_Log_File = alt_Log_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "hometerm", ObjectClass = 1, Level = 1, Structure = 0, Offset = 344, ElementSize = 47, IdentifierElement = 39)
    public String getHometerm() {
        return hometerm;
    }

    public void setHometerm(String hometermParam) {
        this.hometerm = hometermParam;
    }

    @DdlField(Version = "2.0", QualName = "fillrr-1", ObjectClass = 1, Level = 1, Structure = 0, Offset = 391, ElementSize = 1, IdentifierElement = 40)
    public String getFillrr_1() {
        return fillrr_1;
    }

    public void setFillrr_1(String fillrr_1Param) {
        this.fillrr_1 = fillrr_1Param;
    }

    @DdlField(Version = "2.0", QualName = "defines", ObjectClass = 1, Level = 1, Structure = 2, Offset = 392, ElementSize = 2, IdentifierElement = 41)
    public short getDefines() {
        return defines;
    }

    public void setDefines(short definesParam) {
        this.defines = definesParam;
    }

    @DdlField(Version = "2.0", QualName = "saveabend", ObjectClass = 1, Level = 1, Structure = 2, Offset = 394, ElementSize = 2, IdentifierElement = 42)
    public short getSaveabend() {
        return saveabend;
    }

    public void setSaveabend(short saveabendParam) {
        this.saveabend = saveabendParam;
    }

    @DdlField(Version = "2.0", QualName = "pfs-size", ObjectClass = 1, Level = 1, Structure = 2, Offset = 396, ElementSize = 2, IdentifierElement = 43)
    public short getPfs_Size() {
        return pfs_Size;
    }

    public void setPfs_Size(short pfs_SizeParam) {
        this.pfs_Size = pfs_SizeParam;
    }

    @DdlField(Version = "2.0", QualName = "startoptions", ObjectClass = 1, Level = 1, Structure = 0, Offset = 398, ElementSize = 256, IdentifierElement = 44)
    public String getStartoptions() {
        return startoptions;
    }

    public void setStartoptions(String startoptionsParam) {
        this.startoptions = startoptionsParam;
    }

    @DdlField(Version = "2.0", QualName = "pathmon-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 654, ElementSize = 47, IdentifierElement = 45)
    @ReturnType("kr.co.kcs.oncf.ncp_node.Pathmon_Name")
    public Pathmon_NameMarker getPathmon_Name() {
        return pathmon_Name;
    }

    public void setPathmon_Name(Pathmon_NameMarker pathmon_NameParam) {
        this.pathmon_Name = pathmon_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "ncpi-server-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 701, ElementSize = 15, IdentifierElement = 47)
    public String getNcpi_Server_Name() {
        return ncpi_Server_Name;
    }

    public void setNcpi_Server_Name(String ncpi_Server_NameParam) {
        this.ncpi_Server_Name = ncpi_Server_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "monitor-states", ObjectClass = 1, Level = 1, Structure = 2, Offset = 716, ElementSize = 2, IdentifierElement = 48)
    public short getMonitor_States() {
        return monitor_States;
    }

    public void setMonitor_States(short monitor_StatesParam) {
        this.monitor_States = monitor_StatesParam;
    }

    @DdlField(Version = "2.0", QualName = "monitor-nom", ObjectClass = 1, Level = 1, Structure = 2, Offset = 718, ElementSize = 2, IdentifierElement = 49)
    public short getMonitor_Nom() {
        return monitor_Nom;
    }

    public void setMonitor_Nom(short monitor_NomParam) {
        this.monitor_Nom = monitor_NomParam;
    }

    @DdlField(Version = "2.0", QualName = "monitor-qat", ObjectClass = 1, Level = 1, Structure = 2, Offset = 720, ElementSize = 2, IdentifierElement = 50)
    public short getMonitor_Qat() {
        return monitor_Qat;
    }

    public void setMonitor_Qat(short monitor_QatParam) {
        this.monitor_Qat = monitor_QatParam;
    }

    @DdlField(Version = "2.0", QualName = "highpin", ObjectClass = 1, Level = 1, Structure = 2, Offset = 722, ElementSize = 2, IdentifierElement = 51)
    public short getHighpin() {
        return highpin;
    }

    public void setHighpin(short highpinParam) {
        this.highpin = highpinParam;
    }

    @DdlField(Version = "2.0", QualName = "startup", ObjectClass = 1, Level = 1, Structure = 2, Offset = 724, ElementSize = 2, IdentifierElement = 52)
    public short getStartup() {
        return startup;
    }

    public void setStartup(short startupParam) {
        this.startup = startupParam;
    }

    @DdlField(Version = "2.0", QualName = "udqat", ObjectClass = 1, Level = 1, Structure = 2, Offset = 726, ElementSize = 2, IdentifierElement = 53)
    public short getUdqat() {
        return udqat;
    }

    public void setUdqat(short udqatParam) {
        this.udqat = udqatParam;
    }

    @DdlField(Version = "2.0", QualName = "udqmt", ObjectClass = 1, Level = 1, Structure = 2, Offset = 728, ElementSize = 2, IdentifierElement = 54)
    public short getUdqmt() {
        return udqmt;
    }

    public void setUdqmt(short udqmtParam) {
        this.udqmt = udqmtParam;
    }

    @DdlField(Version = "2.0", QualName = "udqmi", ObjectClass = 1, Level = 1, Structure = 2, Offset = 730, ElementSize = 2, IdentifierElement = 55)
    public short getUdqmi() {
        return udqmi;
    }

    public void setUdqmi(short udqmiParam) {
        this.udqmi = udqmiParam;
    }

    @DdlField(Version = "2.0", QualName = "discoverydelay", ObjectClass = 1, Level = 1, Structure = 2, Offset = 732, ElementSize = 2, IdentifierElement = 56)
    public short getDiscoverydelay() {
        return discoverydelay;
    }

    public void setDiscoverydelay(short discoverydelayParam) {
        this.discoverydelay = discoverydelayParam;
    }

    @DdlField(Version = "2.0", QualName = "nom-pages", ObjectClass = 1, Level = 1, Structure = 2, Offset = 734, ElementSize = 2, IdentifierElement = 57)
    public short getNom_Pages() {
        return nom_Pages;
    }

    public void setNom_Pages(short nom_PagesParam) {
        this.nom_Pages = nom_PagesParam;
    }

    @DdlField(Version = "2.0", QualName = "noma", ObjectClass = 1, Level = 1, Structure = 0, Offset = 736, ElementSize = 26, IdentifierElement = 58)
    public String getNoma() {
        return noma;
    }

    public void setNoma(String nomaParam) {
        this.noma = nomaParam;
    }

    @DdlField(Version = "2.0", QualName = "nomb", ObjectClass = 1, Level = 1, Structure = 0, Offset = 762, ElementSize = 26, IdentifierElement = 59)
    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nombParam) {
        this.nomb = nombParam;
    }

    @DdlField(Version = "2.0", QualName = "nomc", ObjectClass = 1, Level = 1, Structure = 0, Offset = 788, ElementSize = 26, IdentifierElement = 60)
    public String getNomc() {
        return nomc;
    }

    public void setNomc(String nomcParam) {
        this.nomc = nomcParam;
    }

    @DdlField(Version = "2.0", QualName = "cj-pages", ObjectClass = 1, Level = 1, Structure = 2, Offset = 814, ElementSize = 2, IdentifierElement = 61)
    public short getCj_Pages() {
        return cj_Pages;
    }

    public void setCj_Pages(short cj_PagesParam) {
        this.cj_Pages = cj_PagesParam;
    }

    @DdlField(Version = "2.0", QualName = "cja-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 816, ElementSize = 26, IdentifierElement = 62)
    public String getCja_File() {
        return cja_File;
    }

    public void setCja_File(String cja_FileParam) {
        this.cja_File = cja_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "cjb-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 842, ElementSize = 26, IdentifierElement = 63)
    public String getCjb_File() {
        return cjb_File;
    }

    public void setCjb_File(String cjb_FileParam) {
        this.cjb_File = cjb_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "cjc-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 868, ElementSize = 26, IdentifierElement = 64)
    public String getCjc_File() {
        return cjc_File;
    }

    public void setCjc_File(String cjc_FileParam) {
        this.cjc_File = cjc_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "symbolic-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 894, ElementSize = 16, IdentifierElement = 65)
    public String getSymbolic_Name() {
        return symbolic_Name;
    }

    public void setSymbolic_Name(String symbolic_NameParam) {
        this.symbolic_Name = symbolic_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "enabled", ObjectClass = 1, Level = 1, Structure = 2, Offset = 910, ElementSize = 2, IdentifierElement = 66)
    public short getEnabled() {
        return enabled;
    }

    public void setEnabled(short enabledParam) {
        this.enabled = enabledParam;
    }

    @DdlField(Version = "2.0", QualName = "invalid-var1", ObjectClass = 1, Level = 1, Structure = 2, Offset = 912, ElementSize = 2, IdentifierElement = 67)
    public short getInvalid_Var1() {
        return invalid_Var1;
    }

    public void setInvalid_Var1(short invalid_Var1Param) {
        this.invalid_Var1 = invalid_Var1Param;
    }

    @DdlField(Version = "2.0", QualName = "mmt", ObjectClass = 1, Level = 1, Structure = 2, Offset = 914, ElementSize = 2, IdentifierElement = 68)
    public short getMmt() {
        return mmt;
    }

    public void setMmt(short mmtParam) {
        this.mmt = mmtParam;
    }

    @DdlField(Version = "2.0", QualName = "max-pro-msg-size", ObjectClass = 1, Level = 1, Structure = 2, Offset = 916, ElementSize = 2, IdentifierElement = 69)
    public short getMax_Pro_Msg_Size() {
        return max_Pro_Msg_Size;
    }

    public void setMax_Pro_Msg_Size(short max_Pro_Msg_SizeParam) {
        this.max_Pro_Msg_Size = max_Pro_Msg_SizeParam;
    }

    @DdlField(Version = "2.0", QualName = "x25-trunk-short-delay", ObjectClass = 1, Level = 1, Structure = 2, Offset = 918, ElementSize = 2, IdentifierElement = 70)
    public short getX25_Trunk_Short_Delay() {
        return x25_Trunk_Short_Delay;
    }

    public void setX25_Trunk_Short_Delay(short x25_Trunk_Short_DelayParam) {
        this.x25_Trunk_Short_Delay = x25_Trunk_Short_DelayParam;
    }

    @DdlField(Version = "2.0", QualName = "osi-enable", ObjectClass = 1, Level = 1, Structure = 2, Offset = 920, ElementSize = 2, IdentifierElement = 71)
    public short getOsi_Enable() {
        return osi_Enable;
    }

    public void setOsi_Enable(short osi_EnableParam) {
        this.osi_Enable = osi_EnableParam;
    }

    @DdlField(Version = "2.0", QualName = "debug", ObjectClass = 1, Level = 1, Structure = 2, Offset = 922, ElementSize = 2, IdentifierElement = 72)
    public short getDebug() {
        return debug;
    }

    public void setDebug(short debugParam) {
        this.debug = debugParam;
    }

    @DdlField(Version = "2.0", QualName = "svc-transmit-delay", ObjectClass = 1, Level = 1, Structure = 2, Offset = 924, ElementSize = 2, IdentifierElement = 73)
    public short getSvc_Transmit_Delay() {
        return svc_Transmit_Delay;
    }

    public void setSvc_Transmit_Delay(short svc_Transmit_DelayParam) {
        this.svc_Transmit_Delay = svc_Transmit_DelayParam;
    }

    @DdlField(Version = "2.0", QualName = "audadd", ObjectClass = 0, Level = 1, Structure = 0, Offset = 926, ElementSize = 122, IdentifierElement = 74)
    public Audadd getAudadd() {
        return audadd;
    }

    public void setAudadd(Audadd audaddParam) {
        this.audadd = audaddParam;
    }

    @DdlField(Version = "2.0", QualName = "evtadd", ObjectClass = 0, Level = 1, Structure = 0, Offset = 1048, ElementSize = 94, IdentifierElement = 87)
    public Evtadd getEvtadd() {
        return evtadd;
    }

    public void setEvtadd(Evtadd evtaddParam) {
        this.evtadd = evtaddParam;
    }

    @DdlField(Version = "2.0", QualName = "bretrydelay", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1142, ElementSize = 2, IdentifierElement = 135)
    public short getBretrydelay() {
        return bretrydelay;
    }

    public void setBretrydelay(short bretrydelayParam) {
        this.bretrydelay = bretrydelayParam;
    }

    @DdlField(Version = "2.0", QualName = "nom-to-disk", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1144, ElementSize = 2, IdentifierElement = 136)
    public short getNom_To_Disk() {
        return nom_To_Disk;
    }

    public void setNom_To_Disk(short nom_To_DiskParam) {
        this.nom_To_Disk = nom_To_DiskParam;
    }

    @DdlField(Version = "2.0", QualName = "cj", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1146, ElementSize = 2, IdentifierElement = 137)
    public short getCj() {
        return cj;
    }

    public void setCj(short cjParam) {
        this.cj = cjParam;
    }

    @DdlField(Version = "2.0", QualName = "usqat", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1148, ElementSize = 2, IdentifierElement = 138)
    public short getUsqat() {
        return usqat;
    }

    public void setUsqat(short usqatParam) {
        this.usqat = usqatParam;
    }

    @DdlField(Version = "2.0", QualName = "usqmt", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1150, ElementSize = 2, IdentifierElement = 139)
    public short getUsqmt() {
        return usqmt;
    }

    public void setUsqmt(short usqmtParam) {
        this.usqmt = usqmtParam;
    }

    @DdlField(Version = "2.0", QualName = "usqmi", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1152, ElementSize = 2, IdentifierElement = 140)
    public short getUsqmi() {
        return usqmi;
    }

    public void setUsqmi(short usqmiParam) {
        this.usqmi = usqmiParam;
    }

    @DdlField(Version = "2.0", QualName = "udfail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1154, ElementSize = 2, IdentifierElement = 141)
    public short getUdfail() {
        return udfail;
    }

    public void setUdfail(short udfailParam) {
        this.udfail = udfailParam;
    }

    @DdlField(Version = "2.0", QualName = "payloadpages", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1156, ElementSize = 2, IdentifierElement = 142)
    public short getPayloadpages() {
        return payloadpages;
    }

    public void setPayloadpages(short payloadpagesParam) {
        this.payloadpages = payloadpagesParam;
    }

    @DdlField(Version = "2.0", QualName = "payloadtimeout", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1158, ElementSize = 2, IdentifierElement = 143)
    public short getPayloadtimeout() {
        return payloadtimeout;
    }

    public void setPayloadtimeout(short payloadtimeoutParam) {
        this.payloadtimeout = payloadtimeoutParam;
    }

    @DdlField(Version = "2.0", QualName = "msgpriority", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1160, ElementSize = 2, IdentifierElement = 144)
    public short getMsgpriority() {
        return msgpriority;
    }

    public void setMsgpriority(short msgpriorityParam) {
        this.msgpriority = msgpriorityParam;
    }

    @DdlField(Version = "2.0", QualName = "msgtimeout", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1162, ElementSize = 2, IdentifierElement = 145)
    public short getMsgtimeout() {
        return msgtimeout;
    }

    public void setMsgtimeout(short msgtimeoutParam) {
        this.msgtimeout = msgtimeoutParam;
    }

    @DdlField(Version = "2.0", QualName = "loge-qat32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 1164, ElementSize = 4, IdentifierElement = 146)
    public int getLoge_Qat32() {
        return loge_Qat32;
    }

    public void setLoge_Qat32(int loge_Qat32Param) {
        this.loge_Qat32 = loge_Qat32Param;
    }

    @DdlField(Version = "2.0", QualName = "loge-qlim32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 1168, ElementSize = 4, IdentifierElement = 147)
    @ReturnType("kr.co.kcs.oncf.ncp_node.Loge_Qlim32")
    public Loge_Qlim32Marker getLoge_Qlim32() {
        return loge_Qlim32;
    }

    public void setLoge_Qlim32(Loge_Qlim32Marker loge_Qlim32Param) {
        this.loge_Qlim32 = loge_Qlim32Param;
    }

    @DdlField(Version = "2.0", QualName = "logn-qat32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 1172, ElementSize = 4, IdentifierElement = 149)
    public int getLogn_Qat32() {
        return logn_Qat32;
    }

    public void setLogn_Qat32(int logn_Qat32Param) {
        this.logn_Qat32 = logn_Qat32Param;
    }

    @DdlField(Version = "2.0", QualName = "logn-qlim32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 1176, ElementSize = 4, IdentifierElement = 150)
    @ReturnType("kr.co.kcs.oncf.ncp_node.Logn_Qlim32")
    public Logn_Qlim32Marker getLogn_Qlim32() {
        return logn_Qlim32;
    }

    public void setLogn_Qlim32(Logn_Qlim32Marker logn_Qlim32Param) {
        this.logn_Qlim32 = logn_Qlim32Param;
    }

    @DdlField(Version = "2.0", QualName = "udqat32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 1180, ElementSize = 4, IdentifierElement = 152)
    public int getUdqat32() {
        return udqat32;
    }

    public void setUdqat32(int udqat32Param) {
        this.udqat32 = udqat32Param;
    }

    @DdlField(Version = "2.0", QualName = "udqmt32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 1184, ElementSize = 4, IdentifierElement = 153)
    public int getUdqmt32() {
        return udqmt32;
    }

    public void setUdqmt32(int udqmt32Param) {
        this.udqmt32 = udqmt32Param;
    }

    @DdlField(Version = "2.0", QualName = "usqat32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 1188, ElementSize = 4, IdentifierElement = 154)
    public int getUsqat32() {
        return usqat32;
    }

    public void setUsqat32(int usqat32Param) {
        this.usqat32 = usqat32Param;
    }

    @DdlField(Version = "2.0", QualName = "usqmt32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 1192, ElementSize = 4, IdentifierElement = 155)
    public int getUsqmt32() {
        return usqmt32;
    }

    public void setUsqmt32(int usqmt32Param) {
        this.usqmt32 = usqmt32Param;
    }

    @DdlField(Version = "2.0", QualName = "maxlargemsgsize", ObjectClass = 1, Level = 1, Structure = 4, Offset = 1196, ElementSize = 4, IdentifierElement = 156)
    public int getMaxlargemsgsize() {
        return maxlargemsgsize;
    }

    public void setMaxlargemsgsize(int maxlargemsgsizeParam) {
        this.maxlargemsgsize = maxlargemsgsizeParam;
    }

    @DdlField(Version = "2.0", QualName = "mem-frag-alert-pages", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1200, ElementSize = 2, IdentifierElement = 157)
    public short getMem_Frag_Alert_Pages() {
        return mem_Frag_Alert_Pages;
    }

    public void setMem_Frag_Alert_Pages(short mem_Frag_Alert_PagesParam) {
        this.mem_Frag_Alert_Pages = mem_Frag_Alert_PagesParam;
    }

    @DdlField(Version = "2.0", QualName = "nom-file-code", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1202, ElementSize = 2, IdentifierElement = 158)
    public short getNom_File_Code() {
        return nom_File_Code;
    }

    public void setNom_File_Code(short nom_File_CodeParam) {
        this.nom_File_Code = nom_File_CodeParam;
    }

    @DdlField(Version = "2.0", QualName = "qwr-file-code", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1204, ElementSize = 2, IdentifierElement = 159)
    public short getQwr_File_Code() {
        return qwr_File_Code;
    }

    public void setQwr_File_Code(short qwr_File_CodeParam) {
        this.qwr_File_Code = qwr_File_CodeParam;
    }

    @DdlField(Version = "2.0", QualName = "sec-backup-cpu", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1206, ElementSize = 2, IdentifierElement = 160)
    public short getSec_Backup_Cpu() {
        return sec_Backup_Cpu;
    }

    public void setSec_Backup_Cpu(short sec_Backup_CpuParam) {
        this.sec_Backup_Cpu = sec_Backup_CpuParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-ext-seg-pages", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1208, ElementSize = 2, IdentifierElement = 161)
    public short getSsl_Ext_Seg_Pages() {
        return ssl_Ext_Seg_Pages;
    }

    public void setSsl_Ext_Seg_Pages(short ssl_Ext_Seg_PagesParam) {
        this.ssl_Ext_Seg_Pages = ssl_Ext_Seg_PagesParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-mem-threshold", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1210, ElementSize = 2, IdentifierElement = 162)
    public short getSsl_Mem_Threshold() {
        return ssl_Mem_Threshold;
    }

    public void setSsl_Mem_Threshold(short ssl_Mem_ThresholdParam) {
        this.ssl_Mem_Threshold = ssl_Mem_ThresholdParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-memdelay", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1212, ElementSize = 2, IdentifierElement = 163)
    public short getSsl_Memdelay() {
        return ssl_Memdelay;
    }

    public void setSsl_Memdelay(short ssl_MemdelayParam) {
        this.ssl_Memdelay = ssl_MemdelayParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-cert-exp-lead", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1214, ElementSize = 2, IdentifierElement = 164)
    public short getSsl_Cert_Exp_Lead() {
        return ssl_Cert_Exp_Lead;
    }

    public void setSsl_Cert_Exp_Lead(short ssl_Cert_Exp_LeadParam) {
        this.ssl_Cert_Exp_Lead = ssl_Cert_Exp_LeadParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-cert-exp-intrvl", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1216, ElementSize = 2, IdentifierElement = 165)
    public short getSsl_Cert_Exp_Intrvl() {
        return ssl_Cert_Exp_Intrvl;
    }

    public void setSsl_Cert_Exp_Intrvl(short ssl_Cert_Exp_IntrvlParam) {
        this.ssl_Cert_Exp_Intrvl = ssl_Cert_Exp_IntrvlParam;
    }

    @DdlField(Version = "2.0", QualName = "hsm-timer", ObjectClass = 1, Level = 1, Structure = 4, Offset = 1218, ElementSize = 4, IdentifierElement = 166)
    public int getHsm_Timer() {
        return hsm_Timer;
    }

    public void setHsm_Timer(int hsm_TimerParam) {
        this.hsm_Timer = hsm_TimerParam;
    }

    @DdlField(Version = "2.0", QualName = "hsm-protocol", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1222, ElementSize = 3, IdentifierElement = 167)
    public String getHsm_Protocol() {
        return hsm_Protocol;
    }

    public void setHsm_Protocol(String hsm_ProtocolParam) {
        this.hsm_Protocol = hsm_ProtocolParam;
    }

    @DdlField(Version = "2.0", QualName = "fil130603-1433", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1225, ElementSize = 1, IdentifierElement = 168)
    public String getFil130603_1433() {
        return fil130603_1433;
    }

    public void setFil130603_1433(String fil130603_1433Param) {
        this.fil130603_1433 = fil130603_1433Param;
    }

    @DdlField(Version = "2.0", QualName = "msg-process", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1226, ElementSize = 2, IdentifierElement = 169)
    public short getMsg_Process() {
        return msg_Process;
    }

    public void setMsg_Process(short msg_ProcessParam) {
        this.msg_Process = msg_ProcessParam;
    }

    @DdlField(Version = "2.0", QualName = "hsm-rport", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1228, ElementSize = 2, IdentifierElement = 170)
    public short getHsm_Rport() {
        return hsm_Rport;
    }

    public void setHsm_Rport(short hsm_RportParam) {
        this.hsm_Rport = hsm_RportParam;
    }

    @DdlField(Version = "2.0", QualName = "hsm-rport2", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1230, ElementSize = 2, IdentifierElement = 171)
    public short getHsm_Rport2() {
        return hsm_Rport2;
    }

    public void setHsm_Rport2(short hsm_Rport2Param) {
        this.hsm_Rport2 = hsm_Rport2Param;
    }

    @DdlField(Version = "2.0", QualName = "hsm-raddr", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1232, ElementSize = 16, IdentifierElement = 172)
    public String getHsm_Raddr() {
        return hsm_Raddr;
    }

    public void setHsm_Raddr(String hsm_RaddrParam) {
        this.hsm_Raddr = hsm_RaddrParam;
    }

    @DdlField(Version = "2.0", QualName = "hsm-raddr2", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1248, ElementSize = 16, IdentifierElement = 173)
    public String getHsm_Raddr2() {
        return hsm_Raddr2;
    }

    public void setHsm_Raddr2(String hsm_Raddr2Param) {
        this.hsm_Raddr2 = hsm_Raddr2Param;
    }

    @DdlField(Version = "2.0", QualName = "hsm-key", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1264, ElementSize = 80, IdentifierElement = 174)
    public String getHsm_Key() {
        return hsm_Key;
    }

    public void setHsm_Key(String hsm_KeyParam) {
        this.hsm_Key = hsm_KeyParam;
    }

    @DdlField(Version = "2.0", QualName = "hsm-sec-box", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1344, ElementSize = 2, IdentifierElement = 175)
    public short getHsm_Sec_Box() {
        return hsm_Sec_Box;
    }

    public void setHsm_Sec_Box(short hsm_Sec_BoxParam) {
        this.hsm_Sec_Box = hsm_Sec_BoxParam;
    }

    @DdlField(Version = "2.0", QualName = "hsm-tcpip-pro", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1346, ElementSize = 24, IdentifierElement = 176)
    public String getHsm_Tcpip_Pro() {
        return hsm_Tcpip_Pro;
    }

    public void setHsm_Tcpip_Pro(String hsm_Tcpip_ProParam) {
        this.hsm_Tcpip_Pro = hsm_Tcpip_ProParam;
    }

    @DdlField(Version = "2.0", QualName = "hsm-chk-digits", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1370, ElementSize = 6, IdentifierElement = 177)
    public String getHsm_Chk_Digits() {
        return hsm_Chk_Digits;
    }

    public void setHsm_Chk_Digits(String hsm_Chk_DigitsParam) {
        this.hsm_Chk_Digits = hsm_Chk_DigitsParam;
    }

    @DdlField(Version = "2.0", QualName = "n-hsm-timer", ObjectClass = 1, Level = 1, Structure = 4, Offset = 1376, ElementSize = 4, IdentifierElement = 178)
    public int getN_Hsm_Timer() {
        return n_Hsm_Timer;
    }

    public void setN_Hsm_Timer(int n_Hsm_TimerParam) {
        this.n_Hsm_Timer = n_Hsm_TimerParam;
    }

    @DdlField(Version = "2.0", QualName = "n-hsm-protocol", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1380, ElementSize = 3, IdentifierElement = 179)
    public String getN_Hsm_Protocol() {
        return n_Hsm_Protocol;
    }

    public void setN_Hsm_Protocol(String n_Hsm_ProtocolParam) {
        this.n_Hsm_Protocol = n_Hsm_ProtocolParam;
    }

    @DdlField(Version = "2.0", QualName = "fil130812-1548", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1383, ElementSize = 1, IdentifierElement = 180)
    public String getFil130812_1548() {
        return fil130812_1548;
    }

    public void setFil130812_1548(String fil130812_1548Param) {
        this.fil130812_1548 = fil130812_1548Param;
    }

    @DdlField(Version = "2.0", QualName = "n-hsm-rport", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1384, ElementSize = 2, IdentifierElement = 181)
    public short getN_Hsm_Rport() {
        return n_Hsm_Rport;
    }

    public void setN_Hsm_Rport(short n_Hsm_RportParam) {
        this.n_Hsm_Rport = n_Hsm_RportParam;
    }

    @DdlField(Version = "2.0", QualName = "n-hsm-rport2", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1386, ElementSize = 2, IdentifierElement = 182)
    public short getN_Hsm_Rport2() {
        return n_Hsm_Rport2;
    }

    public void setN_Hsm_Rport2(short n_Hsm_Rport2Param) {
        this.n_Hsm_Rport2 = n_Hsm_Rport2Param;
    }

    @DdlField(Version = "2.0", QualName = "n-hsm-raddr", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1388, ElementSize = 16, IdentifierElement = 183)
    public String getN_Hsm_Raddr() {
        return n_Hsm_Raddr;
    }

    public void setN_Hsm_Raddr(String n_Hsm_RaddrParam) {
        this.n_Hsm_Raddr = n_Hsm_RaddrParam;
    }

    @DdlField(Version = "2.0", QualName = "n-hsm-raddr2", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1404, ElementSize = 16, IdentifierElement = 184)
    public String getN_Hsm_Raddr2() {
        return n_Hsm_Raddr2;
    }

    public void setN_Hsm_Raddr2(String n_Hsm_Raddr2Param) {
        this.n_Hsm_Raddr2 = n_Hsm_Raddr2Param;
    }

    @DdlField(Version = "2.0", QualName = "n-hsm-key", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1420, ElementSize = 80, IdentifierElement = 185)
    public String getN_Hsm_Key() {
        return n_Hsm_Key;
    }

    public void setN_Hsm_Key(String n_Hsm_KeyParam) {
        this.n_Hsm_Key = n_Hsm_KeyParam;
    }

    @DdlField(Version = "2.0", QualName = "n-hsm-sec-box", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1500, ElementSize = 2, IdentifierElement = 186)
    public short getN_Hsm_Sec_Box() {
        return n_Hsm_Sec_Box;
    }

    public void setN_Hsm_Sec_Box(short n_Hsm_Sec_BoxParam) {
        this.n_Hsm_Sec_Box = n_Hsm_Sec_BoxParam;
    }

    @DdlField(Version = "2.0", QualName = "n-hsm-tcpip-pro", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1502, ElementSize = 24, IdentifierElement = 187)
    public String getN_Hsm_Tcpip_Pro() {
        return n_Hsm_Tcpip_Pro;
    }

    public void setN_Hsm_Tcpip_Pro(String n_Hsm_Tcpip_ProParam) {
        this.n_Hsm_Tcpip_Pro = n_Hsm_Tcpip_ProParam;
    }

    @DdlField(Version = "2.0", QualName = "n-hsm-chk-digits", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1526, ElementSize = 6, IdentifierElement = 188)
    public String getN_Hsm_Chk_Digits() {
        return n_Hsm_Chk_Digits;
    }

    public void setN_Hsm_Chk_Digits(String n_Hsm_Chk_DigitsParam) {
        this.n_Hsm_Chk_Digits = n_Hsm_Chk_DigitsParam;
    }

    @DdlField(Version = "2.0", QualName = "hsm-laddr", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1532, ElementSize = 16, IdentifierElement = 189)
    public String getHsm_Laddr() {
        return hsm_Laddr;
    }

    public void setHsm_Laddr(String hsm_LaddrParam) {
        this.hsm_Laddr = hsm_LaddrParam;
    }

    @DdlField(Version = "2.0", QualName = "n-hsm-laddr", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1548, ElementSize = 16, IdentifierElement = 190)
    public String getN_Hsm_Laddr() {
        return n_Hsm_Laddr;
    }

    public void setN_Hsm_Laddr(String n_Hsm_LaddrParam) {
        this.n_Hsm_Laddr = n_Hsm_LaddrParam;
    }

    @DdlField(Version = "2.0", QualName = "sba-staletimer", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1564, ElementSize = 2, IdentifierElement = 191)
    public short getSba_Staletimer() {
        return sba_Staletimer;
    }

    public void setSba_Staletimer(short sba_StaletimerParam) {
        this.sba_Staletimer = sba_StaletimerParam;
    }

    @DdlField(Version = "2.0", QualName = "sba-staletimout", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1566, ElementSize = 2, IdentifierElement = 192)
    public short getSba_Staletimout() {
        return sba_Staletimout;
    }

    public void setSba_Staletimout(short sba_StaletimoutParam) {
        this.sba_Staletimout = sba_StaletimoutParam;
    }

    @DdlField(Version = "2.0", QualName = "sba-staleaction", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1568, ElementSize = 2, IdentifierElement = 193)
    public short getSba_Staleaction() {
        return sba_Staleaction;
    }

    public void setSba_Staleaction(short sba_StaleactionParam) {
        this.sba_Staleaction = sba_StaleactionParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-increment", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1570, ElementSize = 2, IdentifierElement = 194)
    public short getExt_Increment() {
        return ext_Increment;
    }

    public void setExt_Increment(short ext_IncrementParam) {
        this.ext_Increment = ext_IncrementParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-current", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1572, ElementSize = 2, IdentifierElement = 195)
    public short getExt_Current() {
        return ext_Current;
    }

    public void setExt_Current(short ext_CurrentParam) {
        this.ext_Current = ext_CurrentParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-aud-pri", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1574, ElementSize = 26, IdentifierElement = 196)
    public String getExt_Aud_Pri() {
        return ext_Aud_Pri;
    }

    public void setExt_Aud_Pri(String ext_Aud_PriParam) {
        this.ext_Aud_Pri = ext_Aud_PriParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-aud-bkup", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1600, ElementSize = 26, IdentifierElement = 197)
    public String getExt_Aud_Bkup() {
        return ext_Aud_Bkup;
    }

    public void setExt_Aud_Bkup(String ext_Aud_BkupParam) {
        this.ext_Aud_Bkup = ext_Aud_BkupParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-aud-file-code", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1626, ElementSize = 2, IdentifierElement = 198)
    public short getExt_Aud_File_Code() {
        return ext_Aud_File_Code;
    }

    public void setExt_Aud_File_Code(short ext_Aud_File_CodeParam) {
        this.ext_Aud_File_Code = ext_Aud_File_CodeParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-aud-flag", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1628, ElementSize = 2, IdentifierElement = 199)
    public short getExt_Aud_Flag() {
        return ext_Aud_Flag;
    }

    public void setExt_Aud_Flag(short ext_Aud_FlagParam) {
        this.ext_Aud_Flag = ext_Aud_FlagParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-aud-io", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1630, ElementSize = 2, IdentifierElement = 200)
    public short getExt_Aud_Io() {
        return ext_Aud_Io;
    }

    public void setExt_Aud_Io(short ext_Aud_IoParam) {
        this.ext_Aud_Io = ext_Aud_IoParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-aud-ret-days", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1632, ElementSize = 2, IdentifierElement = 201)
    public short getExt_Aud_Ret_Days() {
        return ext_Aud_Ret_Days;
    }

    public void setExt_Aud_Ret_Days(short ext_Aud_Ret_DaysParam) {
        this.ext_Aud_Ret_Days = ext_Aud_Ret_DaysParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-aud-stat-int", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1634, ElementSize = 2, IdentifierElement = 202)
    public short getExt_Aud_Stat_Int() {
        return ext_Aud_Stat_Int;
    }

    public void setExt_Aud_Stat_Int(short ext_Aud_Stat_IntParam) {
        this.ext_Aud_Stat_Int = ext_Aud_Stat_IntParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-aud-qat", ObjectClass = 1, Level = 1, Structure = 4, Offset = 1636, ElementSize = 4, IdentifierElement = 203)
    public int getExt_Aud_Qat() {
        return ext_Aud_Qat;
    }

    public void setExt_Aud_Qat(int ext_Aud_QatParam) {
        this.ext_Aud_Qat = ext_Aud_QatParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-aud-qmt", ObjectClass = 1, Level = 1, Structure = 4, Offset = 1640, ElementSize = 4, IdentifierElement = 204)
    public int getExt_Aud_Qmt() {
        return ext_Aud_Qmt;
    }

    public void setExt_Aud_Qmt(int ext_Aud_QmtParam) {
        this.ext_Aud_Qmt = ext_Aud_QmtParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-aud-qmi", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1644, ElementSize = 2, IdentifierElement = 205)
    public short getExt_Aud_Qmi() {
        return ext_Aud_Qmi;
    }

    public void setExt_Aud_Qmi(short ext_Aud_QmiParam) {
        this.ext_Aud_Qmi = ext_Aud_QmiParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-aud-pages", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1646, ElementSize = 2, IdentifierElement = 206)
    public short getExt_Aud_Pages() {
        return ext_Aud_Pages;
    }

    public void setExt_Aud_Pages(short ext_Aud_PagesParam) {
        this.ext_Aud_Pages = ext_Aud_PagesParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-aud-extent-size", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1648, ElementSize = 2, IdentifierElement = 207)
    public short getExt_Aud_Extent_Size() {
        return ext_Aud_Extent_Size;
    }

    public void setExt_Aud_Extent_Size(short ext_Aud_Extent_SizeParam) {
        this.ext_Aud_Extent_Size = ext_Aud_Extent_SizeParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-aud-max-extents", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1650, ElementSize = 2, IdentifierElement = 208)
    public short getExt_Aud_Max_Extents() {
        return ext_Aud_Max_Extents;
    }

    public void setExt_Aud_Max_Extents(short ext_Aud_Max_ExtentsParam) {
        this.ext_Aud_Max_Extents = ext_Aud_Max_ExtentsParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-aud-tcpip", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1652, ElementSize = 2, IdentifierElement = 209)
    public short getExt_Aud_Tcpip() {
        return ext_Aud_Tcpip;
    }

    public void setExt_Aud_Tcpip(short ext_Aud_TcpipParam) {
        this.ext_Aud_Tcpip = ext_Aud_TcpipParam;
    }

    @DdlField(Version = "2.0", QualName = "rts-onoff", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1654, ElementSize = 2, IdentifierElement = 210)
    public short getRts_Onoff() {
        return rts_Onoff;
    }

    public void setRts_Onoff(short rts_OnoffParam) {
        this.rts_Onoff = rts_OnoffParam;
    }

}
