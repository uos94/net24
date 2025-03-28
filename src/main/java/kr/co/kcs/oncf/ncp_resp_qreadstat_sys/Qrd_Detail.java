
package kr.co.kcs.oncf.ncp_resp_qreadstat_sys;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "qrd-detail", ElementSize = 2884, LocalName = "qrd-detail")
public class Qrd_Detail
    implements Serializable, Var_DataMarker
{

    private short cmd_Id;
    private String qfilename;
    private short cmd_Status;
    private short[] start_Date_Time = new short[ 3 ] ;
    private short[] end_Date_Time = new short[ 3 ] ;
    private String dest_Queue;
    private int req_First;
    private int req_Count;
    private int msgs_Read;
    private int msgs_Used;
    private int file_Bytes_Ttl;
    private int file_Bytes_Read;
    private int first_Msg_Used;
    private int last_Msg_Used;
    private short msg_Typ;
    private short poss_Dup_Flg;
    private short percent_Read;
    private short intvl_Cnt;
    private short intvl_Secs;
    private short last_Err;
    private short err_Detail;
    private short[] fill041022_1230 = new short[ 1385 ] ;

    @DdlField(Version = "2.0", QualName = "cmd-id", ObjectClass = 1, Level = 2, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 4)
    public short getCmd_Id() {
        return cmd_Id;
    }

    public void setCmd_Id(short cmd_IdParam) {
        this.cmd_Id = cmd_IdParam;
    }

    @DdlField(Version = "2.0", QualName = "qfilename", ObjectClass = 1, Level = 2, Structure = 0, Offset = 4, ElementSize = 36, IdentifierElement = 5)
    public String getQfilename() {
        return qfilename;
    }

    public void setQfilename(String qfilenameParam) {
        this.qfilename = qfilenameParam;
    }

    @DdlField(Version = "2.0", QualName = "cmd-status", ObjectClass = 1, Level = 2, Structure = 2, Offset = 40, ElementSize = 2, IdentifierElement = 6)
    public short getCmd_Status() {
        return cmd_Status;
    }

    public void setCmd_Status(short cmd_StatusParam) {
        this.cmd_Status = cmd_StatusParam;
    }

    @DdlField(Version = "2.0", QualName = "start-date-time", ObjectClass = 1, Level = 2, Structure = 2, Offset = 42, ElementSize = 2, IdentifierElement = 7, OccursMax = 3)
    public short[] getStart_Date_Time() {
        return start_Date_Time;
    }

    @DdlField(Version = "2.0", QualName = "start-date-time", ObjectClass = 1, Level = 2, Structure = 2, Offset = 42, ElementSize = 2, IdentifierElement = 7, OccursMax = 3)
    public short getStart_Date_Time(int index) {
        return (start_Date_Time[index]);
    }

    public void setStart_Date_Time(short[] start_Date_TimeParam) {
        this.start_Date_Time = start_Date_TimeParam;
    }

    public void setStart_Date_Time(int index, short start_Date_TimeParam) {
        this.start_Date_Time[index]=start_Date_TimeParam;
    }

    @DdlField(Version = "2.0", QualName = "end-date-time", ObjectClass = 1, Level = 2, Structure = 2, Offset = 48, ElementSize = 2, IdentifierElement = 8, OccursMax = 3)
    public short[] getEnd_Date_Time() {
        return end_Date_Time;
    }

    @DdlField(Version = "2.0", QualName = "end-date-time", ObjectClass = 1, Level = 2, Structure = 2, Offset = 48, ElementSize = 2, IdentifierElement = 8, OccursMax = 3)
    public short getEnd_Date_Time(int index) {
        return (end_Date_Time[index]);
    }

    public void setEnd_Date_Time(short[] end_Date_TimeParam) {
        this.end_Date_Time = end_Date_TimeParam;
    }

    public void setEnd_Date_Time(int index, short end_Date_TimeParam) {
        this.end_Date_Time[index]=end_Date_TimeParam;
    }

    @DdlField(Version = "2.0", QualName = "dest-queue", ObjectClass = 1, Level = 2, Structure = 0, Offset = 54, ElementSize = 16, IdentifierElement = 9)
    public String getDest_Queue() {
        return dest_Queue;
    }

    public void setDest_Queue(String dest_QueueParam) {
        this.dest_Queue = dest_QueueParam;
    }

    @DdlField(Version = "2.0", QualName = "req-first", ObjectClass = 1, Level = 2, Structure = 4, Offset = 70, ElementSize = 4, IdentifierElement = 10)
    public int getReq_First() {
        return req_First;
    }

    public void setReq_First(int req_FirstParam) {
        this.req_First = req_FirstParam;
    }

    @DdlField(Version = "2.0", QualName = "req-count", ObjectClass = 1, Level = 2, Structure = 4, Offset = 74, ElementSize = 4, IdentifierElement = 11)
    public int getReq_Count() {
        return req_Count;
    }

    public void setReq_Count(int req_CountParam) {
        this.req_Count = req_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "msgs-read", ObjectClass = 1, Level = 2, Structure = 4, Offset = 78, ElementSize = 4, IdentifierElement = 12)
    public int getMsgs_Read() {
        return msgs_Read;
    }

    public void setMsgs_Read(int msgs_ReadParam) {
        this.msgs_Read = msgs_ReadParam;
    }

    @DdlField(Version = "2.0", QualName = "msgs-used", ObjectClass = 1, Level = 2, Structure = 4, Offset = 82, ElementSize = 4, IdentifierElement = 13)
    public int getMsgs_Used() {
        return msgs_Used;
    }

    public void setMsgs_Used(int msgs_UsedParam) {
        this.msgs_Used = msgs_UsedParam;
    }

    @DdlField(Version = "2.0", QualName = "file-bytes-ttl", ObjectClass = 1, Level = 2, Structure = 4, Offset = 86, ElementSize = 4, IdentifierElement = 14)
    public int getFile_Bytes_Ttl() {
        return file_Bytes_Ttl;
    }

    public void setFile_Bytes_Ttl(int file_Bytes_TtlParam) {
        this.file_Bytes_Ttl = file_Bytes_TtlParam;
    }

    @DdlField(Version = "2.0", QualName = "file-bytes-read", ObjectClass = 1, Level = 2, Structure = 4, Offset = 90, ElementSize = 4, IdentifierElement = 15)
    public int getFile_Bytes_Read() {
        return file_Bytes_Read;
    }

    public void setFile_Bytes_Read(int file_Bytes_ReadParam) {
        this.file_Bytes_Read = file_Bytes_ReadParam;
    }

    @DdlField(Version = "2.0", QualName = "first-msg-used", ObjectClass = 1, Level = 2, Structure = 4, Offset = 94, ElementSize = 4, IdentifierElement = 16)
    public int getFirst_Msg_Used() {
        return first_Msg_Used;
    }

    public void setFirst_Msg_Used(int first_Msg_UsedParam) {
        this.first_Msg_Used = first_Msg_UsedParam;
    }

    @DdlField(Version = "2.0", QualName = "last-msg-used", ObjectClass = 1, Level = 2, Structure = 4, Offset = 98, ElementSize = 4, IdentifierElement = 17)
    public int getLast_Msg_Used() {
        return last_Msg_Used;
    }

    public void setLast_Msg_Used(int last_Msg_UsedParam) {
        this.last_Msg_Used = last_Msg_UsedParam;
    }

    @DdlField(Version = "2.0", QualName = "msg-typ", ObjectClass = 1, Level = 2, Structure = 2, Offset = 102, ElementSize = 2, IdentifierElement = 18)
    public short getMsg_Typ() {
        return msg_Typ;
    }

    public void setMsg_Typ(short msg_TypParam) {
        this.msg_Typ = msg_TypParam;
    }

    @DdlField(Version = "2.0", QualName = "poss-dup-flg", ObjectClass = 1, Level = 2, Structure = 2, Offset = 104, ElementSize = 2, IdentifierElement = 19)
    public short getPoss_Dup_Flg() {
        return poss_Dup_Flg;
    }

    public void setPoss_Dup_Flg(short poss_Dup_FlgParam) {
        this.poss_Dup_Flg = poss_Dup_FlgParam;
    }

    @DdlField(Version = "2.0", QualName = "percent-read", ObjectClass = 1, Level = 2, Structure = 2, Offset = 106, ElementSize = 2, IdentifierElement = 20)
    public short getPercent_Read() {
        return percent_Read;
    }

    public void setPercent_Read(short percent_ReadParam) {
        this.percent_Read = percent_ReadParam;
    }

    @DdlField(Version = "2.0", QualName = "intvl-cnt", ObjectClass = 1, Level = 2, Structure = 2, Offset = 108, ElementSize = 2, IdentifierElement = 21)
    public short getIntvl_Cnt() {
        return intvl_Cnt;
    }

    public void setIntvl_Cnt(short intvl_CntParam) {
        this.intvl_Cnt = intvl_CntParam;
    }

    @DdlField(Version = "2.0", QualName = "intvl-secs", ObjectClass = 1, Level = 2, Structure = 2, Offset = 110, ElementSize = 2, IdentifierElement = 22)
    public short getIntvl_Secs() {
        return intvl_Secs;
    }

    public void setIntvl_Secs(short intvl_SecsParam) {
        this.intvl_Secs = intvl_SecsParam;
    }

    @DdlField(Version = "2.0", QualName = "last-err", ObjectClass = 1, Level = 2, Structure = 2, Offset = 112, ElementSize = 2, IdentifierElement = 23)
    public short getLast_Err() {
        return last_Err;
    }

    public void setLast_Err(short last_ErrParam) {
        this.last_Err = last_ErrParam;
    }

    @DdlField(Version = "2.0", QualName = "err-detail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 114, ElementSize = 2, IdentifierElement = 24)
    public short getErr_Detail() {
        return err_Detail;
    }

    public void setErr_Detail(short err_DetailParam) {
        this.err_Detail = err_DetailParam;
    }

    @DdlField(Version = "2.0", QualName = "fill041022-1230", ObjectClass = 1, Level = 2, Structure = 2, Offset = 116, ElementSize = 2, IdentifierElement = 25, OccursMax = 1385)
    public short[] getFill041022_1230() {
        return fill041022_1230;
    }

    @DdlField(Version = "2.0", QualName = "fill041022-1230", ObjectClass = 1, Level = 2, Structure = 2, Offset = 116, ElementSize = 2, IdentifierElement = 25, OccursMax = 1385)
    public short getFill041022_1230(int index) {
        return (fill041022_1230[index]);
    }

    public void setFill041022_1230(short[] fill041022_1230Param) {
        this.fill041022_1230 = fill041022_1230Param;
    }

    public void setFill041022_1230(int index, short fill041022_1230Param) {
        this.fill041022_1230[index]=fill041022_1230Param;
    }

}
