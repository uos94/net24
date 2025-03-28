
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_status_sys.License_Exp;
import kr.co.kcs.oncf.ncp_resp_status_sys.Num_Lpros_StartedMarker;
import kr.co.kcs.oncf.ncp_resp_status_sys.Swbits;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-status-sys", ElementSize = 766, LocalName = "ncp-resp-status-sys")
public class Ncp_Resp_Status_Sys
    implements Serializable
{

    private short backup_Cpu;
    private short backup_Pin;
    private short backup_State;
    private int current_Queue_Memory;
    private short current_State;
    private int free_Byte_Bytes;
    private int free_Word_Bytes;
    private int free_Xtd_Bytes;
    private short load_Level_Index;
    private String log_Name_Alt;
    private String log_Name_Pri;
    private short log_Status_Alt;
    private short log_Status_Pri;
    private short loge_Qstate;
    private short logn_Qstate;
    private short meas_Enabled;
    private int messages_Queued;
    private int messages_Queued_To_Log;
    private short num_Lins_Started;
    private Num_Lpros_StartedMarker num_Lpros_Started;
    private short num_Pros_Started;
    private short num_Stas_Started;
    private short primary_Cpu;
    private short primary_Pin;
    private short startup_Priority;
    private short percent_Mem_Used;
    private int elog_Msgs_Queued;
    private int nlog_Msgs_Queued;
    private String audit_File_Name;
    private short audit_Dev_Type;
    private short[] pri_Phandle = new short[ 10 ] ;
    private short[] bkup_Phandle = new short[ 10 ] ;
    private String nef_File_Name;
    private String program_Var1;
    private String library;
    private String swap_File;
    private String ext_Swap_File;
    private String hometerm;
    private Swbits swbits;
    private String current_Cj_File;
    private String fillrr_1;
    private short config_Locked;
    private int msgs_Queued_To_Unk_Dests;
    private int msgs_Queued_To_Unav_Srvs;
    private short node_State;
    private int payloads_Allocated;
    private int payloads_In_Use;
    private int payload_Pages_Used;
    private int payload_Max_Size;
    private int dests_Inuse;
    private int dests_Added;
    private String license_File;
    private String fillrr_2;
    private License_Exp license_Exp;
    private int diagdest_Queue;
    private int curr_Num_Free_Blocks;
    private int prev_Num_Free_Blocks;
    private int curr_Largest_Free_Block;
    private int prev_Largest_Free_Block;
    private int curr_Smallest_Free_Block;
    private int prev_Smallest_Free_Block;
    private String ssl_Trc_File_Name;
    private short ssl_Trc_Status;
    private short ssl_Trc_Wrap;
    private int ssl_Trc_Pages;
    private int ssl_Trc_Segsize;
    private int ssl_Trc_Recsize;
    private short ssl_Prcnt_Ful;
    private int sba_Tot_Entries;
    private int sba_Tot_Inuse;
    private int sba_Tot_Free;
    private short sba_Tot_Numlist;
    private int total_Xtd_Bytes;
    private int total_Lmgr_Bytes;
    private int free_Lmgr_Bytes;
    private short percent_Lmgr_Used;
    private short ext_Increment;
    private short ext_Incremented;
    private String curr_Ext_Aud_File;
    private String aud_Filr_1;
    private short ext_Aud_Perc_Full;
    private int ext_Aud_Num_Recs;

    @DdlField(Version = "2.0", QualName = "backup-cpu", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getBackup_Cpu() {
        return backup_Cpu;
    }

    public void setBackup_Cpu(short backup_CpuParam) {
        this.backup_Cpu = backup_CpuParam;
    }

    @DdlField(Version = "2.0", QualName = "backup-pin", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getBackup_Pin() {
        return backup_Pin;
    }

    public void setBackup_Pin(short backup_PinParam) {
        this.backup_Pin = backup_PinParam;
    }

    @DdlField(Version = "2.0", QualName = "backup-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 3)
    public short getBackup_State() {
        return backup_State;
    }

    public void setBackup_State(short backup_StateParam) {
        this.backup_State = backup_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "current-queue-memory", ObjectClass = 1, Level = 1, Structure = 4, Offset = 6, ElementSize = 4, IdentifierElement = 4)
    public int getCurrent_Queue_Memory() {
        return current_Queue_Memory;
    }

    public void setCurrent_Queue_Memory(int current_Queue_MemoryParam) {
        this.current_Queue_Memory = current_Queue_MemoryParam;
    }

    @DdlField(Version = "2.0", QualName = "current-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 10, ElementSize = 2, IdentifierElement = 5)
    public short getCurrent_State() {
        return current_State;
    }

    public void setCurrent_State(short current_StateParam) {
        this.current_State = current_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "free-byte-bytes", ObjectClass = 1, Level = 1, Structure = 4, Offset = 12, ElementSize = 4, IdentifierElement = 6)
    public int getFree_Byte_Bytes() {
        return free_Byte_Bytes;
    }

    public void setFree_Byte_Bytes(int free_Byte_BytesParam) {
        this.free_Byte_Bytes = free_Byte_BytesParam;
    }

    @DdlField(Version = "2.0", QualName = "free-word-bytes", ObjectClass = 1, Level = 1, Structure = 4, Offset = 16, ElementSize = 4, IdentifierElement = 7)
    public int getFree_Word_Bytes() {
        return free_Word_Bytes;
    }

    public void setFree_Word_Bytes(int free_Word_BytesParam) {
        this.free_Word_Bytes = free_Word_BytesParam;
    }

    @DdlField(Version = "2.0", QualName = "free-xtd-bytes", ObjectClass = 1, Level = 1, Structure = 4, Offset = 20, ElementSize = 4, IdentifierElement = 8)
    public int getFree_Xtd_Bytes() {
        return free_Xtd_Bytes;
    }

    public void setFree_Xtd_Bytes(int free_Xtd_BytesParam) {
        this.free_Xtd_Bytes = free_Xtd_BytesParam;
    }

    @DdlField(Version = "2.0", QualName = "load-level-index", ObjectClass = 1, Level = 1, Structure = 2, Offset = 24, ElementSize = 2, IdentifierElement = 9)
    public short getLoad_Level_Index() {
        return load_Level_Index;
    }

    public void setLoad_Level_Index(short load_Level_IndexParam) {
        this.load_Level_Index = load_Level_IndexParam;
    }

    @DdlField(Version = "2.0", QualName = "log-name-alt", ObjectClass = 1, Level = 1, Structure = 0, Offset = 26, ElementSize = 34, IdentifierElement = 10)
    public String getLog_Name_Alt() {
        return log_Name_Alt;
    }

    public void setLog_Name_Alt(String log_Name_AltParam) {
        this.log_Name_Alt = log_Name_AltParam;
    }

    @DdlField(Version = "2.0", QualName = "log-name-pri", ObjectClass = 1, Level = 1, Structure = 0, Offset = 60, ElementSize = 34, IdentifierElement = 11)
    public String getLog_Name_Pri() {
        return log_Name_Pri;
    }

    public void setLog_Name_Pri(String log_Name_PriParam) {
        this.log_Name_Pri = log_Name_PriParam;
    }

    @DdlField(Version = "2.0", QualName = "log-status-alt", ObjectClass = 1, Level = 1, Structure = 2, Offset = 94, ElementSize = 2, IdentifierElement = 12)
    public short getLog_Status_Alt() {
        return log_Status_Alt;
    }

    public void setLog_Status_Alt(short log_Status_AltParam) {
        this.log_Status_Alt = log_Status_AltParam;
    }

    @DdlField(Version = "2.0", QualName = "log-status-pri", ObjectClass = 1, Level = 1, Structure = 2, Offset = 96, ElementSize = 2, IdentifierElement = 13)
    public short getLog_Status_Pri() {
        return log_Status_Pri;
    }

    public void setLog_Status_Pri(short log_Status_PriParam) {
        this.log_Status_Pri = log_Status_PriParam;
    }

    @DdlField(Version = "2.0", QualName = "loge-qstate", ObjectClass = 1, Level = 1, Structure = 2, Offset = 98, ElementSize = 2, IdentifierElement = 14)
    public short getLoge_Qstate() {
        return loge_Qstate;
    }

    public void setLoge_Qstate(short loge_QstateParam) {
        this.loge_Qstate = loge_QstateParam;
    }

    @DdlField(Version = "2.0", QualName = "logn-qstate", ObjectClass = 1, Level = 1, Structure = 2, Offset = 100, ElementSize = 2, IdentifierElement = 15)
    public short getLogn_Qstate() {
        return logn_Qstate;
    }

    public void setLogn_Qstate(short logn_QstateParam) {
        this.logn_Qstate = logn_QstateParam;
    }

    @DdlField(Version = "2.0", QualName = "meas-enabled", ObjectClass = 1, Level = 1, Structure = 2, Offset = 102, ElementSize = 2, IdentifierElement = 16)
    public short getMeas_Enabled() {
        return meas_Enabled;
    }

    public void setMeas_Enabled(short meas_EnabledParam) {
        this.meas_Enabled = meas_EnabledParam;
    }

    @DdlField(Version = "2.0", QualName = "messages-queued", ObjectClass = 1, Level = 1, Structure = 4, Offset = 104, ElementSize = 4, IdentifierElement = 17)
    public int getMessages_Queued() {
        return messages_Queued;
    }

    public void setMessages_Queued(int messages_QueuedParam) {
        this.messages_Queued = messages_QueuedParam;
    }

    @DdlField(Version = "2.0", QualName = "messages-queued-to-log", ObjectClass = 1, Level = 1, Structure = 4, Offset = 108, ElementSize = 4, IdentifierElement = 18)
    public int getMessages_Queued_To_Log() {
        return messages_Queued_To_Log;
    }

    public void setMessages_Queued_To_Log(int messages_Queued_To_LogParam) {
        this.messages_Queued_To_Log = messages_Queued_To_LogParam;
    }

    @DdlField(Version = "2.0", QualName = "num-lins-started", ObjectClass = 1, Level = 1, Structure = 2, Offset = 112, ElementSize = 2, IdentifierElement = 19)
    public short getNum_Lins_Started() {
        return num_Lins_Started;
    }

    public void setNum_Lins_Started(short num_Lins_StartedParam) {
        this.num_Lins_Started = num_Lins_StartedParam;
    }

    @DdlField(Version = "2.0", QualName = "num-lpros-started", ObjectClass = 1, Level = 1, Structure = 2, Offset = 114, ElementSize = 2, IdentifierElement = 20)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_status_sys.Num_Lpros_Started")
    public Num_Lpros_StartedMarker getNum_Lpros_Started() {
        return num_Lpros_Started;
    }

    public void setNum_Lpros_Started(Num_Lpros_StartedMarker num_Lpros_StartedParam) {
        this.num_Lpros_Started = num_Lpros_StartedParam;
    }

    @DdlField(Version = "2.0", QualName = "num-pros-started", ObjectClass = 1, Level = 1, Structure = 2, Offset = 116, ElementSize = 2, IdentifierElement = 22)
    public short getNum_Pros_Started() {
        return num_Pros_Started;
    }

    public void setNum_Pros_Started(short num_Pros_StartedParam) {
        this.num_Pros_Started = num_Pros_StartedParam;
    }

    @DdlField(Version = "2.0", QualName = "num-stas-started", ObjectClass = 1, Level = 1, Structure = 2, Offset = 118, ElementSize = 2, IdentifierElement = 23)
    public short getNum_Stas_Started() {
        return num_Stas_Started;
    }

    public void setNum_Stas_Started(short num_Stas_StartedParam) {
        this.num_Stas_Started = num_Stas_StartedParam;
    }

    @DdlField(Version = "2.0", QualName = "primary-cpu", ObjectClass = 1, Level = 1, Structure = 2, Offset = 120, ElementSize = 2, IdentifierElement = 24)
    public short getPrimary_Cpu() {
        return primary_Cpu;
    }

    public void setPrimary_Cpu(short primary_CpuParam) {
        this.primary_Cpu = primary_CpuParam;
    }

    @DdlField(Version = "2.0", QualName = "primary-pin", ObjectClass = 1, Level = 1, Structure = 2, Offset = 122, ElementSize = 2, IdentifierElement = 25)
    public short getPrimary_Pin() {
        return primary_Pin;
    }

    public void setPrimary_Pin(short primary_PinParam) {
        this.primary_Pin = primary_PinParam;
    }

    @DdlField(Version = "2.0", QualName = "startup-priority", ObjectClass = 1, Level = 1, Structure = 2, Offset = 124, ElementSize = 2, IdentifierElement = 26)
    public short getStartup_Priority() {
        return startup_Priority;
    }

    public void setStartup_Priority(short startup_PriorityParam) {
        this.startup_Priority = startup_PriorityParam;
    }

    @DdlField(Version = "2.0", QualName = "percent-mem-used", ObjectClass = 1, Level = 1, Structure = 2, Offset = 126, ElementSize = 2, IdentifierElement = 27)
    public short getPercent_Mem_Used() {
        return percent_Mem_Used;
    }

    public void setPercent_Mem_Used(short percent_Mem_UsedParam) {
        this.percent_Mem_Used = percent_Mem_UsedParam;
    }

    @DdlField(Version = "2.0", QualName = "elog-msgs-queued", ObjectClass = 1, Level = 1, Structure = 4, Offset = 128, ElementSize = 4, IdentifierElement = 28)
    public int getElog_Msgs_Queued() {
        return elog_Msgs_Queued;
    }

    public void setElog_Msgs_Queued(int elog_Msgs_QueuedParam) {
        this.elog_Msgs_Queued = elog_Msgs_QueuedParam;
    }

    @DdlField(Version = "2.0", QualName = "nlog-msgs-queued", ObjectClass = 1, Level = 1, Structure = 4, Offset = 132, ElementSize = 4, IdentifierElement = 29)
    public int getNlog_Msgs_Queued() {
        return nlog_Msgs_Queued;
    }

    public void setNlog_Msgs_Queued(int nlog_Msgs_QueuedParam) {
        this.nlog_Msgs_Queued = nlog_Msgs_QueuedParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-file-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 136, ElementSize = 34, IdentifierElement = 30)
    public String getAudit_File_Name() {
        return audit_File_Name;
    }

    public void setAudit_File_Name(String audit_File_NameParam) {
        this.audit_File_Name = audit_File_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-dev-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 170, ElementSize = 2, IdentifierElement = 31)
    public short getAudit_Dev_Type() {
        return audit_Dev_Type;
    }

    public void setAudit_Dev_Type(short audit_Dev_TypeParam) {
        this.audit_Dev_Type = audit_Dev_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "pri-phandle", ObjectClass = 1, Level = 1, Structure = 2, Offset = 172, ElementSize = 2, IdentifierElement = 32, OccursMax = 10)
    public short[] getPri_Phandle() {
        return pri_Phandle;
    }

    @DdlField(Version = "2.0", QualName = "pri-phandle", ObjectClass = 1, Level = 1, Structure = 2, Offset = 172, ElementSize = 2, IdentifierElement = 32, OccursMax = 10)
    public short getPri_Phandle(int index) {
        return (pri_Phandle[index]);
    }

    public void setPri_Phandle(short[] pri_PhandleParam) {
        this.pri_Phandle = pri_PhandleParam;
    }

    public void setPri_Phandle(int index, short pri_PhandleParam) {
        this.pri_Phandle[index]=pri_PhandleParam;
    }

    @DdlField(Version = "2.0", QualName = "bkup-phandle", ObjectClass = 1, Level = 1, Structure = 2, Offset = 192, ElementSize = 2, IdentifierElement = 33, OccursMax = 10)
    public short[] getBkup_Phandle() {
        return bkup_Phandle;
    }

    @DdlField(Version = "2.0", QualName = "bkup-phandle", ObjectClass = 1, Level = 1, Structure = 2, Offset = 192, ElementSize = 2, IdentifierElement = 33, OccursMax = 10)
    public short getBkup_Phandle(int index) {
        return (bkup_Phandle[index]);
    }

    public void setBkup_Phandle(short[] bkup_PhandleParam) {
        this.bkup_Phandle = bkup_PhandleParam;
    }

    public void setBkup_Phandle(int index, short bkup_PhandleParam) {
        this.bkup_Phandle[index]=bkup_PhandleParam;
    }

    @DdlField(Version = "2.0", QualName = "nef-file-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 212, ElementSize = 35, IdentifierElement = 34)
    public String getNef_File_Name() {
        return nef_File_Name;
    }

    public void setNef_File_Name(String nef_File_NameParam) {
        this.nef_File_Name = nef_File_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "program-var1", ObjectClass = 1, Level = 1, Structure = 0, Offset = 247, ElementSize = 35, IdentifierElement = 35)
    public String getProgram_Var1() {
        return program_Var1;
    }

    public void setProgram_Var1(String program_Var1Param) {
        this.program_Var1 = program_Var1Param;
    }

    @DdlField(Version = "2.0", QualName = "library", ObjectClass = 1, Level = 1, Structure = 0, Offset = 282, ElementSize = 35, IdentifierElement = 36)
    public String getLibrary() {
        return library;
    }

    public void setLibrary(String libraryParam) {
        this.library = libraryParam;
    }

    @DdlField(Version = "2.0", QualName = "swap-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 317, ElementSize = 35, IdentifierElement = 37)
    public String getSwap_File() {
        return swap_File;
    }

    public void setSwap_File(String swap_FileParam) {
        this.swap_File = swap_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-swap-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 352, ElementSize = 35, IdentifierElement = 38)
    public String getExt_Swap_File() {
        return ext_Swap_File;
    }

    public void setExt_Swap_File(String ext_Swap_FileParam) {
        this.ext_Swap_File = ext_Swap_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "hometerm", ObjectClass = 1, Level = 1, Structure = 0, Offset = 387, ElementSize = 47, IdentifierElement = 39)
    public String getHometerm() {
        return hometerm;
    }

    public void setHometerm(String hometermParam) {
        this.hometerm = hometermParam;
    }

    @DdlField(Version = "2.0", QualName = "swbits", ObjectClass = 0, Level = 1, Structure = 0, Offset = 434, ElementSize = 64, IdentifierElement = 40)
    public Swbits getSwbits() {
        return swbits;
    }

    public void setSwbits(Swbits swbitsParam) {
        this.swbits = swbitsParam;
    }

    @DdlField(Version = "2.0", QualName = "current-cj-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 498, ElementSize = 35, IdentifierElement = 73)
    public String getCurrent_Cj_File() {
        return current_Cj_File;
    }

    public void setCurrent_Cj_File(String current_Cj_FileParam) {
        this.current_Cj_File = current_Cj_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "fillrr-1", ObjectClass = 1, Level = 1, Structure = 0, Offset = 533, ElementSize = 1, IdentifierElement = 74)
    public String getFillrr_1() {
        return fillrr_1;
    }

    public void setFillrr_1(String fillrr_1Param) {
        this.fillrr_1 = fillrr_1Param;
    }

    @DdlField(Version = "2.0", QualName = "config-locked", ObjectClass = 1, Level = 1, Structure = 2, Offset = 534, ElementSize = 2, IdentifierElement = 75)
    public short getConfig_Locked() {
        return config_Locked;
    }

    public void setConfig_Locked(short config_LockedParam) {
        this.config_Locked = config_LockedParam;
    }

    @DdlField(Version = "2.0", QualName = "msgs-queued-to-unk-dests", ObjectClass = 1, Level = 1, Structure = 4, Offset = 536, ElementSize = 4, IdentifierElement = 76)
    public int getMsgs_Queued_To_Unk_Dests() {
        return msgs_Queued_To_Unk_Dests;
    }

    public void setMsgs_Queued_To_Unk_Dests(int msgs_Queued_To_Unk_DestsParam) {
        this.msgs_Queued_To_Unk_Dests = msgs_Queued_To_Unk_DestsParam;
    }

    @DdlField(Version = "2.0", QualName = "msgs-queued-to-unav-srvs", ObjectClass = 1, Level = 1, Structure = 4, Offset = 540, ElementSize = 4, IdentifierElement = 77)
    public int getMsgs_Queued_To_Unav_Srvs() {
        return msgs_Queued_To_Unav_Srvs;
    }

    public void setMsgs_Queued_To_Unav_Srvs(int msgs_Queued_To_Unav_SrvsParam) {
        this.msgs_Queued_To_Unav_Srvs = msgs_Queued_To_Unav_SrvsParam;
    }

    @DdlField(Version = "2.0", QualName = "node-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 544, ElementSize = 2, IdentifierElement = 78)
    public short getNode_State() {
        return node_State;
    }

    public void setNode_State(short node_StateParam) {
        this.node_State = node_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "payloads-allocated", ObjectClass = 1, Level = 1, Structure = 4, Offset = 546, ElementSize = 4, IdentifierElement = 79)
    public int getPayloads_Allocated() {
        return payloads_Allocated;
    }

    public void setPayloads_Allocated(int payloads_AllocatedParam) {
        this.payloads_Allocated = payloads_AllocatedParam;
    }

    @DdlField(Version = "2.0", QualName = "payloads-in-use", ObjectClass = 1, Level = 1, Structure = 4, Offset = 550, ElementSize = 4, IdentifierElement = 80)
    public int getPayloads_In_Use() {
        return payloads_In_Use;
    }

    public void setPayloads_In_Use(int payloads_In_UseParam) {
        this.payloads_In_Use = payloads_In_UseParam;
    }

    @DdlField(Version = "2.0", QualName = "payload-pages-used", ObjectClass = 1, Level = 1, Structure = 4, Offset = 554, ElementSize = 4, IdentifierElement = 81)
    public int getPayload_Pages_Used() {
        return payload_Pages_Used;
    }

    public void setPayload_Pages_Used(int payload_Pages_UsedParam) {
        this.payload_Pages_Used = payload_Pages_UsedParam;
    }

    @DdlField(Version = "2.0", QualName = "payload-max-size", ObjectClass = 1, Level = 1, Structure = 4, Offset = 558, ElementSize = 4, IdentifierElement = 82)
    public int getPayload_Max_Size() {
        return payload_Max_Size;
    }

    public void setPayload_Max_Size(int payload_Max_SizeParam) {
        this.payload_Max_Size = payload_Max_SizeParam;
    }

    @DdlField(Version = "2.0", QualName = "dests-inuse", ObjectClass = 1, Level = 1, Structure = 4, Offset = 562, ElementSize = 4, IdentifierElement = 83)
    public int getDests_Inuse() {
        return dests_Inuse;
    }

    public void setDests_Inuse(int dests_InuseParam) {
        this.dests_Inuse = dests_InuseParam;
    }

    @DdlField(Version = "2.0", QualName = "dests-added", ObjectClass = 1, Level = 1, Structure = 4, Offset = 566, ElementSize = 4, IdentifierElement = 84)
    public int getDests_Added() {
        return dests_Added;
    }

    public void setDests_Added(int dests_AddedParam) {
        this.dests_Added = dests_AddedParam;
    }

    @DdlField(Version = "2.0", QualName = "license-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 570, ElementSize = 35, IdentifierElement = 85)
    public String getLicense_File() {
        return license_File;
    }

    public void setLicense_File(String license_FileParam) {
        this.license_File = license_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "fillrr-2", ObjectClass = 1, Level = 1, Structure = 0, Offset = 605, ElementSize = 1, IdentifierElement = 86)
    public String getFillrr_2() {
        return fillrr_2;
    }

    public void setFillrr_2(String fillrr_2Param) {
        this.fillrr_2 = fillrr_2Param;
    }

    @DdlField(Version = "2.0", QualName = "license-exp", ObjectClass = 0, Level = 1, Structure = 0, Offset = 606, ElementSize = 6, IdentifierElement = 87)
    public License_Exp getLicense_Exp() {
        return license_Exp;
    }

    public void setLicense_Exp(License_Exp license_ExpParam) {
        this.license_Exp = license_ExpParam;
    }

    @DdlField(Version = "2.0", QualName = "diagdest-queue", ObjectClass = 1, Level = 1, Structure = 4, Offset = 612, ElementSize = 4, IdentifierElement = 91)
    public int getDiagdest_Queue() {
        return diagdest_Queue;
    }

    public void setDiagdest_Queue(int diagdest_QueueParam) {
        this.diagdest_Queue = diagdest_QueueParam;
    }

    @DdlField(Version = "2.0", QualName = "curr-num-free-blocks", ObjectClass = 1, Level = 1, Structure = 4, Offset = 616, ElementSize = 4, IdentifierElement = 92)
    public int getCurr_Num_Free_Blocks() {
        return curr_Num_Free_Blocks;
    }

    public void setCurr_Num_Free_Blocks(int curr_Num_Free_BlocksParam) {
        this.curr_Num_Free_Blocks = curr_Num_Free_BlocksParam;
    }

    @DdlField(Version = "2.0", QualName = "prev-num-free-blocks", ObjectClass = 1, Level = 1, Structure = 4, Offset = 620, ElementSize = 4, IdentifierElement = 93)
    public int getPrev_Num_Free_Blocks() {
        return prev_Num_Free_Blocks;
    }

    public void setPrev_Num_Free_Blocks(int prev_Num_Free_BlocksParam) {
        this.prev_Num_Free_Blocks = prev_Num_Free_BlocksParam;
    }

    @DdlField(Version = "2.0", QualName = "curr-largest-free-block", ObjectClass = 1, Level = 1, Structure = 4, Offset = 624, ElementSize = 4, IdentifierElement = 94)
    public int getCurr_Largest_Free_Block() {
        return curr_Largest_Free_Block;
    }

    public void setCurr_Largest_Free_Block(int curr_Largest_Free_BlockParam) {
        this.curr_Largest_Free_Block = curr_Largest_Free_BlockParam;
    }

    @DdlField(Version = "2.0", QualName = "prev-largest-free-block", ObjectClass = 1, Level = 1, Structure = 4, Offset = 628, ElementSize = 4, IdentifierElement = 95)
    public int getPrev_Largest_Free_Block() {
        return prev_Largest_Free_Block;
    }

    public void setPrev_Largest_Free_Block(int prev_Largest_Free_BlockParam) {
        this.prev_Largest_Free_Block = prev_Largest_Free_BlockParam;
    }

    @DdlField(Version = "2.0", QualName = "curr-smallest-free-block", ObjectClass = 1, Level = 1, Structure = 4, Offset = 632, ElementSize = 4, IdentifierElement = 96)
    public int getCurr_Smallest_Free_Block() {
        return curr_Smallest_Free_Block;
    }

    public void setCurr_Smallest_Free_Block(int curr_Smallest_Free_BlockParam) {
        this.curr_Smallest_Free_Block = curr_Smallest_Free_BlockParam;
    }

    @DdlField(Version = "2.0", QualName = "prev-smallest-free-block", ObjectClass = 1, Level = 1, Structure = 4, Offset = 636, ElementSize = 4, IdentifierElement = 97)
    public int getPrev_Smallest_Free_Block() {
        return prev_Smallest_Free_Block;
    }

    public void setPrev_Smallest_Free_Block(int prev_Smallest_Free_BlockParam) {
        this.prev_Smallest_Free_Block = prev_Smallest_Free_BlockParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-trc-file-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 640, ElementSize = 34, IdentifierElement = 98)
    public String getSsl_Trc_File_Name() {
        return ssl_Trc_File_Name;
    }

    public void setSsl_Trc_File_Name(String ssl_Trc_File_NameParam) {
        this.ssl_Trc_File_Name = ssl_Trc_File_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-trc-status", ObjectClass = 1, Level = 1, Structure = 2, Offset = 674, ElementSize = 2, IdentifierElement = 99)
    public short getSsl_Trc_Status() {
        return ssl_Trc_Status;
    }

    public void setSsl_Trc_Status(short ssl_Trc_StatusParam) {
        this.ssl_Trc_Status = ssl_Trc_StatusParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-trc-wrap", ObjectClass = 1, Level = 1, Structure = 2, Offset = 676, ElementSize = 2, IdentifierElement = 100)
    public short getSsl_Trc_Wrap() {
        return ssl_Trc_Wrap;
    }

    public void setSsl_Trc_Wrap(short ssl_Trc_WrapParam) {
        this.ssl_Trc_Wrap = ssl_Trc_WrapParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-trc-pages", ObjectClass = 1, Level = 1, Structure = 4, Offset = 678, ElementSize = 4, IdentifierElement = 101)
    public int getSsl_Trc_Pages() {
        return ssl_Trc_Pages;
    }

    public void setSsl_Trc_Pages(int ssl_Trc_PagesParam) {
        this.ssl_Trc_Pages = ssl_Trc_PagesParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-trc-segsize", ObjectClass = 1, Level = 1, Structure = 4, Offset = 682, ElementSize = 4, IdentifierElement = 102)
    public int getSsl_Trc_Segsize() {
        return ssl_Trc_Segsize;
    }

    public void setSsl_Trc_Segsize(int ssl_Trc_SegsizeParam) {
        this.ssl_Trc_Segsize = ssl_Trc_SegsizeParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-trc-recsize", ObjectClass = 1, Level = 1, Structure = 4, Offset = 686, ElementSize = 4, IdentifierElement = 103)
    public int getSsl_Trc_Recsize() {
        return ssl_Trc_Recsize;
    }

    public void setSsl_Trc_Recsize(int ssl_Trc_RecsizeParam) {
        this.ssl_Trc_Recsize = ssl_Trc_RecsizeParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-prcnt-ful", ObjectClass = 1, Level = 1, Structure = 2, Offset = 690, ElementSize = 2, IdentifierElement = 104)
    public short getSsl_Prcnt_Ful() {
        return ssl_Prcnt_Ful;
    }

    public void setSsl_Prcnt_Ful(short ssl_Prcnt_FulParam) {
        this.ssl_Prcnt_Ful = ssl_Prcnt_FulParam;
    }

    @DdlField(Version = "2.0", QualName = "sba-tot-entries", ObjectClass = 1, Level = 1, Structure = 4, Offset = 692, ElementSize = 4, IdentifierElement = 105)
    public int getSba_Tot_Entries() {
        return sba_Tot_Entries;
    }

    public void setSba_Tot_Entries(int sba_Tot_EntriesParam) {
        this.sba_Tot_Entries = sba_Tot_EntriesParam;
    }

    @DdlField(Version = "2.0", QualName = "sba-tot-inuse", ObjectClass = 1, Level = 1, Structure = 4, Offset = 696, ElementSize = 4, IdentifierElement = 106)
    public int getSba_Tot_Inuse() {
        return sba_Tot_Inuse;
    }

    public void setSba_Tot_Inuse(int sba_Tot_InuseParam) {
        this.sba_Tot_Inuse = sba_Tot_InuseParam;
    }

    @DdlField(Version = "2.0", QualName = "sba-tot-free", ObjectClass = 1, Level = 1, Structure = 4, Offset = 700, ElementSize = 4, IdentifierElement = 107)
    public int getSba_Tot_Free() {
        return sba_Tot_Free;
    }

    public void setSba_Tot_Free(int sba_Tot_FreeParam) {
        this.sba_Tot_Free = sba_Tot_FreeParam;
    }

    @DdlField(Version = "2.0", QualName = "sba-tot-numlist", ObjectClass = 1, Level = 1, Structure = 2, Offset = 704, ElementSize = 2, IdentifierElement = 108)
    public short getSba_Tot_Numlist() {
        return sba_Tot_Numlist;
    }

    public void setSba_Tot_Numlist(short sba_Tot_NumlistParam) {
        this.sba_Tot_Numlist = sba_Tot_NumlistParam;
    }

    @DdlField(Version = "2.0", QualName = "total-xtd-bytes", ObjectClass = 1, Level = 1, Structure = 4, Offset = 706, ElementSize = 4, IdentifierElement = 109)
    public int getTotal_Xtd_Bytes() {
        return total_Xtd_Bytes;
    }

    public void setTotal_Xtd_Bytes(int total_Xtd_BytesParam) {
        this.total_Xtd_Bytes = total_Xtd_BytesParam;
    }

    @DdlField(Version = "2.0", QualName = "total-lmgr-bytes", ObjectClass = 1, Level = 1, Structure = 4, Offset = 710, ElementSize = 4, IdentifierElement = 110)
    public int getTotal_Lmgr_Bytes() {
        return total_Lmgr_Bytes;
    }

    public void setTotal_Lmgr_Bytes(int total_Lmgr_BytesParam) {
        this.total_Lmgr_Bytes = total_Lmgr_BytesParam;
    }

    @DdlField(Version = "2.0", QualName = "free-lmgr-bytes", ObjectClass = 1, Level = 1, Structure = 4, Offset = 714, ElementSize = 4, IdentifierElement = 111)
    public int getFree_Lmgr_Bytes() {
        return free_Lmgr_Bytes;
    }

    public void setFree_Lmgr_Bytes(int free_Lmgr_BytesParam) {
        this.free_Lmgr_Bytes = free_Lmgr_BytesParam;
    }

    @DdlField(Version = "2.0", QualName = "percent-lmgr-used", ObjectClass = 1, Level = 1, Structure = 2, Offset = 718, ElementSize = 2, IdentifierElement = 112)
    public short getPercent_Lmgr_Used() {
        return percent_Lmgr_Used;
    }

    public void setPercent_Lmgr_Used(short percent_Lmgr_UsedParam) {
        this.percent_Lmgr_Used = percent_Lmgr_UsedParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-increment", ObjectClass = 1, Level = 1, Structure = 2, Offset = 720, ElementSize = 2, IdentifierElement = 113)
    public short getExt_Increment() {
        return ext_Increment;
    }

    public void setExt_Increment(short ext_IncrementParam) {
        this.ext_Increment = ext_IncrementParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-incremented", ObjectClass = 1, Level = 1, Structure = 2, Offset = 722, ElementSize = 2, IdentifierElement = 114)
    public short getExt_Incremented() {
        return ext_Incremented;
    }

    public void setExt_Incremented(short ext_IncrementedParam) {
        this.ext_Incremented = ext_IncrementedParam;
    }

    @DdlField(Version = "2.0", QualName = "curr-ext-aud-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 724, ElementSize = 35, IdentifierElement = 115)
    public String getCurr_Ext_Aud_File() {
        return curr_Ext_Aud_File;
    }

    public void setCurr_Ext_Aud_File(String curr_Ext_Aud_FileParam) {
        this.curr_Ext_Aud_File = curr_Ext_Aud_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "aud-filr-1", ObjectClass = 1, Level = 1, Structure = 0, Offset = 759, ElementSize = 1, IdentifierElement = 116)
    public String getAud_Filr_1() {
        return aud_Filr_1;
    }

    public void setAud_Filr_1(String aud_Filr_1Param) {
        this.aud_Filr_1 = aud_Filr_1Param;
    }

    @DdlField(Version = "2.0", QualName = "ext-aud-perc-full", ObjectClass = 1, Level = 1, Structure = 2, Offset = 760, ElementSize = 2, IdentifierElement = 117)
    public short getExt_Aud_Perc_Full() {
        return ext_Aud_Perc_Full;
    }

    public void setExt_Aud_Perc_Full(short ext_Aud_Perc_FullParam) {
        this.ext_Aud_Perc_Full = ext_Aud_Perc_FullParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-aud-num-recs", ObjectClass = 1, Level = 1, Structure = 4, Offset = 762, ElementSize = 4, IdentifierElement = 118)
    public int getExt_Aud_Num_Recs() {
        return ext_Aud_Num_Recs;
    }

    public void setExt_Aud_Num_Recs(int ext_Aud_Num_RecsParam) {
        this.ext_Aud_Num_Recs = ext_Aud_Num_RecsParam;
    }

}
