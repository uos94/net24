
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-trace", ElementSize = 37, LocalName = "ncp-req-trace")
public class Ncp_Req_Trace
    implements Serializable
{

    private String trace_Val_Filename;
    private byte trace_Val_Filenamelen;

    @DdlField(Version = "2.0", QualName = "trace-val-filename", ObjectClass = 1, Level = 1, Structure = 0, Offset = 0, ElementSize = 36, IdentifierElement = 1)
    public String getTrace_Val_Filename() {
        return trace_Val_Filename;
    }

    public void setTrace_Val_Filename(String trace_Val_FilenameParam) {
        this.trace_Val_Filename = trace_Val_FilenameParam;
    }

    @DdlField(Version = "2.0", QualName = "trace-val-filenamelen", ObjectClass = 1, Level = 1, Structure = 22, Offset = 36, ElementSize = 1, IdentifierElement = 2)
    public byte getTrace_Val_Filenamelen() {
        return trace_Val_Filenamelen;
    }

    public void setTrace_Val_Filenamelen(byte trace_Val_FilenamelenParam) {
        this.trace_Val_Filenamelen = trace_Val_FilenamelenParam;
    }

}
