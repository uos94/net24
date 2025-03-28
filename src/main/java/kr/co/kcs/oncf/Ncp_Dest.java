
package kr.co.kcs.oncf;

import java.io.Serializable;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;

@DdlGroup(Version = "2.0", QualName = "ncp-dest", ElementSize = 162, LocalName = "ncp-dest")
public class Ncp_Dest
    implements Serializable
{

    private String symbolic_Name;
    private short adapt;
    private short fail;
    private short freeze;
    private short qmi;
    private int qat;
    private int qmt;
    private int qgc_Depth;
    private String extlink;
    private String class32;
    private String uc_Queue;
    private short external_Attr;
    private short extcontingency;
    private short enabled;
    private short invalid_Var1;
    private short dest_Type;
    private short dest_Is_Ext;
    private short dest_Error;
    private short dest_Added;
    private short dflt_Qmi;
    private int dflt_Qat;
    private int dflt_Qmt;
    private String dest_Link;
    private String alias;
    private short replace_Alias;
    private short sba_Bsi_Service;
    private short rts_Onoff;

    @DdlField(Version = "2.0", QualName = "symbolic-name", ObjectClass = 1, Level = 1, Structure = 0, Offset = 0, ElementSize = 16, IdentifierElement = 1)
    public String getSymbolic_Name() {
        return symbolic_Name;
    }

    public void setSymbolic_Name(String symbolic_NameParam) {
        this.symbolic_Name = symbolic_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "adapt", ObjectClass = 1, Level = 1, Structure = 2, Offset = 16, ElementSize = 2, IdentifierElement = 2)
    public short getAdapt() {
        return adapt;
    }

    public void setAdapt(short adaptParam) {
        this.adapt = adaptParam;
    }

    @DdlField(Version = "2.0", QualName = "fail", ObjectClass = 1, Level = 1, Structure = 2, Offset = 18, ElementSize = 2, IdentifierElement = 3)
    public short getFail() {
        return fail;
    }

    public void setFail(short failParam) {
        this.fail = failParam;
    }

    @DdlField(Version = "2.0", QualName = "freeze", ObjectClass = 1, Level = 1, Structure = 2, Offset = 20, ElementSize = 2, IdentifierElement = 4)
    public short getFreeze() {
        return freeze;
    }

    public void setFreeze(short freezeParam) {
        this.freeze = freezeParam;
    }

    @DdlField(Version = "2.0", QualName = "qmi", ObjectClass = 1, Level = 1, Structure = 2, Offset = 22, ElementSize = 2, IdentifierElement = 5)
    public short getQmi() {
        return qmi;
    }

    public void setQmi(short qmiParam) {
        this.qmi = qmiParam;
    }

    @DdlField(Version = "2.0", QualName = "qat", ObjectClass = 1, Level = 1, Structure = 4, Offset = 24, ElementSize = 4, IdentifierElement = 6)
    public int getQat() {
        return qat;
    }

    public void setQat(int qatParam) {
        this.qat = qatParam;
    }

    @DdlField(Version = "2.0", QualName = "qmt", ObjectClass = 1, Level = 1, Structure = 4, Offset = 28, ElementSize = 4, IdentifierElement = 7)
    public int getQmt() {
        return qmt;
    }

    public void setQmt(int qmtParam) {
        this.qmt = qmtParam;
    }

    @DdlField(Version = "2.0", QualName = "qgc-depth", ObjectClass = 1, Level = 1, Structure = 4, Offset = 32, ElementSize = 4, IdentifierElement = 8)
    public int getQgc_Depth() {
        return qgc_Depth;
    }

    public void setQgc_Depth(int qgc_DepthParam) {
        this.qgc_Depth = qgc_DepthParam;
    }

    @DdlField(Version = "2.0", QualName = "extlink", ObjectClass = 1, Level = 1, Structure = 0, Offset = 36, ElementSize = 16, IdentifierElement = 9)
    public String getExtlink() {
        return extlink;
    }

    public void setExtlink(String extlinkParam) {
        this.extlink = extlinkParam;
    }

    @DdlField(Version = "2.0", QualName = "class32", ObjectClass = 1, Level = 1, Structure = 0, Offset = 52, ElementSize = 32, IdentifierElement = 10)
    public String getClass32() {
        return class32;
    }

    public void setClass32(String class32Param) {
        this.class32 = class32Param;
    }

    @DdlField(Version = "2.0", QualName = "uc-queue", ObjectClass = 1, Level = 1, Structure = 0, Offset = 84, ElementSize = 14, IdentifierElement = 11)
    public String getUc_Queue() {
        return uc_Queue;
    }

    public void setUc_Queue(String uc_QueueParam) {
        this.uc_Queue = uc_QueueParam;
    }

    @DdlField(Version = "2.0", QualName = "external-attr", ObjectClass = 1, Level = 1, Structure = 2, Offset = 98, ElementSize = 2, IdentifierElement = 12)
    public short getExternal_Attr() {
        return external_Attr;
    }

    public void setExternal_Attr(short external_AttrParam) {
        this.external_Attr = external_AttrParam;
    }

    @DdlField(Version = "2.0", QualName = "extcontingency", ObjectClass = 1, Level = 1, Structure = 2, Offset = 100, ElementSize = 2, IdentifierElement = 13)
    public short getExtcontingency() {
        return extcontingency;
    }

    public void setExtcontingency(short extcontingencyParam) {
        this.extcontingency = extcontingencyParam;
    }

    @DdlField(Version = "2.0", QualName = "enabled", ObjectClass = 1, Level = 1, Structure = 2, Offset = 102, ElementSize = 2, IdentifierElement = 14)
    public short getEnabled() {
        return enabled;
    }

    public void setEnabled(short enabledParam) {
        this.enabled = enabledParam;
    }

    @DdlField(Version = "2.0", QualName = "invalid-var1", ObjectClass = 1, Level = 1, Structure = 2, Offset = 104, ElementSize = 2, IdentifierElement = 15)
    public short getInvalid_Var1() {
        return invalid_Var1;
    }

    public void setInvalid_Var1(short invalid_Var1Param) {
        this.invalid_Var1 = invalid_Var1Param;
    }

    @DdlField(Version = "2.0", QualName = "dest-type", ObjectClass = 1, Level = 1, Structure = 2, Offset = 106, ElementSize = 2, IdentifierElement = 16)
    public short getDest_Type() {
        return dest_Type;
    }

    public void setDest_Type(short dest_TypeParam) {
        this.dest_Type = dest_TypeParam;
    }

    @DdlField(Version = "2.0", QualName = "dest-is-ext", ObjectClass = 1, Level = 1, Structure = 2, Offset = 108, ElementSize = 2, IdentifierElement = 17)
    public short getDest_Is_Ext() {
        return dest_Is_Ext;
    }

    public void setDest_Is_Ext(short dest_Is_ExtParam) {
        this.dest_Is_Ext = dest_Is_ExtParam;
    }

    @DdlField(Version = "2.0", QualName = "dest-error", ObjectClass = 1, Level = 1, Structure = 2, Offset = 110, ElementSize = 2, IdentifierElement = 18)
    public short getDest_Error() {
        return dest_Error;
    }

    public void setDest_Error(short dest_ErrorParam) {
        this.dest_Error = dest_ErrorParam;
    }

    @DdlField(Version = "2.0", QualName = "dest-added", ObjectClass = 1, Level = 1, Structure = 2, Offset = 112, ElementSize = 2, IdentifierElement = 19)
    public short getDest_Added() {
        return dest_Added;
    }

    public void setDest_Added(short dest_AddedParam) {
        this.dest_Added = dest_AddedParam;
    }

    @DdlField(Version = "2.0", QualName = "dflt-qmi", ObjectClass = 1, Level = 1, Structure = 2, Offset = 114, ElementSize = 2, IdentifierElement = 20)
    public short getDflt_Qmi() {
        return dflt_Qmi;
    }

    public void setDflt_Qmi(short dflt_QmiParam) {
        this.dflt_Qmi = dflt_QmiParam;
    }

    @DdlField(Version = "2.0", QualName = "dflt-qat", ObjectClass = 1, Level = 1, Structure = 4, Offset = 116, ElementSize = 4, IdentifierElement = 21)
    public int getDflt_Qat() {
        return dflt_Qat;
    }

    public void setDflt_Qat(int dflt_QatParam) {
        this.dflt_Qat = dflt_QatParam;
    }

    @DdlField(Version = "2.0", QualName = "dflt-qmt", ObjectClass = 1, Level = 1, Structure = 4, Offset = 120, ElementSize = 4, IdentifierElement = 22)
    public int getDflt_Qmt() {
        return dflt_Qmt;
    }

    public void setDflt_Qmt(int dflt_QmtParam) {
        this.dflt_Qmt = dflt_QmtParam;
    }

    @DdlField(Version = "2.0", QualName = "dest-link", ObjectClass = 1, Level = 1, Structure = 0, Offset = 124, ElementSize = 16, IdentifierElement = 23)
    public String getDest_Link() {
        return dest_Link;
    }

    public void setDest_Link(String dest_LinkParam) {
        this.dest_Link = dest_LinkParam;
    }

    @DdlField(Version = "2.0", QualName = "alias", ObjectClass = 1, Level = 1, Structure = 0, Offset = 140, ElementSize = 16, IdentifierElement = 24)
    public String getAlias() {
        return alias;
    }

    public void setAlias(String aliasParam) {
        this.alias = aliasParam;
    }

    @DdlField(Version = "2.0", QualName = "replace-alias", ObjectClass = 1, Level = 1, Structure = 2, Offset = 156, ElementSize = 2, IdentifierElement = 25)
    public short getReplace_Alias() {
        return replace_Alias;
    }

    public void setReplace_Alias(short replace_AliasParam) {
        this.replace_Alias = replace_AliasParam;
    }

    @DdlField(Version = "2.0", QualName = "sba-bsi-service", ObjectClass = 1, Level = 1, Structure = 2, Offset = 158, ElementSize = 2, IdentifierElement = 26)
    public short getSba_Bsi_Service() {
        return sba_Bsi_Service;
    }

    public void setSba_Bsi_Service(short sba_Bsi_ServiceParam) {
        this.sba_Bsi_Service = sba_Bsi_ServiceParam;
    }

    @DdlField(Version = "2.0", QualName = "rts-onoff", ObjectClass = 1, Level = 1, Structure = 2, Offset = 160, ElementSize = 2, IdentifierElement = 27)
    public short getRts_Onoff() {
        return rts_Onoff;
    }

    public void setRts_Onoff(short rts_OnoffParam) {
        this.rts_Onoff = rts_OnoffParam;
    }

}
