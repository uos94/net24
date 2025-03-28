
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_link.Begin_TypeMarker;
import kr.co.kcs.oncf.ncp_link.Evt_Filt;
import kr.co.kcs.oncf.ncp_link.Queue_Limit32Marker;
import kr.co.kcs.oncf.ncp_link.Queue_LimitMarker;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

@DdlGroup(Version = "2.0", QualName = "ncp-link", ElementSize = 188, LocalName = "ncp-link")
public class Ncp_Link
    implements Serializable
{

    private short audit_Input;
    private short audit_Output;
    private Begin_TypeMarker begin_Type;
    private String class_Var1;
    private short output_Enabled;
    private String ppd_Name;
    private short process_Number;
    private short queue_Alert_Threshold;
    private Queue_LimitMarker queue_Limit;
    private String uc_Queue;
    private String uc_Rate;
    private String uc_State;
    private short qmi;
    private String class32;
    private String symbolic_Name;
    private short enabled;
    private short invalid_Var1;
    private Evt_Filt evt_Filt;
    private int queue_Alert_Threshold32;
    private Queue_Limit32Marker queue_Limit32;
    private short auto_Start_Pri;
    private short warm_Start_Pri;
    private short rts_Onoff;

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

    @DdlField(Version = "2.0", QualName = "begin-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 3)
    @ReturnType("kr.co.kcs.oncf.ncp_link.Begin_Type")
    public Begin_TypeMarker getBegin_Type() {
        return begin_Type;
    }

    public void setBegin_Type(Begin_TypeMarker begin_TypeParam) {
        this.begin_Type = begin_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "class-var1", ObjectClass = 1, Level = 1, Structure = 0, Offset = 6, ElementSize = 16, IdentifierElement = 5)
    public String getClass_Var1() {
        return class_Var1;
    }

    public void setClass_Var1(String class_Var1Param) {
        this.class_Var1 = class_Var1Param;
    }

    @DdlField(Version = "2.0", QualName = "output-enabled", ObjectClass = 1, Level = 1, Structure = 2, Offset = 22, ElementSize = 2, IdentifierElement = 6)
    public short getOutput_Enabled() {
        return output_Enabled;
    }

    public void setOutput_Enabled(short output_EnabledParam) {
        this.output_Enabled = output_EnabledParam;
    }

    @DdlField(Version = "2.0", QualName = "ppd-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 24, ElementSize = 16, IdentifierElement = 7)
    public String getPpd_Name() {
        return ppd_Name;
    }

    public void setPpd_Name(String ppd_NameParam) {
        this.ppd_Name = ppd_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "process-number", ObjectClass = 1, Level = 1, Structure = 2, Offset = 40, ElementSize = 2, IdentifierElement = 8)
    public short getProcess_Number() {
        return process_Number;
    }

    public void setProcess_Number(short process_NumberParam) {
        this.process_Number = process_NumberParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-alert-threshold", ObjectClass = 1, Level = 1, Structure = 2, Offset = 42, ElementSize = 2, IdentifierElement = 9)
    public short getQueue_Alert_Threshold() {
        return queue_Alert_Threshold;
    }

    public void setQueue_Alert_Threshold(short queue_Alert_ThresholdParam) {
        this.queue_Alert_Threshold = queue_Alert_ThresholdParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-limit", ObjectClass = 1, Level = 1, Structure = 2, Offset = 44, ElementSize = 2, IdentifierElement = 10)
    @ReturnType("kr.co.kcs.oncf.ncp_link.Queue_Limit")
    public Queue_LimitMarker getQueue_Limit() {
        return queue_Limit;
    }

    public void setQueue_Limit(Queue_LimitMarker queue_LimitParam) {
        this.queue_Limit = queue_LimitParam;
    }

    @DdlField(Version = "2.0", QualName = "uc-queue", ObjectClass = 1, Level = 1, Structure = 0, Offset = 46, ElementSize = 14, IdentifierElement = 12)
    public String getUc_Queue() {
        return uc_Queue;
    }

    public void setUc_Queue(String uc_QueueParam) {
        this.uc_Queue = uc_QueueParam;
    }

    @DdlField(Version = "2.0", QualName = "uc-rate", ObjectClass = 1, Level = 1, Structure = 0, Offset = 60, ElementSize = 14, IdentifierElement = 13)
    public String getUc_Rate() {
        return uc_Rate;
    }

    public void setUc_Rate(String uc_RateParam) {
        this.uc_Rate = uc_RateParam;
    }

    @DdlField(Version = "2.0", QualName = "uc-state", ObjectClass = 1, Level = 1, Structure = 0, Offset = 74, ElementSize = 14, IdentifierElement = 14)
    public String getUc_State() {
        return uc_State;
    }

    public void setUc_State(String uc_StateParam) {
        this.uc_State = uc_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "qmi", ObjectClass = 1, Level = 1, Structure = 2, Offset = 88, ElementSize = 2, IdentifierElement = 15)
    public short getQmi() {
        return qmi;
    }

    public void setQmi(short qmiParam) {
        this.qmi = qmiParam;
    }

    @DdlField(Version = "2.0", QualName = "class32", ObjectClass = 1, Level = 1, Structure = 0, Offset = 90, ElementSize = 32, IdentifierElement = 16)
    public String getClass32() {
        return class32;
    }

    public void setClass32(String class32Param) {
        this.class32 = class32Param;
    }

    @DdlField(Version = "2.0", QualName = "symbolic-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 122, ElementSize = 16, IdentifierElement = 17)
    public String getSymbolic_Name() {
        return symbolic_Name;
    }

    public void setSymbolic_Name(String symbolic_NameParam) {
        this.symbolic_Name = symbolic_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "enabled", ObjectClass = 1, Level = 1, Structure = 2, Offset = 138, ElementSize = 2, IdentifierElement = 18)
    public short getEnabled() {
        return enabled;
    }

    public void setEnabled(short enabledParam) {
        this.enabled = enabledParam;
    }

    @DdlField(Version = "2.0", QualName = "invalid-var1", ObjectClass = 1, Level = 1, Structure = 2, Offset = 140, ElementSize = 2, IdentifierElement = 19)
    public short getInvalid_Var1() {
        return invalid_Var1;
    }

    public void setInvalid_Var1(short invalid_Var1Param) {
        this.invalid_Var1 = invalid_Var1Param;
    }

    @DdlField(Version = "2.0", QualName = "evt-filt", ObjectClass = 0, Level = 1, Structure = 0, Offset = 142, ElementSize = 32, IdentifierElement = 20)
    public Evt_Filt getEvt_Filt() {
        return evt_Filt;
    }

    public void setEvt_Filt(Evt_Filt evt_FiltParam) {
        this.evt_Filt = evt_FiltParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-alert-threshold32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 174, ElementSize = 4, IdentifierElement = 31)
    public int getQueue_Alert_Threshold32() {
        return queue_Alert_Threshold32;
    }

    public void setQueue_Alert_Threshold32(int queue_Alert_Threshold32Param) {
        this.queue_Alert_Threshold32 = queue_Alert_Threshold32Param;
    }

    @DdlField(Version = "2.0", QualName = "queue-limit32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 178, ElementSize = 4, IdentifierElement = 32)
    @ReturnType("kr.co.kcs.oncf.ncp_link.Queue_Limit32")
    public Queue_Limit32Marker getQueue_Limit32() {
        return queue_Limit32;
    }

    public void setQueue_Limit32(Queue_Limit32Marker queue_Limit32Param) {
        this.queue_Limit32 = queue_Limit32Param;
    }

    @DdlField(Version = "2.0", QualName = "auto-start-pri", ObjectClass = 1, Level = 1, Structure = 2, Offset = 182, ElementSize = 2, IdentifierElement = 34)
    public short getAuto_Start_Pri() {
        return auto_Start_Pri;
    }

    public void setAuto_Start_Pri(short auto_Start_PriParam) {
        this.auto_Start_Pri = auto_Start_PriParam;
    }

    @DdlField(Version = "2.0", QualName = "warm-start-pri", ObjectClass = 1, Level = 1, Structure = 2, Offset = 184, ElementSize = 2, IdentifierElement = 35)
    public short getWarm_Start_Pri() {
        return warm_Start_Pri;
    }

    public void setWarm_Start_Pri(short warm_Start_PriParam) {
        this.warm_Start_Pri = warm_Start_PriParam;
    }

    @DdlField(Version = "2.0", QualName = "rts-onoff", ObjectClass = 1, Level = 1, Structure = 2, Offset = 186, ElementSize = 2, IdentifierElement = 36)
    public short getRts_Onoff() {
        return rts_Onoff;
    }

    public void setRts_Onoff(short rts_OnoffParam) {
        this.rts_Onoff = rts_OnoffParam;
    }

}
