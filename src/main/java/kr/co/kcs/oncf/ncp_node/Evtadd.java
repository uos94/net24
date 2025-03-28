
package kr.co.kcs.oncf.ncp_node;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "evtadd", ElementSize = 94, LocalName = "evtadd")
public class Evtadd
    implements Serializable
{

    private short node_Abnormal;
    private short node_Avail;
    private short node_Debug;
    private short node_Diag;
    private short node_Info;
    private short node_Other;
    private short node_Threshold;
    private short node_Unavail;
    private short node_Conf;
    private short pro_Abnormal;
    private short pro_Avail;
    private short pro_Conf;
    private short pro_Debug;
    private short pro_Diag;
    private short pro_Info;
    private short pro_Other;
    private short pro_Threshold;
    private short pro_Unavail;
    private short sta_Abnormal;
    private short sta_Avail;
    private short sta_Conf;
    private short sta_Debug;
    private short sta_Diag;
    private short sta_Info;
    private short sta_Other;
    private short sta_Suspended;
    private short sta_Threshold;
    private short sta_Unavail;
    private short lin_Abnormal;
    private short lin_Avail;
    private short lin_Conf;
    private short lin_Debug;
    private short lin_Diag;
    private short lin_Info;
    private short lin_Other;
    private short lin_Supp;
    private short lin_Threshold;
    private short lin_Unavail;
    private short lnk_Abnormal;
    private short lnk_Avail;
    private short lnk_Conf;
    private short lnk_Debug;
    private short lnk_Diag;
    private short lnk_Info;
    private short lnk_Other;
    private short lnk_Threshold;
    private short lnk_Unavail;

    @DdlField(Version = "2.0", QualName = "node-abnormal", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1048, ElementSize = 2, IdentifierElement = 88)
    public short getNode_Abnormal() {
        return node_Abnormal;
    }

    public void setNode_Abnormal(short node_AbnormalParam) {
        this.node_Abnormal = node_AbnormalParam;
    }

    @DdlField(Version = "2.0", QualName = "node-avail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1050, ElementSize = 2, IdentifierElement = 89)
    public short getNode_Avail() {
        return node_Avail;
    }

    public void setNode_Avail(short node_AvailParam) {
        this.node_Avail = node_AvailParam;
    }

    @DdlField(Version = "2.0", QualName = "node-debug", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1052, ElementSize = 2, IdentifierElement = 90)
    public short getNode_Debug() {
        return node_Debug;
    }

    public void setNode_Debug(short node_DebugParam) {
        this.node_Debug = node_DebugParam;
    }

    @DdlField(Version = "2.0", QualName = "node-diag", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1054, ElementSize = 2, IdentifierElement = 91)
    public short getNode_Diag() {
        return node_Diag;
    }

    public void setNode_Diag(short node_DiagParam) {
        this.node_Diag = node_DiagParam;
    }

    @DdlField(Version = "2.0", QualName = "node-info", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1056, ElementSize = 2, IdentifierElement = 92)
    public short getNode_Info() {
        return node_Info;
    }

    public void setNode_Info(short node_InfoParam) {
        this.node_Info = node_InfoParam;
    }

    @DdlField(Version = "2.0", QualName = "node-other", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1058, ElementSize = 2, IdentifierElement = 93)
    public short getNode_Other() {
        return node_Other;
    }

    public void setNode_Other(short node_OtherParam) {
        this.node_Other = node_OtherParam;
    }

    @DdlField(Version = "2.0", QualName = "node-threshold", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1060, ElementSize = 2, IdentifierElement = 94)
    public short getNode_Threshold() {
        return node_Threshold;
    }

    public void setNode_Threshold(short node_ThresholdParam) {
        this.node_Threshold = node_ThresholdParam;
    }

    @DdlField(Version = "2.0", QualName = "node-unavail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1062, ElementSize = 2, IdentifierElement = 95)
    public short getNode_Unavail() {
        return node_Unavail;
    }

    public void setNode_Unavail(short node_UnavailParam) {
        this.node_Unavail = node_UnavailParam;
    }

    @DdlField(Version = "2.0", QualName = "node-conf", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1064, ElementSize = 2, IdentifierElement = 96)
    public short getNode_Conf() {
        return node_Conf;
    }

    public void setNode_Conf(short node_ConfParam) {
        this.node_Conf = node_ConfParam;
    }

    @DdlField(Version = "2.0", QualName = "pro-abnormal", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1066, ElementSize = 2, IdentifierElement = 97)
    public short getPro_Abnormal() {
        return pro_Abnormal;
    }

    public void setPro_Abnormal(short pro_AbnormalParam) {
        this.pro_Abnormal = pro_AbnormalParam;
    }

    @DdlField(Version = "2.0", QualName = "pro-avail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1068, ElementSize = 2, IdentifierElement = 98)
    public short getPro_Avail() {
        return pro_Avail;
    }

    public void setPro_Avail(short pro_AvailParam) {
        this.pro_Avail = pro_AvailParam;
    }

    @DdlField(Version = "2.0", QualName = "pro-conf", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1070, ElementSize = 2, IdentifierElement = 99)
    public short getPro_Conf() {
        return pro_Conf;
    }

    public void setPro_Conf(short pro_ConfParam) {
        this.pro_Conf = pro_ConfParam;
    }

    @DdlField(Version = "2.0", QualName = "pro-debug", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1072, ElementSize = 2, IdentifierElement = 100)
    public short getPro_Debug() {
        return pro_Debug;
    }

    public void setPro_Debug(short pro_DebugParam) {
        this.pro_Debug = pro_DebugParam;
    }

    @DdlField(Version = "2.0", QualName = "pro-diag", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1074, ElementSize = 2, IdentifierElement = 101)
    public short getPro_Diag() {
        return pro_Diag;
    }

    public void setPro_Diag(short pro_DiagParam) {
        this.pro_Diag = pro_DiagParam;
    }

    @DdlField(Version = "2.0", QualName = "pro-info", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1076, ElementSize = 2, IdentifierElement = 102)
    public short getPro_Info() {
        return pro_Info;
    }

    public void setPro_Info(short pro_InfoParam) {
        this.pro_Info = pro_InfoParam;
    }

    @DdlField(Version = "2.0", QualName = "pro-other", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1078, ElementSize = 2, IdentifierElement = 103)
    public short getPro_Other() {
        return pro_Other;
    }

    public void setPro_Other(short pro_OtherParam) {
        this.pro_Other = pro_OtherParam;
    }

    @DdlField(Version = "2.0", QualName = "pro-threshold", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1080, ElementSize = 2, IdentifierElement = 104)
    public short getPro_Threshold() {
        return pro_Threshold;
    }

    public void setPro_Threshold(short pro_ThresholdParam) {
        this.pro_Threshold = pro_ThresholdParam;
    }

    @DdlField(Version = "2.0", QualName = "pro-unavail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1082, ElementSize = 2, IdentifierElement = 105)
    public short getPro_Unavail() {
        return pro_Unavail;
    }

    public void setPro_Unavail(short pro_UnavailParam) {
        this.pro_Unavail = pro_UnavailParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-abnormal", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1084, ElementSize = 2, IdentifierElement = 106)
    public short getSta_Abnormal() {
        return sta_Abnormal;
    }

    public void setSta_Abnormal(short sta_AbnormalParam) {
        this.sta_Abnormal = sta_AbnormalParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-avail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1086, ElementSize = 2, IdentifierElement = 107)
    public short getSta_Avail() {
        return sta_Avail;
    }

    public void setSta_Avail(short sta_AvailParam) {
        this.sta_Avail = sta_AvailParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-conf", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1088, ElementSize = 2, IdentifierElement = 108)
    public short getSta_Conf() {
        return sta_Conf;
    }

    public void setSta_Conf(short sta_ConfParam) {
        this.sta_Conf = sta_ConfParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-debug", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1090, ElementSize = 2, IdentifierElement = 109)
    public short getSta_Debug() {
        return sta_Debug;
    }

    public void setSta_Debug(short sta_DebugParam) {
        this.sta_Debug = sta_DebugParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-diag", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1092, ElementSize = 2, IdentifierElement = 110)
    public short getSta_Diag() {
        return sta_Diag;
    }

    public void setSta_Diag(short sta_DiagParam) {
        this.sta_Diag = sta_DiagParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-info", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1094, ElementSize = 2, IdentifierElement = 111)
    public short getSta_Info() {
        return sta_Info;
    }

    public void setSta_Info(short sta_InfoParam) {
        this.sta_Info = sta_InfoParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-other", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1096, ElementSize = 2, IdentifierElement = 112)
    public short getSta_Other() {
        return sta_Other;
    }

    public void setSta_Other(short sta_OtherParam) {
        this.sta_Other = sta_OtherParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-suspended", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1098, ElementSize = 2, IdentifierElement = 113)
    public short getSta_Suspended() {
        return sta_Suspended;
    }

    public void setSta_Suspended(short sta_SuspendedParam) {
        this.sta_Suspended = sta_SuspendedParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-threshold", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1100, ElementSize = 2, IdentifierElement = 114)
    public short getSta_Threshold() {
        return sta_Threshold;
    }

    public void setSta_Threshold(short sta_ThresholdParam) {
        this.sta_Threshold = sta_ThresholdParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-unavail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1102, ElementSize = 2, IdentifierElement = 115)
    public short getSta_Unavail() {
        return sta_Unavail;
    }

    public void setSta_Unavail(short sta_UnavailParam) {
        this.sta_Unavail = sta_UnavailParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-abnormal", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1104, ElementSize = 2, IdentifierElement = 116)
    public short getLin_Abnormal() {
        return lin_Abnormal;
    }

    public void setLin_Abnormal(short lin_AbnormalParam) {
        this.lin_Abnormal = lin_AbnormalParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-avail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1106, ElementSize = 2, IdentifierElement = 117)
    public short getLin_Avail() {
        return lin_Avail;
    }

    public void setLin_Avail(short lin_AvailParam) {
        this.lin_Avail = lin_AvailParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-conf", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1108, ElementSize = 2, IdentifierElement = 118)
    public short getLin_Conf() {
        return lin_Conf;
    }

    public void setLin_Conf(short lin_ConfParam) {
        this.lin_Conf = lin_ConfParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-debug", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1110, ElementSize = 2, IdentifierElement = 119)
    public short getLin_Debug() {
        return lin_Debug;
    }

    public void setLin_Debug(short lin_DebugParam) {
        this.lin_Debug = lin_DebugParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-diag", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1112, ElementSize = 2, IdentifierElement = 120)
    public short getLin_Diag() {
        return lin_Diag;
    }

    public void setLin_Diag(short lin_DiagParam) {
        this.lin_Diag = lin_DiagParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-info", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1114, ElementSize = 2, IdentifierElement = 121)
    public short getLin_Info() {
        return lin_Info;
    }

    public void setLin_Info(short lin_InfoParam) {
        this.lin_Info = lin_InfoParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-other", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1116, ElementSize = 2, IdentifierElement = 122)
    public short getLin_Other() {
        return lin_Other;
    }

    public void setLin_Other(short lin_OtherParam) {
        this.lin_Other = lin_OtherParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-supp", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1118, ElementSize = 2, IdentifierElement = 123)
    public short getLin_Supp() {
        return lin_Supp;
    }

    public void setLin_Supp(short lin_SuppParam) {
        this.lin_Supp = lin_SuppParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-threshold", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1120, ElementSize = 2, IdentifierElement = 124)
    public short getLin_Threshold() {
        return lin_Threshold;
    }

    public void setLin_Threshold(short lin_ThresholdParam) {
        this.lin_Threshold = lin_ThresholdParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-unavail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1122, ElementSize = 2, IdentifierElement = 125)
    public short getLin_Unavail() {
        return lin_Unavail;
    }

    public void setLin_Unavail(short lin_UnavailParam) {
        this.lin_Unavail = lin_UnavailParam;
    }

    @DdlField(Version = "2.0", QualName = "lnk-abnormal", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1124, ElementSize = 2, IdentifierElement = 126)
    public short getLnk_Abnormal() {
        return lnk_Abnormal;
    }

    public void setLnk_Abnormal(short lnk_AbnormalParam) {
        this.lnk_Abnormal = lnk_AbnormalParam;
    }

    @DdlField(Version = "2.0", QualName = "lnk-avail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1126, ElementSize = 2, IdentifierElement = 127)
    public short getLnk_Avail() {
        return lnk_Avail;
    }

    public void setLnk_Avail(short lnk_AvailParam) {
        this.lnk_Avail = lnk_AvailParam;
    }

    @DdlField(Version = "2.0", QualName = "lnk-conf", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1128, ElementSize = 2, IdentifierElement = 128)
    public short getLnk_Conf() {
        return lnk_Conf;
    }

    public void setLnk_Conf(short lnk_ConfParam) {
        this.lnk_Conf = lnk_ConfParam;
    }

    @DdlField(Version = "2.0", QualName = "lnk-debug", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1130, ElementSize = 2, IdentifierElement = 129)
    public short getLnk_Debug() {
        return lnk_Debug;
    }

    public void setLnk_Debug(short lnk_DebugParam) {
        this.lnk_Debug = lnk_DebugParam;
    }

    @DdlField(Version = "2.0", QualName = "lnk-diag", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1132, ElementSize = 2, IdentifierElement = 130)
    public short getLnk_Diag() {
        return lnk_Diag;
    }

    public void setLnk_Diag(short lnk_DiagParam) {
        this.lnk_Diag = lnk_DiagParam;
    }

    @DdlField(Version = "2.0", QualName = "lnk-info", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1134, ElementSize = 2, IdentifierElement = 131)
    public short getLnk_Info() {
        return lnk_Info;
    }

    public void setLnk_Info(short lnk_InfoParam) {
        this.lnk_Info = lnk_InfoParam;
    }

    @DdlField(Version = "2.0", QualName = "lnk-other", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1136, ElementSize = 2, IdentifierElement = 132)
    public short getLnk_Other() {
        return lnk_Other;
    }

    public void setLnk_Other(short lnk_OtherParam) {
        this.lnk_Other = lnk_OtherParam;
    }

    @DdlField(Version = "2.0", QualName = "lnk-threshold", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1138, ElementSize = 2, IdentifierElement = 133)
    public short getLnk_Threshold() {
        return lnk_Threshold;
    }

    public void setLnk_Threshold(short lnk_ThresholdParam) {
        this.lnk_Threshold = lnk_ThresholdParam;
    }

    @DdlField(Version = "2.0", QualName = "lnk-unavail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 1140, ElementSize = 2, IdentifierElement = 134)
    public short getLnk_Unavail() {
        return lnk_Unavail;
    }

    public void setLnk_Unavail(short lnk_UnavailParam) {
        this.lnk_Unavail = lnk_UnavailParam;
    }

}
