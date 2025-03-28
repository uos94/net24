
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_status_lin.Circuit_EstablishedMarker;
import kr.co.kcs.oncf.ncp_resp_status_lin.Circuit_TimestampMarker;
import kr.co.kcs.oncf.ncp_resp_status_lin.Comm_MethodMarker;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-status-lin", ElementSize = 54, LocalName = "ncp-resp-status-lin")
public class Ncp_Resp_Status_Lin
    implements Serializable
{

    private short ete_Protocol;
    private short lin_Protocol;
    private short current_State;
    private short io_Status;
    private short logical_State;
    private short queue_Count;
    private short stas_Started;
    private short stas_Susp;
    private Circuit_EstablishedMarker circuit_Established;
    private Circuit_TimestampMarker circuit_Timestamp;
    private short trace;
    private Comm_MethodMarker comm_Method;
    private int queue_Count32;
    private short dsts_Dynamic_Sta;

    @DdlField(Version = "2.0", QualName = "ete-protocol", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getEte_Protocol() {
        return ete_Protocol;
    }

    public void setEte_Protocol(short ete_ProtocolParam) {
        this.ete_Protocol = ete_ProtocolParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-protocol", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getLin_Protocol() {
        return lin_Protocol;
    }

    public void setLin_Protocol(short lin_ProtocolParam) {
        this.lin_Protocol = lin_ProtocolParam;
    }

    @DdlField(Version = "2.0", QualName = "current-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 3)
    public short getCurrent_State() {
        return current_State;
    }

    public void setCurrent_State(short current_StateParam) {
        this.current_State = current_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "io-status", ObjectClass = 1, Level = 1, Structure = 2, Offset = 6, ElementSize = 2, IdentifierElement = 4)
    public short getIo_Status() {
        return io_Status;
    }

    public void setIo_Status(short io_StatusParam) {
        this.io_Status = io_StatusParam;
    }

    @DdlField(Version = "2.0", QualName = "logical-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 8, ElementSize = 2, IdentifierElement = 5)
    public short getLogical_State() {
        return logical_State;
    }

    public void setLogical_State(short logical_StateParam) {
        this.logical_State = logical_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-count", ObjectClass = 1, Level = 1, Structure = 2, Offset = 10, ElementSize = 2, IdentifierElement = 6)
    public short getQueue_Count() {
        return queue_Count;
    }

    public void setQueue_Count(short queue_CountParam) {
        this.queue_Count = queue_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "stas-started", ObjectClass = 1, Level = 1, Structure = 2, Offset = 12, ElementSize = 2, IdentifierElement = 7)
    public short getStas_Started() {
        return stas_Started;
    }

    public void setStas_Started(short stas_StartedParam) {
        this.stas_Started = stas_StartedParam;
    }

    @DdlField(Version = "2.0", QualName = "stas-susp", ObjectClass = 1, Level = 1, Structure = 2, Offset = 14, ElementSize = 2, IdentifierElement = 8)
    public short getStas_Susp() {
        return stas_Susp;
    }

    public void setStas_Susp(short stas_SuspParam) {
        this.stas_Susp = stas_SuspParam;
    }

    @DdlField(Version = "2.0", QualName = "circuit-established", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 9)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_status_lin.Circuit_Established")
    public Circuit_EstablishedMarker getCircuit_Established() {
        return circuit_Established;
    }

    public void setCircuit_Established(Circuit_EstablishedMarker circuit_EstablishedParam) {
        this.circuit_Established = circuit_EstablishedParam;
    }

    @DdlField(Version = "2.0", QualName = "circuit-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 18, ElementSize = 12, IdentifierElement = 13)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_status_lin.Circuit_Timestamp")
    public Circuit_TimestampMarker getCircuit_Timestamp() {
        return circuit_Timestamp;
    }

    public void setCircuit_Timestamp(Circuit_TimestampMarker circuit_TimestampParam) {
        this.circuit_Timestamp = circuit_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "trace", ObjectClass = 1, Level = 1, Structure = 2, Offset = 30, ElementSize = 2, IdentifierElement = 17)
    public short getTrace() {
        return trace;
    }

    public void setTrace(short traceParam) {
        this.trace = traceParam;
    }

    @DdlField(Version = "2.0", QualName = "comm-method", ObjectClass = 1, Level = 1, Structure = 0, Offset = 32, ElementSize = 16, IdentifierElement = 18)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_status_lin.Comm_Method")
    public Comm_MethodMarker getComm_Method() {
        return comm_Method;
    }

    public void setComm_Method(Comm_MethodMarker comm_MethodParam) {
        this.comm_Method = comm_MethodParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-count32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 48, ElementSize = 4, IdentifierElement = 21)
    public int getQueue_Count32() {
        return queue_Count32;
    }

    public void setQueue_Count32(int queue_Count32Param) {
        this.queue_Count32 = queue_Count32Param;
    }

    @DdlField(Version = "2.0", QualName = "dsts-dynamic-sta", ObjectClass = 1, Level = 1, Structure = 2, Offset = 52, ElementSize = 2, IdentifierElement = 22)
    public short getDsts_Dynamic_Sta() {
        return dsts_Dynamic_Sta;
    }

    public void setDsts_Dynamic_Sta(short dsts_Dynamic_StaParam) {
        this.dsts_Dynamic_Sta = dsts_Dynamic_StaParam;
    }

}
