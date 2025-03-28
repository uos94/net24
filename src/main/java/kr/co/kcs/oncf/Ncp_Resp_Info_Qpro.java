
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_info_qpro.Queue_LimitMarker;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-info-qpro", ElementSize = 94, LocalName = "ncp-resp-info-qpro")
public class Ncp_Resp_Info_Qpro
    implements Serializable
{

    private short audit_Input;
    private short audit_Output;
    private String class_Var1;
    private short output_Enabled;
    private short process_Number;
    private short qpro_Process_Count;
    private short qpro_Type;
    private short queue_Alert_Threshold;
    private Queue_LimitMarker queue_Limit;
    private String uc_Queue;
    private String uc_Rate;
    private short qmi;
    private String class32;

    @DdlField(Version = "2.0", QualName = "audit-input", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getAudit_Input() {
        return audit_Input;
    }

    public void setAudit_Input(short audit_InputParam) {
        this.audit_Input = audit_InputParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-output", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getAudit_Output() {
        return audit_Output;
    }

    public void setAudit_Output(short audit_OutputParam) {
        this.audit_Output = audit_OutputParam;
    }

    @DdlField(Version = "2.0", QualName = "class-var1", ObjectClass = 1, Level = 1, Structure = 0, Offset = 4, ElementSize = 16, IdentifierElement = 3)
    public String getClass_Var1() {
        return class_Var1;
    }

    public void setClass_Var1(String class_Var1Param) {
        this.class_Var1 = class_Var1Param;
    }

    @DdlField(Version = "2.0", QualName = "output-enabled", ObjectClass = 1, Level = 1, Structure = 2, Offset = 20, ElementSize = 2, IdentifierElement = 4)
    public short getOutput_Enabled() {
        return output_Enabled;
    }

    public void setOutput_Enabled(short output_EnabledParam) {
        this.output_Enabled = output_EnabledParam;
    }

    @DdlField(Version = "2.0", QualName = "process-number", ObjectClass = 1, Level = 1, Structure = 2, Offset = 22, ElementSize = 2, IdentifierElement = 5)
    public short getProcess_Number() {
        return process_Number;
    }

    public void setProcess_Number(short process_NumberParam) {
        this.process_Number = process_NumberParam;
    }

    @DdlField(Version = "2.0", QualName = "qpro-process-count", ObjectClass = 1, Level = 1, Structure = 2, Offset = 24, ElementSize = 2, IdentifierElement = 6)
    public short getQpro_Process_Count() {
        return qpro_Process_Count;
    }

    public void setQpro_Process_Count(short qpro_Process_CountParam) {
        this.qpro_Process_Count = qpro_Process_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "qpro-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 26, ElementSize = 2, IdentifierElement = 7)
    public short getQpro_Type() {
        return qpro_Type;
    }

    public void setQpro_Type(short qpro_TypeParam) {
        this.qpro_Type = qpro_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-alert-threshold", ObjectClass = 1, Level = 1, Structure = 2, Offset = 28, ElementSize = 2, IdentifierElement = 8)
    public short getQueue_Alert_Threshold() {
        return queue_Alert_Threshold;
    }

    public void setQueue_Alert_Threshold(short queue_Alert_ThresholdParam) {
        this.queue_Alert_Threshold = queue_Alert_ThresholdParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-limit", ObjectClass = 1, Level = 1, Structure = 2, Offset = 30, ElementSize = 2, IdentifierElement = 9)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_info_qpro.Queue_Limit")
    public Queue_LimitMarker getQueue_Limit() {
        return queue_Limit;
    }

    public void setQueue_Limit(Queue_LimitMarker queue_LimitParam) {
        this.queue_Limit = queue_LimitParam;
    }

    @DdlField(Version = "2.0", QualName = "uc-queue", ObjectClass = 1, Level = 1, Structure = 0, Offset = 32, ElementSize = 14, IdentifierElement = 11)
    public String getUc_Queue() {
        return uc_Queue;
    }

    public void setUc_Queue(String uc_QueueParam) {
        this.uc_Queue = uc_QueueParam;
    }

    @DdlField(Version = "2.0", QualName = "uc-rate", ObjectClass = 1, Level = 1, Structure = 0, Offset = 46, ElementSize = 14, IdentifierElement = 12)
    public String getUc_Rate() {
        return uc_Rate;
    }

    public void setUc_Rate(String uc_RateParam) {
        this.uc_Rate = uc_RateParam;
    }

    @DdlField(Version = "2.0", QualName = "qmi", ObjectClass = 1, Level = 1, Structure = 2, Offset = 60, ElementSize = 2, IdentifierElement = 13)
    public short getQmi() {
        return qmi;
    }

    public void setQmi(short qmiParam) {
        this.qmi = qmiParam;
    }

    @DdlField(Version = "2.0", QualName = "class32", ObjectClass = 1, Level = 1, Structure = 0, Offset = 62, ElementSize = 32, IdentifierElement = 14)
    public String getClass32() {
        return class32;
    }

    public void setClass32(String class32Param) {
        this.class32 = class32Param;
    }

}
