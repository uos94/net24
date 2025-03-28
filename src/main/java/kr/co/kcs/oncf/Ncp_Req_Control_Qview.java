
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-control-qview", ElementSize = 28, LocalName = "ncp-req-control-qview")
public class Ncp_Req_Control_Qview
    implements Serializable
{

    private short control_Val_Type;
    private short control_Val_Txt_Offset;
    private int control_Val_Qnum_Msg;
    private int control_Val_Msg_Trans;
    private short control_Val_Tlength;
    private short control_Val_Mod_Detail_Rqsted;
    private short control_Val_Mod_Hdr_Rqsted;
    private short control_Val_Mod_Hex_Rqsted;
    private short control_Val_Mod_Text_Rqsted;
    private short control_Val_Mod_Tlength_Rqsted;
    private short control_Val_Mod_Toffset_Rqsted;
    private short control_Val_Chunk_Num;

    @DdlField(Version = "2.0", QualName = "control-val-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getControl_Val_Type() {
        return control_Val_Type;
    }

    public void setControl_Val_Type(short control_Val_TypeParam) {
        this.control_Val_Type = control_Val_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-txt-offset", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getControl_Val_Txt_Offset() {
        return control_Val_Txt_Offset;
    }

    public void setControl_Val_Txt_Offset(short control_Val_Txt_OffsetParam) {
        this.control_Val_Txt_Offset = control_Val_Txt_OffsetParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-qnum-msg", ObjectClass = 1, Level = 1, Structure = 4, Offset = 4, ElementSize = 4, IdentifierElement = 3)
    public int getControl_Val_Qnum_Msg() {
        return control_Val_Qnum_Msg;
    }

    public void setControl_Val_Qnum_Msg(int control_Val_Qnum_MsgParam) {
        this.control_Val_Qnum_Msg = control_Val_Qnum_MsgParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-msg-trans", ObjectClass = 1, Level = 1, Structure = 4, Offset = 8, ElementSize = 4, IdentifierElement = 4)
    public int getControl_Val_Msg_Trans() {
        return control_Val_Msg_Trans;
    }

    public void setControl_Val_Msg_Trans(int control_Val_Msg_TransParam) {
        this.control_Val_Msg_Trans = control_Val_Msg_TransParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-tlength", ObjectClass = 1, Level = 1, Structure = 2, Offset = 12, ElementSize = 2, IdentifierElement = 5)
    public short getControl_Val_Tlength() {
        return control_Val_Tlength;
    }

    public void setControl_Val_Tlength(short control_Val_TlengthParam) {
        this.control_Val_Tlength = control_Val_TlengthParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-mod-detail-rqsted", ObjectClass = 1, Level = 1, Structure = 2, Offset = 14, ElementSize = 2, IdentifierElement = 6)
    public short getControl_Val_Mod_Detail_Rqsted() {
        return control_Val_Mod_Detail_Rqsted;
    }

    public void setControl_Val_Mod_Detail_Rqsted(short control_Val_Mod_Detail_RqstedParam) {
        this.control_Val_Mod_Detail_Rqsted = control_Val_Mod_Detail_RqstedParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-mod-hdr-rqsted", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 7)
    public short getControl_Val_Mod_Hdr_Rqsted() {
        return control_Val_Mod_Hdr_Rqsted;
    }

    public void setControl_Val_Mod_Hdr_Rqsted(short control_Val_Mod_Hdr_RqstedParam) {
        this.control_Val_Mod_Hdr_Rqsted = control_Val_Mod_Hdr_RqstedParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-mod-hex-rqsted", ObjectClass = 1, Level = 1, Structure = 2, Offset = 18, ElementSize = 2, IdentifierElement = 8)
    public short getControl_Val_Mod_Hex_Rqsted() {
        return control_Val_Mod_Hex_Rqsted;
    }

    public void setControl_Val_Mod_Hex_Rqsted(short control_Val_Mod_Hex_RqstedParam) {
        this.control_Val_Mod_Hex_Rqsted = control_Val_Mod_Hex_RqstedParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-mod-text-rqsted", ObjectClass = 1, Level = 1, Structure = 2, Offset = 20, ElementSize = 2, IdentifierElement = 9)
    public short getControl_Val_Mod_Text_Rqsted() {
        return control_Val_Mod_Text_Rqsted;
    }

    public void setControl_Val_Mod_Text_Rqsted(short control_Val_Mod_Text_RqstedParam) {
        this.control_Val_Mod_Text_Rqsted = control_Val_Mod_Text_RqstedParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-mod-tlength-rqsted", ObjectClass = 1, Level = 1, Structure = 2, Offset = 22, ElementSize = 2, IdentifierElement = 10)
    public short getControl_Val_Mod_Tlength_Rqsted() {
        return control_Val_Mod_Tlength_Rqsted;
    }

    public void setControl_Val_Mod_Tlength_Rqsted(short control_Val_Mod_Tlength_RqstedParam) {
        this.control_Val_Mod_Tlength_Rqsted = control_Val_Mod_Tlength_RqstedParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-mod-toffset-rqsted", ObjectClass = 1, Level = 1, Structure = 2, Offset = 24, ElementSize = 2, IdentifierElement = 11)
    public short getControl_Val_Mod_Toffset_Rqsted() {
        return control_Val_Mod_Toffset_Rqsted;
    }

    public void setControl_Val_Mod_Toffset_Rqsted(short control_Val_Mod_Toffset_RqstedParam) {
        this.control_Val_Mod_Toffset_Rqsted = control_Val_Mod_Toffset_RqstedParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-chunk-num", ObjectClass = 1, Level = 1, Structure = 2, Offset = 26, ElementSize = 2, IdentifierElement = 12)
    public short getControl_Val_Chunk_Num() {
        return control_Val_Chunk_Num;
    }

    public void setControl_Val_Chunk_Num(short control_Val_Chunk_NumParam) {
        this.control_Val_Chunk_Num = control_Val_Chunk_NumParam;
    }

}
