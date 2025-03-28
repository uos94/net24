
package kr.co.kcs.oncf.ncp_node;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "audadd", ElementSize = 122, LocalName = "audadd")
public class Audadd
    implements Serializable
{

    private String audit_File_Name_A;
    private String audit_File_Name_B;
    private String audit_File_Name_C;
    private String fillrr_2;
    private short audit_Extent_Size;
    private short audit_Lin_Stats;
    private short audit_Sta_Stats;
    private short audit;
    private short audwait;
    private short audmaxextents;
    private short auderraction;
    private short real_Time_Aud;

    @DdlField(Version = "2.0", QualName = "audit-file-name-a", ObjectClass = 1, Level = 2, Structure = 0, Offset = 926, ElementSize = 35, IdentifierElement = 75)
    public String getAudit_File_Name_A() {
        return audit_File_Name_A;
    }

    public void setAudit_File_Name_A(String audit_File_Name_AParam) {
        this.audit_File_Name_A = audit_File_Name_AParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-file-name-b", ObjectClass = 1, Level = 2, Structure = 0, Offset = 961, ElementSize = 35, IdentifierElement = 76)
    public String getAudit_File_Name_B() {
        return audit_File_Name_B;
    }

    public void setAudit_File_Name_B(String audit_File_Name_BParam) {
        this.audit_File_Name_B = audit_File_Name_BParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-file-name-c", ObjectClass = 1, Level = 2, Structure = 0, Offset = 996, ElementSize = 35, IdentifierElement = 77)
    public String getAudit_File_Name_C() {
        return audit_File_Name_C;
    }

    public void setAudit_File_Name_C(String audit_File_Name_CParam) {
        this.audit_File_Name_C = audit_File_Name_CParam;
    }

    @DdlField(Version = "2.0", QualName = "fillrr-2", ObjectClass = 1, Level = 2, Structure = 0, Offset = 1031, ElementSize = 1, IdentifierElement = 78)
    public String getFillrr_2() {
        return fillrr_2;
    }

    public void setFillrr_2(String fillrr_2Param) {
        this.fillrr_2 = fillrr_2Param;
    }

    @DdlField(Version = "2.0", QualName = "audit-extent-size", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1032, ElementSize = 2, IdentifierElement = 79)
    public short getAudit_Extent_Size() {
        return audit_Extent_Size;
    }

    public void setAudit_Extent_Size(short audit_Extent_SizeParam) {
        this.audit_Extent_Size = audit_Extent_SizeParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-lin-stats", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1034, ElementSize = 2, IdentifierElement = 80)
    public short getAudit_Lin_Stats() {
        return audit_Lin_Stats;
    }

    public void setAudit_Lin_Stats(short audit_Lin_StatsParam) {
        this.audit_Lin_Stats = audit_Lin_StatsParam;
    }

    @DdlField(Version = "2.0", QualName = "audit-sta-stats", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1036, ElementSize = 2, IdentifierElement = 81)
    public short getAudit_Sta_Stats() {
        return audit_Sta_Stats;
    }

    public void setAudit_Sta_Stats(short audit_Sta_StatsParam) {
        this.audit_Sta_Stats = audit_Sta_StatsParam;
    }

    @DdlField(Version = "2.0", QualName = "audit", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1038, ElementSize = 2, IdentifierElement = 82)
    public short getAudit() {
        return audit;
    }

    public void setAudit(short auditParam) {
        this.audit = auditParam;
    }

    @DdlField(Version = "2.0", QualName = "audwait", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1040, ElementSize = 2, IdentifierElement = 83)
    public short getAudwait() {
        return audwait;
    }

    public void setAudwait(short audwaitParam) {
        this.audwait = audwaitParam;
    }

    @DdlField(Version = "2.0", QualName = "audmaxextents", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1042, ElementSize = 2, IdentifierElement = 84)
    public short getAudmaxextents() {
        return audmaxextents;
    }

    public void setAudmaxextents(short audmaxextentsParam) {
        this.audmaxextents = audmaxextentsParam;
    }

    @DdlField(Version = "2.0", QualName = "auderraction", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1044, ElementSize = 2, IdentifierElement = 85)
    public short getAuderraction() {
        return auderraction;
    }

    public void setAuderraction(short auderractionParam) {
        this.auderraction = auderractionParam;
    }

    @DdlField(Version = "2.0", QualName = "real-time-aud", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1046, ElementSize = 2, IdentifierElement = 86)
    public short getReal_Time_Aud() {
        return real_Time_Aud;
    }

    public void setReal_Time_Aud(short real_Time_AudParam) {
        this.real_Time_Aud = real_Time_AudParam;
    }

}
