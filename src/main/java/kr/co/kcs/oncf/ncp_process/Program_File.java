
package kr.co.kcs.oncf.ncp_process;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "program-file", ElementSize = 34, LocalName = "program-file")
public class Program_File
    implements Serializable, Object_FileMarker
{

    private String program_File;

    @DdlField(Version = "2.0", QualName = "program-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 94, ElementSize = 34, IdentifierElement = 13)
    public String getProgram_File() {
        return program_File;
    }

    public void setProgram_File(String program_FileParam) {
        this.program_File = program_FileParam;
    }

}
