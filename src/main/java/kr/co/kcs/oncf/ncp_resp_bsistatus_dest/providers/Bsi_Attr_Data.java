
package kr.co.kcs.oncf.ncp_resp_bsistatus_dest.providers;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "bsi-attr-data", ElementSize = 100, LocalName = "bsi-attr-data")
public class Bsi_Attr_Data
    implements Serializable, Bsi_Attr_DataMarker
{

    private String bsi_Attr_Data;

    @DdlField(Version = "2.0", QualName = "bsi-attr-data", ObjectClass = 1, Level = 2, Structure = 0, Offset = 280, ElementSize = 100, IdentifierElement = 19)
    public String getBsi_Attr_Data() {
        return bsi_Attr_Data;
    }

    public void setBsi_Attr_Data(String bsi_Attr_DataParam) {
        this.bsi_Attr_Data = bsi_Attr_DataParam;
    }

}
