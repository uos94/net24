
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-alter-filename", ElementSize = 48, LocalName = "ncp-req-alter-filename")
public class Ncp_Req_Alter_Filename
    implements Serializable
{

    private String alter_Val_Filename;
    private byte alter_Val_Filenamelen;

    @DdlField(Version = "2.0", QualName = "alter-val-filename", ObjectClass = 1, Level = 1, Structure = 0, Offset = 0, ElementSize = 47, IdentifierElement = 1)
    public String getAlter_Val_Filename() {
        return alter_Val_Filename;
    }

    public void setAlter_Val_Filename(String alter_Val_FilenameParam) {
        this.alter_Val_Filename = alter_Val_FilenameParam;
    }

    @DdlField(Version = "2.0", QualName = "alter-val-filenamelen", ObjectClass = 1, Level = 1, Structure = 22, Offset = 47, ElementSize = 1, IdentifierElement = 2)
    public byte getAlter_Val_Filenamelen() {
        return alter_Val_Filenamelen;
    }

    public void setAlter_Val_Filenamelen(byte alter_Val_FilenamelenParam) {
        this.alter_Val_Filenamelen = alter_Val_FilenamelenParam;
    }

}
