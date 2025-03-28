
package kr.co.kcs.oncf.ncp_resp_qwritestat_sys.mult;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "qwrites", ElementSize = 72, LocalName = "qwrites")
public class Qwrites
    implements Serializable
{

    private short cmd_Id;
    private short[] start_Date_Time = new short[ 3 ] ;
    private String src_Queue;
    private String qfilename;
    private short percent_Written;
    private short cmd_Status;
    private short[] fill041022_1315 = new short[ 4 ] ;

    @DdlField(Version = "2.0", QualName = "cmd-id", ObjectClass = 1, Level = 3, Structure = 2, Offset = 6, ElementSize = 2, IdentifierElement = 27)
    public short getCmd_Id() {
        return cmd_Id;
    }

    public void setCmd_Id(short cmd_IdParam) {
        this.cmd_Id = cmd_IdParam;
    }

    @DdlField(Version = "2.0", QualName = "start-date-time", ObjectClass = 1, Level = 3, Structure = 2, Offset = 8, ElementSize = 2, IdentifierElement = 28, OccursMax = 3)
    public short[] getStart_Date_Time() {
        return start_Date_Time;
    }

    @DdlField(Version = "2.0", QualName = "start-date-time", ObjectClass = 1, Level = 3, Structure = 2, Offset = 8, ElementSize = 2, IdentifierElement = 28, OccursMax = 3)
    public short getStart_Date_Time(int index) {
        return (start_Date_Time[index]);
    }

    public void setStart_Date_Time(short[] start_Date_TimeParam) {
        this.start_Date_Time = start_Date_TimeParam;
    }

    public void setStart_Date_Time(int index, short start_Date_TimeParam) {
        this.start_Date_Time[index]=start_Date_TimeParam;
    }

    @DdlField(Version = "2.0", QualName = "src-queue", ObjectClass = 1, Level = 3, Structure = 0, Offset = 14, ElementSize = 16, IdentifierElement = 29)
    public String getSrc_Queue() {
        return src_Queue;
    }

    public void setSrc_Queue(String src_QueueParam) {
        this.src_Queue = src_QueueParam;
    }

    @DdlField(Version = "2.0", QualName = "qfilename", ObjectClass = 1, Level = 3, Structure = 0, Offset = 30, ElementSize = 36, IdentifierElement = 30)
    public String getQfilename() {
        return qfilename;
    }

    public void setQfilename(String qfilenameParam) {
        this.qfilename = qfilenameParam;
    }

    @DdlField(Version = "2.0", QualName = "percent-written", ObjectClass = 1, Level = 3, Structure = 2, Offset = 66, ElementSize = 2, IdentifierElement = 31)
    public short getPercent_Written() {
        return percent_Written;
    }

    public void setPercent_Written(short percent_WrittenParam) {
        this.percent_Written = percent_WrittenParam;
    }

    @DdlField(Version = "2.0", QualName = "cmd-status", ObjectClass = 1, Level = 3, Structure = 2, Offset = 68, ElementSize = 2, IdentifierElement = 32)
    public short getCmd_Status() {
        return cmd_Status;
    }

    public void setCmd_Status(short cmd_StatusParam) {
        this.cmd_Status = cmd_StatusParam;
    }

    @DdlField(Version = "2.0", QualName = "fill041022-1315", ObjectClass = 1, Level = 3, Structure = 2, Offset = 70, ElementSize = 2, IdentifierElement = 33, OccursMax = 4)
    public short[] getFill041022_1315() {
        return fill041022_1315;
    }

    @DdlField(Version = "2.0", QualName = "fill041022-1315", ObjectClass = 1, Level = 3, Structure = 2, Offset = 70, ElementSize = 2, IdentifierElement = 33, OccursMax = 4)
    public short getFill041022_1315(int index) {
        return (fill041022_1315[index]);
    }

    public void setFill041022_1315(short[] fill041022_1315Param) {
        this.fill041022_1315 = fill041022_1315Param;
    }

    public void setFill041022_1315(int index, short fill041022_1315Param) {
        this.fill041022_1315[index]=fill041022_1315Param;
    }

}
