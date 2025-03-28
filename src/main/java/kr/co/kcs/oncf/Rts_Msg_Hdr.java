
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "rts-msg-hdr", ElementSize = 54, LocalName = "rts-msg-hdr")
public class Rts_Msg_Hdr
    implements Serializable
{

    private short rts_Msg_Len;
    private short rts_Ver;
    private short rts_Msg_Id;
    private String rts_Nstp_Node;
    private String rts_Xpnet_Node;
    private String rts_Symbolic_Name;
    private String rts_Ncpi_Ddl_Ver;

    @DdlField(Version = "2.0", QualName = "rts-msg-len", ObjectClass = 1, Level = 1, Structure = 2, Offset = 0, ElementSize = 2, IdentifierElement = 1)
    public short getRts_Msg_Len() {
        return rts_Msg_Len;
    }

    public void setRts_Msg_Len(short rts_Msg_LenParam) {
        this.rts_Msg_Len = rts_Msg_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "rts-ver", ObjectClass = 1, Level = 1, Structure = 2, Offset = 2, ElementSize = 2, IdentifierElement = 2)
    public short getRts_Ver() {
        return rts_Ver;
    }

    public void setRts_Ver(short rts_VerParam) {
        this.rts_Ver = rts_VerParam;
    }

    @DdlField(Version = "2.0", QualName = "rts-msg-id", ObjectClass = 1, Level = 1, Structure = 2, Offset = 4, ElementSize = 2, IdentifierElement = 3)
    public short getRts_Msg_Id() {
        return rts_Msg_Id;
    }

    public void setRts_Msg_Id(short rts_Msg_IdParam) {
        this.rts_Msg_Id = rts_Msg_IdParam;
    }

    @DdlField(Version = "2.0", QualName = "rts-nstp-node", ObjectClass = 1, Level = 1, Structure = 0, Offset = 6, ElementSize = 8, IdentifierElement = 4)
    public String getRts_Nstp_Node() {
        return rts_Nstp_Node;
    }

    public void setRts_Nstp_Node(String rts_Nstp_NodeParam) {
        this.rts_Nstp_Node = rts_Nstp_NodeParam;
    }

    @DdlField(Version = "2.0", QualName = "rts-xpnet-node", ObjectClass = 1, Level = 1, Structure = 0, Offset = 14, ElementSize = 16, IdentifierElement = 5)
    public String getRts_Xpnet_Node() {
        return rts_Xpnet_Node;
    }

    public void setRts_Xpnet_Node(String rts_Xpnet_NodeParam) {
        this.rts_Xpnet_Node = rts_Xpnet_NodeParam;
    }

    @DdlField(Version = "2.0", QualName = "rts-symbolic-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 30, ElementSize = 16, IdentifierElement = 6)
    public String getRts_Symbolic_Name() {
        return rts_Symbolic_Name;
    }

    public void setRts_Symbolic_Name(String rts_Symbolic_NameParam) {
        this.rts_Symbolic_Name = rts_Symbolic_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "rts-ncpi-ddl-ver", ObjectClass = 1, Level = 1, Structure = 0, Offset = 46, ElementSize = 8, IdentifierElement = 7)
    public String getRts_Ncpi_Ddl_Ver() {
        return rts_Ncpi_Ddl_Ver;
    }

    public void setRts_Ncpi_Ddl_Ver(String rts_Ncpi_Ddl_VerParam) {
        this.rts_Ncpi_Ddl_Ver = rts_Ncpi_Ddl_VerParam;
    }

}
