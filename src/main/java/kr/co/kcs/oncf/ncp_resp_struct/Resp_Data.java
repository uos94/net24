
package kr.co.kcs.oncf.ncp_resp_struct;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "resp-data", ElementSize = 2, LocalName = "resp-data")
public class Resp_Data
    implements Serializable, Resp_Data_SMarker
{

    private short[] resp_Data = new short[ 1859 ] ;

    @DdlField(Version = "2.0", QualName = "resp-data", ObjectClass = 1, Level = 1, Structure = 2, Offset = 72, ElementSize = 2, IdentifierElement = 10, OccursMax = 1859)
    public short[] getResp_Data() {
        return resp_Data;
    }

    @DdlField(Version = "2.0", QualName = "resp-data", ObjectClass = 1, Level = 1, Structure = 2, Offset = 72, ElementSize = 2, IdentifierElement = 10, OccursMax = 1859)
    public short getResp_Data(int index) {
        return (resp_Data[index]);
    }

    public void setResp_Data(short[] resp_DataParam) {
        this.resp_Data = resp_DataParam;
    }

    public void setResp_Data(int index, short resp_DataParam) {
        this.resp_Data[index]=resp_DataParam;
    }

}
