
package kr.co.kcs.oncf.ncp_resp_ctrl_qview;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_ctrl_qview.single_msg.Msg_Data_Area_SMarker;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

@DdlGroup(Version = "2.0", QualName = "single-msg", ElementSize = 3232, LocalName = "single-msg")
public class Single_Msg
    implements Serializable, Single_MsgMarker
{

    private int msg_Id;
    private short full_Msg_Lgth;
    private short udata_Lgth;
    private short text_Lgth;
    private short payload_Lgth;
    private short hdr_Present;
    private short last_Msg_Byte_Ofst_Returned;
    private short chunk_Num;
    private short chunks_Ttl;
    private int chunks_Ttl_Text_Lgth;
    private short[] fil040830_1423 = new short[ 2 ] ;
    private short fail_Cde;
    private short msg_Data_Lgth;
    private Msg_Data_Area_SMarker msg_Data_Area_S;

    @DdlField(Version = "2.0", QualName = "msg-id", ObjectClass = 1, Level = 2, Structure = 4, Offset = 8, ElementSize = 4, IdentifierElement = 5)
    public int getMsg_Id() {
        return msg_Id;
    }

    public void setMsg_Id(int msg_IdParam) {
        this.msg_Id = msg_IdParam;
    }

    @DdlField(Version = "2.0", QualName = "full-msg-lgth", ObjectClass = 1, Level = 2, Structure = 2, Offset = 12, ElementSize = 2, IdentifierElement = 6)
    public short getFull_Msg_Lgth() {
        return full_Msg_Lgth;
    }

    public void setFull_Msg_Lgth(short full_Msg_LgthParam) {
        this.full_Msg_Lgth = full_Msg_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "udata-lgth", ObjectClass = 1, Level = 2, Structure = 2, Offset = 14, ElementSize = 2, IdentifierElement = 7)
    public short getUdata_Lgth() {
        return udata_Lgth;
    }

    public void setUdata_Lgth(short udata_LgthParam) {
        this.udata_Lgth = udata_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "text-lgth", ObjectClass = 1, Level = 2, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 8)
    public short getText_Lgth() {
        return text_Lgth;
    }

    public void setText_Lgth(short text_LgthParam) {
        this.text_Lgth = text_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "payload-lgth", ObjectClass = 1, Level = 2, Structure = 2, Offset = 18, ElementSize = 2, IdentifierElement = 9)
    public short getPayload_Lgth() {
        return payload_Lgth;
    }

    public void setPayload_Lgth(short payload_LgthParam) {
        this.payload_Lgth = payload_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "hdr-present", ObjectClass = 1, Level = 2, Structure = 2, Offset = 20, ElementSize = 2, IdentifierElement = 10)
    public short getHdr_Present() {
        return hdr_Present;
    }

    public void setHdr_Present(short hdr_PresentParam) {
        this.hdr_Present = hdr_PresentParam;
    }

    @DdlField(Version = "2.0", QualName = "last-msg-byte-ofst-returned", ObjectClass = 1, Level = 2, Structure = 2, Offset = 22, ElementSize = 2, IdentifierElement = 11)
    public short getLast_Msg_Byte_Ofst_Returned() {
        return last_Msg_Byte_Ofst_Returned;
    }

    public void setLast_Msg_Byte_Ofst_Returned(short last_Msg_Byte_Ofst_ReturnedParam) {
        this.last_Msg_Byte_Ofst_Returned = last_Msg_Byte_Ofst_ReturnedParam;
    }

    @DdlField(Version = "2.0", QualName = "chunk-num", ObjectClass = 1, Level = 2, Structure = 2, Offset = 24, ElementSize = 2, IdentifierElement = 12)
    public short getChunk_Num() {
        return chunk_Num;
    }

    public void setChunk_Num(short chunk_NumParam) {
        this.chunk_Num = chunk_NumParam;
    }

    @DdlField(Version = "2.0", QualName = "chunks-ttl", ObjectClass = 1, Level = 2, Structure = 2, Offset = 26, ElementSize = 2, IdentifierElement = 13)
    public short getChunks_Ttl() {
        return chunks_Ttl;
    }

    public void setChunks_Ttl(short chunks_TtlParam) {
        this.chunks_Ttl = chunks_TtlParam;
    }

    @DdlField(Version = "2.0", QualName = "chunks-ttl-text-lgth", ObjectClass = 1, Level = 2, Structure = 4, Offset = 28, ElementSize = 4, IdentifierElement = 14)
    public int getChunks_Ttl_Text_Lgth() {
        return chunks_Ttl_Text_Lgth;
    }

    public void setChunks_Ttl_Text_Lgth(int chunks_Ttl_Text_LgthParam) {
        this.chunks_Ttl_Text_Lgth = chunks_Ttl_Text_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "fil040830-1423", ObjectClass = 1, Level = 2, Structure = 2, Offset = 32, ElementSize = 2, IdentifierElement = 15, OccursMax = 2)
    public short[] getFil040830_1423() {
        return fil040830_1423;
    }

    @DdlField(Version = "2.0", QualName = "fil040830-1423", ObjectClass = 1, Level = 2, Structure = 2, Offset = 32, ElementSize = 2, IdentifierElement = 15, OccursMax = 2)
    public short getFil040830_1423(int index) {
        return (fil040830_1423[index]);
    }

    public void setFil040830_1423(short[] fil040830_1423Param) {
        this.fil040830_1423 = fil040830_1423Param;
    }

    public void setFil040830_1423(int index, short fil040830_1423Param) {
        this.fil040830_1423[index]=fil040830_1423Param;
    }

    @DdlField(Version = "2.0", QualName = "fail-cde", ObjectClass = 1, Level = 2, Structure = 2, Offset = 36, ElementSize = 2, IdentifierElement = 16)
    public short getFail_Cde() {
        return fail_Cde;
    }

    public void setFail_Cde(short fail_CdeParam) {
        this.fail_Cde = fail_CdeParam;
    }

    @DdlField(Version = "2.0", QualName = "msg-data-lgth", ObjectClass = 1, Level = 2, Structure = 2, Offset = 38, ElementSize = 2, IdentifierElement = 17)
    public short getMsg_Data_Lgth() {
        return msg_Data_Lgth;
    }

    public void setMsg_Data_Lgth(short msg_Data_LgthParam) {
        this.msg_Data_Lgth = msg_Data_LgthParam;
    }

    @DdlField(Version = "2.0", QualName = "msg-data-area-s", ObjectClass = 1, Level = 2, Structure = 0, Offset = 40, ElementSize = 3200, IdentifierElement = 18, ValidationPattern = "\\p{Sc}{0,3200}")
    @ReturnType("kr.co.kcs.oncf.ncp_resp_ctrl_qview.single_msg.Msg_Data_Area_S")
    public Msg_Data_Area_SMarker getMsg_Data_Area_S() {
        return msg_Data_Area_S;
    }

    public void setMsg_Data_Area_S(Msg_Data_Area_SMarker msg_Data_Area_SParam) {
        this.msg_Data_Area_S = msg_Data_Area_SParam;
    }

}
