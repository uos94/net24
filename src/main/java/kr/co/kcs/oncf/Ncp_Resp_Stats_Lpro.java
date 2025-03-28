
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-stats-lpro", ElementSize = 68, LocalName = "ncp-resp-stats-lpro")
public class Ncp_Resp_Stats_Lpro
    implements Serializable
{

    private short failures;
    private int input_Block_Count;
    private int input_Count;
    private int output_Block_Count;
    private int output_Count;
    private short max_Queue_Count;
    private int msgs_Dropped_Ttl;
    private int msg_Drop_Rate;
    private String reset_Timestamp;
    private int max_Queue_Count32;
    private String maxq_Timestamp;

    @DdlField(Version = "2.0", QualName = "failures", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getFailures() {
        return failures;
    }

    public void setFailures(short failuresParam) {
        this.failures = failuresParam;
    }

    @DdlField(Version = "2.0", QualName = "input-block-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 2, ElementSize = 4, IdentifierElement = 2)
    public int getInput_Block_Count() {
        return input_Block_Count;
    }

    public void setInput_Block_Count(int input_Block_CountParam) {
        this.input_Block_Count = input_Block_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "input-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 6, ElementSize = 4, IdentifierElement = 3)
    public int getInput_Count() {
        return input_Count;
    }

    public void setInput_Count(int input_CountParam) {
        this.input_Count = input_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "output-block-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 10, ElementSize = 4, IdentifierElement = 4)
    public int getOutput_Block_Count() {
        return output_Block_Count;
    }

    public void setOutput_Block_Count(int output_Block_CountParam) {
        this.output_Block_Count = output_Block_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "output-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 14, ElementSize = 4, IdentifierElement = 5)
    public int getOutput_Count() {
        return output_Count;
    }

    public void setOutput_Count(int output_CountParam) {
        this.output_Count = output_CountParam;
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

    @DdlField(Version = "2.0", QualName = "maxq-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 50, ElementSize = 18, IdentifierElement = 11)
    public String getMaxq_Timestamp() {
        return maxq_Timestamp;
    }

    public void setMaxq_Timestamp(String maxq_TimestampParam) {
        this.maxq_Timestamp = maxq_TimestampParam;
    }

}
