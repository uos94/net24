
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_stats_sys.Number_Of_LprocessesMarker;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-stats-sys", ElementSize = 148, LocalName = "ncp-resp-stats-sys")
public class Ncp_Resp_Stats_Sys
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
    private short percent_Mem_Used;
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
    @ReturnType("kr.co.kcs.oncf.ncp_resp_stats_sys.Number_Of_Lprocesses")
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

    @DdlField(Version = "2.0", QualName = "percent-mem-used", ObjectClass = 1, Level = 1, Structure = 2, Offset = 38, ElementSize = 2, IdentifierElement = 15)
    public short getPercent_Mem_Used() {
        return percent_Mem_Used;
    }

    public void setPercent_Mem_Used(short percent_Mem_UsedParam) {
        this.percent_Mem_Used = percent_Mem_UsedParam;
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

}
