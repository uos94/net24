
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_hstat_sys.License_Exp;
import kr.co.kcs.oncf.ncp_resp_hstat_sys.Num_Lpros_StartedMarker;
import kr.co.kcs.oncf.ncp_resp_hstat_sys.Number_Of_LprocessesMarker;
import kr.co.kcs.oncf.ncp_resp_hstat_sys.Swbits;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-hstat-sys", ElementSize = 914, LocalName = "ncp-resp-hstat-sys")
public class Ncp_Resp_Hstat_Sys
    implements Serializable
{

    private int audit_Number_Of_Records;
    private short audit_Percent_Full;
    private int loge_Msgs_Dropped_Ttl;
    private int loge_Msg_Drop_Rate;
    private int logn_Msgs_Dropped_Ttl;
    private int logn_Msg_Drop_Rate;
    private int maximum_Queue_Memory;
    private short number_Of_Devices;
    private short number_Of_Lines;
    private Number_Of_LprocessesMarker number_Of_Lprocesses;
    private short number_Of_Processes;
    private short number_Of_Qprocesses;
    private short number_Of_Stations;
    private short percent_Mem_Used_Stats;
    private int nom_Msgs_Dropped;
    private int max_Chkpt_Size;
    private int multiple_Chkpt_Count;
    private short failures;
    private int max_Payloads_Expired;
    private int max_Payloads_In_Use;
    private int max_Payload_Pages;
    private String reset_Timestamp;
    private short rpc_Segments_In_Use;
    private short xnc_Segments_In_Use;
    private int min_Num_Free_Blocks;
    private int max_Num_Free_Blocks;
    private int min_Largest_Free_Block;
    private int max_Largest_Free_Block;
    private int min_Smallest_Free_Block;
    private int max_Smallest_Free_Block;
    private String max_Qmem_Timestamp;
    private String max_Pmem_Timestamp;
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
    private short percent_Mem_Used_Status;
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

    @DdlField(Version = "2.0", QualName = "audit-number-of-records", ObjectClass = 1, Level = 1, Structure = 4, Offset = 0, ElementSize = 4, IdentifierElement = 1)
    public int getAudit_Number_Of_Records() {
        return audit_Number_Of_Records;
    }

    public void setAudit_Number_Of_Records(int audit_Number_Of_RecordsParam) {
        this.audit_Number_Of_Records = audit_Number_Of_RecordsParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-percent-full", ObjectClass = 1, Level = 1, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 2)
    public short getAudit_Percent_Full() {
        return audit_Percent_Full;
    }

    public void setAudit_Percent_Full(short audit_Percent_FullParam) {
        this.audit_Percent_Full = audit_Percent_FullParam;
    }

    @DdlField(Version = "2.0", QualName = "loge-msgs-dropped-ttl", ObjectClass = 1, Level = 1, Structure = 4, Offset = 6, ElementSize = 4, IdentifierElement = 3)
    public int getLoge_Msgs_Dropped_Ttl() {
        return loge_Msgs_Dropped_Ttl;
    }

    public void setLoge_Msgs_Dropped_Ttl(int loge_Msgs_Dropped_TtlParam) {
        this.loge_Msgs_Dropped_Ttl = loge_Msgs_Dropped_TtlParam;
    }

    @DdlField(Version = "2.0", QualName = "loge-msg-drop-rate", ObjectClass = 1, Level = 1, Structure = 4, Offset = 10, ElementSize = 4, IdentifierElement = 4)
    public int getLoge_Msg_Drop_Rate() {
        return loge_Msg_Drop_Rate;
    }

    public void setLoge_Msg_Drop_Rate(int loge_Msg_Drop_RateParam) {
        this.loge_Msg_Drop_Rate = loge_Msg_Drop_RateParam;
    }

    @DdlField(Version = "2.0", QualName = "logn-msgs-dropped-ttl", ObjectClass = 1, Level = 1, Structure = 4, Offset = 14, ElementSize = 4, IdentifierElement = 5)
    public int getLogn_Msgs_Dropped_Ttl() {
        return logn_Msgs_Dropped_Ttl;
    }

    public void setLogn_Msgs_Dropped_Ttl(int logn_Msgs_Dropped_TtlParam) {
        this.logn_Msgs_Dropped_Ttl = logn_Msgs_Dropped_TtlParam;
    }

    @DdlField(Version = "2.0", QualName = "logn-msg-drop-rate", ObjectClass = 1, Level = 1, Structure = 4, Offset = 18, ElementSize = 4, IdentifierElement = 6)
    public int getLogn_Msg_Drop_Rate() {
        return logn_Msg_Drop_Rate;
    }

    public void setLogn_Msg_Drop_Rate(int logn_Msg_Drop_RateParam) {
        this.logn_Msg_Drop_Rate = logn_Msg_Drop_RateParam;
    }

    @DdlField(Version = "2.0", QualName = "maximum-queue-memory", ObjectClass = 1, Level = 1, Structure = 4, Offset = 22, ElementSize = 4, IdentifierElement = 7)
    public int getMaximum_Queue_Memory() {
        return maximum_Queue_Memory;
    }

    public void setMaximum_Queue_Memory(int maximum_Queue_MemoryParam) {
        this.maximum_Queue_Memory = maximum_Queue_MemoryParam;
    }

    @DdlField(Version = "2.0", QualName = "number-of-devices", ObjectClass = 1, Level = 1, Structure = 2, Offset = 26, ElementSize = 2, IdentifierElement = 8)
    public short getNumber_Of_Devices() {
        return number_Of_Devices;
    }

    public void setNumber_Of_Devices(short number_Of_DevicesParam) {
        this.number_Of_Devices = number_Of_DevicesParam;
    }

    @DdlField(Version = "2.0", QualName = "number-of-lines", ObjectClass = 1, Level = 1, Structure = 2, Offset = 28, ElementSize = 2, IdentifierElement = 9)
    public short getNumber_Of_Lines() {
        return number_Of_Lines;
    }

    public void setNumber_Of_Lines(short number_Of_LinesParam) {
        this.number_Of_Lines = number_Of_LinesParam;
    }

    @DdlField(Version = "2.0", QualName = "number-of-lprocesses", ObjectClass = 1, Level = 1, Structure = 2, Offset = 30, ElementSize = 2, IdentifierElement = 10)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_hstat_sys.Number_Of_Lprocesses")
    public Number_Of_LprocessesMarker getNumber_Of_Lprocesses() {
        return number_Of_Lprocesses;
    }

    public void setNumber_Of_Lprocesses(Number_Of_LprocessesMarker number_Of_LprocessesParam) {
        this.number_Of_Lprocesses = number_Of_LprocessesParam;
    }

    @DdlField(Version = "2.0", QualName = "number-of-processes", ObjectClass = 1, Level = 1, Structure = 2, Offset = 32, ElementSize = 2, IdentifierElement = 12)
    public short getNumber_Of_Processes() {
        return number_Of_Processes;
    }

    public void setNumber_Of_Processes(short number_Of_ProcessesParam) {
        this.number_Of_Processes = number_Of_ProcessesParam;
    }

    @DdlField(Version = "2.0", QualName = "number-of-qprocesses", ObjectClass = 1, Level = 1, Structure = 2, Offset = 34, ElementSize = 2, IdentifierElement = 13)
    public short getNumber_Of_Qprocesses() {
        return number_Of_Qprocesses;
    }

    public void setNumber_Of_Qprocesses(short number_Of_QprocessesParam) {
        this.number_Of_Qprocesses = number_Of_QprocessesParam;
    }

    @DdlField(Version = "2.0", QualName = "number-of-stations", ObjectClass = 1, Level = 1, Structure = 2, Offset = 36, ElementSize = 2, IdentifierElement = 14)
    public short getNumber_Of_Stations() {
        return number_Of_Stations;
    }

    public void setNumber_Of_Stations(short number_Of_StationsParam) {
        this.number_Of_Stations = number_Of_StationsParam;
    }

    @DdlField(Version = "2.0", QualName = "percent-mem-used-stats", ObjectClass = 1, Level = 1, Structure = 2, Offset = 38, ElementSize = 2, IdentifierElement = 15)
    public short getPercent_Mem_Used_Stats() {
        return percent_Mem_Used_Stats;
    }

    public void setPercent_Mem_Used_Stats(short percent_Mem_Used_StatsParam) {
        this.percent_Mem_Used_Stats = percent_Mem_Used_StatsParam;
    }

    @DdlField(Version = "2.0", QualName = "nom-msgs-dropped", ObjectClass = 1, Level = 1, Structure = 4, Offset = 40, ElementSize = 4, IdentifierElement = 16)
    public int getNom_Msgs_Dropped() {
        return nom_Msgs_Dropped;
    }

    public void setNom_Msgs_Dropped(int nom_Msgs_DroppedParam) {
        this.nom_Msgs_Dropped = nom_Msgs_DroppedParam;
    }

    @DdlField(Version = "2.0", QualName = "max-chkpt-size", ObjectClass = 1, Level = 1, Structure = 4, Offset = 44, ElementSize = 4, IdentifierElement = 17)
    public int getMax_Chkpt_Size() {
        return max_Chkpt_Size;
    }

    public void setMax_Chkpt_Size(int max_Chkpt_SizeParam) {
        this.max_Chkpt_Size = max_Chkpt_SizeParam;
    }

    @DdlField(Version = "2.0", QualName = "multiple-chkpt-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 48, ElementSize = 4, IdentifierElement = 18)
    public int getMultiple_Chkpt_Count() {
        return multiple_Chkpt_Count;
    }

    public void setMultiple_Chkpt_Count(int multiple_Chkpt_CountParam) {
        this.multiple_Chkpt_Count = multiple_Chkpt_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "failures", ObjectClass = 1, Level = 1, Structure = 2, Offset = 52, ElementSize = 2, IdentifierElement = 19)
    public short getFailures() {
        return failures;
    }

    public void setFailures(short failuresParam) {
        this.failures = failuresParam;
    }

    @DdlField(Version = "2.0", QualName = "max-payloads-expired", ObjectClass = 1, Level = 1, Structure = 4, Offset = 54, ElementSize = 4, IdentifierElement = 20)
    public int getMax_Payloads_Expired() {
        return max_Payloads_Expired;
    }

    public void setMax_Payloads_Expired(int max_Payloads_ExpiredParam) {
        this.max_Payloads_Expired = max_Payloads_ExpiredParam;
    }

    @DdlField(Version = "2.0", QualName = "max-payloads-in-use", ObjectClass = 1, Level = 1, Structure = 4, Offset = 58, ElementSize = 4, IdentifierElement = 21)
    public int getMax_Payloads_In_Use() {
        return max_Payloads_In_Use;
    }

    public void setMax_Payloads_In_Use(int max_Payloads_In_UseParam) {
        this.max_Payloads_In_Use = max_Payloads_In_UseParam;
    }

    @DdlField(Version = "2.0", QualName = "max-payload-pages", ObjectClass = 1, Level = 1, Structure = 4, Offset = 62, ElementSize = 4, IdentifierElement = 22)
    public int getMax_Payload_Pages() {
        return max_Payload_Pages;
    }

    public void setMax_Payload_Pages(int max_Payload_PagesParam) {
        this.max_Payload_Pages = max_Payload_PagesParam;
    }

    @DdlField(Version = "2.0", QualName = "reset-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 66, ElementSize = 18, IdentifierElement = 23)
    public String getReset_Timestamp() {
        return reset_Timestamp;
    }

    public void setReset_Timestamp(String reset_TimestampParam) {
        this.reset_Timestamp = reset_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "rpc-segments-in-use", ObjectClass = 1, Level = 1, Structure = 2, Offset = 84, ElementSize = 2, IdentifierElement = 24)
    public short getRpc_Segments_In_Use() {
        return rpc_Segments_In_Use;
    }

    public void setRpc_Segments_In_Use(short rpc_Segments_In_UseParam) {
        this.rpc_Segments_In_Use = rpc_Segments_In_UseParam;
    }

    @DdlField(Version = "2.0", QualName = "xnc-segments-in-use", ObjectClass = 1, Level = 1, Structure = 2, Offset = 86, ElementSize = 2, IdentifierElement = 25)
    public short getXnc_Segments_In_Use() {
        return xnc_Segments_In_Use;
    }

    public void setXnc_Segments_In_Use(short xnc_Segments_In_UseParam) {
        this.xnc_Segments_In_Use = xnc_Segments_In_UseParam;
    }

    @DdlField(Version = "2.0", QualName = "min-num-free-blocks", ObjectClass = 1, Level = 1, Structure = 4, Offset = 88, ElementSize = 4, IdentifierElement = 26)
    public int getMin_Num_Free_Blocks() {
        return min_Num_Free_Blocks;
    }

    public void setMin_Num_Free_Blocks(int min_Num_Free_BlocksParam) {
        this.min_Num_Free_Blocks = min_Num_Free_BlocksParam;
    }

    @DdlField(Version = "2.0", QualName = "max-num-free-blocks", ObjectClass = 1, Level = 1, Structure = 4, Offset = 92, ElementSize = 4, IdentifierElement = 27)
    public int getMax_Num_Free_Blocks() {
        return max_Num_Free_Blocks;
    }

    public void setMax_Num_Free_Blocks(int max_Num_Free_BlocksParam) {
        this.max_Num_Free_Blocks = max_Num_Free_BlocksParam;
    }

    @DdlField(Version = "2.0", QualName = "min-largest-free-block", ObjectClass = 1, Level = 1, Structure = 4, Offset = 96, ElementSize = 4, IdentifierElement = 28)
    public int getMin_Largest_Free_Block() {
        return min_Largest_Free_Block;
    }

    public void setMin_Largest_Free_Block(int min_Largest_Free_BlockParam) {
        this.min_Largest_Free_Block = min_Largest_Free_BlockParam;
    }

    @DdlField(Version = "2.0", QualName = "max-largest-free-block", ObjectClass = 1, Level = 1, Structure = 4, Offset = 100, ElementSize = 4, IdentifierElement = 29)
    public int getMax_Largest_Free_Block() {
        return max_Largest_Free_Block;
    }

    public void setMax_Largest_Free_Block(int max_Largest_Free_BlockParam) {
        this.max_Largest_Free_Block = max_Largest_Free_BlockParam;
    }

    @DdlField(Version = "2.0", QualName = "min-smallest-free-block", ObjectClass = 1, Level = 1, Structure = 4, Offset = 104, ElementSize = 4, IdentifierElement = 30)
    public int getMin_Smallest_Free_Block() {
        return min_Smallest_Free_Block;
    }

    public void setMin_Smallest_Free_Block(int min_Smallest_Free_BlockParam) {
        this.min_Smallest_Free_Block = min_Smallest_Free_BlockParam;
    }

    @DdlField(Version = "2.0", QualName = "max-smallest-free-block", ObjectClass = 1, Level = 1, Structure = 4, Offset = 108, ElementSize = 4, IdentifierElement = 31)
    public int getMax_Smallest_Free_Block() {
        return max_Smallest_Free_Block;
    }

    public void setMax_Smallest_Free_Block(int max_Smallest_Free_BlockParam) {
        this.max_Smallest_Free_Block = max_Smallest_Free_BlockParam;
    }

    @DdlField(Version = "2.0", QualName = "max-qmem-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 112, ElementSize = 18, IdentifierElement = 32)
    public String getMax_Qmem_Timestamp() {
        return max_Qmem_Timestamp;
    }

    public void setMax_Qmem_Timestamp(String max_Qmem_TimestampParam) {
        this.max_Qmem_Timestamp = max_Qmem_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "max-pmem-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 130, ElementSize = 18, IdentifierElement = 33)
    public String getMax_Pmem_Timestamp() {
        return max_Pmem_Timestamp;
    }

    public void setMax_Pmem_Timestamp(String max_Pmem_TimestampParam) {
        this.max_Pmem_Timestamp = max_Pmem_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "backup-cpu", ObjectClass = 1, Level = 1, Structure = 2, Offset = 148, ElementSize = 2, IdentifierElement = 34)
    public short getBackup_Cpu() {
        return backup_Cpu;
    }

    public void setBackup_Cpu(short backup_CpuParam) {
        this.backup_Cpu = backup_CpuParam;
    }

    @DdlField(Version = "2.0", QualName = "backup-pin", ObjectClass = 1, Level = 1, Structure = 2, Offset = 150, ElementSize = 2, IdentifierElement = 35)
    public short getBackup_Pin() {
        return backup_Pin;
    }

    public void setBackup_Pin(short backup_PinParam) {
        this.backup_Pin = backup_PinParam;
    }

    @DdlField(Version = "2.0", QualName = "backup-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 152, ElementSize = 2, IdentifierElement = 36)
    public short getBackup_State() {
        return backup_State;
    }

    public void setBackup_State(short backup_StateParam) {
        this.backup_State = backup_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "current-queue-memory", ObjectClass = 1, Level = 1, Structure = 4, Offset = 154, ElementSize = 4, IdentifierElement = 37)
    public int getCurrent_Queue_Memory() {
        return current_Queue_Memory;
    }

    public void setCurrent_Queue_Memory(int current_Queue_MemoryParam) {
        this.current_Queue_Memory = current_Queue_MemoryParam;
    }

    @DdlField(Version = "2.0", QualName = "current-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 158, ElementSize = 2, IdentifierElement = 38)
    public short getCurrent_State() {
        return current_State;
    }

    public void setCurrent_State(short current_StateParam) {
        this.current_State = current_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "free-byte-bytes", ObjectClass = 1, Level = 1, Structure = 4, Offset = 160, ElementSize = 4, IdentifierElement = 39)
    public int getFree_Byte_Bytes() {
        return free_Byte_Bytes;
    }

    public void setFree_Byte_Bytes(int free_Byte_BytesParam) {
        this.free_Byte_Bytes = free_Byte_BytesParam;
    }

    @DdlField(Version = "2.0", QualName = "free-word-bytes", ObjectClass = 1, Level = 1, Structure = 4, Offset = 164, ElementSize = 4, IdentifierElement = 40)
    public int getFree_Word_Bytes() {
        return free_Word_Bytes;
    }

    public void setFree_Word_Bytes(int free_Word_BytesParam) {
        this.free_Word_Bytes = free_Word_BytesParam;
    }

    @DdlField(Version = "2.0", QualName = "free-xtd-bytes", ObjectClass = 1, Level = 1, Structure = 4, Offset = 168, ElementSize = 4, IdentifierElement = 41)
    public int getFree_Xtd_Bytes() {
        return free_Xtd_Bytes;
    }

    public void setFree_Xtd_Bytes(int free_Xtd_BytesParam) {
        this.free_Xtd_Bytes = free_Xtd_BytesParam;
    }

    @DdlField(Version = "2.0", QualName = "load-level-index", ObjectClass = 1, Level = 1, Structure = 2, Offset = 172, ElementSize = 2, IdentifierElement = 42)
    public short getLoad_Level_Index() {
        return load_Level_Index;
    }

    public void setLoad_Level_Index(short load_Level_IndexParam) {
        this.load_Level_Index = load_Level_IndexParam;
    }

    @DdlField(Version = "2.0", QualName = "log-name-alt", ObjectClass = 1, Level = 1, Structure = 0, Offset = 174, ElementSize = 34, IdentifierElement = 43)
    public String getLog_Name_Alt() {
        return log_Name_Alt;
    }

    public void setLog_Name_Alt(String log_Name_AltParam) {
        this.log_Name_Alt = log_Name_AltParam;
    }

    @DdlField(Version = "2.0", QualName = "log-name-pri", ObjectClass = 1, Level = 1, Structure = 0, Offset = 208, ElementSize = 34, IdentifierElement = 44)
    public String getLog_Name_Pri() {
        return log_Name_Pri;
    }

    public void setLog_Name_Pri(String log_Name_PriParam) {
        this.log_Name_Pri = log_Name_PriParam;
    }

    @DdlField(Version = "2.0", QualName = "log-status-alt", ObjectClass = 1, Level = 1, Structure = 2, Offset = 242, ElementSize = 2, IdentifierElement = 45)
    public short getLog_Status_Alt() {
        return log_Status_Alt;
    }

    public void setLog_Status_Alt(short log_Status_AltParam) {
        this.log_Status_Alt = log_Status_AltParam;
    }

    @DdlField(Version = "2.0", QualName = "log-status-pri", ObjectClass = 1, Level = 1, Structure = 2, Offset = 244, ElementSize = 2, IdentifierElement = 46)
    public short getLog_Status_Pri() {
        return log_Status_Pri;
    }

    public void setLog_Status_Pri(short log_Status_PriParam) {
        this.log_Status_Pri = log_Status_PriParam;
    }

    @DdlField(Version = "2.0", QualName = "loge-qstate", ObjectClass = 1, Level = 1, Structure = 2, Offset = 246, ElementSize = 2, IdentifierElement = 47)
    public short getLoge_Qstate() {
        return loge_Qstate;
    }

    public void setLoge_Qstate(short loge_QstateParam) {
        this.loge_Qstate = loge_QstateParam;
    }

    @DdlField(Version = "2.0", QualName = "logn-qstate", ObjectClass = 1, Level = 1, Structure = 2, Offset = 248, ElementSize = 2, IdentifierElement = 48)
    public short getLogn_Qstate() {
        return logn_Qstate;
    }

    public void setLogn_Qstate(short logn_QstateParam) {
        this.logn_Qstate = logn_QstateParam;
    }

    @DdlField(Version = "2.0", QualName = "meas-enabled", ObjectClass = 1, Level = 1, Structure = 2, Offset = 250, ElementSize = 2, IdentifierElement = 49)
    public short getMeas_Enabled() {
        return meas_Enabled;
    }

    public void setMeas_Enabled(short meas_EnabledParam) {
        this.meas_Enabled = meas_EnabledParam;
    }

    @DdlField(Version = "2.0", QualName = "messages-queued", ObjectClass = 1, Level = 1, Structure = 4, Offset = 252, ElementSize = 4, IdentifierElement = 50)
    public int getMessages_Queued() {
        return messages_Queued;
    }

    public void setMessages_Queued(int messages_QueuedParam) {
        this.messages_Queued = messages_QueuedParam;
    }

    @DdlField(Version = "2.0", QualName = "messages-queued-to-log", ObjectClass = 1, Level = 1, Structure = 4, Offset = 256, ElementSize = 4, IdentifierElement = 51)
    public int getMessages_Queued_To_Log() {
        return messages_Queued_To_Log;
    }

    public void setMessages_Queued_To_Log(int messages_Queued_To_LogParam) {
        this.messages_Queued_To_Log = messages_Queued_To_LogParam;
    }

    @DdlField(Version = "2.0", QualName = "num-lins-started", ObjectClass = 1, Level = 1, Structure = 2, Offset = 260, ElementSize = 2, IdentifierElement = 52)
    public short getNum_Lins_Started() {
        return num_Lins_Started;
    }

    public void setNum_Lins_Started(short num_Lins_StartedParam) {
        this.num_Lins_Started = num_Lins_StartedParam;
    }

    @DdlField(Version = "2.0", QualName = "num-lpros-started", ObjectClass = 1, Level = 1, Structure = 2, Offset = 262, ElementSize = 2, IdentifierElement = 53)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_hstat_sys.Num_Lpros_Started")
    public Num_Lpros_StartedMarker getNum_Lpros_Started() {
        return num_Lpros_Started;
    }

    public void setNum_Lpros_Started(Num_Lpros_StartedMarker num_Lpros_StartedParam) {
        this.num_Lpros_Started = num_Lpros_StartedParam;
    }

    @DdlField(Version = "2.0", QualName = "num-pros-started", ObjectClass = 1, Level = 1, Structure = 2, Offset = 264, ElementSize = 2, IdentifierElement = 55)
    public short getNum_Pros_Started() {
        return num_Pros_Started;
    }

    public void setNum_Pros_Started(short num_Pros_StartedParam) {
        this.num_Pros_Started = num_Pros_StartedParam;
    }

    @DdlField(Version = "2.0", QualName = "num-stas-started", ObjectClass = 1, Level = 1, Structure = 2, Offset = 266, ElementSize = 2, IdentifierElement = 56)
    public short getNum_Stas_Started() {
        return num_Stas_Started;
    }

    public void setNum_Stas_Started(short num_Stas_StartedParam) {
        this.num_Stas_Started = num_Stas_StartedParam;
    }

    @DdlField(Version = "2.0", QualName = "primary-cpu", ObjectClass = 1, Level = 1, Structure = 2, Offset = 268, ElementSize = 2, IdentifierElement = 57)
    public short getPrimary_Cpu() {
        return primary_Cpu;
    }

    public void setPrimary_Cpu(short primary_CpuParam) {
        this.primary_Cpu = primary_CpuParam;
    }

    @DdlField(Version = "2.0", QualName = "primary-pin", ObjectClass = 1, Level = 1, Structure = 2, Offset = 270, ElementSize = 2, IdentifierElement = 58)
    public short getPrimary_Pin() {
        return primary_Pin;
    }

    public void setPrimary_Pin(short primary_PinParam) {
        this.primary_Pin = primary_PinParam;
    }

    @DdlField(Version = "2.0", QualName = "startup-priority", ObjectClass = 1, Level = 1, Structure = 2, Offset = 272, ElementSize = 2, IdentifierElement = 59)
    public short getStartup_Priority() {
        return startup_Priority;
    }

    public void setStartup_Priority(short startup_PriorityParam) {
        this.startup_Priority = startup_PriorityParam;
    }

    @DdlField(Version = "2.0", QualName = "percent-mem-used-status", ObjectClass = 1, Level = 1, Structure = 2, Offset = 274, ElementSize = 2, IdentifierElement = 60)
    public short getPercent_Mem_Used_Status() {
        return percent_Mem_Used_Status;
    }

    public void setPercent_Mem_Used_Status(short percent_Mem_Used_StatusParam) {
        this.percent_Mem_Used_Status = percent_Mem_Used_StatusParam;
    }

    @DdlField(Version = "2.0", QualName = "elog-msgs-queued", ObjectClass = 1, Level = 1, Structure = 4, Offset = 276, ElementSize = 4, IdentifierElement = 61)
    public int getElog_Msgs_Queued() {
        return elog_Msgs_Queued;
    }

    public void setElog_Msgs_Queued(int elog_Msgs_QueuedParam) {
        this.elog_Msgs_Queued = elog_Msgs_QueuedParam;
    }

    @DdlField(Version = "2.0", QualName = "nlog-msgs-queued", ObjectClass = 1, Level = 1, Structure = 4, Offset = 280, ElementSize = 4, IdentifierElement = 62)
    public int getNlog_Msgs_Queued() {
        return nlog_Msgs_Queued;
    }

    public void setNlog_Msgs_Queued(int nlog_Msgs_QueuedParam) {
        this.nlog_Msgs_Queued = nlog_Msgs_QueuedParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-file-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 284, ElementSize = 34, IdentifierElement = 63)
    public String getAudit_File_Name() {
        return audit_File_Name;
    }

    public void setAudit_File_Name(String audit_File_NameParam) {
        this.audit_File_Name = audit_File_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-dev-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 318, ElementSize = 2, IdentifierElement = 64)
    public short getAudit_Dev_Type() {
        return audit_Dev_Type;
    }

    public void setAudit_Dev_Type(short audit_Dev_TypeParam) {
        this.audit_Dev_Type = audit_Dev_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "pri-phandle", ObjectClass = 1, Level = 1, Structure = 2, Offset = 320, ElementSize = 2, IdentifierElement = 65, OccursMax = 10)
    public short[] getPri_Phandle() {
        return pri_Phandle;
    }

    @DdlField(Version = "2.0", QualName = "pri-phandle", ObjectClass = 1, Level = 1, Structure = 2, Offset = 320, ElementSize = 2, IdentifierElement = 65, OccursMax = 10)
    public short getPri_Phandle(int index) {
        return (pri_Phandle[index]);
    }

    public void setPri_Phandle(short[] pri_PhandleParam) {
        this.pri_Phandle = pri_PhandleParam;
    }

    public void setPri_Phandle(int index, short pri_PhandleParam) {
        this.pri_Phandle[index]=pri_PhandleParam;
    }

    @DdlField(Version = "2.0", QualName = "bkup-phandle", ObjectClass = 1, Level = 1, Structure = 2, Offset = 340, ElementSize = 2, IdentifierElement = 66, OccursMax = 10)
    public short[] getBkup_Phandle() {
        return bkup_Phandle;
    }

    @DdlField(Version = "2.0", QualName = "bkup-phandle", ObjectClass = 1, Level = 1, Structure = 2, Offset = 340, ElementSize = 2, IdentifierElement = 66, OccursMax = 10)
    public short getBkup_Phandle(int index) {
        return (bkup_Phandle[index]);
    }

    public void setBkup_Phandle(short[] bkup_PhandleParam) {
        this.bkup_Phandle = bkup_PhandleParam;
    }

    public void setBkup_Phandle(int index, short bkup_PhandleParam) {
        this.bkup_Phandle[index]=bkup_PhandleParam;
    }

    @DdlField(Version = "2.0", QualName = "nef-file-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 360, ElementSize = 35, IdentifierElement = 67)
    public String getNef_File_Name() {
        return nef_File_Name;
    }

    public void setNef_File_Name(String nef_File_NameParam) {
        this.nef_File_Name = nef_File_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "program-var1", ObjectClass = 1, Level = 1, Structure = 0, Offset = 395, ElementSize = 35, IdentifierElement = 68)
    public String getProgram_Var1() {
        return program_Var1;
    }

    public void setProgram_Var1(String program_Var1Param) {
        this.program_Var1 = program_Var1Param;
    }

    @DdlField(Version = "2.0", QualName = "library", ObjectClass = 1, Level = 1, Structure = 0, Offset = 430, ElementSize = 35, IdentifierElement = 69)
    public String getLibrary() {
        return library;
    }

    public void setLibrary(String libraryParam) {
        this.library = libraryParam;
    }

    @DdlField(Version = "2.0", QualName = "swap-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 465, ElementSize = 35, IdentifierElement = 70)
    public String getSwap_File() {
        return swap_File;
    }

    public void setSwap_File(String swap_FileParam) {
        this.swap_File = swap_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-swap-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 500, ElementSize = 35, IdentifierElement = 71)
    public String getExt_Swap_File() {
        return ext_Swap_File;
    }

    public void setExt_Swap_File(String ext_Swap_FileParam) {
        this.ext_Swap_File = ext_Swap_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "hometerm", ObjectClass = 1, Level = 1, Structure = 0, Offset = 535, ElementSize = 47, IdentifierElement = 72)
    public String getHometerm() {
        return hometerm;
    }

    public void setHometerm(String hometermParam) {
        this.hometerm = hometermParam;
    }

    @DdlField(Version = "2.0", QualName = "swbits", ObjectClass = 0, Level = 1, Structure = 0, Offset = 582, ElementSize = 64, IdentifierElement = 73)
    public Swbits getSwbits() {
        return swbits;
    }

    public void setSwbits(Swbits swbitsParam) {
        this.swbits = swbitsParam;
    }

    @DdlField(Version = "2.0", QualName = "current-cj-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 646, ElementSize = 35, IdentifierElement = 106)
    public String getCurrent_Cj_File() {
        return current_Cj_File;
    }

    public void setCurrent_Cj_File(String current_Cj_FileParam) {
        this.current_Cj_File = current_Cj_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "fillrr-1", ObjectClass = 1, Level = 1, Structure = 0, Offset = 681, ElementSize = 1, IdentifierElement = 107)
    public String getFillrr_1() {
        return fillrr_1;
    }

    public void setFillrr_1(String fillrr_1Param) {
        this.fillrr_1 = fillrr_1Param;
    }

    @DdlField(Version = "2.0", QualName = "config-locked", ObjectClass = 1, Level = 1, Structure = 2, Offset = 682, ElementSize = 2, IdentifierElement = 108)
    public short getConfig_Locked() {
        return config_Locked;
    }

    public void setConfig_Locked(short config_LockedParam) {
        this.config_Locked = config_LockedParam;
    }

    @DdlField(Version = "2.0", QualName = "msgs-queued-to-unk-dests", ObjectClass = 1, Level = 1, Structure = 4, Offset = 684, ElementSize = 4, IdentifierElement = 109)
    public int getMsgs_Queued_To_Unk_Dests() {
        return msgs_Queued_To_Unk_Dests;
    }

    public void setMsgs_Queued_To_Unk_Dests(int msgs_Queued_To_Unk_DestsParam) {
        this.msgs_Queued_To_Unk_Dests = msgs_Queued_To_Unk_DestsParam;
    }

    @DdlField(Version = "2.0", QualName = "msgs-queued-to-unav-srvs", ObjectClass = 1, Level = 1, Structure = 4, Offset = 688, ElementSize = 4, IdentifierElement = 110)
    public int getMsgs_Queued_To_Unav_Srvs() {
        return msgs_Queued_To_Unav_Srvs;
    }

    public void setMsgs_Queued_To_Unav_Srvs(int msgs_Queued_To_Unav_SrvsParam) {
        this.msgs_Queued_To_Unav_Srvs = msgs_Queued_To_Unav_SrvsParam;
    }

    @DdlField(Version = "2.0", QualName = "node-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 692, ElementSize = 2, IdentifierElement = 111)
    public short getNode_State() {
        return node_State;
    }

    public void setNode_State(short node_StateParam) {
        this.node_State = node_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "payloads-allocated", ObjectClass = 1, Level = 1, Structure = 4, Offset = 694, ElementSize = 4, IdentifierElement = 112)
    public int getPayloads_Allocated() {
        return payloads_Allocated;
    }

    public void setPayloads_Allocated(int payloads_AllocatedParam) {
        this.payloads_Allocated = payloads_AllocatedParam;
    }

    @DdlField(Version = "2.0", QualName = "payloads-in-use", ObjectClass = 1, Level = 1, Structure = 4, Offset = 698, ElementSize = 4, IdentifierElement = 113)
    public int getPayloads_In_Use() {
        return payloads_In_Use;
    }

    public void setPayloads_In_Use(int payloads_In_UseParam) {
        this.payloads_In_Use = payloads_In_UseParam;
    }

    @DdlField(Version = "2.0", QualName = "payload-pages-used", ObjectClass = 1, Level = 1, Structure = 4, Offset = 702, ElementSize = 4, IdentifierElement = 114)
    public int getPayload_Pages_Used() {
        return payload_Pages_Used;
    }

    public void setPayload_Pages_Used(int payload_Pages_UsedParam) {
        this.payload_Pages_Used = payload_Pages_UsedParam;
    }

    @DdlField(Version = "2.0", QualName = "payload-max-size", ObjectClass = 1, Level = 1, Structure = 4, Offset = 706, ElementSize = 4, IdentifierElement = 115)
    public int getPayload_Max_Size() {
        return payload_Max_Size;
    }

    public void setPayload_Max_Size(int payload_Max_SizeParam) {
        this.payload_Max_Size = payload_Max_SizeParam;
    }

    @DdlField(Version = "2.0", QualName = "dests-inuse", ObjectClass = 1, Level = 1, Structure = 4, Offset = 710, ElementSize = 4, IdentifierElement = 116)
    public int getDests_Inuse() {
        return dests_Inuse;
    }

    public void setDests_Inuse(int dests_InuseParam) {
        this.dests_Inuse = dests_InuseParam;
    }

    @DdlField(Version = "2.0", QualName = "dests-added", ObjectClass = 1, Level = 1, Structure = 4, Offset = 714, ElementSize = 4, IdentifierElement = 117)
    public int getDests_Added() {
        return dests_Added;
    }

    public void setDests_Added(int dests_AddedParam) {
        this.dests_Added = dests_AddedParam;
    }

    @DdlField(Version = "2.0", QualName = "license-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 718, ElementSize = 35, IdentifierElement = 118)
    public String getLicense_File() {
        return license_File;
    }

    public void setLicense_File(String license_FileParam) {
        this.license_File = license_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "fillrr-2", ObjectClass = 1, Level = 1, Structure = 0, Offset = 753, ElementSize = 1, IdentifierElement = 119)
    public String getFillrr_2() {
        return fillrr_2;
    }

    public void setFillrr_2(String fillrr_2Param) {
        this.fillrr_2 = fillrr_2Param;
    }

    @DdlField(Version = "2.0", QualName = "license-exp", ObjectClass = 0, Level = 1, Structure = 0, Offset = 754, ElementSize = 6, IdentifierElement = 120)
    public License_Exp getLicense_Exp() {
        return license_Exp;
    }

    public void setLicense_Exp(License_Exp license_ExpParam) {
        this.license_Exp = license_ExpParam;
    }

    @DdlField(Version = "2.0", QualName = "diagdest-queue", ObjectClass = 1, Level = 1, Structure = 4, Offset = 760, ElementSize = 4, IdentifierElement = 124)
    public int getDiagdest_Queue() {
        return diagdest_Queue;
    }

    public void setDiagdest_Queue(int diagdest_QueueParam) {
        this.diagdest_Queue = diagdest_QueueParam;
    }

    @DdlField(Version = "2.0", QualName = "curr-num-free-blocks", ObjectClass = 1, Level = 1, Structure = 4, Offset = 764, ElementSize = 4, IdentifierElement = 125)
    public int getCurr_Num_Free_Blocks() {
        return curr_Num_Free_Blocks;
    }

    public void setCurr_Num_Free_Blocks(int curr_Num_Free_BlocksParam) {
        this.curr_Num_Free_Blocks = curr_Num_Free_BlocksParam;
    }

    @DdlField(Version = "2.0", QualName = "prev-num-free-blocks", ObjectClass = 1, Level = 1, Structure = 4, Offset = 768, ElementSize = 4, IdentifierElement = 126)
    public int getPrev_Num_Free_Blocks() {
        return prev_Num_Free_Blocks;
    }

    public void setPrev_Num_Free_Blocks(int prev_Num_Free_BlocksParam) {
        this.prev_Num_Free_Blocks = prev_Num_Free_BlocksParam;
    }

    @DdlField(Version = "2.0", QualName = "curr-largest-free-block", ObjectClass = 1, Level = 1, Structure = 4, Offset = 772, ElementSize = 4, IdentifierElement = 127)
    public int getCurr_Largest_Free_Block() {
        return curr_Largest_Free_Block;
    }

    public void setCurr_Largest_Free_Block(int curr_Largest_Free_BlockParam) {
        this.curr_Largest_Free_Block = curr_Largest_Free_BlockParam;
    }

    @DdlField(Version = "2.0", QualName = "prev-largest-free-block", ObjectClass = 1, Level = 1, Structure = 4, Offset = 776, ElementSize = 4, IdentifierElement = 128)
    public int getPrev_Largest_Free_Block() {
        return prev_Largest_Free_Block;
    }

    public void setPrev_Largest_Free_Block(int prev_Largest_Free_BlockParam) {
        this.prev_Largest_Free_Block = prev_Largest_Free_BlockParam;
    }

    @DdlField(Version = "2.0", QualName = "curr-smallest-free-block", ObjectClass = 1, Level = 1, Structure = 4, Offset = 780, ElementSize = 4, IdentifierElement = 129)
    public int getCurr_Smallest_Free_Block() {
        return curr_Smallest_Free_Block;
    }

    public void setCurr_Smallest_Free_Block(int curr_Smallest_Free_BlockParam) {
        this.curr_Smallest_Free_Block = curr_Smallest_Free_BlockParam;
    }

    @DdlField(Version = "2.0", QualName = "prev-smallest-free-block", ObjectClass = 1, Level = 1, Structure = 4, Offset = 784, ElementSize = 4, IdentifierElement = 130)
    public int getPrev_Smallest_Free_Block() {
        return prev_Smallest_Free_Block;
    }

    public void setPrev_Smallest_Free_Block(int prev_Smallest_Free_BlockParam) {
        this.prev_Smallest_Free_Block = prev_Smallest_Free_BlockParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-trc-file-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 788, ElementSize = 34, IdentifierElement = 131)
    public String getSsl_Trc_File_Name() {
        return ssl_Trc_File_Name;
    }

    public void setSsl_Trc_File_Name(String ssl_Trc_File_NameParam) {
        this.ssl_Trc_File_Name = ssl_Trc_File_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-trc-status", ObjectClass = 1, Level = 1, Structure = 2, Offset = 822, ElementSize = 2, IdentifierElement = 132)
    public short getSsl_Trc_Status() {
        return ssl_Trc_Status;
    }

    public void setSsl_Trc_Status(short ssl_Trc_StatusParam) {
        this.ssl_Trc_Status = ssl_Trc_StatusParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-trc-wrap", ObjectClass = 1, Level = 1, Structure = 2, Offset = 824, ElementSize = 2, IdentifierElement = 133)
    public short getSsl_Trc_Wrap() {
        return ssl_Trc_Wrap;
    }

    public void setSsl_Trc_Wrap(short ssl_Trc_WrapParam) {
        this.ssl_Trc_Wrap = ssl_Trc_WrapParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-trc-pages", ObjectClass = 1, Level = 1, Structure = 4, Offset = 826, ElementSize = 4, IdentifierElement = 134)
    public int getSsl_Trc_Pages() {
        return ssl_Trc_Pages;
    }

    public void setSsl_Trc_Pages(int ssl_Trc_PagesParam) {
        this.ssl_Trc_Pages = ssl_Trc_PagesParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-trc-segsize", ObjectClass = 1, Level = 1, Structure = 4, Offset = 830, ElementSize = 4, IdentifierElement = 135)
    public int getSsl_Trc_Segsize() {
        return ssl_Trc_Segsize;
    }

    public void setSsl_Trc_Segsize(int ssl_Trc_SegsizeParam) {
        this.ssl_Trc_Segsize = ssl_Trc_SegsizeParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-trc-recsize", ObjectClass = 1, Level = 1, Structure = 4, Offset = 834, ElementSize = 4, IdentifierElement = 136)
    public int getSsl_Trc_Recsize() {
        return ssl_Trc_Recsize;
    }

    public void setSsl_Trc_Recsize(int ssl_Trc_RecsizeParam) {
        this.ssl_Trc_Recsize = ssl_Trc_RecsizeParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-prcnt-ful", ObjectClass = 1, Level = 1, Structure = 2, Offset = 838, ElementSize = 2, IdentifierElement = 137)
    public short getSsl_Prcnt_Ful() {
        return ssl_Prcnt_Ful;
    }

    public void setSsl_Prcnt_Ful(short ssl_Prcnt_FulParam) {
        this.ssl_Prcnt_Ful = ssl_Prcnt_FulParam;
    }

    @DdlField(Version = "2.0", QualName = "sba-tot-entries", ObjectClass = 1, Level = 1, Structure = 4, Offset = 840, ElementSize = 4, IdentifierElement = 138)
    public int getSba_Tot_Entries() {
        return sba_Tot_Entries;
    }

    public void setSba_Tot_Entries(int sba_Tot_EntriesParam) {
        this.sba_Tot_Entries = sba_Tot_EntriesParam;
    }

    @DdlField(Version = "2.0", QualName = "sba-tot-inuse", ObjectClass = 1, Level = 1, Structure = 4, Offset = 844, ElementSize = 4, IdentifierElement = 139)
    public int getSba_Tot_Inuse() {
        return sba_Tot_Inuse;
    }

    public void setSba_Tot_Inuse(int sba_Tot_InuseParam) {
        this.sba_Tot_Inuse = sba_Tot_InuseParam;
    }

    @DdlField(Version = "2.0", QualName = "sba-tot-free", ObjectClass = 1, Level = 1, Structure = 4, Offset = 848, ElementSize = 4, IdentifierElement = 140)
    public int getSba_Tot_Free() {
        return sba_Tot_Free;
    }

    public void setSba_Tot_Free(int sba_Tot_FreeParam) {
        this.sba_Tot_Free = sba_Tot_FreeParam;
    }

    @DdlField(Version = "2.0", QualName = "sba-tot-numlist", ObjectClass = 1, Level = 1, Structure = 2, Offset = 852, ElementSize = 2, IdentifierElement = 141)
    public short getSba_Tot_Numlist() {
        return sba_Tot_Numlist;
    }

    public void setSba_Tot_Numlist(short sba_Tot_NumlistParam) {
        this.sba_Tot_Numlist = sba_Tot_NumlistParam;
    }

    @DdlField(Version = "2.0", QualName = "total-xtd-bytes", ObjectClass = 1, Level = 1, Structure = 4, Offset = 854, ElementSize = 4, IdentifierElement = 142)
    public int getTotal_Xtd_Bytes() {
        return total_Xtd_Bytes;
    }

    public void setTotal_Xtd_Bytes(int total_Xtd_BytesParam) {
        this.total_Xtd_Bytes = total_Xtd_BytesParam;
    }

    @DdlField(Version = "2.0", QualName = "total-lmgr-bytes", ObjectClass = 1, Level = 1, Structure = 4, Offset = 858, ElementSize = 4, IdentifierElement = 143)
    public int getTotal_Lmgr_Bytes() {
        return total_Lmgr_Bytes;
    }

    public void setTotal_Lmgr_Bytes(int total_Lmgr_BytesParam) {
        this.total_Lmgr_Bytes = total_Lmgr_BytesParam;
    }

    @DdlField(Version = "2.0", QualName = "free-lmgr-bytes", ObjectClass = 1, Level = 1, Structure = 4, Offset = 862, ElementSize = 4, IdentifierElement = 144)
    public int getFree_Lmgr_Bytes() {
        return free_Lmgr_Bytes;
    }

    public void setFree_Lmgr_Bytes(int free_Lmgr_BytesParam) {
        this.free_Lmgr_Bytes = free_Lmgr_BytesParam;
    }

    @DdlField(Version = "2.0", QualName = "percent-lmgr-used", ObjectClass = 1, Level = 1, Structure = 2, Offset = 866, ElementSize = 2, IdentifierElement = 145)
    public short getPercent_Lmgr_Used() {
        return percent_Lmgr_Used;
    }

    public void setPercent_Lmgr_Used(short percent_Lmgr_UsedParam) {
        this.percent_Lmgr_Used = percent_Lmgr_UsedParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-increment", ObjectClass = 1, Level = 1, Structure = 2, Offset = 868, ElementSize = 2, IdentifierElement = 146)
    public short getExt_Increment() {
        return ext_Increment;
    }

    public void setExt_Increment(short ext_IncrementParam) {
        this.ext_Increment = ext_IncrementParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-incremented", ObjectClass = 1, Level = 1, Structure = 2, Offset = 870, ElementSize = 2, IdentifierElement = 147)
    public short getExt_Incremented() {
        return ext_Incremented;
    }

    public void setExt_Incremented(short ext_IncrementedParam) {
        this.ext_Incremented = ext_IncrementedParam;
    }

    @DdlField(Version = "2.0", QualName = "curr-ext-aud-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 872, ElementSize = 35, IdentifierElement = 148)
    public String getCurr_Ext_Aud_File() {
        return curr_Ext_Aud_File;
    }

    public void setCurr_Ext_Aud_File(String curr_Ext_Aud_FileParam) {
        this.curr_Ext_Aud_File = curr_Ext_Aud_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "aud-filr-1", ObjectClass = 1, Level = 1, Structure = 0, Offset = 907, ElementSize = 1, IdentifierElement = 149)
    public String getAud_Filr_1() {
        return aud_Filr_1;
    }

    public void setAud_Filr_1(String aud_Filr_1Param) {
        this.aud_Filr_1 = aud_Filr_1Param;
    }

    @DdlField(Version = "2.0", QualName = "ext-aud-perc-full", ObjectClass = 1, Level = 1, Structure = 2, Offset = 908, ElementSize = 2, IdentifierElement = 150)
    public short getExt_Aud_Perc_Full() {
        return ext_Aud_Perc_Full;
    }

    public void setExt_Aud_Perc_Full(short ext_Aud_Perc_FullParam) {
        this.ext_Aud_Perc_Full = ext_Aud_Perc_FullParam;
    }

    @DdlField(Version = "2.0", QualName = "ext-aud-num-recs", ObjectClass = 1, Level = 1, Structure = 4, Offset = 910, ElementSize = 4, IdentifierElement = 151)
    public int getExt_Aud_Num_Recs() {
        return ext_Aud_Num_Recs;
    }

    public void setExt_Aud_Num_Recs(int ext_Aud_Num_RecsParam) {
        this.ext_Aud_Num_Recs = ext_Aud_Num_RecsParam;
    }

}
