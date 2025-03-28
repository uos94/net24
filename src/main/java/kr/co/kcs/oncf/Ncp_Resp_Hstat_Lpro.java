
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_hstat_lpro.Begin_TypeMarker;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-hstat-lpro", ElementSize = 122, LocalName = "ncp-resp-hstat-lpro")
public class Ncp_Resp_Hstat_Lpro
    implements Serializable
{

    private short current_State;
    private short logical_State;
    private short queue_Count;
    private short queue_State;
    private short warmbackup_Logic;
    private int queue_Count32;
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
    private short audit_Input;
    private short audit_Output;
    private Begin_TypeMarker begin_Type;
    private String class_Var1;
    private short output_Enabled;
    private String ppd_Name;

    @DdlField(Version = "2.0", QualName = "current-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getCurrent_State() {
        return current_State;
    }

    public void setCurrent_State(short current_StateParam) {
        this.current_State = current_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "logical-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getLogical_State() {
        return logical_State;
    }

    public void setLogical_State(short logical_StateParam) {
        this.logical_State = logical_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-count", ObjectClass = 1, Level = 1, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 3)
    public short getQueue_Count() {
        return queue_Count;
    }

    public void setQueue_Count(short queue_CountParam) {
        this.queue_Count = queue_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 6, ElementSize = 2, IdentifierElement = 4)
    public short getQueue_State() {
        return queue_State;
    }

    public void setQueue_State(short queue_StateParam) {
        this.queue_State = queue_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "warmbackup-logic", ObjectClass = 1, Level = 1, Structure = 2, Offset = 8, ElementSize = 2, IdentifierElement = 5)
    public short getWarmbackup_Logic() {
        return warmbackup_Logic;
    }

    public void setWarmbackup_Logic(short warmbackup_LogicParam) {
        this.warmbackup_Logic = warmbackup_LogicParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-count32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 10, ElementSize = 4, IdentifierElement = 6)
    public int getQueue_Count32() {
        return queue_Count32;
    }

    public void setQueue_Count32(int queue_Count32Param) {
        this.queue_Count32 = queue_Count32Param;
    }

    @DdlField(Version = "2.0", QualName = "failures", ObjectClass = 1, Level = 1, Structure = 2, Offset = 14, ElementSize = 2, IdentifierElement = 7)
    public short getFailures() {
        return failures;
    }

    public void setFailures(short failuresParam) {
        this.failures = failuresParam;
    }

    @DdlField(Version = "2.0", QualName = "input-block-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 16, ElementSize = 4, IdentifierElement = 8)
    public int getInput_Block_Count() {
        return input_Block_Count;
    }

    public void setInput_Block_Count(int input_Block_CountParam) {
        this.input_Block_Count = input_Block_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "input-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 20, ElementSize = 4, IdentifierElement = 9)
    public int getInput_Count() {
        return input_Count;
    }

    public void setInput_Count(int input_CountParam) {
        this.input_Count = input_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "output-block-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 24, ElementSize = 4, IdentifierElement = 10)
    public int getOutput_Block_Count() {
        return output_Block_Count;
    }

    public void setOutput_Block_Count(int output_Block_CountParam) {
        this.output_Block_Count = output_Block_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "output-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 28, ElementSize = 4, IdentifierElement = 11)
    public int getOutput_Count() {
        return output_Count;
    }

    public void setOutput_Count(int output_CountParam) {
        this.output_Count = output_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "max-queue-count", ObjectClass = 1, Level = 1, Structure = 2, Offset = 32, ElementSize = 2, IdentifierElement = 12)
    public short getMax_Queue_Count() {
        return max_Queue_Count;
    }

    public void setMax_Queue_Count(short max_Queue_CountParam) {
        this.max_Queue_Count = max_Queue_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "msgs-dropped-ttl", ObjectClass = 1, Level = 1, Structure = 4, Offset = 34, ElementSize = 4, IdentifierElement = 13)
    public int getMsgs_Dropped_Ttl() {
        return msgs_Dropped_Ttl;
    }

    public void setMsgs_Dropped_Ttl(int msgs_Dropped_TtlParam) {
        this.msgs_Dropped_Ttl = msgs_Dropped_TtlParam;
    }

    @DdlField(Version = "2.0", QualName = "msg-drop-rate", ObjectClass = 1, Level = 1, Structure = 4, Offset = 38, ElementSize = 4, IdentifierElement = 14)
    public int getMsg_Drop_Rate() {
        return msg_Drop_Rate;
    }

    public void setMsg_Drop_Rate(int msg_Drop_RateParam) {
        this.msg_Drop_Rate = msg_Drop_RateParam;
    }

    @DdlField(Version = "2.0", QualName = "reset-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 42, ElementSize = 18, IdentifierElement = 15)
    public String getReset_Timestamp() {
        return reset_Timestamp;
    }

    public void setReset_Timestamp(String reset_TimestampParam) {
        this.reset_Timestamp = reset_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "max-queue-count32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 60, ElementSize = 4, IdentifierElement = 16)
    public int getMax_Queue_Count32() {
        return max_Queue_Count32;
    }

    public void setMax_Queue_Count32(int max_Queue_Count32Param) {
        this.max_Queue_Count32 = max_Queue_Count32Param;
    }

    @DdlField(Version = "2.0", QualName = "maxq-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 64, ElementSize = 18, IdentifierElement = 17)
    public String getMaxq_Timestamp() {
        return maxq_Timestamp;
    }

    public void setMaxq_Timestamp(String maxq_TimestampParam) {
        this.maxq_Timestamp = maxq_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-input", ObjectClass = 1, Level = 1, Structure = 2, Offset = 82, ElementSize = 2, IdentifierElement = 18)
    public short getAudit_Input() {
        return audit_Input;
    }

    public void setAudit_Input(short audit_InputParam) {
        this.audit_Input = audit_InputParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-output", ObjectClass = 1, Level = 1, Structure = 2, Offset = 84, ElementSize = 2, IdentifierElement = 19)
    public short getAudit_Output() {
        return audit_Output;
    }

    public void setAudit_Output(short audit_OutputParam) {
        this.audit_Output = audit_OutputParam;
    }

    @DdlField(Version = "2.0", QualName = "begin-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 86, ElementSize = 2, IdentifierElement = 20)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_hstat_lpro.Begin_Type")
    public Begin_TypeMarker getBegin_Type() {
        return begin_Type;
    }

    public void setBegin_Type(Begin_TypeMarker begin_TypeParam) {
        this.begin_Type = begin_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "class-var1", ObjectClass = 1, Level = 1, Structure = 0, Offset = 88, ElementSize = 16, IdentifierElement = 22)
    public String getClass_Var1() {
        return class_Var1;
    }

    public void setClass_Var1(String class_Var1Param) {
        this.class_Var1 = class_Var1Param;
    }

    @DdlField(Version = "2.0", QualName = "output-enabled", ObjectClass = 1, Level = 1, Structure = 2, Offset = 104, ElementSize = 2, IdentifierElement = 23)
    public short getOutput_Enabled() {
        return output_Enabled;
    }

    public void setOutput_Enabled(short output_EnabledParam) {
        this.output_Enabled = output_EnabledParam;
    }

    @DdlField(Version = "2.0", QualName = "ppd-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 106, ElementSize = 16, IdentifierElement = 24)
    public String getPpd_Name() {
        return ppd_Name;
    }

    public void setPpd_Name(String ppd_NameParam) {
        this.ppd_Name = ppd_NameParam;
    }

}
