
package kr.co.kcs.oncf.ncp_resp_qreadstat_sys.mult;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "qreads", ElementSize = 72, LocalName = "qreads")
public class Qreads
    implements Serializable
{

    private short cmd_Id;
    private short[] start_Date_Time = new short[ 3 ] ;
    private String dest_Queue;
    private String qfilename;
    private short percent_Read;
    private short cmd_Status;
    private short[] fill041022_1235 = new short[ 4 ] ;

    @DdlField(Version = "2.0", QualName = "cmd-id", ObjectClass = 1, Level = 3, Structure = 2, Offset = 6, ElementSize = 2, IdentifierElement = 30)
    public short getCmd_Id() {
        return cmd_Id;
    }

    public void setCmd_Id(short cmd_IdParam) {
        this.cmd_Id = cmd_IdParam;
    }

    @DdlField(Version = "2.0", QualName = "start-date-time", ObjectClass = 1, Level = 3, Structure = 2, Offset = 8, ElementSize = 2, IdentifierElement = 31, OccursMax = 3)
    public short[] getStart_Date_Time() {
        return start_Date_Time;
    }

    @DdlField(Version = "2.0", QualName = "start-date-time", ObjectClass = 1, Level = 3, Structure = 2, Offset = 8, ElementSize = 2, IdentifierElement = 31, OccursMax = 3)
    public short getStart_Date_Time(int index) {
        return (start_Date_Time[index]);
    }

    public void setStart_Date_Time(short[] start_Date_TimeParam) {
        this.start_Date_Time = start_Date_TimeParam;
    }

    public void setStart_Date_Time(int index, short start_Date_TimeParam) {
        this.start_Date_Time[index]=start_Date_TimeParam;
    }

    @DdlField(Version = "2.0", QualName = "dest-queue", ObjectClass = 1, Level = 3, Structure = 0, Offset = 14, ElementSize = 16, IdentifierElement = 32)
    public String getDest_Queue() {
        return dest_Queue;
    }

    public void setDest_Queue(String dest_QueueParam) {
        this.dest_Queue = dest_QueueParam;
    }

    @DdlField(Version = "2.0", QualName = "qfilename", ObjectClass = 1, Level = 3, Structure = 0, Offset = 30, ElementSize = 36, IdentifierElement = 33)
    public String getQfilename() {
        return qfilename;
    }

    public void setQfilename(String qfilenameParam) {
        this.qfilename = qfilenameParam;
    }

    @DdlField(Version = "2.0", QualName = "percent-read", ObjectClass = 1, Level = 3, Structure = 2, Offset = 66, ElementSize = 2, IdentifierElement = 34)
    public short getPercent_Read() {
        return percent_Read;
    }

    public void setPercent_Read(short percent_ReadParam) {
        this.percent_Read = percent_ReadParam;
    }

    @DdlField(Version = "2.0", QualName = "cmd-status", ObjectClass = 1, Level = 3, Structure = 2, Offset = 68, ElementSize = 2, IdentifierElement = 35)
    public short getCmd_Status() {
        return cmd_Status;
    }

    public void setCmd_Status(short cmd_StatusParam) {
        this.cmd_Status = cmd_StatusParam;
    }

    @DdlField(Version = "2.0", QualName = "fill041022-1235", ObjectClass = 1, Level = 3, Structure = 2, Offset = 70, ElementSize = 2, IdentifierElement = 36, OccursMax = 4)
    public short[] getFill041022_1235() {
        return fill041022_1235;
    }

    @DdlField(Version = "2.0", QualName = "fill041022-1235", ObjectClass = 1, Level = 3, Structure = 2, Offset = 70, ElementSize = 2, IdentifierElement = 36, OccursMax = 4)
    public short getFill041022_1235(int index) {
        return (fill041022_1235[index]);
    }

    public void setFill041022_1235(short[] fill041022_1235Param) {
        this.fill041022_1235 = fill041022_1235Param;
    }

    public void setFill041022_1235(int index, short fill041022_1235Param) {
        this.fill041022_1235[index]=fill041022_1235Param;
    }

}
