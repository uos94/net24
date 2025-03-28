
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_device.Devdest;
import kr.co.kcs.oncf.ncp_device.Devprot;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-device", ElementSize = 1962, LocalName = "ncp-device")
public class Ncp_Device
    implements Serializable
{

    private String alternate_Profile_Name;
    private String appl_Id;
    private short defrsp;
    private short device_Absent;
    private short device_Number;
    private short device_Type;
    private String input_Format;
    private String fil030324_1400;
    private short input_Format_Lgth;
    private short macro;
    private String output_Format;
    private String fil030324_1401;
    private short output_Format_Lgth;
    private String poll_Format;
    private short poll_Format_Lgth;
    private String profile_Name;
    private short receive_Length;
    private short resident_Sscp;
    private String select_Format;
    private short select_Format_Lgth;
    private short select_Type;
    private short addr_Char_Length;
    private short translate_Address_Chars;
    private short transmission_Number_Length;
    private short transmit_Devunitaddr_Position;
    private short transmit_Length;
    private short transmit_Transparent;
    private short destroute;
    private String symbolic_Name;
    private String wildchar;
    private String fillrr1;
    private short invalid_Var1;
    private Devdest devdest;
    private Devprot devprot;
    private String xnc_File;
    private byte xnc_File_Len;
    private String fillrr_050322_1336;
    private String rpc_File;
    private byte rpc_File_Len;
    private String fillrr_050322_1338;
    private short iformat_Len_Type;
    private short iformat_Len_Of_Len;
    private short iformat_Len_Adjust;
    private short iformat_Len_Little_Endian;
    private short iformat_Len_Offset;
    private short oformat_Len_Type;
    private short oformat_Len_Of_Len;
    private short oformat_Len_Adjust;
    private short oformat_Len_Little_Endian;
    private String ssl_Roots_File;
    private byte file130701_0957;
    private short ssl_Roots_File_Len;
    private String ssl_Certs_File;
    private byte file130701_0958;
    private short ssl_Certs_File_Len;
    private String ssl_Cert_Key;
    private short ssl_Cert_Key_Len;
    private String ssl_Enc_Pwd;
    private short ssl_Enc_Pwd_Len;
    private String ssl_Clr_Pwd;
    private String fil130719_1622;
    private short ssl_Clr_Pwd_Len;

    @DdlField(Version = "2.0", QualName = "alternate-profile-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 0, ElementSize = 8, IdentifierElement = 1)
    public String getAlternate_Profile_Name() {
        return alternate_Profile_Name;
    }

    public void setAlternate_Profile_Name(String alternate_Profile_NameParam) {
        this.alternate_Profile_Name = alternate_Profile_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "appl-id", ObjectClass = 1, Level = 1, Structure = 0, Offset = 8, ElementSize = 8, IdentifierElement = 2)
    public String getAppl_Id() {
        return appl_Id;
    }

    public void setAppl_Id(String appl_IdParam) {
        this.appl_Id = appl_IdParam;
    }

    @DdlField(Version = "2.0", QualName = "defrsp", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 3)
    public short getDefrsp() {
        return defrsp;
    }

    public void setDefrsp(short defrspParam) {
        this.defrsp = defrspParam;
    }

    @DdlField(Version = "2.0", QualName = "device-absent", ObjectClass = 1, Level = 1, Structure = 2, Offset = 18, ElementSize = 2, IdentifierElement = 4)
    public short getDevice_Absent() {
        return device_Absent;
    }

    public void setDevice_Absent(short device_AbsentParam) {
        this.device_Absent = device_AbsentParam;
    }

    @DdlField(Version = "2.0", QualName = "device-number", ObjectClass = 1, Level = 1, Structure = 2, Offset = 20, ElementSize = 2, IdentifierElement = 5)
    public short getDevice_Number() {
        return device_Number;
    }

    public void setDevice_Number(short device_NumberParam) {
        this.device_Number = device_NumberParam;
    }

    @DdlField(Version = "2.0", QualName = "device-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 22, ElementSize = 2, IdentifierElement = 6)
    public short getDevice_Type() {
        return device_Type;
    }

    public void setDevice_Type(short device_TypeParam) {
        this.device_Type = device_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "input-format", ObjectClass = 1, Level = 1, Structure = 0, Offset = 24, ElementSize = 55, IdentifierElement = 7)
    public String getInput_Format() {
        return input_Format;
    }

    public void setInput_Format(String input_FormatParam) {
        this.input_Format = input_FormatParam;
    }

    @DdlField(Version = "2.0", QualName = "fil030324-1400", ObjectClass = 1, Level = 1, Structure = 0, Offset = 79, ElementSize = 1, IdentifierElement = 8)
    public String getFil030324_1400() {
        return fil030324_1400;
    }

    public void setFil030324_1400(String fil030324_1400Param) {
        this.fil030324_1400 = fil030324_1400Param;
    }

    @DdlField(Version = "2.0", QualName = "input-format-lgth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 80, ElementSize = 2, IdentifierElement = 9)
    public short getInput_Format_Lgth() {
        return input_Format_Lgth;
    }

    public void setInput_Format_Lgth(short input_Format_LgthParam) {
        this.input_Format_Lgth = input_Format_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "macro", ObjectClass = 1, Level = 1, Structure = 2, Offset = 82, ElementSize = 2, IdentifierElement = 10)
    public short getMacro() {
        return macro;
    }

    public void setMacro(short macroParam) {
        this.macro = macroParam;
    }

    @DdlField(Version = "2.0", QualName = "output-format", ObjectClass = 1, Level = 1, Structure = 0, Offset = 84, ElementSize = 55, IdentifierElement = 11)
    public String getOutput_Format() {
        return output_Format;
    }

    public void setOutput_Format(String output_FormatParam) {
        this.output_Format = output_FormatParam;
    }

    @DdlField(Version = "2.0", QualName = "fil030324-1401", ObjectClass = 1, Level = 1, Structure = 0, Offset = 139, ElementSize = 1, IdentifierElement = 12)
    public String getFil030324_1401() {
        return fil030324_1401;
    }

    public void setFil030324_1401(String fil030324_1401Param) {
        this.fil030324_1401 = fil030324_1401Param;
    }

    @DdlField(Version = "2.0", QualName = "output-format-lgth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 140, ElementSize = 2, IdentifierElement = 13)
    public short getOutput_Format_Lgth() {
        return output_Format_Lgth;
    }

    public void setOutput_Format_Lgth(short output_Format_LgthParam) {
        this.output_Format_Lgth = output_Format_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "poll-format", ObjectClass = 1, Level = 1, Structure = 0, Offset = 142, ElementSize = 30, IdentifierElement = 14)
    public String getPoll_Format() {
        return poll_Format;
    }

    public void setPoll_Format(String poll_FormatParam) {
        this.poll_Format = poll_FormatParam;
    }

    @DdlField(Version = "2.0", QualName = "poll-format-lgth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 172, ElementSize = 2, IdentifierElement = 15)
    public short getPoll_Format_Lgth() {
        return poll_Format_Lgth;
    }

    public void setPoll_Format_Lgth(short poll_Format_LgthParam) {
        this.poll_Format_Lgth = poll_Format_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "profile-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 174, ElementSize = 8, IdentifierElement = 16)
    public String getProfile_Name() {
        return profile_Name;
    }

    public void setProfile_Name(String profile_NameParam) {
        this.profile_Name = profile_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "receive-length", ObjectClass = 1, Level = 1, Structure = 2, Offset = 182, ElementSize = 2, IdentifierElement = 17)
    public short getReceive_Length() {
        return receive_Length;
    }

    public void setReceive_Length(short receive_LengthParam) {
        this.receive_Length = receive_LengthParam;
    }

    @DdlField(Version = "2.0", QualName = "resident-sscp", ObjectClass = 1, Level = 1, Structure = 2, Offset = 184, ElementSize = 2, IdentifierElement = 18)
    public short getResident_Sscp() {
        return resident_Sscp;
    }

    public void setResident_Sscp(short resident_SscpParam) {
        this.resident_Sscp = resident_SscpParam;
    }

    @DdlField(Version = "2.0", QualName = "select-format", ObjectClass = 1, Level = 1, Structure = 0, Offset = 186, ElementSize = 30, IdentifierElement = 19)
    public String getSelect_Format() {
        return select_Format;
    }

    public void setSelect_Format(String select_FormatParam) {
        this.select_Format = select_FormatParam;
    }

    @DdlField(Version = "2.0", QualName = "select-format-lgth", ObjectClass = 1, Level = 1, Structure = 2, Offset = 216, ElementSize = 2, IdentifierElement = 20)
    public short getSelect_Format_Lgth() {
        return select_Format_Lgth;
    }

    public void setSelect_Format_Lgth(short select_Format_LgthParam) {
        this.select_Format_Lgth = select_Format_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "select-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 218, ElementSize = 2, IdentifierElement = 21)
    public short getSelect_Type() {
        return select_Type;
    }

    public void setSelect_Type(short select_TypeParam) {
        this.select_Type = select_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "addr-char-length", ObjectClass = 1, Level = 1, Structure = 2, Offset = 220, ElementSize = 2, IdentifierElement = 22)
    public short getAddr_Char_Length() {
        return addr_Char_Length;
    }

    public void setAddr_Char_Length(short addr_Char_LengthParam) {
        this.addr_Char_Length = addr_Char_LengthParam;
    }

    @DdlField(Version = "2.0", QualName = "translate-address-chars", ObjectClass = 1, Level = 1, Structure = 2, Offset = 222, ElementSize = 2, IdentifierElement = 23)
    public short getTranslate_Address_Chars() {
        return translate_Address_Chars;
    }

    public void setTranslate_Address_Chars(short translate_Address_CharsParam) {
        this.translate_Address_Chars = translate_Address_CharsParam;
    }

    @DdlField(Version = "2.0", QualName = "transmission-number-length", ObjectClass = 1, Level = 1, Structure = 2, Offset = 224, ElementSize = 2, IdentifierElement = 24)
    public short getTransmission_Number_Length() {
        return transmission_Number_Length;
    }

    public void setTransmission_Number_Length(short transmission_Number_LengthParam) {
        this.transmission_Number_Length = transmission_Number_LengthParam;
    }

    @DdlField(Version = "2.0", QualName = "transmit-devunitaddr-position", ObjectClass = 1, Level = 1, Structure = 2, Offset = 226, ElementSize = 2, IdentifierElement = 25)
    public short getTransmit_Devunitaddr_Position() {
        return transmit_Devunitaddr_Position;
    }

    public void setTransmit_Devunitaddr_Position(short transmit_Devunitaddr_PositionParam) {
        this.transmit_Devunitaddr_Position = transmit_Devunitaddr_PositionParam;
    }

    @DdlField(Version = "2.0", QualName = "transmit-length", ObjectClass = 1, Level = 1, Structure = 2, Offset = 228, ElementSize = 2, IdentifierElement = 26)
    public short getTransmit_Length() {
        return transmit_Length;
    }

    public void setTransmit_Length(short transmit_LengthParam) {
        this.transmit_Length = transmit_LengthParam;
    }

    @DdlField(Version = "2.0", QualName = "transmit-transparent", ObjectClass = 1, Level = 1, Structure = 2, Offset = 230, ElementSize = 2, IdentifierElement = 27)
    public short getTransmit_Transparent() {
        return transmit_Transparent;
    }

    public void setTransmit_Transparent(short transmit_TransparentParam) {
        this.transmit_Transparent = transmit_TransparentParam;
    }

    @DdlField(Version = "2.0", QualName = "destroute", ObjectClass = 1, Level = 1, Structure = 2, Offset = 232, ElementSize = 2, IdentifierElement = 28)
    public short getDestroute() {
        return destroute;
    }

    public void setDestroute(short destrouteParam) {
        this.destroute = destrouteParam;
    }

    @DdlField(Version = "2.0", QualName = "symbolic-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 234, ElementSize = 16, IdentifierElement = 29)
    public String getSymbolic_Name() {
        return symbolic_Name;
    }

    public void setSymbolic_Name(String symbolic_NameParam) {
        this.symbolic_Name = symbolic_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "wildchar", ObjectClass = 1, Level = 1, Structure = 0, Offset = 250, ElementSize = 1, IdentifierElement = 30)
    public String getWildchar() {
        return wildchar;
    }

    public void setWildchar(String wildcharParam) {
        this.wildchar = wildcharParam;
    }

    @DdlField(Version = "2.0", QualName = "fillrr1", ObjectClass = 1, Level = 1, Structure = 0, Offset = 251, ElementSize = 1, IdentifierElement = 31)
    public String getFillrr1() {
        return fillrr1;
    }

    public void setFillrr1(String fillrr1Param) {
        this.fillrr1 = fillrr1Param;
    }

    @DdlField(Version = "2.0", QualName = "invalid-var1", ObjectClass = 1, Level = 1, Structure = 2, Offset = 252, ElementSize = 2, IdentifierElement = 32)
    public short getInvalid_Var1() {
        return invalid_Var1;
    }

    public void setInvalid_Var1(short invalid_Var1Param) {
        this.invalid_Var1 = invalid_Var1Param;
    }

    @DdlField(Version = "2.0", QualName = "devdest", ObjectClass = 0, Level = 1, Structure = 0, Offset = 254, ElementSize = 1154, IdentifierElement = 33)
    public Devdest getDevdest() {
        return devdest;
    }

    public void setDevdest(Devdest devdestParam) {
        this.devdest = devdestParam;
    }

    @DdlField(Version = "2.0", QualName = "devprot", ObjectClass = 0, Level = 1, Structure = 0, Offset = 1408, ElementSize = 142, IdentifierElement = 42)
    public Devprot getDevprot() {
        return devprot;
    }

    public void setDevprot(Devprot devprotParam) {
        this.devprot = devprotParam;
    }

    @DdlField(Version = "2.0", QualName = "xnc-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1550, ElementSize = 35, IdentifierElement = 50)
    public String getXnc_File() {
        return xnc_File;
    }

    public void setXnc_File(String xnc_FileParam) {
        this.xnc_File = xnc_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "xnc-file-len", ObjectClass = 1, Level = 1, Structure = 22, Offset = 1585, ElementSize = 1, IdentifierElement = 51)
    public byte getXnc_File_Len() {
        return xnc_File_Len;
    }

    public void setXnc_File_Len(byte xnc_File_LenParam) {
        this.xnc_File_Len = xnc_File_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "fillrr-050322-1336", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1586, ElementSize = 72, IdentifierElement = 52)
    public String getFillrr_050322_1336() {
        return fillrr_050322_1336;
    }

    public void setFillrr_050322_1336(String fillrr_050322_1336Param) {
        this.fillrr_050322_1336 = fillrr_050322_1336Param;
    }

    @DdlField(Version = "2.0", QualName = "rpc-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1658, ElementSize = 35, IdentifierElement = 53)
    public String getRpc_File() {
        return rpc_File;
    }

    public void setRpc_File(String rpc_FileParam) {
        this.rpc_File = rpc_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "rpc-file-len", ObjectClass = 1, Level = 1, Structure = 22, Offset = 1693, ElementSize = 1, IdentifierElement = 54)
    public byte getRpc_File_Len() {
        return rpc_File_Len;
    }

    public void setRpc_File_Len(byte rpc_File_LenParam) {
        this.rpc_File_Len = rpc_File_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "fillrr-050322-1338", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1694, ElementSize = 72, IdentifierElement = 55)
    public String getFillrr_050322_1338() {
        return fillrr_050322_1338;
    }

    public void setFillrr_050322_1338(String fillrr_050322_1338Param) {
        this.fillrr_050322_1338 = fillrr_050322_1338Param;
    }

    @DdlField(Version = "2.0", QualName = "iformat-len-type", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1766, ElementSize = 2, IdentifierElement = 56)
    public short getIformat_Len_Type() {
        return iformat_Len_Type;
    }

    public void setIformat_Len_Type(short iformat_Len_TypeParam) {
        this.iformat_Len_Type = iformat_Len_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "iformat-len-of-len", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1768, ElementSize = 2, IdentifierElement = 57)
    public short getIformat_Len_Of_Len() {
        return iformat_Len_Of_Len;
    }

    public void setIformat_Len_Of_Len(short iformat_Len_Of_LenParam) {
        this.iformat_Len_Of_Len = iformat_Len_Of_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "iformat-len-adjust", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1770, ElementSize = 2, IdentifierElement = 58)
    public short getIformat_Len_Adjust() {
        return iformat_Len_Adjust;
    }

    public void setIformat_Len_Adjust(short iformat_Len_AdjustParam) {
        this.iformat_Len_Adjust = iformat_Len_AdjustParam;
    }

    @DdlField(Version = "2.0", QualName = "iformat-len-little-endian", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1772, ElementSize = 2, IdentifierElement = 59)
    public short getIformat_Len_Little_Endian() {
        return iformat_Len_Little_Endian;
    }

    public void setIformat_Len_Little_Endian(short iformat_Len_Little_EndianParam) {
        this.iformat_Len_Little_Endian = iformat_Len_Little_EndianParam;
    }

    @DdlField(Version = "2.0", QualName = "iformat-len-offset", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1774, ElementSize = 2, IdentifierElement = 60)
    public short getIformat_Len_Offset() {
        return iformat_Len_Offset;
    }

    public void setIformat_Len_Offset(short iformat_Len_OffsetParam) {
        this.iformat_Len_Offset = iformat_Len_OffsetParam;
    }

    @DdlField(Version = "2.0", QualName = "oformat-len-type", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1776, ElementSize = 2, IdentifierElement = 61)
    public short getOformat_Len_Type() {
        return oformat_Len_Type;
    }

    public void setOformat_Len_Type(short oformat_Len_TypeParam) {
        this.oformat_Len_Type = oformat_Len_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "oformat-len-of-len", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1778, ElementSize = 2, IdentifierElement = 62)
    public short getOformat_Len_Of_Len() {
        return oformat_Len_Of_Len;
    }

    public void setOformat_Len_Of_Len(short oformat_Len_Of_LenParam) {
        this.oformat_Len_Of_Len = oformat_Len_Of_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "oformat-len-adjust", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1780, ElementSize = 2, IdentifierElement = 63)
    public short getOformat_Len_Adjust() {
        return oformat_Len_Adjust;
    }

    public void setOformat_Len_Adjust(short oformat_Len_AdjustParam) {
        this.oformat_Len_Adjust = oformat_Len_AdjustParam;
    }

    @DdlField(Version = "2.0", QualName = "oformat-len-little-endian", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1782, ElementSize = 2, IdentifierElement = 64)
    public short getOformat_Len_Little_Endian() {
        return oformat_Len_Little_Endian;
    }

    public void setOformat_Len_Little_Endian(short oformat_Len_Little_EndianParam) {
        this.oformat_Len_Little_Endian = oformat_Len_Little_EndianParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-roots-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1784, ElementSize = 35, IdentifierElement = 65)
    public String getSsl_Roots_File() {
        return ssl_Roots_File;
    }

    public void setSsl_Roots_File(String ssl_Roots_FileParam) {
        this.ssl_Roots_File = ssl_Roots_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "file130701-0957", ObjectClass = 1, Level = 1, Structure = 22, Offset = 1819, ElementSize = 1, IdentifierElement = 66)
    public byte getFile130701_0957() {
        return file130701_0957;
    }

    public void setFile130701_0957(byte file130701_0957Param) {
        this.file130701_0957 = file130701_0957Param;
    }

    @DdlField(Version = "2.0", QualName = "ssl-roots-file-len", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1820, ElementSize = 2, IdentifierElement = 67)
    public short getSsl_Roots_File_Len() {
        return ssl_Roots_File_Len;
    }

    public void setSsl_Roots_File_Len(short ssl_Roots_File_LenParam) {
        this.ssl_Roots_File_Len = ssl_Roots_File_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-certs-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1822, ElementSize = 35, IdentifierElement = 68)
    public String getSsl_Certs_File() {
        return ssl_Certs_File;
    }

    public void setSsl_Certs_File(String ssl_Certs_FileParam) {
        this.ssl_Certs_File = ssl_Certs_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "file130701-0958", ObjectClass = 1, Level = 1, Structure = 22, Offset = 1857, ElementSize = 1, IdentifierElement = 69)
    public byte getFile130701_0958() {
        return file130701_0958;
    }

    public void setFile130701_0958(byte file130701_0958Param) {
        this.file130701_0958 = file130701_0958Param;
    }

    @DdlField(Version = "2.0", QualName = "ssl-certs-file-len", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1858, ElementSize = 2, IdentifierElement = 70)
    public short getSsl_Certs_File_Len() {
        return ssl_Certs_File_Len;
    }

    public void setSsl_Certs_File_Len(short ssl_Certs_File_LenParam) {
        this.ssl_Certs_File_Len = ssl_Certs_File_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-cert-key", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1860, ElementSize = 32, IdentifierElement = 71)
    public String getSsl_Cert_Key() {
        return ssl_Cert_Key;
    }

    public void setSsl_Cert_Key(String ssl_Cert_KeyParam) {
        this.ssl_Cert_Key = ssl_Cert_KeyParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-cert-key-len", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1892, ElementSize = 2, IdentifierElement = 72)
    public short getSsl_Cert_Key_Len() {
        return ssl_Cert_Key_Len;
    }

    public void setSsl_Cert_Key_Len(short ssl_Cert_Key_LenParam) {
        this.ssl_Cert_Key_Len = ssl_Cert_Key_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-enc-pwd", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1894, ElementSize = 32, IdentifierElement = 73)
    public String getSsl_Enc_Pwd() {
        return ssl_Enc_Pwd;
    }

    public void setSsl_Enc_Pwd(String ssl_Enc_PwdParam) {
        this.ssl_Enc_Pwd = ssl_Enc_PwdParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-enc-pwd-len", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1926, ElementSize = 2, IdentifierElement = 74)
    public short getSsl_Enc_Pwd_Len() {
        return ssl_Enc_Pwd_Len;
    }

    public void setSsl_Enc_Pwd_Len(short ssl_Enc_Pwd_LenParam) {
        this.ssl_Enc_Pwd_Len = ssl_Enc_Pwd_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "ssl-clr-pwd", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1928, ElementSize = 16, IdentifierElement = 75)
    public String getSsl_Clr_Pwd() {
        return ssl_Clr_Pwd;
    }

    public void setSsl_Clr_Pwd(String ssl_Clr_PwdParam) {
        this.ssl_Clr_Pwd = ssl_Clr_PwdParam;
    }

    @DdlField(Version = "2.0", QualName = "fil130719-1622", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1944, ElementSize = 16, IdentifierElement = 76)
    public String getFil130719_1622() {
        return fil130719_1622;
    }

    public void setFil130719_1622(String fil130719_1622Param) {
        this.fil130719_1622 = fil130719_1622Param;
    }

    @DdlField(Version = "2.0", QualName = "ssl-clr-pwd-len", ObjectClass = 1, Level = 1, Structure = 2, Offset = 1960, ElementSize = 2, IdentifierElement = 77)
    public short getSsl_Clr_Pwd_Len() {
        return ssl_Clr_Pwd_Len;
    }

    public void setSsl_Clr_Pwd_Len(short ssl_Clr_Pwd_LenParam) {
        this.ssl_Clr_Pwd_Len = ssl_Clr_Pwd_LenParam;
    }

}
