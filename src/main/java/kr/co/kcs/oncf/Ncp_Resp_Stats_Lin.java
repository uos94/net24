
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-stats-lin", ElementSize = 46, LocalName = "ncp-resp-stats-lin")
public class Ncp_Resp_Stats_Lin
    implements Serializable
{

    private short ete_Protocol;
    private int input_Count;
    private int input_Failures;
    private short lin_Protocol;
    private short messages_Pending;
    private int output_Count;
    private int output_Failures;
    private String reset_Timestamp;
    private int messages_Pending32;
    private short dsts_Dynamic_Sta;

    @DdlField(Version = "2.0", QualName = "ete-protocol", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getEte_Protocol() {
        return ete_Protocol;
    }

    public void setEte_Protocol(short ete_ProtocolParam) {
        this.ete_Protocol = ete_ProtocolParam;
    }

    @DdlField(Version = "2.0", QualName = "input-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 2, ElementSize = 4, IdentifierElement = 2)
    public int getInput_Count() {
        return input_Count;
    }

    public void setInput_Count(int input_CountParam) {
        this.input_Count = input_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "input-failures", ObjectClass = 1, Level = 1, Structure = 4, Offset = 6, ElementSize = 4, IdentifierElement = 3)
    public int getInput_Failures() {
        return input_Failures;
    }

    public void setInput_Failures(int input_FailuresParam) {
        this.input_Failures = input_FailuresParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-protocol", ObjectClass = 1, Level = 1, Structure = 2, Offset = 10, ElementSize = 2, IdentifierElement = 4)
    public short getLin_Protocol() {
        return lin_Protocol;
    }

    public void setLin_Protocol(short lin_ProtocolParam) {
        this.lin_Protocol = lin_ProtocolParam;
    }

    @DdlField(Version = "2.0", QualName = "messages-pending", ObjectClass = 1, Level = 1, Structure = 2, Offset = 12, ElementSize = 2, IdentifierElement = 5)
    public short getMessages_Pending() {
        return messages_Pending;
    }

    public void setMessages_Pending(short messages_PendingParam) {
        this.messages_Pending = messages_PendingParam;
    }

    @DdlField(Version = "2.0", QualName = "output-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 14, ElementSize = 4, IdentifierElement = 6)
    public int getOutput_Count() {
        return output_Count;
    }

    public void setOutput_Count(int output_CountParam) {
        this.output_Count = output_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "output-failures", ObjectClass = 1, Level = 1, Structure = 4, Offset = 18, ElementSize = 4, IdentifierElement = 7)
    public int getOutput_Failures() {
        return output_Failures;
    }

    public void setOutput_Failures(int output_FailuresParam) {
        this.output_Failures = output_FailuresParam;
    }

    @DdlField(Version = "2.0", QualName = "reset-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 22, ElementSize = 18, IdentifierElement = 8)
    public String getReset_Timestamp() {
        return reset_Timestamp;
    }

    public void setReset_Timestamp(String reset_TimestampParam) {
        this.reset_Timestamp = reset_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "messages-pending32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 40, ElementSize = 4, IdentifierElement = 9)
    public int getMessages_Pending32() {
        return messages_Pending32;
    }

    public void setMessages_Pending32(int messages_Pending32Param) {
        this.messages_Pending32 = messages_Pending32Param;
    }

    @DdlField(Version = "2.0", QualName = "dsts-dynamic-sta", ObjectClass = 1, Level = 1, Structure = 2, Offset = 44, ElementSize = 2, IdentifierElement = 10)
    public short getDsts_Dynamic_Sta() {
        return dsts_Dynamic_Sta;
    }

    public void setDsts_Dynamic_Sta(short dsts_Dynamic_StaParam) {
        this.dsts_Dynamic_Sta = dsts_Dynamic_StaParam;
    }

}
