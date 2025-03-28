
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-hstat-dest", ElementSize = 104, LocalName = "ncp-resp-hstat-dest")
public class Ncp_Resp_Hstat_Dest
    implements Serializable
{

    private short dest_Type;
    private short dest_Is_External;
    private short dest_Error;
    private short dest_Added;
    private short dest_Frozen;
    private short dest_Fail;
    private String obj_Symname;
    private int dest_Queue_Count;
    private int obj_Queue_Count;
    private short discover_In_Progress;
    private short srvc_Local_Ttl;
    private short srvc_Local_Avail;
    private short srvc_Local_Usable;
    private short srvc_Extrn_Avail;
    private short num_Providers;
    private short queue_State;
    private short sba_Bsi_Service;
    private int total_Msgs;
    private int max_Queue_Count;
    private int msgs_Dropped_Ttl;
    private int msg_Drop_Rate;
    private String reset_Timestamp;
    private String maxq_Timestamp;

    @DdlField(Version = "2.0", QualName = "dest-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getDest_Type() {
        return dest_Type;
    }

    public void setDest_Type(short dest_TypeParam) {
        this.dest_Type = dest_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "dest-is-external", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getDest_Is_External() {
        return dest_Is_External;
    }

    public void setDest_Is_External(short dest_Is_ExternalParam) {
        this.dest_Is_External = dest_Is_ExternalParam;
    }

    @DdlField(Version = "2.0", QualName = "dest-error", ObjectClass = 1, Level = 1, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 3)
    public short getDest_Error() {
        return dest_Error;
    }

    public void setDest_Error(short dest_ErrorParam) {
        this.dest_Error = dest_ErrorParam;
    }

    @DdlField(Version = "2.0", QualName = "dest-added", ObjectClass = 1, Level = 1, Structure = 2, Offset = 6, ElementSize = 2, IdentifierElement = 4)
    public short getDest_Added() {
        return dest_Added;
    }

    public void setDest_Added(short dest_AddedParam) {
        this.dest_Added = dest_AddedParam;
    }

    @DdlField(Version = "2.0", QualName = "dest-frozen", ObjectClass = 1, Level = 1, Structure = 2, Offset = 8, ElementSize = 2, IdentifierElement = 5)
    public short getDest_Frozen() {
        return dest_Frozen;
    }

    public void setDest_Frozen(short dest_FrozenParam) {
        this.dest_Frozen = dest_FrozenParam;
    }

    @DdlField(Version = "2.0", QualName = "dest-fail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 10, ElementSize = 2, IdentifierElement = 6)
    public short getDest_Fail() {
        return dest_Fail;
    }

    public void setDest_Fail(short dest_FailParam) {
        this.dest_Fail = dest_FailParam;
    }

    @DdlField(Version = "2.0", QualName = "obj-symname", ObjectClass = 1, Level = 1, Structure = 0, Offset = 12, ElementSize = 16, IdentifierElement = 7)
    public String getObj_Symname() {
        return obj_Symname;
    }

    public void setObj_Symname(String obj_SymnameParam) {
        this.obj_Symname = obj_SymnameParam;
    }

    @DdlField(Version = "2.0", QualName = "dest-queue-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 28, ElementSize = 4, IdentifierElement = 8)
    public int getDest_Queue_Count() {
        return dest_Queue_Count;
    }

    public void setDest_Queue_Count(int dest_Queue_CountParam) {
        this.dest_Queue_Count = dest_Queue_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "obj-queue-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 32, ElementSize = 4, IdentifierElement = 9)
    public int getObj_Queue_Count() {
        return obj_Queue_Count;
    }

    public void setObj_Queue_Count(int obj_Queue_CountParam) {
        this.obj_Queue_Count = obj_Queue_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "discover-in-progress", ObjectClass = 1, Level = 1, Structure = 2, Offset = 36, ElementSize = 2, IdentifierElement = 10)
    public short getDiscover_In_Progress() {
        return discover_In_Progress;
    }

    public void setDiscover_In_Progress(short discover_In_ProgressParam) {
        this.discover_In_Progress = discover_In_ProgressParam;
    }

    @DdlField(Version = "2.0", QualName = "srvc-local-ttl", ObjectClass = 1, Level = 1, Structure = 2, Offset = 38, ElementSize = 2, IdentifierElement = 11)
    public short getSrvc_Local_Ttl() {
        return srvc_Local_Ttl;
    }

    public void setSrvc_Local_Ttl(short srvc_Local_TtlParam) {
        this.srvc_Local_Ttl = srvc_Local_TtlParam;
    }

    @DdlField(Version = "2.0", QualName = "srvc-local-avail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 40, ElementSize = 2, IdentifierElement = 12)
    public short getSrvc_Local_Avail() {
        return srvc_Local_Avail;
    }

    public void setSrvc_Local_Avail(short srvc_Local_AvailParam) {
        this.srvc_Local_Avail = srvc_Local_AvailParam;
    }

    @DdlField(Version = "2.0", QualName = "srvc-local-usable", ObjectClass = 1, Level = 1, Structure = 2, Offset = 42, ElementSize = 2, IdentifierElement = 13)
    public short getSrvc_Local_Usable() {
        return srvc_Local_Usable;
    }

    public void setSrvc_Local_Usable(short srvc_Local_UsableParam) {
        this.srvc_Local_Usable = srvc_Local_UsableParam;
    }

    @DdlField(Version = "2.0", QualName = "srvc-extrn-avail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 44, ElementSize = 2, IdentifierElement = 14)
    public short getSrvc_Extrn_Avail() {
        return srvc_Extrn_Avail;
    }

    public void setSrvc_Extrn_Avail(short srvc_Extrn_AvailParam) {
        this.srvc_Extrn_Avail = srvc_Extrn_AvailParam;
    }

    @DdlField(Version = "2.0", QualName = "num-providers", ObjectClass = 1, Level = 1, Structure = 2, Offset = 46, ElementSize = 2, IdentifierElement = 15)
    public short getNum_Providers() {
        return num_Providers;
    }

    public void setNum_Providers(short num_ProvidersParam) {
        this.num_Providers = num_ProvidersParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 48, ElementSize = 2, IdentifierElement = 16)
    public short getQueue_State() {
        return queue_State;
    }

    public void setQueue_State(short queue_StateParam) {
        this.queue_State = queue_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "sba-bsi-service", ObjectClass = 1, Level = 1, Structure = 2, Offset = 50, ElementSize = 2, IdentifierElement = 17)
    public short getSba_Bsi_Service() {
        return sba_Bsi_Service;
    }

    public void setSba_Bsi_Service(short sba_Bsi_ServiceParam) {
        this.sba_Bsi_Service = sba_Bsi_ServiceParam;
    }

    @DdlField(Version = "2.0", QualName = "total-msgs", ObjectClass = 1, Level = 1, Structure = 4, Offset = 52, ElementSize = 4, IdentifierElement = 18)
    public int getTotal_Msgs() {
        return total_Msgs;
    }

    public void setTotal_Msgs(int total_MsgsParam) {
        this.total_Msgs = total_MsgsParam;
    }

    @DdlField(Version = "2.0", QualName = "max-queue-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 56, ElementSize = 4, IdentifierElement = 19)
    public int getMax_Queue_Count() {
        return max_Queue_Count;
    }

    public void setMax_Queue_Count(int max_Queue_CountParam) {
        this.max_Queue_Count = max_Queue_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "msgs-dropped-ttl", ObjectClass = 1, Level = 1, Structure = 4, Offset = 60, ElementSize = 4, IdentifierElement = 20)
    public int getMsgs_Dropped_Ttl() {
        return msgs_Dropped_Ttl;
    }

    public void setMsgs_Dropped_Ttl(int msgs_Dropped_TtlParam) {
        this.msgs_Dropped_Ttl = msgs_Dropped_TtlParam;
    }

    @DdlField(Version = "2.0", QualName = "msg-drop-rate", ObjectClass = 1, Level = 1, Structure = 4, Offset = 64, ElementSize = 4, IdentifierElement = 21)
    public int getMsg_Drop_Rate() {
        return msg_Drop_Rate;
    }

    public void setMsg_Drop_Rate(int msg_Drop_RateParam) {
        this.msg_Drop_Rate = msg_Drop_RateParam;
    }

    @DdlField(Version = "2.0", QualName = "reset-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 68, ElementSize = 18, IdentifierElement = 22)
    public String getReset_Timestamp() {
        return reset_Timestamp;
    }

    public void setReset_Timestamp(String reset_TimestampParam) {
        this.reset_Timestamp = reset_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "maxq-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 86, ElementSize = 18, IdentifierElement = 23)
    public String getMaxq_Timestamp() {
        return maxq_Timestamp;
    }

    public void setMaxq_Timestamp(String maxq_TimestampParam) {
        this.maxq_Timestamp = maxq_TimestampParam;
    }

}
