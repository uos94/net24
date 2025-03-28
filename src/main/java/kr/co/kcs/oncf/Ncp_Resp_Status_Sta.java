
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_status_sta.State_DetailMarker;
import kr.co.kcs.oncf.ncp_resp_status_sta.Userdata;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-status-sta", ElementSize = 354, LocalName = "ncp-resp-status-sta")
public class Ncp_Resp_Status_Sta
    implements Serializable
{

    private short crtp_Terminal_Status;
    private short current_State;
    private short lin_Protocol;
    private short logical_State;
    private short queue_Count;
    private short queue_State;
    private short retry_Count;
    private short warmbackup_Logic;
    private State_DetailMarker state_Detail;
    private int queue_Count32;
    private Userdata userdata;
    private String cts_Local_Addr;
    private String cts_Remote_Addr;
    private short dsts_Dynamic_Sta;

    @DdlField(Version = "2.0", QualName = "crtp-terminal-status", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getCrtp_Terminal_Status() {
        return crtp_Terminal_Status;
    }

    public void setCrtp_Terminal_Status(short crtp_Terminal_StatusParam) {
        this.crtp_Terminal_Status = crtp_Terminal_StatusParam;
    }

    @DdlField(Version = "2.0", QualName = "current-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getCurrent_State() {
        return current_State;
    }

    public void setCurrent_State(short current_StateParam) {
        this.current_State = current_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-protocol", ObjectClass = 1, Level = 1, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 3)
    public short getLin_Protocol() {
        return lin_Protocol;
    }

    public void setLin_Protocol(short lin_ProtocolParam) {
        this.lin_Protocol = lin_ProtocolParam;
    }

    @DdlField(Version = "2.0", QualName = "logical-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 6, ElementSize = 2, IdentifierElement = 4)
    public short getLogical_State() {
        return logical_State;
    }

    public void setLogical_State(short logical_StateParam) {
        this.logical_State = logical_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-count", ObjectClass = 1, Level = 1, Structure = 2, Offset = 8, ElementSize = 2, IdentifierElement = 5)
    public short getQueue_Count() {
        return queue_Count;
    }

    public void setQueue_Count(short queue_CountParam) {
        this.queue_Count = queue_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 10, ElementSize = 2, IdentifierElement = 6)
    public short getQueue_State() {
        return queue_State;
    }

    public void setQueue_State(short queue_StateParam) {
        this.queue_State = queue_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "retry-count", ObjectClass = 1, Level = 1, Structure = 2, Offset = 12, ElementSize = 2, IdentifierElement = 7)
    public short getRetry_Count() {
        return retry_Count;
    }

    public void setRetry_Count(short retry_CountParam) {
        this.retry_Count = retry_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "warmbackup-logic", ObjectClass = 1, Level = 1, Structure = 2, Offset = 14, ElementSize = 2, IdentifierElement = 8)
    public short getWarmbackup_Logic() {
        return warmbackup_Logic;
    }

    public void setWarmbackup_Logic(short warmbackup_LogicParam) {
        this.warmbackup_Logic = warmbackup_LogicParam;
    }

    @DdlField(Version = "2.0", QualName = "state-detail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 9)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_status_sta.State_Detail")
    public State_DetailMarker getState_Detail() {
        return state_Detail;
    }

    public void setState_Detail(State_DetailMarker state_DetailParam) {
        this.state_Detail = state_DetailParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-count32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 18, ElementSize = 4, IdentifierElement = 16)
    public int getQueue_Count32() {
        return queue_Count32;
    }

    public void setQueue_Count32(int queue_Count32Param) {
        this.queue_Count32 = queue_Count32Param;
    }

    @DdlField(Version = "2.0", QualName = "userdata", ObjectClass = 0, Level = 1, Structure = 0, Offset = 22, ElementSize = 218, IdentifierElement = 17)
    public Userdata getUserdata() {
        return userdata;
    }

    public void setUserdata(Userdata userdataParam) {
        this.userdata = userdataParam;
    }

    @DdlField(Version = "2.0", QualName = "cts-local-addr", ObjectClass = 1, Level = 1, Structure = 0, Offset = 240, ElementSize = 56, IdentifierElement = 21)
    public String getCts_Local_Addr() {
        return cts_Local_Addr;
    }

    public void setCts_Local_Addr(String cts_Local_AddrParam) {
        this.cts_Local_Addr = cts_Local_AddrParam;
    }

    @DdlField(Version = "2.0", QualName = "cts-remote-addr", ObjectClass = 1, Level = 1, Structure = 0, Offset = 296, ElementSize = 56, IdentifierElement = 22)
    public String getCts_Remote_Addr() {
        return cts_Remote_Addr;
    }

    public void setCts_Remote_Addr(String cts_Remote_AddrParam) {
        this.cts_Remote_Addr = cts_Remote_AddrParam;
    }

    @DdlField(Version = "2.0", QualName = "dsts-dynamic-sta", ObjectClass = 1, Level = 1, Structure = 2, Offset = 352, ElementSize = 2, IdentifierElement = 23)
    public short getDsts_Dynamic_Sta() {
        return dsts_Dynamic_Sta;
    }

    public void setDsts_Dynamic_Sta(short dsts_Dynamic_StaParam) {
        this.dsts_Dynamic_Sta = dsts_Dynamic_StaParam;
    }

}
