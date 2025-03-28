
package kr.co.kcs.oncf.ncp_resp_hinfo_sta.sta.udata;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "data", ElementSize = 2, LocalName = "data")
public class Data
    implements Serializable, Data_SMarker
{

    private short[] data = new short[ 100 ] ;

    @DdlField(Version = "2.0", QualName = "data", ObjectClass = 1, Level = 3, Structure = 3, Offset = 362, ElementSize = 2, IdentifierElement = 36, OccursMax = 100)
    public short[] getData() {
        return data;
    }

    @DdlField(Version = "2.0", QualName = "data", ObjectClass = 1, Level = 3, Structure = 3, Offset = 362, ElementSize = 2, IdentifierElement = 36, OccursMax = 100)
    public short getData(int index) {
        return (data[index]);
    }

    public void setData(short[] dataParam) {
        this.data = dataParam;
    }

    public void setData(int index, short dataParam) {
        this.data[index]=dataParam;
    }

}
