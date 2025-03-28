
package kr.co.kcs.oncf.ncp_line;

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
    private short linsupp;
    private short config;
    private String fillrr_040121_1556;

    @DdlField(Version = "2.0", QualName = "unavail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 332, ElementSize = 2, IdentifierElement = 198)
    public short getUnavail() {
        return unavail;
    }

    public void setUnavail(short unavailParam) {
        this.unavail = unavailParam;
    }

    @DdlField(Version = "2.0", QualName = "avail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 334, ElementSize = 2, IdentifierElement = 199)
    public short getAvail() {
        return avail;
    }

    public void setAvail(short availParam) {
        this.avail = availParam;
    }

    @DdlField(Version = "2.0", QualName = "otherr", ObjectClass = 1, Level = 2, Structure = 2, Offset = 336, ElementSize = 2, IdentifierElement = 200)
    public short getOtherr() {
        return otherr;
    }

    public void setOtherr(short otherrParam) {
        this.otherr = otherrParam;
    }

    @DdlField(Version = "2.0", QualName = "threshold", ObjectClass = 1, Level = 2, Structure = 2, Offset = 338, ElementSize = 2, IdentifierElement = 201)
    public short getThreshold() {
        return threshold;
    }

    public void setThreshold(short thresholdParam) {
        this.threshold = thresholdParam;
    }

    @DdlField(Version = "2.0", QualName = "debug", ObjectClass = 1, Level = 2, Structure = 2, Offset = 340, ElementSize = 2, IdentifierElement = 202)
    public short getDebug() {
        return debug;
    }

    public void setDebug(short debugParam) {
        this.debug = debugParam;
    }

    @DdlField(Version = "2.0", QualName = "diag", ObjectClass = 1, Level = 2, Structure = 2, Offset = 342, ElementSize = 2, IdentifierElement = 203)
    public short getDiag() {
        return diag;
    }

    public void setDiag(short diagParam) {
        this.diag = diagParam;
    }

    @DdlField(Version = "2.0", QualName = "info", ObjectClass = 1, Level = 2, Structure = 2, Offset = 344, ElementSize = 2, IdentifierElement = 204)
    public short getInfo() {
        return info;
    }

    public void setInfo(short infoParam) {
        this.info = infoParam;
    }

    @DdlField(Version = "2.0", QualName = "abnorml", ObjectClass = 1, Level = 2, Structure = 2, Offset = 346, ElementSize = 2, IdentifierElement = 205)
    public short getAbnorml() {
        return abnorml;
    }

    public void setAbnorml(short abnormlParam) {
        this.abnorml = abnormlParam;
    }

    @DdlField(Version = "2.0", QualName = "linsupp", ObjectClass = 1, Level = 2, Structure = 2, Offset = 348, ElementSize = 2, IdentifierElement = 206)
    public short getLinsupp() {
        return linsupp;
    }

    public void setLinsupp(short linsuppParam) {
        this.linsupp = linsuppParam;
    }

    @DdlField(Version = "2.0", QualName = "config", ObjectClass = 1, Level = 2, Structure = 2, Offset = 350, ElementSize = 2, IdentifierElement = 207)
    public short getConfig() {
        return config;
    }

    public void setConfig(short configParam) {
        this.config = configParam;
    }

    @DdlField(Version = "2.0", QualName = "fillrr-040121-1556", ObjectClass = 1, Level = 2, Structure = 0, Offset = 352, ElementSize = 12, IdentifierElement = 208)
    public String getFillrr_040121_1556() {
        return fillrr_040121_1556;
    }

    public void setFillrr_040121_1556(String fillrr_040121_1556Param) {
        this.fillrr_040121_1556 = fillrr_040121_1556Param;
    }

}
