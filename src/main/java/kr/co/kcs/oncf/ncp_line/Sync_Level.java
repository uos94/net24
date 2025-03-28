
package kr.co.kcs.oncf.ncp_line;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "sync-level", ElementSize = 2, LocalName = "sync-level")
public class Sync_Level
    implements Serializable, Sync_LevelMarker
{

    private short sync_Level;

    @DdlField(Version = "2.0", QualName = "sync-level", ObjectClass = 1, Level = 1, Structure = 2, Offset = 202, ElementSize = 2, IdentifierElement = 154)
    public short getSync_Level() {
        return sync_Level;
    }

    public void setSync_Level(short sync_LevelParam) {
        this.sync_Level = sync_LevelParam;
    }

}
