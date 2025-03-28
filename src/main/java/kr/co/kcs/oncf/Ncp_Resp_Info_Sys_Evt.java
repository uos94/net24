
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_info_sys_evt.Evt_AbnormalMarker;
import kr.co.kcs.oncf.ncp_resp_info_sys_evt.Evt_AvailMarker;
import kr.co.kcs.oncf.ncp_resp_info_sys_evt.Evt_DebugMarker;
import kr.co.kcs.oncf.ncp_resp_info_sys_evt.Evt_DiagMarker;
import kr.co.kcs.oncf.ncp_resp_info_sys_evt.Evt_InfoMarker;
import kr.co.kcs.oncf.ncp_resp_info_sys_evt.Evt_OtherMarker;
import kr.co.kcs.oncf.ncp_resp_info_sys_evt.Evt_ThresholdMarker;
import kr.co.kcs.oncf.ncp_resp_info_sys_evt.Evt_UnavailMarker;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-info-sys-evt", ElementSize = 96, LocalName = "ncp-resp-info-sys-evt")
public class Ncp_Resp_Info_Sys_Evt
    implements Serializable
{

    private Evt_AbnormalMarker evt_Abnormal;
    private Evt_AvailMarker evt_Avail;
    private Evt_DebugMarker evt_Debug;
    private Evt_DiagMarker evt_Diag;
    private Evt_InfoMarker evt_Info;
    private short evt_Linsupp;
    private Evt_OtherMarker evt_Other;
    private Evt_ThresholdMarker evt_Threshold;
    private Evt_UnavailMarker evt_Unavail;
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

    @DdlField(Version = "2.0", QualName = "evt-abnormal", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_info_sys_evt.Evt_Abnormal")
    public Evt_AbnormalMarker getEvt_Abnormal() {
        return evt_Abnormal;
    }

    public void setEvt_Abnormal(Evt_AbnormalMarker evt_AbnormalParam) {
        this.evt_Abnormal = evt_AbnormalParam;
    }

    @DdlField(Version = "2.0", QualName = "evt-avail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 3)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_info_sys_evt.Evt_Avail")
    public Evt_AvailMarker getEvt_Avail() {
        return evt_Avail;
    }

    public void setEvt_Avail(Evt_AvailMarker evt_AvailParam) {
        this.evt_Avail = evt_AvailParam;
    }

    @DdlField(Version = "2.0", QualName = "evt-debug", ObjectClass = 1, Level = 1, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 5)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_info_sys_evt.Evt_Debug")
    public Evt_DebugMarker getEvt_Debug() {
        return evt_Debug;
    }

    public void setEvt_Debug(Evt_DebugMarker evt_DebugParam) {
        this.evt_Debug = evt_DebugParam;
    }

    @DdlField(Version = "2.0", QualName = "evt-diag", ObjectClass = 1, Level = 1, Structure = 2, Offset = 6, ElementSize = 2, IdentifierElement = 7)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_info_sys_evt.Evt_Diag")
    public Evt_DiagMarker getEvt_Diag() {
        return evt_Diag;
    }

    public void setEvt_Diag(Evt_DiagMarker evt_DiagParam) {
        this.evt_Diag = evt_DiagParam;
    }

    @DdlField(Version = "2.0", QualName = "evt-info", ObjectClass = 1, Level = 1, Structure = 2, Offset = 8, ElementSize = 2, IdentifierElement = 9)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_info_sys_evt.Evt_Info")
    public Evt_InfoMarker getEvt_Info() {
        return evt_Info;
    }

    public void setEvt_Info(Evt_InfoMarker evt_InfoParam) {
        this.evt_Info = evt_InfoParam;
    }

    @DdlField(Version = "2.0", QualName = "evt-linsupp", ObjectClass = 1, Level = 1, Structure = 2, Offset = 10, ElementSize = 2, IdentifierElement = 11)
    public short getEvt_Linsupp() {
        return evt_Linsupp;
    }

    public void setEvt_Linsupp(short evt_LinsuppParam) {
        this.evt_Linsupp = evt_LinsuppParam;
    }

    @DdlField(Version = "2.0", QualName = "evt-other", ObjectClass = 1, Level = 1, Structure = 2, Offset = 12, ElementSize = 2, IdentifierElement = 12)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_info_sys_evt.Evt_Other")
    public Evt_OtherMarker getEvt_Other() {
        return evt_Other;
    }

    public void setEvt_Other(Evt_OtherMarker evt_OtherParam) {
        this.evt_Other = evt_OtherParam;
    }

    @DdlField(Version = "2.0", QualName = "evt-threshold", ObjectClass = 1, Level = 1, Structure = 2, Offset = 14, ElementSize = 2, IdentifierElement = 14)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_info_sys_evt.Evt_Threshold")
    public Evt_ThresholdMarker getEvt_Threshold() {
        return evt_Threshold;
    }

    public void setEvt_Threshold(Evt_ThresholdMarker evt_ThresholdParam) {
        this.evt_Threshold = evt_ThresholdParam;
    }

    @DdlField(Version = "2.0", QualName = "evt-unavail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 16)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_info_sys_evt.Evt_Unavail")
    public Evt_UnavailMarker getEvt_Unavail() {
        return evt_Unavail;
    }

    public void setEvt_Unavail(Evt_UnavailMarker evt_UnavailParam) {
        this.evt_Unavail = evt_UnavailParam;
    }

    @DdlField(Version = "2.0", QualName = "node-conf", ObjectClass = 1, Level = 1, Structure = 2, Offset = 18, ElementSize = 2, IdentifierElement = 18)
    public short getNode_Conf() {
        return node_Conf;
    }

    public void setNode_Conf(short node_ConfParam) {
        this.node_Conf = node_ConfParam;
    }

    @DdlField(Version = "2.0", QualName = "pro-abnormal", ObjectClass = 1, Level = 1, Structure = 2, Offset = 20, ElementSize = 2, IdentifierElement = 19)
    public short getPro_Abnormal() {
        return pro_Abnormal;
    }

    public void setPro_Abnormal(short pro_AbnormalParam) {
        this.pro_Abnormal = pro_AbnormalParam;
    }

    @DdlField(Version = "2.0", QualName = "pro-avail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 22, ElementSize = 2, IdentifierElement = 20)
    public short getPro_Avail() {
        return pro_Avail;
    }

    public void setPro_Avail(short pro_AvailParam) {
        this.pro_Avail = pro_AvailParam;
    }

    @DdlField(Version = "2.0", QualName = "pro-conf", ObjectClass = 1, Level = 1, Structure = 2, Offset = 24, ElementSize = 2, IdentifierElement = 21)
    public short getPro_Conf() {
        return pro_Conf;
    }

    public void setPro_Conf(short pro_ConfParam) {
        this.pro_Conf = pro_ConfParam;
    }

    @DdlField(Version = "2.0", QualName = "pro-debug", ObjectClass = 1, Level = 1, Structure = 2, Offset = 26, ElementSize = 2, IdentifierElement = 22)
    public short getPro_Debug() {
        return pro_Debug;
    }

    public void setPro_Debug(short pro_DebugParam) {
        this.pro_Debug = pro_DebugParam;
    }

    @DdlField(Version = "2.0", QualName = "pro-diag", ObjectClass = 1, Level = 1, Structure = 2, Offset = 28, ElementSize = 2, IdentifierElement = 23)
    public short getPro_Diag() {
        return pro_Diag;
    }

    public void setPro_Diag(short pro_DiagParam) {
        this.pro_Diag = pro_DiagParam;
    }

    @DdlField(Version = "2.0", QualName = "pro-info", ObjectClass = 1, Level = 1, Structure = 2, Offset = 30, ElementSize = 2, IdentifierElement = 24)
    public short getPro_Info() {
        return pro_Info;
    }

    public void setPro_Info(short pro_InfoParam) {
        this.pro_Info = pro_InfoParam;
    }

    @DdlField(Version = "2.0", QualName = "pro-other", ObjectClass = 1, Level = 1, Structure = 2, Offset = 32, ElementSize = 2, IdentifierElement = 25)
    public short getPro_Other() {
        return pro_Other;
    }

    public void setPro_Other(short pro_OtherParam) {
        this.pro_Other = pro_OtherParam;
    }

    @DdlField(Version = "2.0", QualName = "pro-threshold", ObjectClass = 1, Level = 1, Structure = 2, Offset = 34, ElementSize = 2, IdentifierElement = 26)
    public short getPro_Threshold() {
        return pro_Threshold;
    }

    public void setPro_Threshold(short pro_ThresholdParam) {
        this.pro_Threshold = pro_ThresholdParam;
    }

    @DdlField(Version = "2.0", QualName = "pro-unavail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 36, ElementSize = 2, IdentifierElement = 27)
    public short getPro_Unavail() {
        return pro_Unavail;
    }

    public void setPro_Unavail(short pro_UnavailParam) {
        this.pro_Unavail = pro_UnavailParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-abnormal", ObjectClass = 1, Level = 1, Structure = 2, Offset = 38, ElementSize = 2, IdentifierElement = 28)
    public short getSta_Abnormal() {
        return sta_Abnormal;
    }

    public void setSta_Abnormal(short sta_AbnormalParam) {
        this.sta_Abnormal = sta_AbnormalParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-avail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 40, ElementSize = 2, IdentifierElement = 29)
    public short getSta_Avail() {
        return sta_Avail;
    }

    public void setSta_Avail(short sta_AvailParam) {
        this.sta_Avail = sta_AvailParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-conf", ObjectClass = 1, Level = 1, Structure = 2, Offset = 42, ElementSize = 2, IdentifierElement = 30)
    public short getSta_Conf() {
        return sta_Conf;
    }

    public void setSta_Conf(short sta_ConfParam) {
        this.sta_Conf = sta_ConfParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-debug", ObjectClass = 1, Level = 1, Structure = 2, Offset = 44, ElementSize = 2, IdentifierElement = 31)
    public short getSta_Debug() {
        return sta_Debug;
    }

    public void setSta_Debug(short sta_DebugParam) {
        this.sta_Debug = sta_DebugParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-diag", ObjectClass = 1, Level = 1, Structure = 2, Offset = 46, ElementSize = 2, IdentifierElement = 32)
    public short getSta_Diag() {
        return sta_Diag;
    }

    public void setSta_Diag(short sta_DiagParam) {
        this.sta_Diag = sta_DiagParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-info", ObjectClass = 1, Level = 1, Structure = 2, Offset = 48, ElementSize = 2, IdentifierElement = 33)
    public short getSta_Info() {
        return sta_Info;
    }

    public void setSta_Info(short sta_InfoParam) {
        this.sta_Info = sta_InfoParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-other", ObjectClass = 1, Level = 1, Structure = 2, Offset = 50, ElementSize = 2, IdentifierElement = 34)
    public short getSta_Other() {
        return sta_Other;
    }

    public void setSta_Other(short sta_OtherParam) {
        this.sta_Other = sta_OtherParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-suspended", ObjectClass = 1, Level = 1, Structure = 2, Offset = 52, ElementSize = 2, IdentifierElement = 35)
    public short getSta_Suspended() {
        return sta_Suspended;
    }

    public void setSta_Suspended(short sta_SuspendedParam) {
        this.sta_Suspended = sta_SuspendedParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-threshold", ObjectClass = 1, Level = 1, Structure = 2, Offset = 54, ElementSize = 2, IdentifierElement = 36)
    public short getSta_Threshold() {
        return sta_Threshold;
    }

    public void setSta_Threshold(short sta_ThresholdParam) {
        this.sta_Threshold = sta_ThresholdParam;
    }

    @DdlField(Version = "2.0", QualName = "sta-unavail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 56, ElementSize = 2, IdentifierElement = 37)
    public short getSta_Unavail() {
        return sta_Unavail;
    }

    public void setSta_Unavail(short sta_UnavailParam) {
        this.sta_Unavail = sta_UnavailParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-abnormal", ObjectClass = 1, Level = 1, Structure = 2, Offset = 58, ElementSize = 2, IdentifierElement = 38)
    public short getLin_Abnormal() {
        return lin_Abnormal;
    }

    public void setLin_Abnormal(short lin_AbnormalParam) {
        this.lin_Abnormal = lin_AbnormalParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-avail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 60, ElementSize = 2, IdentifierElement = 39)
    public short getLin_Avail() {
        return lin_Avail;
    }

    public void setLin_Avail(short lin_AvailParam) {
        this.lin_Avail = lin_AvailParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-conf", ObjectClass = 1, Level = 1, Structure = 2, Offset = 62, ElementSize = 2, IdentifierElement = 40)
    public short getLin_Conf() {
        return lin_Conf;
    }

    public void setLin_Conf(short lin_ConfParam) {
        this.lin_Conf = lin_ConfParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-debug", ObjectClass = 1, Level = 1, Structure = 2, Offset = 64, ElementSize = 2, IdentifierElement = 41)
    public short getLin_Debug() {
        return lin_Debug;
    }

    public void setLin_Debug(short lin_DebugParam) {
        this.lin_Debug = lin_DebugParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-diag", ObjectClass = 1, Level = 1, Structure = 2, Offset = 66, ElementSize = 2, IdentifierElement = 42)
    public short getLin_Diag() {
        return lin_Diag;
    }

    public void setLin_Diag(short lin_DiagParam) {
        this.lin_Diag = lin_DiagParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-info", ObjectClass = 1, Level = 1, Structure = 2, Offset = 68, ElementSize = 2, IdentifierElement = 43)
    public short getLin_Info() {
        return lin_Info;
    }

    public void setLin_Info(short lin_InfoParam) {
        this.lin_Info = lin_InfoParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-other", ObjectClass = 1, Level = 1, Structure = 2, Offset = 70, ElementSize = 2, IdentifierElement = 44)
    public short getLin_Other() {
        return lin_Other;
    }

    public void setLin_Other(short lin_OtherParam) {
        this.lin_Other = lin_OtherParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-supp", ObjectClass = 1, Level = 1, Structure = 2, Offset = 72, ElementSize = 2, IdentifierElement = 45)
    public short getLin_Supp() {
        return lin_Supp;
    }

    public void setLin_Supp(short lin_SuppParam) {
        this.lin_Supp = lin_SuppParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-threshold", ObjectClass = 1, Level = 1, Structure = 2, Offset = 74, ElementSize = 2, IdentifierElement = 46)
    public short getLin_Threshold() {
        return lin_Threshold;
    }

    public void setLin_Threshold(short lin_ThresholdParam) {
        this.lin_Threshold = lin_ThresholdParam;
    }

    @DdlField(Version = "2.0", QualName = "lin-unavail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 76, ElementSize = 2, IdentifierElement = 47)
    public short getLin_Unavail() {
        return lin_Unavail;
    }

    public void setLin_Unavail(short lin_UnavailParam) {
        this.lin_Unavail = lin_UnavailParam;
    }

    @DdlField(Version = "2.0", QualName = "lnk-abnormal", ObjectClass = 1, Level = 1, Structure = 2, Offset = 78, ElementSize = 2, IdentifierElement = 48)
    public short getLnk_Abnormal() {
        return lnk_Abnormal;
    }

    public void setLnk_Abnormal(short lnk_AbnormalParam) {
        this.lnk_Abnormal = lnk_AbnormalParam;
    }

    @DdlField(Version = "2.0", QualName = "lnk-avail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 80, ElementSize = 2, IdentifierElement = 49)
    public short getLnk_Avail() {
        return lnk_Avail;
    }

    public void setLnk_Avail(short lnk_AvailParam) {
        this.lnk_Avail = lnk_AvailParam;
    }

    @DdlField(Version = "2.0", QualName = "lnk-conf", ObjectClass = 1, Level = 1, Structure = 2, Offset = 82, ElementSize = 2, IdentifierElement = 50)
    public short getLnk_Conf() {
        return lnk_Conf;
    }

    public void setLnk_Conf(short lnk_ConfParam) {
        this.lnk_Conf = lnk_ConfParam;
    }

    @DdlField(Version = "2.0", QualName = "lnk-debug", ObjectClass = 1, Level = 1, Structure = 2, Offset = 84, ElementSize = 2, IdentifierElement = 51)
    public short getLnk_Debug() {
        return lnk_Debug;
    }

    public void setLnk_Debug(short lnk_DebugParam) {
        this.lnk_Debug = lnk_DebugParam;
    }

    @DdlField(Version = "2.0", QualName = "lnk-diag", ObjectClass = 1, Level = 1, Structure = 2, Offset = 86, ElementSize = 2, IdentifierElement = 52)
    public short getLnk_Diag() {
        return lnk_Diag;
    }

    public void setLnk_Diag(short lnk_DiagParam) {
        this.lnk_Diag = lnk_DiagParam;
    }

    @DdlField(Version = "2.0", QualName = "lnk-info", ObjectClass = 1, Level = 1, Structure = 2, Offset = 88, ElementSize = 2, IdentifierElement = 53)
    public short getLnk_Info() {
        return lnk_Info;
    }

    public void setLnk_Info(short lnk_InfoParam) {
        this.lnk_Info = lnk_InfoParam;
    }

    @DdlField(Version = "2.0", QualName = "lnk-other", ObjectClass = 1, Level = 1, Structure = 2, Offset = 90, ElementSize = 2, IdentifierElement = 54)
    public short getLnk_Other() {
        return lnk_Other;
    }

    public void setLnk_Other(short lnk_OtherParam) {
        this.lnk_Other = lnk_OtherParam;
    }

    @DdlField(Version = "2.0", QualName = "lnk-threshold", ObjectClass = 1, Level = 1, Structure = 2, Offset = 92, ElementSize = 2, IdentifierElement = 55)
    public short getLnk_Threshold() {
        return lnk_Threshold;
    }

    public void setLnk_Threshold(short lnk_ThresholdParam) {
        this.lnk_Threshold = lnk_ThresholdParam;
    }

    @DdlField(Version = "2.0", QualName = "lnk-unavail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 94, ElementSize = 2, IdentifierElement = 56)
    public short getLnk_Unavail() {
        return lnk_Unavail;
    }

    public void setLnk_Unavail(short lnk_UnavailParam) {
        this.lnk_Unavail = lnk_UnavailParam;
    }

}
