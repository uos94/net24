
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-stats-sta", ElementSize = 74, LocalName = "ncp-resp-stats-sta")
public class Ncp_Resp_Stats_Sta
    implements Serializable
{

    private int errs;
    private int input_Count;
    private int input_Failures;
    private short lin_Protocol;
    private short max_Queue_Count;
    private int msgs_Dropped_Ttl;
    private int msg_Drop_Rate;
    private int output_Count;
    private int output_Failures;
    private String reset_Timestamp;
    private int max_Queue_Count32;
    private String maxq_Timestamp;
    private short dsts_Dynamic_Sta;

    @DdlField(Version = "2.0", QualName = "errs", ObjectClass = 1, Level = 1, Structure = 4, Offset = 0, ElementSize = 4, IdentifierElement = 1)
    public int getErrs() {
        return errs;
    }

    public void setErrs(int errsParam) {
        this.errs = errsParam;
    }

    @DdlField(Version = "2.0", QualName = "input-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 4, ElementSize = 4, IdentifierElement = 2)
    public int getInput_Count() {
        return input_Count;
    }

    public void setInput_Count(int input_CountParam) {
        this.input_Count = input_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "input-failures", ObjectClass = 1, Level = 1, Structure = 4, Offset = 8, ElementSize = 4, IdentifierElement = 3)
    public int getInput_Failures() {
        return input_Failures;
    }

    public void setInput_Failures(int input_FailuresParam) {
        this.input_Failures = input_FailuresParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-protocol", ObjectClass = 1, Level = 1, Structure = 2, Offset = 12, ElementSize = 2, IdentifierElement = 4)
    public short getLin_Protocol() {
        return lin_Protocol;
    }

    public void setLin_Protocol(short lin_ProtocolParam) {
        this.lin_Protocol = lin_ProtocolParam;
    }

    @DdlField(Version = "2.0", QualName = "max-queue-count", ObjectClass = 1, Level = 1, Structure = 2, Offset = 14, ElementSize = 2, IdentifierElement = 5)
    public short getMax_Queue_Count() {
        return max_Queue_Count;
    }

    public void setMax_Queue_Count(short max_Queue_CountParam) {
        this.max_Queue_Count = max_Queue_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "msgs-dropped-ttl", ObjectClass = 1, Level = 1, Structure = 4, Offset = 16, ElementSize = 4, IdentifierElement = 6)
    public int getMsgs_Dropped_Ttl() {
        return msgs_Dropped_Ttl;
    }

    public void setMsgs_Dropped_Ttl(int msgs_Dropped_TtlParam) {
        this.msgs_Dropped_Ttl = msgs_Dropped_TtlParam;
    }

    @DdlField(Version = "2.0", QualName = "msg-drop-rate", ObjectClass = 1, Level = 1, Structure = 4, Offset = 20, ElementSize = 4, IdentifierElement = 7)
    public int getMsg_Drop_Rate() {
        return msg_Drop_Rate;
    }

    public void setMsg_Drop_Rate(int msg_Drop_RateParam) {
        this.msg_Drop_Rate = msg_Drop_RateParam;
    }

    @DdlField(Version = "2.0", QualName = "output-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 24, ElementSize = 4, IdentifierElement = 8)
    public int getOutput_Count() {
        return output_Count;
    }

    public void setOutput_Count(int output_CountParam) {
        this.output_Count = output_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "output-failures", ObjectClass = 1, Level = 1, Structure = 4, Offset = 28, ElementSize = 4, IdentifierElement = 9)
    public int getOutput_Failures() {
        return output_Failures;
    }

    public void setOutput_Failures(int output_FailuresParam) {
        this.output_Failures = output_FailuresParam;
    }

    @DdlField(Version = "2.0", QualName = "reset-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 32, ElementSize = 18, IdentifierElement = 10)
    public String getReset_Timestamp() {
        return reset_Timestamp;
    }

    public void setReset_Timestamp(String reset_TimestampParam) {
        this.reset_Timestamp = reset_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "max-queue-count32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 50, ElementSize = 4, IdentifierElement = 11)
    public int getMax_Queue_Count32() {
        return max_Queue_Count32;
    }

    public void setMax_Queue_Count32(int max_Queue_Count32Param) {
        this.max_Queue_Count32 = max_Queue_Count32Param;
    }

    @DdlField(Version = "2.0", QualName = "maxq-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 54, ElementSize = 18, IdentifierElement = 12)
    public String getMaxq_Timestamp() {
        return maxq_Timestamp;
    }

    public void setMaxq_Timestamp(String maxq_TimestampParam) {
        this.maxq_Timestamp = maxq_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "dsts-dynamic-sta", ObjectClass = 1, Level = 1, Structure = 2, Offset = 72, ElementSize = 2, IdentifierElement = 13)
    public short getDsts_Dynamic_Sta() {
        return dsts_Dynamic_Sta;
    }

    public void setDsts_Dynamic_Sta(short dsts_Dynamic_StaParam) {
        this.dsts_Dynamic_Sta = dsts_Dynamic_StaParam;
    }

}
