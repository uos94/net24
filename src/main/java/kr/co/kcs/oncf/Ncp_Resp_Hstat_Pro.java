
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-hstat-pro", ElementSize = 414, LocalName = "ncp-resp-hstat-pro")
public class Ncp_Resp_Hstat_Pro
    implements Serializable
{

    private short backup_Cpu;
    private short backup_Pin;
    private short current_State;
    private short logical_State;
    private short process_Type;
    private short primary_Cpu;
    private short primary_Pin;
    private short queue_Count;
    private short queue_State;
    private short warmbackup_Logic;
    private short begin_Type;
    private short[] pri_Phandle = new short[ 10 ] ;
    private short[] bkup_Phandle = new short[ 10 ] ;
    private int queue_Count32;
    private short payload_Mgt_Ind;
    private short sync_Status;
    private String sync_Dest;
    private String destination;
    private String devicename;
    private short failures;
    private int input_Count;
    private int input_Block_Count;
    private int output_Count;
    private int output_Block_Count;
    private short max_Queue_Count;
    private int msgs_Dropped_Ttl;
    private int msg_Drop_Rate;
    private String reset_Timestamp;
    private int max_Queue_Count32;
    private int sync_Input_Count;
    private int sync_Output_Count;
    private int sync_Failures;
    private int sync_Best_Resp_Time;
    private int sync_Worst_Resp_Time;
    private int sync_Last_Resp_Time;
    private String sync_Last_Destination;
    private String sync_Last_Req_Timestamp;
    private String sync_Last_Resp_Timestamp;
    private String sync_Best_Resp_Timestamp;
    private String sync_Worst_Resp_Timestamp;
    private int sync_Num_Avg_Rsps;
    private int[] sync_Num_Avg_Rsps_Times = new int[ 20 ] ;
    private String maxq_Timestamp;

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

    @DdlField(Version = "2.0", QualName = "current-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 3)
    public short getCurrent_State() {
        return current_State;
    }

    public void setCurrent_State(short current_StateParam) {
        this.current_State = current_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "logical-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 6, ElementSize = 2, IdentifierElement = 4)
    public short getLogical_State() {
        return logical_State;
    }

    public void setLogical_State(short logical_StateParam) {
        this.logical_State = logical_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "process-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 8, ElementSize = 2, IdentifierElement = 5)
    public short getProcess_Type() {
        return process_Type;
    }

    public void setProcess_Type(short process_TypeParam) {
        this.process_Type = process_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "primary-cpu", ObjectClass = 1, Level = 1, Structure = 2, Offset = 10, ElementSize = 2, IdentifierElement = 6)
    public short getPrimary_Cpu() {
        return primary_Cpu;
    }

    public void setPrimary_Cpu(short primary_CpuParam) {
        this.primary_Cpu = primary_CpuParam;
    }

    @DdlField(Version = "2.0", QualName = "primary-pin", ObjectClass = 1, Level = 1, Structure = 2, Offset = 12, ElementSize = 2, IdentifierElement = 7)
    public short getPrimary_Pin() {
        return primary_Pin;
    }

    public void setPrimary_Pin(short primary_PinParam) {
        this.primary_Pin = primary_PinParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-count", ObjectClass = 1, Level = 1, Structure = 2, Offset = 14, ElementSize = 2, IdentifierElement = 8)
    public short getQueue_Count() {
        return queue_Count;
    }

    public void setQueue_Count(short queue_CountParam) {
        this.queue_Count = queue_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 9)
    public short getQueue_State() {
        return queue_State;
    }

    public void setQueue_State(short queue_StateParam) {
        this.queue_State = queue_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "warmbackup-logic", ObjectClass = 1, Level = 1, Structure = 2, Offset = 18, ElementSize = 2, IdentifierElement = 10)
    public short getWarmbackup_Logic() {
        return warmbackup_Logic;
    }

    public void setWarmbackup_Logic(short warmbackup_LogicParam) {
        this.warmbackup_Logic = warmbackup_LogicParam;
    }

    @DdlField(Version = "2.0", QualName = "begin-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 20, ElementSize = 2, IdentifierElement = 11)
    public short getBegin_Type() {
        return begin_Type;
    }

    public void setBegin_Type(short begin_TypeParam) {
        this.begin_Type = begin_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "pri-phandle", ObjectClass = 1, Level = 1, Structure = 2, Offset = 22, ElementSize = 2, IdentifierElement = 12, OccursMax = 10)
    public short[] getPri_Phandle() {
        return pri_Phandle;
    }

    @DdlField(Version = "2.0", QualName = "pri-phandle", ObjectClass = 1, Level = 1, Structure = 2, Offset = 22, ElementSize = 2, IdentifierElement = 12, OccursMax = 10)
    public short getPri_Phandle(int index) {
        return (pri_Phandle[index]);
    }

    public void setPri_Phandle(short[] pri_PhandleParam) {
        this.pri_Phandle = pri_PhandleParam;
    }

    public void setPri_Phandle(int index, short pri_PhandleParam) {
        this.pri_Phandle[index]=pri_PhandleParam;
    }

    @DdlField(Version = "2.0", QualName = "bkup-phandle", ObjectClass = 1, Level = 1, Structure = 2, Offset = 42, ElementSize = 2, IdentifierElement = 13, OccursMax = 10)
    public short[] getBkup_Phandle() {
        return bkup_Phandle;
    }

    @DdlField(Version = "2.0", QualName = "bkup-phandle", ObjectClass = 1, Level = 1, Structure = 2, Offset = 42, ElementSize = 2, IdentifierElement = 13, OccursMax = 10)
    public short getBkup_Phandle(int index) {
        return (bkup_Phandle[index]);
    }

    public void setBkup_Phandle(short[] bkup_PhandleParam) {
        this.bkup_Phandle = bkup_PhandleParam;
    }

    public void setBkup_Phandle(int index, short bkup_PhandleParam) {
        this.bkup_Phandle[index]=bkup_PhandleParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-count32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 62, ElementSize = 4, IdentifierElement = 14)
    public int getQueue_Count32() {
        return queue_Count32;
    }

    public void setQueue_Count32(int queue_Count32Param) {
        this.queue_Count32 = queue_Count32Param;
    }

    @DdlField(Version = "2.0", QualName = "payload-mgt-ind", ObjectClass = 1, Level = 1, Structure = 2, Offset = 66, ElementSize = 2, IdentifierElement = 15)
    public short getPayload_Mgt_Ind() {
        return payload_Mgt_Ind;
    }

    public void setPayload_Mgt_Ind(short payload_Mgt_IndParam) {
        this.payload_Mgt_Ind = payload_Mgt_IndParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-status", ObjectClass = 1, Level = 1, Structure = 2, Offset = 68, ElementSize = 2, IdentifierElement = 16)
    public short getSync_Status() {
        return sync_Status;
    }

    public void setSync_Status(short sync_StatusParam) {
        this.sync_Status = sync_StatusParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-dest", ObjectClass = 1, Level = 1, Structure = 0, Offset = 70, ElementSize = 16, IdentifierElement = 17)
    public String getSync_Dest() {
        return sync_Dest;
    }

    public void setSync_Dest(String sync_DestParam) {
        this.sync_Dest = sync_DestParam;
    }

    @DdlField(Version = "2.0", QualName = "destination", ObjectClass = 1, Level = 1, Structure = 0, Offset = 86, ElementSize = 16, IdentifierElement = 18)
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destinationParam) {
        this.destination = destinationParam;
    }

    @DdlField(Version = "2.0", QualName = "devicename", ObjectClass = 1, Level = 1, Structure = 0, Offset = 102, ElementSize = 16, IdentifierElement = 19)
    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicenameParam) {
        this.devicename = devicenameParam;
    }

    @DdlField(Version = "2.0", QualName = "failures", ObjectClass = 1, Level = 1, Structure = 2, Offset = 118, ElementSize = 2, IdentifierElement = 20)
    public short getFailures() {
        return failures;
    }

    public void setFailures(short failuresParam) {
        this.failures = failuresParam;
    }

    @DdlField(Version = "2.0", QualName = "input-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 120, ElementSize = 4, IdentifierElement = 21)
    public int getInput_Count() {
        return input_Count;
    }

    public void setInput_Count(int input_CountParam) {
        this.input_Count = input_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "input-block-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 124, ElementSize = 4, IdentifierElement = 22)
    public int getInput_Block_Count() {
        return input_Block_Count;
    }

    public void setInput_Block_Count(int input_Block_CountParam) {
        this.input_Block_Count = input_Block_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "output-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 128, ElementSize = 4, IdentifierElement = 23)
    public int getOutput_Count() {
        return output_Count;
    }

    public void setOutput_Count(int output_CountParam) {
        this.output_Count = output_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "output-block-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 132, ElementSize = 4, IdentifierElement = 24)
    public int getOutput_Block_Count() {
        return output_Block_Count;
    }

    public void setOutput_Block_Count(int output_Block_CountParam) {
        this.output_Block_Count = output_Block_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "max-queue-count", ObjectClass = 1, Level = 1, Structure = 2, Offset = 136, ElementSize = 2, IdentifierElement = 25)
    public short getMax_Queue_Count() {
        return max_Queue_Count;
    }

    public void setMax_Queue_Count(short max_Queue_CountParam) {
        this.max_Queue_Count = max_Queue_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "msgs-dropped-ttl", ObjectClass = 1, Level = 1, Structure = 4, Offset = 138, ElementSize = 4, IdentifierElement = 26)
    public int getMsgs_Dropped_Ttl() {
        return msgs_Dropped_Ttl;
    }

    public void setMsgs_Dropped_Ttl(int msgs_Dropped_TtlParam) {
        this.msgs_Dropped_Ttl = msgs_Dropped_TtlParam;
    }

    @DdlField(Version = "2.0", QualName = "msg-drop-rate", ObjectClass = 1, Level = 1, Structure = 4, Offset = 142, ElementSize = 4, IdentifierElement = 27)
    public int getMsg_Drop_Rate() {
        return msg_Drop_Rate;
    }

    public void setMsg_Drop_Rate(int msg_Drop_RateParam) {
        this.msg_Drop_Rate = msg_Drop_RateParam;
    }

    @DdlField(Version = "2.0", QualName = "reset-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 146, ElementSize = 18, IdentifierElement = 28)
    public String getReset_Timestamp() {
        return reset_Timestamp;
    }

    public void setReset_Timestamp(String reset_TimestampParam) {
        this.reset_Timestamp = reset_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "max-queue-count32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 164, ElementSize = 4, IdentifierElement = 29)
    public int getMax_Queue_Count32() {
        return max_Queue_Count32;
    }

    public void setMax_Queue_Count32(int max_Queue_Count32Param) {
        this.max_Queue_Count32 = max_Queue_Count32Param;
    }

    @DdlField(Version = "2.0", QualName = "sync-input-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 168, ElementSize = 4, IdentifierElement = 30)
    public int getSync_Input_Count() {
        return sync_Input_Count;
    }

    public void setSync_Input_Count(int sync_Input_CountParam) {
        this.sync_Input_Count = sync_Input_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-output-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 172, ElementSize = 4, IdentifierElement = 31)
    public int getSync_Output_Count() {
        return sync_Output_Count;
    }

    public void setSync_Output_Count(int sync_Output_CountParam) {
        this.sync_Output_Count = sync_Output_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-failures", ObjectClass = 1, Level = 1, Structure = 4, Offset = 176, ElementSize = 4, IdentifierElement = 32)
    public int getSync_Failures() {
        return sync_Failures;
    }

    public void setSync_Failures(int sync_FailuresParam) {
        this.sync_Failures = sync_FailuresParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-best-resp-time", ObjectClass = 1, Level = 1, Structure = 4, Offset = 180, ElementSize = 4, IdentifierElement = 33)
    public int getSync_Best_Resp_Time() {
        return sync_Best_Resp_Time;
    }

    public void setSync_Best_Resp_Time(int sync_Best_Resp_TimeParam) {
        this.sync_Best_Resp_Time = sync_Best_Resp_TimeParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-worst-resp-time", ObjectClass = 1, Level = 1, Structure = 4, Offset = 184, ElementSize = 4, IdentifierElement = 34)
    public int getSync_Worst_Resp_Time() {
        return sync_Worst_Resp_Time;
    }

    public void setSync_Worst_Resp_Time(int sync_Worst_Resp_TimeParam) {
        this.sync_Worst_Resp_Time = sync_Worst_Resp_TimeParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-last-resp-time", ObjectClass = 1, Level = 1, Structure = 4, Offset = 188, ElementSize = 4, IdentifierElement = 35)
    public int getSync_Last_Resp_Time() {
        return sync_Last_Resp_Time;
    }

    public void setSync_Last_Resp_Time(int sync_Last_Resp_TimeParam) {
        this.sync_Last_Resp_Time = sync_Last_Resp_TimeParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-last-destination", ObjectClass = 1, Level = 1, Structure = 0, Offset = 192, ElementSize = 16, IdentifierElement = 36)
    public String getSync_Last_Destination() {
        return sync_Last_Destination;
    }

    public void setSync_Last_Destination(String sync_Last_DestinationParam) {
        this.sync_Last_Destination = sync_Last_DestinationParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-last-req-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 208, ElementSize = 26, IdentifierElement = 37)
    public String getSync_Last_Req_Timestamp() {
        return sync_Last_Req_Timestamp;
    }

    public void setSync_Last_Req_Timestamp(String sync_Last_Req_TimestampParam) {
        this.sync_Last_Req_Timestamp = sync_Last_Req_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-last-resp-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 234, ElementSize = 26, IdentifierElement = 38)
    public String getSync_Last_Resp_Timestamp() {
        return sync_Last_Resp_Timestamp;
    }

    public void setSync_Last_Resp_Timestamp(String sync_Last_Resp_TimestampParam) {
        this.sync_Last_Resp_Timestamp = sync_Last_Resp_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-best-resp-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 260, ElementSize = 26, IdentifierElement = 39)
    public String getSync_Best_Resp_Timestamp() {
        return sync_Best_Resp_Timestamp;
    }

    public void setSync_Best_Resp_Timestamp(String sync_Best_Resp_TimestampParam) {
        this.sync_Best_Resp_Timestamp = sync_Best_Resp_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-worst-resp-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 286, ElementSize = 26, IdentifierElement = 40)
    public String getSync_Worst_Resp_Timestamp() {
        return sync_Worst_Resp_Timestamp;
    }

    public void setSync_Worst_Resp_Timestamp(String sync_Worst_Resp_TimestampParam) {
        this.sync_Worst_Resp_Timestamp = sync_Worst_Resp_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-num-avg-rsps", ObjectClass = 1, Level = 1, Structure = 4, Offset = 312, ElementSize = 4, IdentifierElement = 41)
    public int getSync_Num_Avg_Rsps() {
        return sync_Num_Avg_Rsps;
    }

    public void setSync_Num_Avg_Rsps(int sync_Num_Avg_RspsParam) {
        this.sync_Num_Avg_Rsps = sync_Num_Avg_RspsParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-num-avg-rsps-times", ObjectClass = 1, Level = 1, Structure = 4, Offset = 316, ElementSize = 4, IdentifierElement = 42, OccursMax = 20)
    public int[] getSync_Num_Avg_Rsps_Times() {
        return sync_Num_Avg_Rsps_Times;
    }

    @DdlField(Version = "2.0", QualName = "sync-num-avg-rsps-times", ObjectClass = 1, Level = 1, Structure = 4, Offset = 316, ElementSize = 4, IdentifierElement = 42, OccursMax = 20)
    public int getSync_Num_Avg_Rsps_Times(int index) {
        return (sync_Num_Avg_Rsps_Times[index]);
    }

    public void setSync_Num_Avg_Rsps_Times(int[] sync_Num_Avg_Rsps_TimesParam) {
        this.sync_Num_Avg_Rsps_Times = sync_Num_Avg_Rsps_TimesParam;
    }

    public void setSync_Num_Avg_Rsps_Times(int index, int sync_Num_Avg_Rsps_TimesParam) {
        this.sync_Num_Avg_Rsps_Times[index]=sync_Num_Avg_Rsps_TimesParam;
    }

    @DdlField(Version = "2.0", QualName = "maxq-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 396, ElementSize = 18, IdentifierElement = 43)
    public String getMaxq_Timestamp() {
        return maxq_Timestamp;
    }

    public void setMaxq_Timestamp(String maxq_TimestampParam) {
        this.maxq_Timestamp = maxq_TimestampParam;
    }

}
