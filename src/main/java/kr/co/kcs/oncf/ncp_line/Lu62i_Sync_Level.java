
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "lu62i-sync-level", ElementSize = 2, LocalName = "lu62i-sync-level")
public class Lu62i_Sync_Level
    implements Serializable, Sync_LevelMarker
{

    private short lu62i_Sync_Level;

    @DdlField(Version = "2.0", QualName = "lu62i-sync-level", ObjectClass = 1, Level = 1, Structure = 2, Offset = 202, ElementSize = 2, IdentifierElement = 155)
    public short getLu62i_Sync_Level() {
        return lu62i_Sync_Level;
    }

    public void setLu62i_Sync_Level(short lu62i_Sync_LevelParam) {
        this.lu62i_Sync_Level = lu62i_Sync_LevelParam;
    }

}
