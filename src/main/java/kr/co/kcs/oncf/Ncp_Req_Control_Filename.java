
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-req-control-filename", ElementSize = 48, LocalName = "ncp-req-control-filename")
public class Ncp_Req_Control_Filename
    implements Serializable
{

    private String control_Val_Filename;
    private byte control_Val_Filenamelen;

    @DdlField(Version = "2.0", QualName = "control-val-filename", ObjectClass = 1, Level = 1, Structure = 0, Offset = 0, ElementSize = 47, IdentifierElement = 1)
    public String getControl_Val_Filename() {
        return control_Val_Filename;
    }

    public void setControl_Val_Filename(String control_Val_FilenameParam) {
        this.control_Val_Filename = control_Val_FilenameParam;
    }

    @DdlField(Version = "2.0", QualName = "control-val-filenamelen", ObjectClass = 1, Level = 1, Structure = 22, Offset = 47, ElementSize = 1, IdentifierElement = 2)
    public byte getControl_Val_Filenamelen() {
        return control_Val_Filenamelen;
    }

    public void setControl_Val_Filenamelen(byte control_Val_FilenamelenParam) {
        this.control_Val_Filenamelen = control_Val_FilenamelenParam;
    }

}
