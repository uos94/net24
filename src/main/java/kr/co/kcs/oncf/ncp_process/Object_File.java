
package kr.co.kcs.oncf.ncp_process;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "object-file", ElementSize = 34, LocalName = "object-file")
public class Object_File
    implements Serializable, Object_FileMarker
{

    private String object_File;

    @DdlField(Version = "2.0", QualName = "object-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 94, ElementSize = 34, IdentifierElement = 12)
    public String getObject_File() {
        return object_File;
    }

    public void setObject_File(String object_FileParam) {
        this.object_File = object_FileParam;
    }

}
