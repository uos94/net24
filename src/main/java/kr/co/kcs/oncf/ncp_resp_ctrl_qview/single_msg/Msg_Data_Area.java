
package kr.co.kcs.oncf.ncp_resp_ctrl_qview.single_msg;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "msg-data-area", ElementSize = 2, LocalName = "msg-data-area")
public class Msg_Data_Area
    implements Serializable, Msg_Data_Area_SMarker
{

    private short[] msg_Data_Area = new short[ 1600 ] ;

    @DdlField(Version = "2.0", QualName = "msg-data-area", ObjectClass = 1, Level = 2, Structure = 2, Offset = 40, ElementSize = 2, IdentifierElement = 19, OccursMax = 1600)
    public short[] getMsg_Data_Area() {
        return msg_Data_Area;
    }

    @DdlField(Version = "2.0", QualName = "msg-data-area", ObjectClass = 1, Level = 2, Structure = 2, Offset = 40, ElementSize = 2, IdentifierElement = 19, OccursMax = 1600)
    public short getMsg_Data_Area(int index) {
        return (msg_Data_Area[index]);
    }

    public void setMsg_Data_Area(short[] msg_Data_AreaParam) {
        this.msg_Data_Area = msg_Data_AreaParam;
    }

    public void setMsg_Data_Area(int index, short msg_Data_AreaParam) {
        this.msg_Data_Area[index]=msg_Data_AreaParam;
    }

}
