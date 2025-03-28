
package kr.co.kcs.oncf;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_info_dev_prot.Devprot_List;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-info-dev-prot", ElementSize = 646, LocalName = "ncp-resp-info-dev-prot")
public class Ncp_Resp_Info_Dev_Prot
    implements Serializable
{

    private short devprot_Number;
    private short devprot_Count;
    private Devprot_List[] devprot_List = new Devprot_List[ 32 ] ;
    private String devprot_Wildchar;
    private String fillrr;

    @DdlField(Version = "2.0", QualName = "devprot-number", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getDevprot_Number() {
        return devprot_Number;
    }

    public void setDevprot_Number(short devprot_NumberParam) {
        this.devprot_Number = devprot_NumberParam;
    }

    @DdlField(Version = "2.0", QualName = "devprot-count", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getDevprot_Count() {
        return devprot_Count;
    }

    public void setDevprot_Count(short devprot_CountParam) {
        this.devprot_Count = devprot_CountParam;
    }

    @DdlField(Version = "2.0", QualName = "devprot-list", ObjectClass = 0, Level = 1, Structure = 0, Offset = 4, ElementSize = 20, IdentifierElement = 3, OccursMax = 32)
    public Devprot_List[] getDevprot_List() {
        return devprot_List;
    }

    @DdlField(Version = "2.0", QualName = "devprot-list", ObjectClass = 0, Level = 1, Structure = 0, Offset = 4, ElementSize = 20, IdentifierElement = 3, OccursMax = 32)
    public Devprot_List getDevprot_List(int index) {
        return (devprot_List[index]);
    }

    public void setDevprot_List(Devprot_List[] devprot_ListParam) {
        this.devprot_List = devprot_ListParam;
    }

    public void setDevprot_List(int index, Devprot_List devprot_ListParam) {
        this.devprot_List[index]=devprot_ListParam;
    }

    @DdlField(Version = "2.0", QualName = "devprot-wildchar", ObjectClass = 1, Level = 1, Structure = 0, Offset = 644, ElementSize = 1, IdentifierElement = 9)
    public String getDevprot_Wildchar() {
        return devprot_Wildchar;
    }

    public void setDevprot_Wildchar(String devprot_WildcharParam) {
        this.devprot_Wildchar = devprot_WildcharParam;
    }

    @DdlField(Version = "2.0", QualName = "fillrr", ObjectClass = 1, Level = 1, Structure = 0, Offset = 645, ElementSize = 1, IdentifierElement = 10)
    public String getFillrr() {
        return fillrr;
    }

    public void setFillrr(String fillrrParam) {
        this.fillrr = fillrrParam;
    }

}
