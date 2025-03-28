
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-control-qwrite", ElementSize = 56, LocalName = "ncp-req-control-qwrite")
public class Ncp_Req_Control_Qwrite
    implements Serializable
{

    private String control_Val_Filename;
    private short control_Val_Msg_Type;
    private short control_Val_Msg_Count;
    private short control_Val_Qorder;
    private int control_Val_Msg_Count32;
    private short control_Val_Interval;
    private short control_Val_Msg_Intcount;
    private int control_Val_First32;
    private short control_Val_Filecode;

    @DdlField(Version = "2.0", QualName = "control-val-filename", ObjectClass = 1, Level = 1, Structure = 0, Offset = 0, ElementSize = 36, IdentifierElement = 1)
    public String getControl_Val_Filename() {
        return control_Val_Filename;
    }

    public void setControl_Val_Filename(String control_Val_FilenameParam) {
        this.control_Val_Filename = control_Val_FilenameParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-msg-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 36, ElementSize = 2, IdentifierElement = 2)
    public short getControl_Val_Msg_Type() {
        return control_Val_Msg_Type;
    }

    public void setControl_Val_Msg_Type(short control_Val_Msg_TypeParam) {
        this.control_Val_Msg_Type = control_Val_Msg_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-msg-count", ObjectClass = 1, Level = 1, Structure = 2, Offset = 38, ElementSize = 2, IdentifierElement = 3)
    public short getControl_Val_Msg_Count() {
        return control_Val_Msg_Count;
    }

    public void setControl_Val_Msg_Count(short control_Val_Msg_CountParam) {
        this.control_Val_Msg_Count = control_Val_Msg_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-qorder", ObjectClass = 1, Level = 1, Structure = 2, Offset = 40, ElementSize = 2, IdentifierElement = 4)
    public short getControl_Val_Qorder() {
        return control_Val_Qorder;
    }

    public void setControl_Val_Qorder(short control_Val_QorderParam) {
        this.control_Val_Qorder = control_Val_QorderParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-msg-count32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 42, ElementSize = 4, IdentifierElement = 5)
    public int getControl_Val_Msg_Count32() {
        return control_Val_Msg_Count32;
    }

    public void setControl_Val_Msg_Count32(int control_Val_Msg_Count32Param) {
        this.control_Val_Msg_Count32 = control_Val_Msg_Count32Param;
    }

    @DdlField(Version = "2.0", QualName = "control-val-interval", ObjectClass = 1, Level = 1, Structure = 2, Offset = 46, ElementSize = 2, IdentifierElement = 6)
    public short getControl_Val_Interval() {
        return control_Val_Interval;
    }

    public void setControl_Val_Interval(short control_Val_IntervalParam) {
        this.control_Val_Interval = control_Val_IntervalParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-msg-intcount", ObjectClass = 1, Level = 1, Structure = 2, Offset = 48, ElementSize = 2, IdentifierElement = 7)
    public short getControl_Val_Msg_Intcount() {
        return control_Val_Msg_Intcount;
    }

    public void setControl_Val_Msg_Intcount(short control_Val_Msg_IntcountParam) {
        this.control_Val_Msg_Intcount = control_Val_Msg_IntcountParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-first32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 50, ElementSize = 4, IdentifierElement = 8)
    public int getControl_Val_First32() {
        return control_Val_First32;
    }

    public void setControl_Val_First32(int control_Val_First32Param) {
        this.control_Val_First32 = control_Val_First32Param;
    }

    @DdlField(Version = "2.0", QualName = "control-val-filecode", ObjectClass = 1, Level = 1, Structure = 2, Offset = 54, ElementSize = 2, IdentifierElement = 9)
    public short getControl_Val_Filecode() {
        return control_Val_Filecode;
    }

    public void setControl_Val_Filecode(short control_Val_FilecodeParam) {
        this.control_Val_Filecode = control_Val_FilecodeParam;
    }

}
