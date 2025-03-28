
package kr.co.kcs.oncf.ncp_resp_qwritestat_sys;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "qwr-detail", ElementSize = 2884, LocalName = "qwr-detail")
public class Qwr_Detail
    implements Serializable, Var_DataMarker
{

    private short cmd_Id;
    private String qfilename;
    private short cmd_Status;
    private short[] start_Date_Time = new short[ 3 ] ;
    private short[] end_Date_Time = new short[ 3 ] ;
    private String src_Queue;
    private int req_First;
    private int req_Count;
    private int file_Bytes_Alloc;
    private int file_Bytes_Written;
    private int msgs_Written;
    private short msg_Typ;
    private short msg_Order;
    private short percent_Written;
    private short intvl_Cnt;
    private short intvl_Secs;
    private short last_Err;
    private short err_Detail;
    private short[] fill041022_1313 = new short[ 1391 ] ;

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

    @DdlField(Version = "2.0", QualName = "src-queue", ObjectClass = 1, Level = 2, Structure = 0, Offset = 54, ElementSize = 16, IdentifierElement = 9)
    public String getSrc_Queue() {
        return src_Queue;
    }

    public void setSrc_Queue(String src_QueueParam) {
        this.src_Queue = src_QueueParam;
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

    @DdlField(Version = "2.0", QualName = "file-bytes-alloc", ObjectClass = 1, Level = 2, Structure = 4, Offset = 78, ElementSize = 4, IdentifierElement = 12)
    public int getFile_Bytes_Alloc() {
        return file_Bytes_Alloc;
    }

    public void setFile_Bytes_Alloc(int file_Bytes_AllocParam) {
        this.file_Bytes_Alloc = file_Bytes_AllocParam;
    }

    @DdlField(Version = "2.0", QualName = "file-bytes-written", ObjectClass = 1, Level = 2, Structure = 4, Offset = 82, ElementSize = 4, IdentifierElement = 13)
    public int getFile_Bytes_Written() {
        return file_Bytes_Written;
    }

    public void setFile_Bytes_Written(int file_Bytes_WrittenParam) {
        this.file_Bytes_Written = file_Bytes_WrittenParam;
    }

    @DdlField(Version = "2.0", QualName = "msgs-written", ObjectClass = 1, Level = 2, Structure = 4, Offset = 86, ElementSize = 4, IdentifierElement = 14)
    public int getMsgs_Written() {
        return msgs_Written;
    }

    public void setMsgs_Written(int msgs_WrittenParam) {
        this.msgs_Written = msgs_WrittenParam;
    }

    @DdlField(Version = "2.0", QualName = "msg-typ", ObjectClass = 1, Level = 2, Structure = 2, Offset = 90, ElementSize = 2, IdentifierElement = 15)
    public short getMsg_Typ() {
        return msg_Typ;
    }

    public void setMsg_Typ(short msg_TypParam) {
        this.msg_Typ = msg_TypParam;
    }

    @DdlField(Version = "2.0", QualName = "msg-order", ObjectClass = 1, Level = 2, Structure = 2, Offset = 92, ElementSize = 2, IdentifierElement = 16)
    public short getMsg_Order() {
        return msg_Order;
    }

    public void setMsg_Order(short msg_OrderParam) {
        this.msg_Order = msg_OrderParam;
    }

    @DdlField(Version = "2.0", QualName = "percent-written", ObjectClass = 1, Level = 2, Structure = 2, Offset = 94, ElementSize = 2, IdentifierElement = 17)
    public short getPercent_Written() {
        return percent_Written;
    }

    public void setPercent_Written(short percent_WrittenParam) {
        this.percent_Written = percent_WrittenParam;
    }

    @DdlField(Version = "2.0", QualName = "intvl-cnt", ObjectClass = 1, Level = 2, Structure = 2, Offset = 96, ElementSize = 2, IdentifierElement = 18)
    public short getIntvl_Cnt() {
        return intvl_Cnt;
    }

    public void setIntvl_Cnt(short intvl_CntParam) {
        this.intvl_Cnt = intvl_CntParam;
    }

    @DdlField(Version = "2.0", QualName = "intvl-secs", ObjectClass = 1, Level = 2, Structure = 2, Offset = 98, ElementSize = 2, IdentifierElement = 19)
    public short getIntvl_Secs() {
        return intvl_Secs;
    }

    public void setIntvl_Secs(short intvl_SecsParam) {
        this.intvl_Secs = intvl_SecsParam;
    }

    @DdlField(Version = "2.0", QualName = "last-err", ObjectClass = 1, Level = 2, Structure = 2, Offset = 100, ElementSize = 2, IdentifierElement = 20)
    public short getLast_Err() {
        return last_Err;
    }

    public void setLast_Err(short last_ErrParam) {
        this.last_Err = last_ErrParam;
    }

    @DdlField(Version = "2.0", QualName = "err-detail", ObjectClass = 1, Level = 2, Structure = 2, Offset = 102, ElementSize = 2, IdentifierElement = 21)
    public short getErr_Detail() {
        return err_Detail;
    }

    public void setErr_Detail(short err_DetailParam) {
        this.err_Detail = err_DetailParam;
    }

    @DdlField(Version = "2.0", QualName = "fill041022-1313", ObjectClass = 1, Level = 2, Structure = 2, Offset = 104, ElementSize = 2, IdentifierElement = 22, OccursMax = 1391)
    public short[] getFill041022_1313() {
        return fill041022_1313;
    }

    @DdlField(Version = "2.0", QualName = "fill041022-1313", ObjectClass = 1, Level = 2, Structure = 2, Offset = 104, ElementSize = 2, IdentifierElement = 22, OccursMax = 1391)
    public short getFill041022_1313(int index) {
        return (fill041022_1313[index]);
    }

    public void setFill041022_1313(short[] fill041022_1313Param) {
        this.fill041022_1313 = fill041022_1313Param;
    }

    public void setFill041022_1313(int index, short fill041022_1313Param) {
        this.fill041022_1313[index]=fill041022_1313Param;
    }

}
