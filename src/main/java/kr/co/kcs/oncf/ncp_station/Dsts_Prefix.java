
package kr.co.kcs.oncf.ncp_station;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "dsts-prefix", ElementSize = 2, LocalName = "dsts-prefix")
public class Dsts_Prefix
    implements Serializable, Dsts_Prefix_SMarker
{

    private short[] dsts_Prefix = new short[ 6 ] ;

    @DdlField(Version = "2.0", QualName = "dsts-prefix", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1158, ElementSize = 2, IdentifierElement = 172, OccursMax = 6)
    public short[] getDsts_Prefix() {
        return dsts_Prefix;
    }

    @DdlField(Version = "2.0", QualName = "dsts-prefix", ObjectClass = 1, Level = 1, Structure = 3, Offset = 1158, ElementSize = 2, IdentifierElement = 172, OccursMax = 6)
    public short getDsts_Prefix(int index) {
        return (dsts_Prefix[index]);
    }

    public void setDsts_Prefix(short[] dsts_PrefixParam) {
        this.dsts_Prefix = dsts_PrefixParam;
    }

    public void setDsts_Prefix(int index, short dsts_PrefixParam) {
        this.dsts_Prefix[index]=dsts_PrefixParam;
    }

}
