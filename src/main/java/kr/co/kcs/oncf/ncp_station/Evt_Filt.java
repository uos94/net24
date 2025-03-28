
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "evt-filt", ElementSize = 32, LocalName = "evt-filt")
public class Evt_Filt
    implements Serializable
{

    private short unavail;
    private short avail;
    private short otherr;
    private short threshold;
    private short debug;
    private short diag;
    private short info;
    private short abnorml;
    private short suspend;
    private short config;
    private String fillrr_040123_1512;

    @DdlField(Version = "2.0", QualName = "unavail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 714, ElementSize = 2, IdentifierElement = 107)
    public short getUnavail() {
        return unavail;
    }

    public void setUnavail(short unavailParam) {
        this.unavail = unavailParam;
    }

    @DdlField(Version = "2.0", QualName = "avail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 716, ElementSize = 2, IdentifierElement = 108)
    public short getAvail() {
        return avail;
    }

    public void setAvail(short availParam) {
        this.avail = availParam;
    }

    @DdlField(Version = "2.0", QualName = "otherr", ObjectClass = 1, Level = 2, Structure = 2, Offset = 718, ElementSize = 2, IdentifierElement = 109)
    public short getOtherr() {
        return otherr;
    }

    public void setOtherr(short otherrParam) {
        this.otherr = otherrParam;
    }

    @DdlField(Version = "2.0", QualName = "threshold", ObjectClass = 1, Level = 2, Structure = 2, Offset = 720, ElementSize = 2, IdentifierElement = 110)
    public short getThreshold() {
        return threshold;
    }

    public void setThreshold(short thresholdParam) {
        this.threshold = thresholdParam;
    }

    @DdlField(Version = "2.0", QualName = "debug", ObjectClass = 1, Level = 2, Structure = 2, Offset = 722, ElementSize = 2, IdentifierElement = 111)
    public short getDebug() {
        return debug;
    }

    public void setDebug(short debugParam) {
        this.debug = debugParam;
    }

    @DdlField(Version = "2.0", QualName = "diag", ObjectClass = 1, Level = 2, Structure = 2, Offset = 724, ElementSize = 2, IdentifierElement = 112)
    public short getDiag() {
        return diag;
    }

    public void setDiag(short diagParam) {
        this.diag = diagParam;
    }

    @DdlField(Version = "2.0", QualName = "info", ObjectClass = 1, Level = 2, Structure = 2, Offset = 726, ElementSize = 2, IdentifierElement = 113)
    public short getInfo() {
        return info;
    }

    public void setInfo(short infoParam) {
        this.info = infoParam;
    }

    @DdlField(Version = "2.0", QualName = "abnorml", ObjectClass = 1, Level = 2, Structure = 2, Offset = 728, ElementSize = 2, IdentifierElement = 114)
    public short getAbnorml() {
        return abnorml;
    }

    public void setAbnorml(short abnormlParam) {
        this.abnorml = abnormlParam;
    }

    @DdlField(Version = "2.0", QualName = "suspend", ObjectClass = 1, Level = 2, Structure = 2, Offset = 730, ElementSize = 2, IdentifierElement = 115)
    public short getSuspend() {
        return suspend;
    }

    public void setSuspend(short suspendParam) {
        this.suspend = suspendParam;
    }

    @DdlField(Version = "2.0", QualName = "config", ObjectClass = 1, Level = 2, Structure = 2, Offset = 732, ElementSize = 2, IdentifierElement = 116)
    public short getConfig() {
        return config;
    }

    public void setConfig(short configParam) {
        this.config = configParam;
    }

    @DdlField(Version = "2.0", QualName = "fillrr-040123-1512", ObjectClass = 1, Level = 2, Structure = 0, Offset = 734, ElementSize = 12, IdentifierElement = 117)
    public String getFillrr_040123_1512() {
        return fillrr_040123_1512;
    }

    public void setFillrr_040123_1512(String fillrr_040123_1512Param) {
        this.fillrr_040123_1512 = fillrr_040123_1512Param;
    }

}
