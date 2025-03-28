
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-info-sys-aud", ElementSize = 126, LocalName = "ncp-resp-info-sys-aud")
public class Ncp_Resp_Info_Sys_Aud
    implements Serializable
{

    private short audit_Extent_Size;
    private String audit_File_Name_A;
    private String audit_File_Name_B;
    private short audit_Lin_Stats;
    private short audit_Sta_Stats;
    private short disk_Character_Blocking;
    private short disk_Record_Blocking;
    private short tape_Character_Blocking;
    private short tape_Record_Blocking;
    private String audit_File_Name_C;
    private short audit;
    private short audwait;
    private short audmaxextents;
    private short auderraction;
    private short real_Time_Aud;

    @DdlField(Version = "2.0", QualName = "audit-extent-size", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getAudit_Extent_Size() {
        return audit_Extent_Size;
    }

    public void setAudit_Extent_Size(short audit_Extent_SizeParam) {
        this.audit_Extent_Size = audit_Extent_SizeParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-file-name-a", ObjectClass = 1, Level = 1, Structure = 0, Offset = 2, ElementSize = 34, IdentifierElement = 2)
    public String getAudit_File_Name_A() {
        return audit_File_Name_A;
    }

    public void setAudit_File_Name_A(String audit_File_Name_AParam) {
        this.audit_File_Name_A = audit_File_Name_AParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-file-name-b", ObjectClass = 1, Level = 1, Structure = 0, Offset = 36, ElementSize = 34, IdentifierElement = 3)
    public String getAudit_File_Name_B() {
        return audit_File_Name_B;
    }

    public void setAudit_File_Name_B(String audit_File_Name_BParam) {
        this.audit_File_Name_B = audit_File_Name_BParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-lin-stats", ObjectClass = 1, Level = 1, Structure = 2, Offset = 70, ElementSize = 2, IdentifierElement = 4)
    public short getAudit_Lin_Stats() {
        return audit_Lin_Stats;
    }

    public void setAudit_Lin_Stats(short audit_Lin_StatsParam) {
        this.audit_Lin_Stats = audit_Lin_StatsParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-sta-stats", ObjectClass = 1, Level = 1, Structure = 2, Offset = 72, ElementSize = 2, IdentifierElement = 5)
    public short getAudit_Sta_Stats() {
        return audit_Sta_Stats;
    }

    public void setAudit_Sta_Stats(short audit_Sta_StatsParam) {
        this.audit_Sta_Stats = audit_Sta_StatsParam;
    }

    @DdlField(Version = "2.0", QualName = "disk-character-blocking", ObjectClass = 1, Level = 1, Structure = 2, Offset = 74, ElementSize = 2, IdentifierElement = 6)
    public short getDisk_Character_Blocking() {
        return disk_Character_Blocking;
    }

    public void setDisk_Character_Blocking(short disk_Character_BlockingParam) {
        this.disk_Character_Blocking = disk_Character_BlockingParam;
    }

    @DdlField(Version = "2.0", QualName = "disk-record-blocking", ObjectClass = 1, Level = 1, Structure = 2, Offset = 76, ElementSize = 2, IdentifierElement = 7)
    public short getDisk_Record_Blocking() {
        return disk_Record_Blocking;
    }

    public void setDisk_Record_Blocking(short disk_Record_BlockingParam) {
        this.disk_Record_Blocking = disk_Record_BlockingParam;
    }

    @DdlField(Version = "2.0", QualName = "tape-character-blocking", ObjectClass = 1, Level = 1, Structure = 2, Offset = 78, ElementSize = 2, IdentifierElement = 8)
    public short getTape_Character_Blocking() {
        return tape_Character_Blocking;
    }

    public void setTape_Character_Blocking(short tape_Character_BlockingParam) {
        this.tape_Character_Blocking = tape_Character_BlockingParam;
    }

    @DdlField(Version = "2.0", QualName = "tape-record-blocking", ObjectClass = 1, Level = 1, Structure = 2, Offset = 80, ElementSize = 2, IdentifierElement = 9)
    public short getTape_Record_Blocking() {
        return tape_Record_Blocking;
    }

    public void setTape_Record_Blocking(short tape_Record_BlockingParam) {
        this.tape_Record_Blocking = tape_Record_BlockingParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-file-name-c", ObjectClass = 1, Level = 1, Structure = 0, Offset = 82, ElementSize = 34, IdentifierElement = 10)
    public String getAudit_File_Name_C() {
        return audit_File_Name_C;
    }

    public void setAudit_File_Name_C(String audit_File_Name_CParam) {
        this.audit_File_Name_C = audit_File_Name_CParam;
    }

    @DdlField(Version = "2.0", QualName = "audit", ObjectClass = 1, Level = 1, Structure = 2, Offset = 116, ElementSize = 2, IdentifierElement = 11)
    public short getAudit() {
        return audit;
    }

    public void setAudit(short auditParam) {
        this.audit = auditParam;
    }

    @DdlField(Version = "2.0", QualName = "audwait", ObjectClass = 1, Level = 1, Structure = 2, Offset = 118, ElementSize = 2, IdentifierElement = 12)
    public short getAudwait() {
        return audwait;
    }

    public void setAudwait(short audwaitParam) {
        this.audwait = audwaitParam;
    }

    @DdlField(Version = "2.0", QualName = "audmaxextents", ObjectClass = 1, Level = 1, Structure = 2, Offset = 120, ElementSize = 2, IdentifierElement = 13)
    public short getAudmaxextents() {
        return audmaxextents;
    }

    public void setAudmaxextents(short audmaxextentsParam) {
        this.audmaxextents = audmaxextentsParam;
    }

    @DdlField(Version = "2.0", QualName = "auderraction", ObjectClass = 1, Level = 1, Structure = 2, Offset = 122, ElementSize = 2, IdentifierElement = 14)
    public short getAuderraction() {
        return auderraction;
    }

    public void setAuderraction(short auderractionParam) {
        this.auderraction = auderractionParam;
    }

    @DdlField(Version = "2.0", QualName = "real-time-aud", ObjectClass = 1, Level = 1, Structure = 2, Offset = 124, ElementSize = 2, IdentifierElement = 15)
    public short getReal_Time_Aud() {
        return real_Time_Aud;
    }

    public void setReal_Time_Aud(short real_Time_AudParam) {
        this.real_Time_Aud = real_Time_AudParam;
    }

}
