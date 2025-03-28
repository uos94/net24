
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-stats-pro", ElementSize = 296, LocalName = "ncp-resp-stats-pro")
public class Ncp_Resp_Stats_Pro
    implements Serializable
{

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

    @DdlField(Version = "2.0", QualName = "failures", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getFailures() {
        return failures;
    }

    public void setFailures(short failuresParam) {
        this.failures = failuresParam;
    }

    @DdlField(Version = "2.0", QualName = "input-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 2, ElementSize = 4, IdentifierElement = 2)
    public int getInput_Count() {
        return input_Count;
    }

    public void setInput_Count(int input_CountParam) {
        this.input_Count = input_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "input-block-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 6, ElementSize = 4, IdentifierElement = 3)
    public int getInput_Block_Count() {
        return input_Block_Count;
    }

    public void setInput_Block_Count(int input_Block_CountParam) {
        this.input_Block_Count = input_Block_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "output-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 10, ElementSize = 4, IdentifierElement = 4)
    public int getOutput_Count() {
        return output_Count;
    }

    public void setOutput_Count(int output_CountParam) {
        this.output_Count = output_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "output-block-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 14, ElementSize = 4, IdentifierElement = 5)
    public int getOutput_Block_Count() {
        return output_Block_Count;
    }

    public void setOutput_Block_Count(int output_Block_CountParam) {
        this.output_Block_Count = output_Block_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "max-queue-count", ObjectClass = 1, Level = 1, Structure = 2, Offset = 18, ElementSize = 2, IdentifierElement = 6)
    public short getMax_Queue_Count() {
        return max_Queue_Count;
    }

    public void setMax_Queue_Count(short max_Queue_CountParam) {
        this.max_Queue_Count = max_Queue_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "msgs-dropped-ttl", ObjectClass = 1, Level = 1, Structure = 4, Offset = 20, ElementSize = 4, IdentifierElement = 7)
    public int getMsgs_Dropped_Ttl() {
        return msgs_Dropped_Ttl;
    }

    public void setMsgs_Dropped_Ttl(int msgs_Dropped_TtlParam) {
        this.msgs_Dropped_Ttl = msgs_Dropped_TtlParam;
    }

    @DdlField(Version = "2.0", QualName = "msg-drop-rate", ObjectClass = 1, Level = 1, Structure = 4, Offset = 24, ElementSize = 4, IdentifierElement = 8)
    public int getMsg_Drop_Rate() {
        return msg_Drop_Rate;
    }

    public void setMsg_Drop_Rate(int msg_Drop_RateParam) {
        this.msg_Drop_Rate = msg_Drop_RateParam;
    }

    @DdlField(Version = "2.0", QualName = "reset-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 28, ElementSize = 18, IdentifierElement = 9)
    public String getReset_Timestamp() {
        return reset_Timestamp;
    }

    public void setReset_Timestamp(String reset_TimestampParam) {
        this.reset_Timestamp = reset_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "max-queue-count32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 46, ElementSize = 4, IdentifierElement = 10)
    public int getMax_Queue_Count32() {
        return max_Queue_Count32;
    }

    public void setMax_Queue_Count32(int max_Queue_Count32Param) {
        this.max_Queue_Count32 = max_Queue_Count32Param;
    }

    @DdlField(Version = "2.0", QualName = "sync-input-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 50, ElementSize = 4, IdentifierElement = 11)
    public int getSync_Input_Count() {
        return sync_Input_Count;
    }

    public void setSync_Input_Count(int sync_Input_CountParam) {
        this.sync_Input_Count = sync_Input_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-output-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 54, ElementSize = 4, IdentifierElement = 12)
    public int getSync_Output_Count() {
        return sync_Output_Count;
    }

    public void setSync_Output_Count(int sync_Output_CountParam) {
        this.sync_Output_Count = sync_Output_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-failures", ObjectClass = 1, Level = 1, Structure = 4, Offset = 58, ElementSize = 4, IdentifierElement = 13)
    public int getSync_Failures() {
        return sync_Failures;
    }

    public void setSync_Failures(int sync_FailuresParam) {
        this.sync_Failures = sync_FailuresParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-best-resp-time", ObjectClass = 1, Level = 1, Structure = 4, Offset = 62, ElementSize = 4, IdentifierElement = 14)
    public int getSync_Best_Resp_Time() {
        return sync_Best_Resp_Time;
    }

    public void setSync_Best_Resp_Time(int sync_Best_Resp_TimeParam) {
        this.sync_Best_Resp_Time = sync_Best_Resp_TimeParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-worst-resp-time", ObjectClass = 1, Level = 1, Structure = 4, Offset = 66, ElementSize = 4, IdentifierElement = 15)
    public int getSync_Worst_Resp_Time() {
        return sync_Worst_Resp_Time;
    }

    public void setSync_Worst_Resp_Time(int sync_Worst_Resp_TimeParam) {
        this.sync_Worst_Resp_Time = sync_Worst_Resp_TimeParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-last-resp-time", ObjectClass = 1, Level = 1, Structure = 4, Offset = 70, ElementSize = 4, IdentifierElement = 16)
    public int getSync_Last_Resp_Time() {
        return sync_Last_Resp_Time;
    }

    public void setSync_Last_Resp_Time(int sync_Last_Resp_TimeParam) {
        this.sync_Last_Resp_Time = sync_Last_Resp_TimeParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-last-destination", ObjectClass = 1, Level = 1, Structure = 0, Offset = 74, ElementSize = 16, IdentifierElement = 17)
    public String getSync_Last_Destination() {
        return sync_Last_Destination;
    }

    public void setSync_Last_Destination(String sync_Last_DestinationParam) {
        this.sync_Last_Destination = sync_Last_DestinationParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-last-req-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 90, ElementSize = 26, IdentifierElement = 18)
    public String getSync_Last_Req_Timestamp() {
        return sync_Last_Req_Timestamp;
    }

    public void setSync_Last_Req_Timestamp(String sync_Last_Req_TimestampParam) {
        this.sync_Last_Req_Timestamp = sync_Last_Req_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-last-resp-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 116, ElementSize = 26, IdentifierElement = 19)
    public String getSync_Last_Resp_Timestamp() {
        return sync_Last_Resp_Timestamp;
    }

    public void setSync_Last_Resp_Timestamp(String sync_Last_Resp_TimestampParam) {
        this.sync_Last_Resp_Timestamp = sync_Last_Resp_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-best-resp-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 142, ElementSize = 26, IdentifierElement = 20)
    public String getSync_Best_Resp_Timestamp() {
        return sync_Best_Resp_Timestamp;
    }

    public void setSync_Best_Resp_Timestamp(String sync_Best_Resp_TimestampParam) {
        this.sync_Best_Resp_Timestamp = sync_Best_Resp_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-worst-resp-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 168, ElementSize = 26, IdentifierElement = 21)
    public String getSync_Worst_Resp_Timestamp() {
        return sync_Worst_Resp_Timestamp;
    }

    public void setSync_Worst_Resp_Timestamp(String sync_Worst_Resp_TimestampParam) {
        this.sync_Worst_Resp_Timestamp = sync_Worst_Resp_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-num-avg-rsps", ObjectClass = 1, Level = 1, Structure = 4, Offset = 194, ElementSize = 4, IdentifierElement = 22)
    public int getSync_Num_Avg_Rsps() {
        return sync_Num_Avg_Rsps;
    }

    public void setSync_Num_Avg_Rsps(int sync_Num_Avg_RspsParam) {
        this.sync_Num_Avg_Rsps = sync_Num_Avg_RspsParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-num-avg-rsps-times", ObjectClass = 1, Level = 1, Structure = 4, Offset = 198, ElementSize = 4, IdentifierElement = 23, OccursMax = 20)
    public int[] getSync_Num_Avg_Rsps_Times() {
        return sync_Num_Avg_Rsps_Times;
    }

    @DdlField(Version = "2.0", QualName = "sync-num-avg-rsps-times", ObjectClass = 1, Level = 1, Structure = 4, Offset = 198, ElementSize = 4, IdentifierElement = 23, OccursMax = 20)
    public int getSync_Num_Avg_Rsps_Times(int index) {
        return (sync_Num_Avg_Rsps_Times[index]);
    }

    public void setSync_Num_Avg_Rsps_Times(int[] sync_Num_Avg_Rsps_TimesParam) {
        this.sync_Num_Avg_Rsps_Times = sync_Num_Avg_Rsps_TimesParam;
    }

    public void setSync_Num_Avg_Rsps_Times(int index, int sync_Num_Avg_Rsps_TimesParam) {
        this.sync_Num_Avg_Rsps_Times[index]=sync_Num_Avg_Rsps_TimesParam;
    }

    @DdlField(Version = "2.0", QualName = "maxq-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 278, ElementSize = 18, IdentifierElement = 24)
    public String getMaxq_Timestamp() {
        return maxq_Timestamp;
    }

    public void setMaxq_Timestamp(String maxq_TimestampParam) {
        this.maxq_Timestamp = maxq_TimestampParam;
    }

}
