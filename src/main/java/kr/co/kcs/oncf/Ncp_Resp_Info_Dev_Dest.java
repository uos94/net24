
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_info_dev_dest.Devdest_List;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-info-dev-dest", ElementSize = 1158, LocalName = "ncp-resp-info-dev-dest")
public class Ncp_Resp_Info_Dev_Dest
    implements Serializable
{

    private short devdest_Number;
    private short devdest_Count;
    private Devdest_List[] devdest_List = new Devdest_List[ 32 ] ;
    private String devdest_Wildchar;
    private String fillrr;

    @DdlField(Version = "2.0", QualName = "devdest-number", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getDevdest_Number() {
        return devdest_Number;
    }

    public void setDevdest_Number(short devdest_NumberParam) {
        this.devdest_Number = devdest_NumberParam;
    }

    @DdlField(Version = "2.0", QualName = "devdest-count", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getDevdest_Count() {
        return devdest_Count;
    }

    public void setDevdest_Count(short devdest_CountParam) {
        this.devdest_Count = devdest_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "devdest-list", ObjectClass = 0, Level = 1, Structure = 0, Offset = 4, ElementSize = 36, IdentifierElement = 3, OccursMax = 32)
    public Devdest_List[] getDevdest_List() {
        return devdest_List;
    }

    @DdlField(Version = "2.0", QualName = "devdest-list", ObjectClass = 0, Level = 1, Structure = 0, Offset = 4, ElementSize = 36, IdentifierElement = 3, OccursMax = 32)
    public Devdest_List getDevdest_List(int index) {
        return (devdest_List[index]);
    }

    public void setDevdest_List(Devdest_List[] devdest_ListParam) {
        this.devdest_List = devdest_ListParam;
    }

    public void setDevdest_List(int index, Devdest_List devdest_ListParam) {
        this.devdest_List[index]=devdest_ListParam;
    }

    @DdlField(Version = "2.0", QualName = "devdest-wildchar", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1156, ElementSize = 1, IdentifierElement = 10)
    public String getDevdest_Wildchar() {
        return devdest_Wildchar;
    }

    public void setDevdest_Wildchar(String devdest_WildcharParam) {
        this.devdest_Wildchar = devdest_WildcharParam;
    }

    @DdlField(Version = "2.0", QualName = "fillrr", ObjectClass = 1, Level = 1, Structure = 0, Offset = 1157, ElementSize = 1, IdentifierElement = 11)
    public String getFillrr() {
        return fillrr;
    }

    public void setFillrr(String fillrrParam) {
        this.fillrr = fillrrParam;
    }

}
