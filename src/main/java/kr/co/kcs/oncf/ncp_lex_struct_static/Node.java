
package kr.co.kcs.oncf.ncp_lex_struct_static;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "node", ElementSize = 16, LocalName = "node")
public class Node
    implements Serializable, RnMarker
{

    private String node;

    @DdlField(Version = "2.0", QualName = "node", ObjectClass = 1, Level = 1, Structure = 0, Offset = 22, ElementSize = 16, IdentifierElement = 6)
    public String getNode() {
        return node;
    }

    public void setNode(String nodeParam) {
        this.node = nodeParam;
    }

}
