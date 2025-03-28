
package kr.co.kcs.oncf.ncp_link;

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
    private String fillrr_040122_0555;

    @DdlField(Version = "2.0", QualName = "unavail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 142, ElementSize = 2, IdentifierElement = 21)
    public short getUnavail() {
        return unavail;
    }

    public void setUnavail(short unavailParam) {
        this.unavail = unavailParam;
    }

    @DdlField(Version = "2.0", QualName = "avail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 144, ElementSize = 2, IdentifierElement = 22)
    public short getAvail() {
        return avail;
    }

    public void setAvail(short availParam) {
        this.avail = availParam;
    }

    @DdlField(Version = "2.0", QualName = "otherr", ObjectClass = 1, Level = 2, Structure = 2, Offset = 146, ElementSize = 2, IdentifierElement = 23)
    public short getOtherr() {
        return otherr;
    }

    public void setOtherr(short otherrParam) {
        this.otherr = otherrParam;
    }

    @DdlField(Version = "2.0", QualName = "threshold", ObjectClass = 1, Level = 2, Structure = 2, Offset = 148, ElementSize = 2, IdentifierElement = 24)
    public short getThreshold() {
        return threshold;
    }

    public void setThreshold(short thresholdParam) {
        this.threshold = thresholdParam;
    }

    @DdlField(Version = "2.0", QualName = "debug", ObjectClass = 1, Level = 2, Structure = 2, Offset = 150, ElementSize = 2, IdentifierElement = 25)
    public short getDebug() {
        return debug;
    }

    public void setDebug(short debugParam) {
        this.debug = debugParam;
    }

    @DdlField(Version = "2.0", QualName = "diag", ObjectClass = 1, Level = 2, Structure = 2, Offset = 152, ElementSize = 2, IdentifierElement = 26)
    public short getDiag() {
        return diag;
    }

    public void setDiag(short diagParam) {
        this.diag = diagParam;
    }

    @DdlField(Version = "2.0", QualName = "info", ObjectClass = 1, Level = 2, Structure = 2, Offset = 154, ElementSize = 2, IdentifierElement = 27)
    public short getInfo() {
        return info;
    }

    public void setInfo(short infoParam) {
        this.info = infoParam;
    }

    @DdlField(Version = "2.0", QualName = "abnorml", ObjectClass = 1, Level = 2, Structure = 2, Offset = 156, ElementSize = 2, IdentifierElement = 28)
    public short getAbnorml() {
        return abnorml;
    }

    public void setAbnorml(short abnormlParam) {
        this.abnorml = abnormlParam;
    }

    @DdlField(Version = "2.0", QualName = "config", ObjectClass = 1, Level = 2, Structure = 2, Offset = 158, ElementSize = 2, IdentifierElement = 29)
    public short getConfig() {
        return config;
    }

    public void setConfig(short configParam) {
        this.config = configParam;
    }

    @DdlField(Version = "2.0", QualName = "fillrr-040122-0555", ObjectClass = 1, Level = 2, Structure = 0, Offset = 160, ElementSize = 14, IdentifierElement = 30)
    public String getFillrr_040122_0555() {
        return fillrr_040122_0555;
    }

    public void setFillrr_040122_0555(String fillrr_040122_0555Param) {
        this.fillrr_040122_0555 = fillrr_040122_0555Param;
    }

}
