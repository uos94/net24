
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-status-pro", ElementSize = 82, LocalName = "ncp-resp-status-pro")
public class Ncp_Resp_Status_Pro
    implements Serializable
{

    private short backup_Cpu;
    private short backup_Pin;
    private short current_State;
    private short logical_State;
    private short primary_Cpu;
    private short primary_Pin;
    private short queue_Count;
    private short queue_State;
    private short warmbackup_Logic;
    private short[] pri_Phandle = new short[ 10 ] ;
    private short[] bkup_Phandle = new short[ 10 ] ;
    private int queue_Count32;
    private short payload_Mgt_Ind;
    private short sync_Status;
    private String sync_Dest;

    @DdlField(Version = "2.0", QualName = "backup-cpu", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getBackup_Cpu() {
        return backup_Cpu;
    }

    public void setBackup_Cpu(short backup_CpuParam) {
        this.backup_Cpu = backup_CpuParam;
    }

    @DdlField(Version = "2.0", QualName = "backup-pin", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getBackup_Pin() {
        return backup_Pin;
    }

    public void setBackup_Pin(short backup_PinParam) {
        this.backup_Pin = backup_PinParam;
    }

    @DdlField(Version = "2.0", QualName = "current-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 3)
    public short getCurrent_State() {
        return current_State;
    }

    public void setCurrent_State(short current_StateParam) {
        this.current_State = current_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "logical-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 6, ElementSize = 2, IdentifierElement = 4)
    public short getLogical_State() {
        return logical_State;
    }

    public void setLogical_State(short logical_StateParam) {
        this.logical_State = logical_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "primary-cpu", ObjectClass = 1, Level = 1, Structure = 2, Offset = 8, ElementSize = 2, IdentifierElement = 5)
    public short getPrimary_Cpu() {
        return primary_Cpu;
    }

    public void setPrimary_Cpu(short primary_CpuParam) {
        this.primary_Cpu = primary_CpuParam;
    }

    @DdlField(Version = "2.0", QualName = "primary-pin", ObjectClass = 1, Level = 1, Structure = 2, Offset = 10, ElementSize = 2, IdentifierElement = 6)
    public short getPrimary_Pin() {
        return primary_Pin;
    }

    public void setPrimary_Pin(short primary_PinParam) {
        this.primary_Pin = primary_PinParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-count", ObjectClass = 1, Level = 1, Structure = 2, Offset = 12, ElementSize = 2, IdentifierElement = 7)
    public short getQueue_Count() {
        return queue_Count;
    }

    public void setQueue_Count(short queue_CountParam) {
        this.queue_Count = queue_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-state", ObjectClass = 1, Level = 1, Structure = 2, Offset = 14, ElementSize = 2, IdentifierElement = 8)
    public short getQueue_State() {
        return queue_State;
    }

    public void setQueue_State(short queue_StateParam) {
        this.queue_State = queue_StateParam;
    }

    @DdlField(Version = "2.0", QualName = "warmbackup-logic", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 9)
    public short getWarmbackup_Logic() {
        return warmbackup_Logic;
    }

    public void setWarmbackup_Logic(short warmbackup_LogicParam) {
        this.warmbackup_Logic = warmbackup_LogicParam;
    }

    @DdlField(Version = "2.0", QualName = "pri-phandle", ObjectClass = 1, Level = 1, Structure = 2, Offset = 18, ElementSize = 2, IdentifierElement = 10, OccursMax = 10)
    public short[] getPri_Phandle() {
        return pri_Phandle;
    }

    @DdlField(Version = "2.0", QualName = "pri-phandle", ObjectClass = 1, Level = 1, Structure = 2, Offset = 18, ElementSize = 2, IdentifierElement = 10, OccursMax = 10)
    public short getPri_Phandle(int index) {
        return (pri_Phandle[index]);
    }

    public void setPri_Phandle(short[] pri_PhandleParam) {
        this.pri_Phandle = pri_PhandleParam;
    }

    public void setPri_Phandle(int index, short pri_PhandleParam) {
        this.pri_Phandle[index]=pri_PhandleParam;
    }

    @DdlField(Version = "2.0", QualName = "bkup-phandle", ObjectClass = 1, Level = 1, Structure = 2, Offset = 38, ElementSize = 2, IdentifierElement = 11, OccursMax = 10)
    public short[] getBkup_Phandle() {
        return bkup_Phandle;
    }

    @DdlField(Version = "2.0", QualName = "bkup-phandle", ObjectClass = 1, Level = 1, Structure = 2, Offset = 38, ElementSize = 2, IdentifierElement = 11, OccursMax = 10)
    public short getBkup_Phandle(int index) {
        return (bkup_Phandle[index]);
    }

    public void setBkup_Phandle(short[] bkup_PhandleParam) {
        this.bkup_Phandle = bkup_PhandleParam;
    }

    public void setBkup_Phandle(int index, short bkup_PhandleParam) {
        this.bkup_Phandle[index]=bkup_PhandleParam;
    }

    @DdlField(Version = "2.0", QualName = "queue-count32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 58, ElementSize = 4, IdentifierElement = 12)
    public int getQueue_Count32() {
        return queue_Count32;
    }

    public void setQueue_Count32(int queue_Count32Param) {
        this.queue_Count32 = queue_Count32Param;
    }

    @DdlField(Version = "2.0", QualName = "payload-mgt-ind", ObjectClass = 1, Level = 1, Structure = 2, Offset = 62, ElementSize = 2, IdentifierElement = 13)
    public short getPayload_Mgt_Ind() {
        return payload_Mgt_Ind;
    }

    public void setPayload_Mgt_Ind(short payload_Mgt_IndParam) {
        this.payload_Mgt_Ind = payload_Mgt_IndParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-status", ObjectClass = 1, Level = 1, Structure = 2, Offset = 64, ElementSize = 2, IdentifierElement = 14)
    public short getSync_Status() {
        return sync_Status;
    }

    public void setSync_Status(short sync_StatusParam) {
        this.sync_Status = sync_StatusParam;
    }

    @DdlField(Version = "2.0", QualName = "sync-dest", ObjectClass = 1, Level = 1, Structure = 0, Offset = 66, ElementSize = 16, IdentifierElement = 15)
    public String getSync_Dest() {
        return sync_Dest;
    }

    public void setSync_Dest(String sync_DestParam) {
        this.sync_Dest = sync_DestParam;
    }

}
