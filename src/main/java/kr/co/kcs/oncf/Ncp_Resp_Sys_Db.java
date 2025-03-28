
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-sys-db", ElementSize = 38, LocalName = "ncp-resp-sys-db")
public class Ncp_Resp_Sys_Db
    implements Serializable
{

    private short filenamelen;
    private String filename;

    @DdlField(Version = "2.0", QualName = "filenamelen", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getFilenamelen() {
        return filenamelen;
    }

    public void setFilenamelen(short filenamelenParam) {
        this.filenamelen = filenamelenParam;
    }

    @DdlField(Version = "2.0", QualName = "filename", ObjectClass = 1, Level = 1, Structure = 0, Offset = 2, ElementSize = 36, IdentifierElement = 2)
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filenameParam) {
        this.filename = filenameParam;
    }

}
