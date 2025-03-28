
package kr.co.kcs.oncf.ncp_resp_hinfo_sta;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "dev", ElementSize = 138, LocalName = "dev")
public class Dev
    implements Serializable
{

    private String input_Format;
    private String fil030324_1400;
    private short input_Format_Lgth;
    private String output_Format;
    private String fil030324_1401;
    private short output_Format_Lgth;
    private short receive_Length;
    private short transmit_Length;
    private short iformat_Len_Type;
    private short iformat_Len_Of_Len;
    private short iformat_Len_Adjust;
    private short iformat_Len_Little_Endian;
    private short iformat_Len_Offset;
    private short oformat_Len_Type;
    private short oformat_Len_Of_Len;
    private short oformat_Len_Adjust;
    private short oformat_Len_Little_Endian;

    @DdlField(Version = "2.0", QualName = "input-format", ObjectClass = 1, Level = 2, Structure = 0, Offset = 564, ElementSize = 55, IdentifierElement = 39)
    public String getInput_Format() {
        return input_Format;
    }

    public void setInput_Format(String input_FormatParam) {
        this.input_Format = input_FormatParam;
    }

    @DdlField(Version = "2.0", QualName = "fil030324-1400", ObjectClass = 1, Level = 2, Structure = 0, Offset = 619, ElementSize = 1, IdentifierElement = 40)
    public String getFil030324_1400() {
        return fil030324_1400;
    }

    public void setFil030324_1400(String fil030324_1400Param) {
        this.fil030324_1400 = fil030324_1400Param;
    }

    @DdlField(Version = "2.0", QualName = "input-format-lgth", ObjectClass = 1, Level = 2, Structure = 2, Offset = 620, ElementSize = 2, IdentifierElement = 41)
    public short getInput_Format_Lgth() {
        return input_Format_Lgth;
    }

    public void setInput_Format_Lgth(short input_Format_LgthParam) {
        this.input_Format_Lgth = input_Format_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "output-format", ObjectClass = 1, Level = 2, Structure = 0, Offset = 622, ElementSize = 55, IdentifierElement = 42)
    public String getOutput_Format() {
        return output_Format;
    }

    public void setOutput_Format(String output_FormatParam) {
        this.output_Format = output_FormatParam;
    }

    @DdlField(Version = "2.0", QualName = "fil030324-1401", ObjectClass = 1, Level = 2, Structure = 0, Offset = 677, ElementSize = 1, IdentifierElement = 43)
    public String getFil030324_1401() {
        return fil030324_1401;
    }

    public void setFil030324_1401(String fil030324_1401Param) {
        this.fil030324_1401 = fil030324_1401Param;
    }

    @DdlField(Version = "2.0", QualName = "output-format-lgth", ObjectClass = 1, Level = 2, Structure = 2, Offset = 678, ElementSize = 2, IdentifierElement = 44)
    public short getOutput_Format_Lgth() {
        return output_Format_Lgth;
    }

    public void setOutput_Format_Lgth(short output_Format_LgthParam) {
        this.output_Format_Lgth = output_Format_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "receive-length", ObjectClass = 1, Level = 2, Structure = 2, Offset = 680, ElementSize = 2, IdentifierElement = 45)
    public short getReceive_Length() {
        return receive_Length;
    }

    public void setReceive_Length(short receive_LengthParam) {
        this.receive_Length = receive_LengthParam;
    }

    @DdlField(Version = "2.0", QualName = "transmit-length", ObjectClass = 1, Level = 2, Structure = 2, Offset = 682, ElementSize = 2, IdentifierElement = 46)
    public short getTransmit_Length() {
        return transmit_Length;
    }

    public void setTransmit_Length(short transmit_LengthParam) {
        this.transmit_Length = transmit_LengthParam;
    }

    @DdlField(Version = "2.0", QualName = "iformat-len-type", ObjectClass = 1, Level = 2, Structure = 3, Offset = 684, ElementSize = 2, IdentifierElement = 47)
    public short getIformat_Len_Type() {
        return iformat_Len_Type;
    }

    public void setIformat_Len_Type(short iformat_Len_TypeParam) {
        this.iformat_Len_Type = iformat_Len_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "iformat-len-of-len", ObjectClass = 1, Level = 2, Structure = 3, Offset = 686, ElementSize = 2, IdentifierElement = 48)
    public short getIformat_Len_Of_Len() {
        return iformat_Len_Of_Len;
    }

    public void setIformat_Len_Of_Len(short iformat_Len_Of_LenParam) {
        this.iformat_Len_Of_Len = iformat_Len_Of_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "iformat-len-adjust", ObjectClass = 1, Level = 2, Structure = 3, Offset = 688, ElementSize = 2, IdentifierElement = 49)
    public short getIformat_Len_Adjust() {
        return iformat_Len_Adjust;
    }

    public void setIformat_Len_Adjust(short iformat_Len_AdjustParam) {
        this.iformat_Len_Adjust = iformat_Len_AdjustParam;
    }

    @DdlField(Version = "2.0", QualName = "iformat-len-little-endian", ObjectClass = 1, Level = 2, Structure = 3, Offset = 690, ElementSize = 2, IdentifierElement = 50)
    public short getIformat_Len_Little_Endian() {
        return iformat_Len_Little_Endian;
    }

    public void setIformat_Len_Little_Endian(short iformat_Len_Little_EndianParam) {
        this.iformat_Len_Little_Endian = iformat_Len_Little_EndianParam;
    }

    @DdlField(Version = "2.0", QualName = "iformat-len-offset", ObjectClass = 1, Level = 2, Structure = 3, Offset = 692, ElementSize = 2, IdentifierElement = 51)
    public short getIformat_Len_Offset() {
        return iformat_Len_Offset;
    }

    public void setIformat_Len_Offset(short iformat_Len_OffsetParam) {
        this.iformat_Len_Offset = iformat_Len_OffsetParam;
    }

    @DdlField(Version = "2.0", QualName = "oformat-len-type", ObjectClass = 1, Level = 2, Structure = 3, Offset = 694, ElementSize = 2, IdentifierElement = 52)
    public short getOformat_Len_Type() {
        return oformat_Len_Type;
    }

    public void setOformat_Len_Type(short oformat_Len_TypeParam) {
        this.oformat_Len_Type = oformat_Len_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "oformat-len-of-len", ObjectClass = 1, Level = 2, Structure = 3, Offset = 696, ElementSize = 2, IdentifierElement = 53)
    public short getOformat_Len_Of_Len() {
        return oformat_Len_Of_Len;
    }

    public void setOformat_Len_Of_Len(short oformat_Len_Of_LenParam) {
        this.oformat_Len_Of_Len = oformat_Len_Of_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "oformat-len-adjust", ObjectClass = 1, Level = 2, Structure = 3, Offset = 698, ElementSize = 2, IdentifierElement = 54)
    public short getOformat_Len_Adjust() {
        return oformat_Len_Adjust;
    }

    public void setOformat_Len_Adjust(short oformat_Len_AdjustParam) {
        this.oformat_Len_Adjust = oformat_Len_AdjustParam;
    }

    @DdlField(Version = "2.0", QualName = "oformat-len-little-endian", ObjectClass = 1, Level = 2, Structure = 3, Offset = 700, ElementSize = 2, IdentifierElement = 55)
    public short getOformat_Len_Little_Endian() {
        return oformat_Len_Little_Endian;
    }

    public void setOformat_Len_Little_Endian(short oformat_Len_Little_EndianParam) {
        this.oformat_Len_Little_Endian = oformat_Len_Little_EndianParam;
    }

}
