
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-resp-status-dev", ElementSize = 144, LocalName = "ncp-resp-status-dev")
public class Ncp_Resp_Status_Dev
    implements Serializable
{

    private String xnc_File;
    private byte xnc_File_Len;
    private String xnc_Inuse;
    private byte xnc_Inuse_Len;
    private String rpc_File;
    private byte rpc_File_Len;
    private String rpc_Inuse;
    private byte rpc_Inuse_Len;

    @DdlField(Version = "2.0", QualName = "xnc-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 0, ElementSize = 35, IdentifierElement = 1)
    public String getXnc_File() {
        return xnc_File;
    }

    public void setXnc_File(String xnc_FileParam) {
        this.xnc_File = xnc_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "xnc-file-len", ObjectClass = 1, Level = 1, Structure = 22, Offset = 35, ElementSize = 1, IdentifierElement = 2)
    public byte getXnc_File_Len() {
        return xnc_File_Len;
    }

    public void setXnc_File_Len(byte xnc_File_LenParam) {
        this.xnc_File_Len = xnc_File_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "xnc-inuse", ObjectClass = 1, Level = 1, Structure = 0, Offset = 36, ElementSize = 35, IdentifierElement = 3)
    public String getXnc_Inuse() {
        return xnc_Inuse;
    }

    public void setXnc_Inuse(String xnc_InuseParam) {
        this.xnc_Inuse = xnc_InuseParam;
    }

    @DdlField(Version = "2.0", QualName = "xnc-inuse-len", ObjectClass = 1, Level = 1, Structure = 22, Offset = 71, ElementSize = 1, IdentifierElement = 4)
    public byte getXnc_Inuse_Len() {
        return xnc_Inuse_Len;
    }

    public void setXnc_Inuse_Len(byte xnc_Inuse_LenParam) {
        this.xnc_Inuse_Len = xnc_Inuse_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "rpc-file", ObjectClass = 1, Level = 1, Structure = 0, Offset = 72, ElementSize = 35, IdentifierElement = 5)
    public String getRpc_File() {
        return rpc_File;
    }

    public void setRpc_File(String rpc_FileParam) {
        this.rpc_File = rpc_FileParam;
    }

    @DdlField(Version = "2.0", QualName = "rpc-file-len", ObjectClass = 1, Level = 1, Structure = 22, Offset = 107, ElementSize = 1, IdentifierElement = 6)
    public byte getRpc_File_Len() {
        return rpc_File_Len;
    }

    public void setRpc_File_Len(byte rpc_File_LenParam) {
        this.rpc_File_Len = rpc_File_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "rpc-inuse", ObjectClass = 1, Level = 1, Structure = 0, Offset = 108, ElementSize = 35, IdentifierElement = 7)
    public String getRpc_Inuse() {
        return rpc_Inuse;
    }

    public void setRpc_Inuse(String rpc_InuseParam) {
        this.rpc_Inuse = rpc_InuseParam;
    }

    @DdlField(Version = "2.0", QualName = "rpc-inuse-len", ObjectClass = 1, Level = 1, Structure = 22, Offset = 143, ElementSize = 1, IdentifierElement = 8)
    public byte getRpc_Inuse_Len() {
        return rpc_Inuse_Len;
    }

    public void setRpc_Inuse_Len(byte rpc_Inuse_LenParam) {
        this.rpc_Inuse_Len = rpc_Inuse_LenParam;
    }

}
