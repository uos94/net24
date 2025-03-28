
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-stats-dest", ElementSize = 60, LocalName = "ncp-resp-stats-dest")
public class Ncp_Resp_Stats_Dest
    implements Serializable
{

    private short dest_Type;
    private short dest_Is_External;
    private short dest_Added;
    private int total_Msgs;
    private int max_Queue_Count;
    private int msgs_Dropped_Ttl;
    private int msg_Drop_Rate;
    private String reset_Timestamp;
    private String maxq_Timestamp;
    private short sba_Bsi_Service;

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

    @DdlField(Version = "2.0", QualName = "dest-added", ObjectClass = 1, Level = 1, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 3)
    public short getDest_Added() {
        return dest_Added;
    }

    public void setDest_Added(short dest_AddedParam) {
        this.dest_Added = dest_AddedParam;
    }

    @DdlField(Version = "2.0", QualName = "total-msgs", ObjectClass = 1, Level = 1, Structure = 4, Offset = 6, ElementSize = 4, IdentifierElement = 4)
    public int getTotal_Msgs() {
        return total_Msgs;
    }

    public void setTotal_Msgs(int total_MsgsParam) {
        this.total_Msgs = total_MsgsParam;
    }

    @DdlField(Version = "2.0", QualName = "max-queue-count", ObjectClass = 1, Level = 1, Structure = 4, Offset = 10, ElementSize = 4, IdentifierElement = 5)
    public int getMax_Queue_Count() {
        return max_Queue_Count;
    }

    public void setMax_Queue_Count(int max_Queue_CountParam) {
        this.max_Queue_Count = max_Queue_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "msgs-dropped-ttl", ObjectClass = 1, Level = 1, Structure = 4, Offset = 14, ElementSize = 4, IdentifierElement = 6)
    public int getMsgs_Dropped_Ttl() {
        return msgs_Dropped_Ttl;
    }

    public void setMsgs_Dropped_Ttl(int msgs_Dropped_TtlParam) {
        this.msgs_Dropped_Ttl = msgs_Dropped_TtlParam;
    }

    @DdlField(Version = "2.0", QualName = "msg-drop-rate", ObjectClass = 1, Level = 1, Structure = 4, Offset = 18, ElementSize = 4, IdentifierElement = 7)
    public int getMsg_Drop_Rate() {
        return msg_Drop_Rate;
    }

    public void setMsg_Drop_Rate(int msg_Drop_RateParam) {
        this.msg_Drop_Rate = msg_Drop_RateParam;
    }

    @DdlField(Version = "2.0", QualName = "reset-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 22, ElementSize = 18, IdentifierElement = 8)
    public String getReset_Timestamp() {
        return reset_Timestamp;
    }

    public void setReset_Timestamp(String reset_TimestampParam) {
        this.reset_Timestamp = reset_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "maxq-timestamp", ObjectClass = 1, Level = 1, Structure = 0, Offset = 40, ElementSize = 18, IdentifierElement = 9)
    public String getMaxq_Timestamp() {
        return maxq_Timestamp;
    }

    public void setMaxq_Timestamp(String maxq_TimestampParam) {
        this.maxq_Timestamp = maxq_TimestampParam;
    }

    @DdlField(Version = "2.0", QualName = "sba-bsi-service", ObjectClass = 1, Level = 1, Structure = 2, Offset = 58, ElementSize = 2, IdentifierElement = 10)
    public short getSba_Bsi_Service() {
        return sba_Bsi_Service;
    }

    public void setSba_Bsi_Service(short sba_Bsi_ServiceParam) {
        this.sba_Bsi_Service = sba_Bsi_ServiceParam;
    }

}
