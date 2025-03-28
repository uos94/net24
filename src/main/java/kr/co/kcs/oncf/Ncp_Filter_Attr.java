
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_filter_attr.Attr_Data_SMarker;
import kr.co.kcs.oncf.ncp_filter_attr.Attr_Text_SMarker;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

@DdlGroup(Version = "2.0", QualName = "ncp-filter-attr", ElementSize = 402, LocalName = "ncp-filter-attr")
public class Ncp_Filter_Attr
    implements Serializable
{

    private short attr_Vty;
    private short attr_Val_Int;
    private int attr_Val_Int32;
    private long attr_Val_Fixed;
    private short data_Is_Pattern;
    private short attr_Data_Len;
    private Attr_Data_SMarker attr_Data_S;
    private short attr_Text_Len;
    private Attr_Text_SMarker attr_Text_S;

    @DdlField(Version = "2.0", QualName = "attr-vty", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getAttr_Vty() {
        return attr_Vty;
    }

    public void setAttr_Vty(short attr_VtyParam) {
        this.attr_Vty = attr_VtyParam;
    }

    @DdlField(Version = "2.0", QualName = "attr-val-int", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getAttr_Val_Int() {
        return attr_Val_Int;
    }

    public void setAttr_Val_Int(short attr_Val_IntParam) {
        this.attr_Val_Int = attr_Val_IntParam;
    }

    @DdlField(Version = "2.0", QualName = "attr-val-int32", ObjectClass = 1, Level = 1, Structure = 4, Offset = 4, ElementSize = 4, IdentifierElement = 3)
    public int getAttr_Val_Int32() {
        return attr_Val_Int32;
    }

    public void setAttr_Val_Int32(int attr_Val_Int32Param) {
        this.attr_Val_Int32 = attr_Val_Int32Param;
    }

    @DdlField(Version = "2.0", QualName = "attr-val-fixed", ObjectClass = 1, Level = 1, Structure = 6, Offset = 8, ElementSize = 8, IdentifierElement = 4)
    public long getAttr_Val_Fixed() {
        return attr_Val_Fixed;
    }

    public void setAttr_Val_Fixed(long attr_Val_FixedParam) {
        this.attr_Val_Fixed = attr_Val_FixedParam;
    }

    @DdlField(Version = "2.0", QualName = "data-is-pattern", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 5)
    public short getData_Is_Pattern() {
        return data_Is_Pattern;
    }

    public void setData_Is_Pattern(short data_Is_PatternParam) {
        this.data_Is_Pattern = data_Is_PatternParam;
    }

    @DdlField(Version = "2.0", QualName = "attr-data-len", ObjectClass = 1, Level = 1, Structure = 2, Offset = 18, ElementSize = 2, IdentifierElement = 6)
    public short getAttr_Data_Len() {
        return attr_Data_Len;
    }

    public void setAttr_Data_Len(short attr_Data_LenParam) {
        this.attr_Data_Len = attr_Data_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "attr-data-s", ObjectClass = 1, Level = 1, Structure = 0, Offset = 20, ElementSize = 300, IdentifierElement = 7, ValidationPattern = "\\p{Sc}{0,300}")
    @ReturnType("kr.co.kcs.oncf.ncp_filter_attr.Attr_Data_S")
    public Attr_Data_SMarker getAttr_Data_S() {
        return attr_Data_S;
    }

    public void setAttr_Data_S(Attr_Data_SMarker attr_Data_SParam) {
        this.attr_Data_S = attr_Data_SParam;
    }

    @DdlField(Version = "2.0", QualName = "attr-text-len", ObjectClass = 1, Level = 1, Structure = 2, Offset = 320, ElementSize = 2, IdentifierElement = 9)
    public short getAttr_Text_Len() {
        return attr_Text_Len;
    }

    public void setAttr_Text_Len(short attr_Text_LenParam) {
        this.attr_Text_Len = attr_Text_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "attr-text-s", ObjectClass = 1, Level = 1, Structure = 0, Offset = 322, ElementSize = 80, IdentifierElement = 10, ValidationPattern = "\\p{Sc}{0,80}")
    @ReturnType("kr.co.kcs.oncf.ncp_filter_attr.Attr_Text_S")
    public Attr_Text_SMarker getAttr_Text_S() {
        return attr_Text_S;
    }

    public void setAttr_Text_S(Attr_Text_SMarker attr_Text_SParam) {
        this.attr_Text_S = attr_Text_SParam;
    }

}
