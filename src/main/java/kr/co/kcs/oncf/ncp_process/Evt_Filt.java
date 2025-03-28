
package kr.co.kcs.oncf.ncp_process;

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
    private short config;
    private String fillrr_040123_1337;

    @DdlField(Version = "2.0", QualName = "unavail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 940, ElementSize = 2, IdentifierElement = 59)
    public short getUnavail() {
        return unavail;
    }

    public void setUnavail(short unavailParam) {
        this.unavail = unavailParam;
    }

    @DdlField(Version = "2.0", QualName = "avail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 942, ElementSize = 2, IdentifierElement = 60)
    public short getAvail() {
        return avail;
    }

    public void setAvail(short availParam) {
        this.avail = availParam;
    }

    @DdlField(Version = "2.0", QualName = "otherr", ObjectClass = 1, Level = 2, Structure = 2, Offset = 944, ElementSize = 2, IdentifierElement = 61)
    public short getOtherr() {
        return otherr;
    }

    public void setOtherr(short otherrParam) {
        this.otherr = otherrParam;
    }

    @DdlField(Version = "2.0", QualName = "threshold", ObjectClass = 1, Level = 2, Structure = 2, Offset = 946, ElementSize = 2, IdentifierElement = 62)
    public short getThreshold() {
        return threshold;
    }

    public void setThreshold(short thresholdParam) {
        this.threshold = thresholdParam;
    }

    @DdlField(Version = "2.0", QualName = "debug", ObjectClass = 1, Level = 2, Structure = 2, Offset = 948, ElementSize = 2, IdentifierElement = 63)
    public short getDebug() {
        return debug;
    }

    public void setDebug(short debugParam) {
        this.debug = debugParam;
    }

    @DdlField(Version = "2.0", QualName = "diag", ObjectClass = 1, Level = 2, Structure = 2, Offset = 950, ElementSize = 2, IdentifierElement = 64)
    public short getDiag() {
        return diag;
    }

    public void setDiag(short diagParam) {
        this.diag = diagParam;
    }

    @DdlField(Version = "2.0", QualName = "info", ObjectClass = 1, Level = 2, Structure = 2, Offset = 952, ElementSize = 2, IdentifierElement = 65)
    public short getInfo() {
        return info;
    }

    public void setInfo(short infoParam) {
        this.info = infoParam;
    }

    @DdlField(Version = "2.0", QualName = "abnorml", ObjectClass = 1, Level = 2, Structure = 2, Offset = 954, ElementSize = 2, IdentifierElement = 66)
    public short getAbnorml() {
        return abnorml;
    }

    public void setAbnorml(short abnormlParam) {
        this.abnorml = abnormlParam;
    }

    @DdlField(Version = "2.0", QualName = "config", ObjectClass = 1, Level = 2, Structure = 2, Offset = 956, ElementSize = 2, IdentifierElement = 67)
    public short getConfig() {
        return config;
    }

    public void setConfig(short configParam) {
        this.config = configParam;
    }

    @DdlField(Version = "2.0", QualName = "fillrr-040123-1337", ObjectClass = 1, Level = 2, Structure = 0, Offset = 958, ElementSize = 14, IdentifierElement = 68)
    public String getFillrr_040123_1337() {
        return fillrr_040123_1337;
    }

    public void setFillrr_040123_1337(String fillrr_040123_1337Param) {
        this.fillrr_040123_1337 = fillrr_040123_1337Param;
    }

}
